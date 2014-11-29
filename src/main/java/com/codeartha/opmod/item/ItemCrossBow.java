package com.codeartha.opmod.item;

import com.codeartha.opmod.entity.EntityQuarrel;
import com.codeartha.opmod.init.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemCrossBow
    extends ItemOP
{
    public ItemCrossBow()
    {
        super();
        this.setUnlocalizedName( "crossBow" );
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing( ItemStack itemstack, World world, EntityPlayer entityplayer, int itemInUseCount )
    {
        int j = this.getMaxItemUseDuration( itemstack ) - itemInUseCount;

        ArrowLooseEvent event = new ArrowLooseEvent( entityplayer, itemstack, j );
        MinecraftForge.EVENT_BUS.post( event );
        if ( event.isCanceled() )
        {
            return;
        }
        j = event.charge;

        boolean flag =
            entityplayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel( Enchantment.infinity.effectId, itemstack ) > 0;

        if ( flag || entityplayer.inventory.hasItem( ModItems.steelQuarrel ) )
        {
            float f = (float) j / 20.0F;
            f = ( f * f + f * 2.0F ) / 3.0F;

            if ( (double) f < 0.1D )
            {
                return;
            }

            if ( f > 1.0F )
            {
                f = 1.0F;
            }

            EntityQuarrel entityquarrel = new EntityQuarrel( world, entityplayer, f * 2.0F );

            if ( f == 1.0F )
            {
                entityquarrel.setIsCritical( true );
            }

            int k = EnchantmentHelper.getEnchantmentLevel( Enchantment.power.effectId, itemstack );

            if ( k > 0 )
            {
                entityquarrel.setDamage( entityquarrel.getDamage() + (double) k * 0.5D + 0.5D );
            }

            int l = EnchantmentHelper.getEnchantmentLevel( Enchantment.punch.effectId, itemstack );

            if ( l > 0 )
            {
                entityquarrel.setKnockbackStrength( l );
            }

            if ( EnchantmentHelper.getEnchantmentLevel( Enchantment.flame.effectId, itemstack ) > 0 )
            {
                entityquarrel.setFire( 100 );
            }

            itemstack.damageItem( 1, entityplayer );
            world.playSoundAtEntity( entityplayer, "random.bow", 1.0F, 1.0F / ( itemRand.nextFloat() * 0.4F + 1.2F ) + f * 0.5F );

            if ( flag )
            {
                entityquarrel.canBePickedUp = 2;
            }
            else
            {
                entityplayer.inventory.consumeInventoryItem( ModItems.steelQuarrel );
            }

            if ( !world.isRemote )
            {
                world.spawnEntityInWorld( entityquarrel );
            }
        }
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction( ItemStack itemstack )
    {
        return EnumAction.bow;
    }

    public ItemStack onEaten( ItemStack itemstack, World world, EntityPlayer entityplayer )
    {
        return itemstack;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
        return 1;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration( ItemStack itemstack )
    {
        return 72000;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick( ItemStack itemstack, World world, EntityPlayer entityplayer )
    {
        ArrowNockEvent event = new ArrowNockEvent( entityplayer, itemstack );
        MinecraftForge.EVENT_BUS.post( event );
        if ( event.isCanceled() )
        {
            return event.result;
        }

        if ( entityplayer.capabilities.isCreativeMode || entityplayer.inventory.hasItem( ModItems.steelQuarrel ) )
        {
            entityplayer.setItemInUse( itemstack, this.getMaxItemUseDuration( itemstack ) );
        }

        return itemstack;
    }
}

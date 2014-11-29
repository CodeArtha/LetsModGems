package com.codeartha.opmod.item;

import com.codeartha.opmod.creativetab.CreativeTabOP;
import com.codeartha.opmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemOP
    extends Item
{
    public ItemOP()
    {
        super();
        this.maxStackSize = 1;
        this.setCreativeTab( CreativeTabOP.OpMod_TAB );
        this.setNoRepair();
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format( "item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName( super.getUnlocalizedName() ) );
    }

    @Override
    public String getUnlocalizedName( ItemStack itemStack )
    {
        return String.format( "item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName( super.getUnlocalizedName() ) );
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons( IIconRegister iconRegister )
    {
        itemIcon = iconRegister.registerIcon( this.getUnlocalizedName().substring( this.getUnlocalizedName().indexOf( "." ) + 1 ) );
    }

    protected String getUnwrappedUnlocalizedName( String unlocalizedName )
    {
        return unlocalizedName.substring( unlocalizedName.indexOf( "." ) + 1 );
    }
}

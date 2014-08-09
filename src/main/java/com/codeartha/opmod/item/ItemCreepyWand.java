package com.codeartha.opmod.item;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemCreepyWand extends ItemOP
{
    public ItemCreepyWand()
    {
        super();
        this.setUnlocalizedName( "creepyWand" );
        this.setMaxDamage(20);
    }

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
        if (!entityPlayer.capabilities.isCreativeMode)
        {
            itemStack.damageItem(1, entityPlayer);
        }
        if (!world.isRemote)
        {
            float f = 1.0F;
            float f1 = entityPlayer.prevRotationPitch + (entityPlayer.rotationPitch - entityPlayer.prevRotationPitch) * f;
            float f2 = entityPlayer.prevRotationYaw + (entityPlayer.rotationYaw - entityPlayer.prevRotationYaw) * f;
            double d = entityPlayer.prevPosX + (entityPlayer.posX - entityPlayer.prevPosX) * f;
            double d1 = entityPlayer.prevPosY + (entityPlayer.posY - entityPlayer.prevPosY) * f + 1.6200000000000001D - entityPlayer.yOffset;
            double d2 = entityPlayer.prevPosZ + (entityPlayer.posZ - entityPlayer.prevPosZ) * f;
            Vec3 vec3 = Vec3.createVectorHelper(d, d1, d2);
            float f3 = MathHelper.cos( -f2 * 0.01745329F - 3.141593F );
            float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
            float f5 = -MathHelper.cos(-f1 * 0.01745329F);
            float f6 = MathHelper.sin(-f1 * 0.01745329F);
            float f7 = f4 * f5;
            float f8 = f6;
            float f9 = f3 * f5;
            double d3 = 5000D;
            Vec3 vec3d1 = vec3.addVector(f7 * d3, f8 * d3, f9 * d3);
            MovingObjectPosition movingobjectposition = world.rayTraceBlocks( vec3, vec3d1, false );
            if (movingobjectposition == null)
                return itemStack;
            if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.ENTITY)
            {
                int i = movingobjectposition.blockX;
                int j = movingobjectposition.blockY;
                int k = movingobjectposition.blockZ;
                world.spawnEntityInWorld(new EntityTNTPrimed( world, i, j, k, entityPlayer ));
            }
        }
        
        return itemStack;
    }
}

package com.codeartha.opmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

import java.util.Iterator;


public class ItemPortableBed
    extends ItemOP
{
    public ItemPortableBed()
    {
        super();
        this.setUnlocalizedName( "portableBed" );
    }

    public ItemStack onItemRightClick( ItemStack itemStack, World world, EntityPlayer entityPlayer )
    {
        if ( world.provider.canRespawnHere() )
        {
            ChunkCoordinates chunkcoordinates = entityPlayer.playerLocation;

            entityPlayer.setSpawnChunk( chunkcoordinates, false );
            entityPlayer.addChatMessage(
                new ChatComponentText( "Your spawn has been set to:" + chunkcoordinates.posX + ", " + chunkcoordinates.posZ + "." ) );
        }

        return itemStack;
    }

    public boolean onItemUse( ItemStack itemStack, EntityPlayer entityPlayer, World world, int j, int k, int l, int p_77648_7_, float p_77648_8_,
                              float p_77648_9_, float p_77648_10_ )
    {
        if ( world.isRemote )
        {
            return true;
        }
        else
        {
            if ( world.provider.canRespawnHere() )// && world.getBiomeGenForCoords(entityPlayer.getPlayerCoordinates().posX, entityPlayer.getPlayerCoordinates().posZ) != BiomeGenBase.hell)
            {

                EntityPlayer entityplayer1 = null;
                Iterator iterator = world.playerEntities.iterator();

                while ( iterator.hasNext() )
                {
                    EntityPlayer entityplayer2 = (EntityPlayer) iterator.next();

                    if ( entityplayer2.isPlayerSleeping() )
                    {
                        ChunkCoordinates chunkcoordinates = entityplayer2.playerLocation;

                        if ( chunkcoordinates.posX == j && chunkcoordinates.posY == k && chunkcoordinates.posZ == l )
                        {
                            entityplayer1 = entityplayer2;
                        }
                    }
                }

                /**EntityPlayer.EnumStatus enumstatus = entityPlayer.sleepInBedAt(j, k, l);

                 if (enumstatus == EntityPlayer.EnumStatus.OK)
                 {
                 func_149979_a(world, j, k, l, true);
                 return true;
                 }
                 else
                 {
                 if (enumstatus == EntityPlayer.EnumStatus.NOT_POSSIBLE_NOW)
                 {
                 entityPlayer.addChatComponentMessage(new ChatComponentTranslation("tile.bed.noSleep", new Object[0]));
                 }
                 return true;
                 }*/
            }
            else
            {
                return true;
            }
        }
        return false;

    }
}

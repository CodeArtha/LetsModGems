package com.codeartha.opmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class ItemAdvClock
    extends ItemOP
{
    public ItemAdvClock()
    {
        super();
        this.setUnlocalizedName( "advClock" );
    }

    public ItemStack onItemRightClick( ItemStack itemstack, World world, EntityPlayer entityplayer )
    {
        return itemstack;
    }

    public void onPlayerStoppedUsing( ItemStack itemstack, World world, EntityPlayer entityplayer, int itemInUseCount )
    {
        entityplayer.addChatMessage( new ChatComponentText( humanReadableTime( world.getWorldTime() ) ) );
        return;
    }

    public String humanReadableTime( Long curTime )
    {
        String HH = Long.toString( ( curTime / 1000 ) + 6 );
        String MM = Long.toString( ( ( curTime % 1000 ) * 60 ) / 1000 );
        String SS = Long.toString( ( ( curTime % 10 ) * 60 ) / 10 );

        if ( Integer.parseInt( SS ) < 10 )
        {
            SS = SS + "0";
        }

        return "Current time: " + HH + ":" + MM + ":" + SS + ".";
    }
}

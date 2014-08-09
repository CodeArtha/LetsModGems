package com.codeartha.opmod.entity;

import com.codeartha.opmod.init.ModItems;
import com.codeartha.opmod.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class Event_LivingDrops
{
    public static double rand;
    public static int nb;

    @SubscribeEvent
    public void onDeath(LivingDropsEvent event) {
        if ( event.entityLiving instanceof EntityCreeper ) //Checks the entity killed.
        {
            rand = Math.random();
            if(( (EntityCreeper) event.entityLiving ).getPowered()) //Looks if it's a supercharged creeper
            {
                LogHelper.info( "Killed a Supercharged Creeper!" );
                if ( rand < 0.85D )//Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
                {
                    event.entityLiving.dropItem( ModItems.lightningSphere, 1 );
                }
            }
            else{
                nb++;
                LogHelper.info( "Killed a Creeper." + nb);
                if ( rand < 0.01D )//Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
                {
                    event.entityLiving.dropItem( ModItems.creepySphere, 1 );
                }
            }

        }

        if (event.entityLiving instanceof EntityCreeper) { //Checks the entity killed.

        }
    }
}

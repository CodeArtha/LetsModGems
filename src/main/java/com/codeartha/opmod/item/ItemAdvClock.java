package com.codeartha.opmod.item;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeModContainer;

public class ItemAdvClock extends ItemOP
{
    public ItemAdvClock()
    {
        super();
        this.setUnlocalizedName( "advClock" );
    }

    @Override
    public boolean hasEffect(ItemStack par1ItemStack){
        return false;
    }

    public String humanReadableTime(Long curTime)
    {
        String HH = Long.toString((curTime / 1000) + 6);
        String MM = Long.toString(((curTime % 1000) * 60) / 1000);
        String SS = Long.toString(((curTime % 10) * 60) / 10);

        if (Integer.parseInt(SS) < 10)
        {
            SS = SS + "0";
        }

        return "Current time: " + HH + ":" + MM + ":" + SS + ".";
    }
}
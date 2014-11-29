package com.codeartha.opmod.creativetab;

import com.codeartha.opmod.init.ModItems;
import com.codeartha.opmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabOP
{
    public static final CreativeTabs OpMod_TAB = new CreativeTabs( Reference.MOD_ID.toLowerCase() )
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.lightningWand;
        }
    };
}

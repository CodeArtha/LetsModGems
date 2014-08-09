package com.codeartha.opmod.item;

import net.minecraft.item.ItemStack;

public class ItemEnchantedDiamond extends ItemOP
{
    public ItemEnchantedDiamond()
    {
        super();
        this.setUnlocalizedName( "enchantedDiamond" );
        this.maxStackSize = 16;
    }

    public boolean hasEffect(ItemStack itemStack, int passes)
    {
        return true;
    }
}

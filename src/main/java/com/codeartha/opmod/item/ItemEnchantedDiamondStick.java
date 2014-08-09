package com.codeartha.opmod.item;

import net.minecraft.item.ItemStack;

public class ItemEnchantedDiamondStick extends ItemOP
{
    public ItemEnchantedDiamondStick()
    {
        super();
        this.setUnlocalizedName( "enchantedDiamondStick" );
        this.maxStackSize = 16;
    }

    public boolean hasEffect(ItemStack itemStack, int passes)
    {
        return true;
    }
}

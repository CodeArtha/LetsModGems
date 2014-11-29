package com.codeartha.opmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreRegistry
{
    public static void init()
    {
        OreDictionary.registerOre( "oreTitanium", new ItemStack( ModBlocks.titaniumOre ) );
        OreDictionary.registerOre( "blockSteel", new ItemStack( ModBlocks.steelBlock ) );
        OreDictionary.registerOre( "blockTitanium", new ItemStack( ModBlocks.titaniumBlock ) );
        OreDictionary.registerOre( "blockAdamantium", new ItemStack( ModBlocks.adamantiumBlock ) );
        OreDictionary.registerOre( "ingotSteel", new ItemStack( ModItems.steelIngot ) );
        OreDictionary.registerOre( "ingotTitanium", new ItemStack( ModItems.titaniumIngot ) );
        OreDictionary.registerOre( "ingotAdamantium", new ItemStack( ModItems.adamantiumIngot ) );
    }
}

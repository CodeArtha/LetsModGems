package com.codeartha.opmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        /* Crafting */

        GameRegistry.addRecipe(new ShapedOreRecipe( new ItemStack( ModItems.advClock ),
                                 "sgs", "rcr", "svs",
                                 's', "dustRedstone",
                                 'g', "dustGlowstone",
                                 'r', new ItemStack( Items.repeater ),
                                 'c', new ItemStack( Items.clock ),
                                 'v', "blockGlass" ));
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack( ModItems.leatherStrip, 4 ),
                                "ls",
                                'l', new ItemStack( Items.leather ),
                                's', new ItemStack( Items.shears )));
        GameRegistry.addRecipe(new ShapedOreRecipe( new ItemStack( ModItems.portableBed ),
                               "sis", "lbl", "sps",
                               's', new ItemStack( ModItems.leatherStrip ),
                               'i', "ingotIron",
                               'l', new ItemStack( Items.leather ),
                               'b', new ItemBlock( Blocks.bed ),
                               'p', "plankWood" ) );
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack( ModItems.enchantedDiamond ),
                                "d", "g", "d",
                                'd', "gemDiamond",
                                'g', new ItemStack( Items.ghast_tear )));
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack( ModItems.enchantedDiamondStick ),
                                "e", "e",
                                'e', new ItemStack( ModItems.enchantedDiamond )));
        GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack( ModItems.creepySphere ),
                                      "ctc", "tlt", "ctc",
                                      'c', new ItemStack( Items.skull, 1, 4 ),
                                      't', new ItemStack( Blocks.tnt ),
                                      'l', new ItemStack( Items.flint_and_steel )));
        GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack( ModItems.creepyWand),
                                "  c", " s ", "s  ",
                                'c', new ItemStack( ModItems.creepySphere ),
                                's', new ItemStack( ModItems.enchantedDiamondStick )));
        GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(ModBlocks.steelBlock),
                                "iii", "iii", "iii",
                                'i', "ingotSteel") );
        GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack( ModBlocks.titaniumBlock ),
                                "iii", "iii", "iii",
                                'i', "ingotTitanium"));
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack( ModItems.opIngot, 2 ),
                                "igi", "xsx", "igi",
                                'i', "ingotAdamantium",
                                'g', "ingotGold",
                                'x', new ItemStack( Items.experience_bottle ),
                                's', new ItemStack( Items.nether_star )));
        GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack( ModItems.opSword ),
                                " o ", " o ", " s ",
                                'o', new ItemStack( ModItems.opIngot ),
                                's', new ItemStack( ModItems.enchantedDiamondStick )));

        /* Smelting */
        GameRegistry.addSmelting( new ItemStack( Items.iron_ingot ), new ItemStack( ModItems.steelIngot ), 0.7f  ); //same xp as iron
        GameRegistry.addSmelting( new ItemStack( ModBlocks.titaniumOre ),new ItemStack( ModItems.titaniumIngot ), 1.0f ); //same xp as gold
        //GameRegistry.addRecipe( );
    }

}

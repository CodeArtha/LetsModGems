package com.codeartha.opmod.init;

import com.codeartha.opmod.block.BlockAdamantium;
import com.codeartha.opmod.block.BlockOP;
import com.codeartha.opmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.MapColor;

@GameRegistry.ObjectHolder( Reference.MOD_ID )
public class ModBlocks
{
    public static final BlockOP adamantiumBlock = new BlockAdamantium(MapColor.goldColor);


    public static void init()
    {
        GameRegistry.registerBlock(adamantiumBlock, "adamantiumBlock");
    }
}

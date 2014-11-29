package com.codeartha.opmod.init;

import com.codeartha.opmod.block.BlockAdamantium;
import com.codeartha.opmod.block.BlockLongDoor;
import com.codeartha.opmod.block.BlockOP;
import com.codeartha.opmod.block.BlockSteel;
import com.codeartha.opmod.block.BlockTitanium;
import com.codeartha.opmod.block.BlockTitaniumOre;
import com.codeartha.opmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockOP adamantiumBlock = new BlockAdamantium( MapColor.goldColor );

    public static final BlockOP steelBlock = new BlockSteel();

    public static final BlockOP titaniumBlock = new BlockTitanium();

    public static final BlockOP titaniumOre = new BlockTitaniumOre();

    public static final BlockOP longDoor = new BlockLongDoor( Material.wood );


    public static void init()
    {
        GameRegistry.registerBlock( adamantiumBlock, "adamantiumBlock" );
        GameRegistry.registerBlock( steelBlock, "steelBlock" );
        GameRegistry.registerBlock( titaniumBlock, "titaniumBlock" );
        GameRegistry.registerBlock( titaniumOre, "titaniumOre" );
        GameRegistry.registerBlock( longDoor, "longDoor" );
    }

}

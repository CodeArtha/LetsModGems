package com.codeartha.opmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOP extends Block
{
    public BlockOP(){this( Material.rock);}

    public BlockOP(Material material)
    {
        super(material);
    }
}

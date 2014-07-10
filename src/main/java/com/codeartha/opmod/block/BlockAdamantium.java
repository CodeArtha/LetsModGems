package com.codeartha.opmod.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockAdamantium extends BlockOP
{
    private final MapColor mapColor;
    private static final int COLOR_ID = 30;

    public BlockAdamantium(MapColor Color)
    {
        super();
        this.setBlockName("adamantiumBlock");
        this.setHardness( 20.0f );
        this.setResistance( 2500.0f );
        this.setStepSound( soundTypeMetal );
        this.mapColor = Color;

    }

    public MapColor getMapColor(int COLOR_ID)
    {
        return this.mapColor;
    }
}

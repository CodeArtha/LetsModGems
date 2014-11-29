package com.codeartha.opmod.block;

import net.minecraft.block.material.MapColor;

public class BlockAdamantium
    extends BlockOP
{
    private final MapColor mapColor;

    // Sorry.. Used it in my video, but turns out it wasn't used at all, seems like getMapColor does not use it's parameter!
    //private static final int COLOR_ID = 30;

    public BlockAdamantium( MapColor Color )
    {
        super();
        this.setBlockName( "adamantiumBlock" );
        this.setHardness( 20.0f ); // Mining speed, ae: Obsidian = 50.0f ; Iron Block = 5.0f
        this.setResistance( 2500.0f ); // Blast resistance, ae: Obsidian : 2000.0f
        this.setStepSound( soundTypeMetal );
        this.mapColor = Color;

    }

    // /!\ I removed COLOR_ID ▼ Turns out it isn't used :)
    public MapColor getMapColor()
    {
        return this.mapColor;
    }
}

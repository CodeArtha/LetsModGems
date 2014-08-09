package com.codeartha.opmod.block;

public class BlockTitanium extends BlockOP
{
    public BlockTitanium()
    {
        super();
        this.setBlockName( "titaniumBlock" );
        this.setHardness( 8.0f );
        this.setResistance( 10.0f );
        this.setStepSound( soundTypeMetal );
    }
}

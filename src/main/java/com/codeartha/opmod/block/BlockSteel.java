package com.codeartha.opmod.block;

public class BlockSteel extends BlockOP
{
    public BlockSteel()
    {
        super();
        this.setBlockName( "steelBlock" );
        this.setHardness( 5.0f );
        this.setResistance( 10.0f );
        this.setStepSound( soundTypeMetal );
    }
}

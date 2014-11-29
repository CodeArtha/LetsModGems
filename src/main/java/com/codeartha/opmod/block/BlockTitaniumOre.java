package com.codeartha.opmod.block;

public class BlockTitaniumOre
    extends BlockOP
{
    public BlockTitaniumOre()
    {
        super();
        this.setBlockName( "titaniumOre" );
        this.setHardness( 5.0f );
        this.setResistance( 5.0f );
        this.setStepSound( soundTypeMetal );
    }
}

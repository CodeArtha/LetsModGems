package com.codeartha.opmod.init;

import com.codeartha.opmod.item.ItemAdamantiumIngot;
import com.codeartha.opmod.item.ItemAdvClock;
import com.codeartha.opmod.item.ItemCreepySphere;
import com.codeartha.opmod.item.ItemCreepyWand;
import com.codeartha.opmod.item.ItemLeatherStrip;
import com.codeartha.opmod.item.ItemLightningWand;
import com.codeartha.opmod.item.ItemOP;
import com.codeartha.opmod.item.ItemOPIngot;
import com.codeartha.opmod.item.ItemOPSword;
import com.codeartha.opmod.item.ItemSteelIngot;
import com.codeartha.opmod.item.ItemTitaniumIngot;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemOP steelIngot = new ItemSteelIngot();
    public static final ItemOP titaniumIngot = new ItemTitaniumIngot();
    public static final ItemOP opIngot = new ItemOPIngot();
    public static final ItemOP adamantiumIngot = new ItemAdamantiumIngot();
    public static final ItemOP advClock = new ItemAdvClock();
    public static final ItemOP creepySphere= new ItemCreepySphere();
    public static final ItemOP creepyWand = new ItemCreepyWand();
    public static final ItemOP lightningWand = new ItemLightningWand();
    public static final ItemOP opSword = new ItemOPSword();
    public static final ItemOP leatherStrip = new ItemLeatherStrip();

    public static void init()
    {
        GameRegistry.registerItem( steelIngot, "steelIngot" );
        GameRegistry.registerItem( titaniumIngot, "titaniumIngot" );
        GameRegistry.registerItem( opIngot, "opIngot" );
        GameRegistry.registerItem( adamantiumIngot, "adamantiumIngot" );
        GameRegistry.registerItem( advClock, "advClock" );
        GameRegistry.registerItem( creepySphere, "creepySphere" );
        GameRegistry.registerItem( creepyWand, "creepyWand" );
        GameRegistry.registerItem( lightningWand, "lightningWand" );
        GameRegistry.registerItem( opSword, "opSword" );
        GameRegistry.registerItem( leatherStrip, "leatherStrip" );
    }
}


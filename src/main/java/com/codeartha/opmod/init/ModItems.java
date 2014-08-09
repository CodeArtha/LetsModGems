package com.codeartha.opmod.init;

import com.codeartha.opmod.item.ItemAdamantiumIngot;
import com.codeartha.opmod.item.ItemAdvClock;
import com.codeartha.opmod.item.ItemCreepySphere;
import com.codeartha.opmod.item.ItemCreepyWand;
import com.codeartha.opmod.item.ItemCrossBow;
import com.codeartha.opmod.item.ItemEmeraldAxe;
import com.codeartha.opmod.item.ItemEmeraldBoots;
import com.codeartha.opmod.item.ItemEmeraldChestplate;
import com.codeartha.opmod.item.ItemEmeraldHelmet;
import com.codeartha.opmod.item.ItemEmeraldHoe;
import com.codeartha.opmod.item.ItemEmeraldPants;
import com.codeartha.opmod.item.ItemEmeraldPick;
import com.codeartha.opmod.item.ItemEmeraldShovel;
import com.codeartha.opmod.item.ItemEmeraldSword;
import com.codeartha.opmod.item.ItemEnchantedDiamond;
import com.codeartha.opmod.item.ItemEnchantedDiamondStick;
import com.codeartha.opmod.item.ItemLeatherStrip;
import com.codeartha.opmod.item.ItemLightningSphere;
import com.codeartha.opmod.item.ItemLightningWand;
import com.codeartha.opmod.item.ItemOP;
import com.codeartha.opmod.item.ItemOPIngot;
import com.codeartha.opmod.item.ItemOPSword;
import com.codeartha.opmod.item.ItemPortableBed;
import com.codeartha.opmod.item.ItemSteelIngot;
import com.codeartha.opmod.item.ItemSteelQuarrel;
import com.codeartha.opmod.item.ItemTitaniumIngot;
import com.codeartha.opmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder( Reference.MOD_ID )
public class ModItems
{
    public static final ItemOP steelIngot = new ItemSteelIngot();
    public static final ItemOP titaniumIngot = new ItemTitaniumIngot();
    public static final ItemOP opIngot = new ItemOPIngot();
    public static final ItemOP adamantiumIngot = new ItemAdamantiumIngot();
    public static final ItemOP advClock = new ItemAdvClock();
    public static final ItemOP creepySphere = new ItemCreepySphere();
    public static final ItemOP creepyWand = new ItemCreepyWand();
    public static final ItemOP lightningSphere = new ItemLightningSphere();
    public static final ItemOP lightningWand = new ItemLightningWand();
    public static final ItemOP opSword = new ItemOPSword();
    public static final ItemOP leatherStrip = new ItemLeatherStrip();
    public static final ItemOP crossBow = new ItemCrossBow();
    public static final ItemOP steelQuarrel = new ItemSteelQuarrel();
    public static final ItemOP portableBed = new ItemPortableBed();
    public static final ItemOP enchantedDiamond = new ItemEnchantedDiamond();
    public static final ItemOP enchantedDiamondStick = new ItemEnchantedDiamondStick();
    /*public static final ItemOP emeraldAxe = new ItemEmeraldAxe();
    public static final ItemOP emeraldBoots = new ItemEmeraldBoots();
    public static final ItemOP emeraldChestplate = new ItemEmeraldChestplate();
    public static final ItemOP emeraldHelmet = new ItemEmeraldHelmet();
    public static final ItemOP emeraldHoe = new ItemEmeraldHoe();
    public static final ItemOP emeraldPants = new ItemEmeraldPants();
    public static final ItemOP emeraldPick = new ItemEmeraldPick();
    public static final ItemOP emeraldShovel = new ItemEmeraldShovel();
    public static final ItemOP emeraldSword = new ItemEmeraldSword();*/

    public static void init()
    {
        GameRegistry.registerItem( steelIngot, "steelIngot");
        GameRegistry.registerItem( titaniumIngot, "titaniumIngot");
        GameRegistry.registerItem( opIngot, "opIngot"  );
        GameRegistry.registerItem( adamantiumIngot, "adamantiumIngot");
        GameRegistry.registerItem( advClock, "advClock");
        GameRegistry.registerItem( creepySphere, "creepySphere");
        GameRegistry.registerItem( creepyWand, "creepyWand");
        GameRegistry.registerItem( lightningSphere, "lightningSphere" );
        GameRegistry.registerItem( lightningWand, "lightningWand");
        GameRegistry.registerItem( opSword, "opSword");
        GameRegistry.registerItem( leatherStrip, "leatherStrip");
        GameRegistry.registerItem( crossBow, "crossBow");
        GameRegistry.registerItem( steelQuarrel, "steelQuarrel");
        GameRegistry.registerItem( portableBed, "portableBed");
        GameRegistry.registerItem( enchantedDiamond, "enchantedDiamond");
        GameRegistry.registerItem( enchantedDiamondStick, "enchantedDiamondStick");
    }
}


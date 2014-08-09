package com.codeartha.opmod;

import com.codeartha.opmod.entity.Event_LivingDrops;
import com.codeartha.opmod.handler.ConfigurationHandler;
import com.codeartha.opmod.init.ModBlocks;
import com.codeartha.opmod.init.ModItems;
import com.codeartha.opmod.init.ModOreRegistry;
import com.codeartha.opmod.init.Recipes;
import com.codeartha.opmod.proxy.IProxy;
import com.codeartha.opmod.reference.Reference;
import com.codeartha.opmod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import sun.java2d.pipe.hw.AccelDeviceEventNotifier;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class OpMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static OpMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit( FMLPreInitializationEvent event )
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register( new ConfigurationHandler() );
        MinecraftForge.EVENT_BUS.register( new Event_LivingDrops() );

        ModItems.init();
        ModBlocks.init();
        ModOreRegistry.init();

        LogHelper.info( "Pre Initialisation Complete!" );
    }

    @Mod.EventHandler
    public void init( FMLInitializationEvent event )
    {
        Recipes.init();

        //FMLCommonHandler.instance().bus().register( new Event_LivingDrops() );


        LogHelper.info("Initialisation Complete!");
    }

    @Mod.EventHandler
    public void postInit( FMLPostInitializationEvent event )
    {
        LogHelper.info("Post Initialisation Complete!");
    }
}


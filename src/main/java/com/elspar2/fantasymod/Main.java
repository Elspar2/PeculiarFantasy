package com.elspar2.fantasymod;

import java.io.File;

import com.elspar2.fantasymod.init.ModItems;
import com.elspar2.fantasymod.init.ModRecipes;
import com.elspar2.fantasymod.proxy.CommonProxy;
import com.elspar2.fantasymod.tabs.FantasyTab;
import com.elspar2.fantasymod.util.Reference;
import com.elspar2.fantasymod.util.handlers.ConfigHandler;
import com.elspar2.fantasymod.util.handlers.OreDictionaryHandler;
import com.elspar2.fantasymod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	public static File config;
	
	public static final FantasyTab FantasyTab = new FantasyTab("FantasyTab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		ConfigHandler.RegisterConfig(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		OreDictionaryHandler.registerOreDictionary();
		ModRecipes.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
	
	}	
	
}

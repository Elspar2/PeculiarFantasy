package com.elspar2.fantasymod.util.handlers;

import java.io.File;

import com.elspar2.fantasymod.Main;
import com.elspar2.fantasymod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {
	public static Configuration config;
	
	public static String AMBER_EFFECT = "";
	public static String AMETHYST_EFFECT = "";
	public static String ANGELITE_EFFECT = "";
	public static String AQUAMARINE_EFFECT = "";
	public static String BLACK_OPAL_EFFECT = "";
	public static String CORAL_EFFECT = "";
	public static String DIAMOND_EFFECT = "";
	public static String EMERALD_EFFECT = "";
	public static String GARNET_EFFECT = "";
	public static String JADE_EFFECT = "";
	public static String LAPIS_EFFECT = "";
	public static String MOONSTONE_EFFECT = "";
	public static String OBSIDIAN_EFFECT = "";
	public static String ONYX_EFFECT = "";
	public static String OPAL_EFFECT = "";
	public static String ORANGE_TOPAZ_EFFECT = "";
	public static String PAINITE_EFFECT = "";
	public static String PERIDOT_EFFECT = "";
	public static String RUBY_EFFECT = "";
	public static String SAPPHIRE_EFFECT = "";
	public static String TAAFFEITE_EFFECT = "";
	public static String TANZANITE_EFFECT = "";
	public static String TURQUOISE_EFFECT = "";
	public static String YELLOW_TOPAZ_EFFECT = "";
	
	public static String STEEL_EFFECT = "";
	public static String SILVER_EFFECT = "";
	public static String GOLD_EFFECT = "";
	public static String QUICKSILVER_EFFECT = "";
	public static String MITHRIL_EFFECT = "";
	public static String COBALT_EFFECT = "";
	public static String ADMANTIUM_EFFECT = "";
	public static String EBONY_EFFECT = "";
	public static String DIVINIUM_EFFECT = "";
	public static String MALOVENIUM_EFFECT = "";
	public static String CHANCIUM_EFFECT = "";
	
	
	public static int AMBER_STRENGTH = 0;
	public static int AMETHYST_STRENGTH = 0;
	public static int ANGELITE_STRENGTH = 0;
	public static int AQUAMARINE_STRENGTH = 0;
	public static int BLACK_OPAL_STRENGTH = 0;
	public static int CORAL_STRENGTH = 0;
	public static int DIAMOND_STRENGTH = 0;
	public static int EMERALD_STRENGTH = 0;
	public static int GARNET_STRENGTH = 0;
	public static int JADE_STRENGTH = 0;
	public static int LAPIS_STRENGTH = 0;
	public static int MOONSTONE_STRENGTH = 0;
	public static int OBSIDIAN_STRENGTH = 0;
	public static int ONYX_STRENGTH = 0;
	public static int OPAL_STRENGTH = 0;
	public static int ORANGE_TOPAZ_STRENGTH = 0;
	public static int PAINITE_STRENGTH = 0;
	public static int PERIDOT_STRENGTH = 0;
	public static int RUBY_STRENGTH = 0;
	public static int SAPPHIRE_STRENGTH = 0;
	public static int TAAFFEITE_STRENGTH = 0;
	public static int TANZANITE_STRENGTH = 0;
	public static int TURQUOISE_STRENGTH = 0;
	public static int YELLOW_TOPAZ_STRENGTH = 0;
	
	public static int STEEL_STRENGTH = 0;
	public static int SILVER_STRENGTH = 0;
	public static int GOLD_STRENGTH = 0;
	public static int QUICKSILVER_STRENGTH = 0;
	public static int MITHRIL_STRENGTH = 0;
	public static int COBALT_STRENGTH = 0;
	public static int ADMANTIUM_STRENGTH = 0;
	public static int EBONY_STRENGTH = 0;
	public static int DIVINIUM_STRENGTH = 0;
	public static int MALOVENIUM_STRENGTH = 0;
	public static int CHANCIUM_STRENGTH = 0;
	
	public static void init(File file) {
		config = new Configuration(file);
		String category;
		
		category = "Gems Effects";
		config.addCustomCategoryComment(category, "Set Potion Effects For Each Gem");
		AMBER_EFFECT = config.getString("Amber", category, "RESISTANCE", "");
		AMETHYST_EFFECT = config.getString("Amethyst", category, "PotionRepair", "");
		ANGELITE_EFFECT = config.getString("Angelite", category, "PotionSlowFall", "");
		AQUAMARINE_EFFECT = config.getString("Aquamarine", category, "PotionDrown", "");
		BLACK_OPAL_EFFECT = config.getString("BlackOpal", category, "PotionCure", "");
		CORAL_EFFECT = config.getString("Coral", category, "PotionAntidote", ""); 
		DIAMOND_EFFECT = config.getString("Diamond", category, "PotionDiamondSkin", "");
		EMERALD_EFFECT = config.getString("Emerald", category, "PotionArchery", "");
		GARNET_EFFECT = config.getString("Garnet", category, "INSTANT_HEALTH", "");
		JADE_EFFECT = config.getString("Jade", category, "JUMP_BOOST", "");
		LAPIS_EFFECT = config.getString("Lapis", category, "PotionMagicFocus", "");
		MOONSTONE_EFFECT = config.getString("Moonstone", category, "NIGHT_VISION", "");
		OBSIDIAN_EFFECT = config.getString("Obsidian", category, "FIRE_RESISTANCE", "");
		ONYX_EFFECT = config.getString("Onyx", category, "INVISIBILITY", "");
		OPAL_EFFECT = config.getString("Opal", category, "PotionBless", "");
		ORANGE_TOPAZ_EFFECT = config.getString("OrangeTopaz", category, "LEVITATION", "");
		PAINITE_EFFECT = config.getString("Painite", category, "STRENGTH", "");
		PERIDOT_EFFECT = config.getString("Peridot", category, "SATURATION", "");
		RUBY_EFFECT = config.getString("Ruby", category, "PotionReach", "");
		SAPPHIRE_EFFECT = config.getString("Sapphire", category, "SPEED", "");
		TAAFFEITE_EFFECT = config.getString("Taafeite", category, "SATURATION", "");
		TANZANITE_EFFECT = config.getString("Tanzanite", category, "HASTE", "");
		TURQUOISE_EFFECT = config.getString("Turquoise", category, "WATER_BREATHING", "");
		YELLOW_TOPAZ_EFFECT = config.getString("YellowTopaz", category, "PotionIronSkin", "");
		
		category = "Materials Effects";
		config.addCustomCategoryComment(category, "Set Potion Effects For Each Material");
		STEEL_EFFECT = config.getString("YellowTopaz", category, "PotionIronSkin", "");
		SILVER_EFFECT = config.getString("YellowTopaz", category, "PotionPurity", "");
		GOLD_EFFECT = config.getString("YellowTopaz", category, "PotionAntidote", "");
		QUICKSILVER_EFFECT = config.getString("YellowTopaz", category, "SPEED", "");
		MITHRIL_EFFECT = config.getString("YellowTopaz", category, "PotionMagicFocus", "");
		COBALT_EFFECT = config.getString("YellowTopaz", category, "PotionResistance", "");
		ADMANTIUM_EFFECT = config.getString("YellowTopaz", category, "PotionRepair", "");
		EBONY_EFFECT = config.getString("YellowTopaz", category, "PotionMagicInhibition", "");
		DIVINIUM_EFFECT = config.getString("YellowTopaz", category, "PotionBless", "");
		MALOVENIUM_EFFECT = config.getString("YellowTopaz", category, "PotionCurse", "");
		CHANCIUM_EFFECT = config.getString("YellowTopaz", category, "PotionChance", "");
		
		category = "Gems Strengths";
		config.addCustomCategoryComment(category, "Set Potion Strengths For Each Gem");
		AMBER_STRENGTH = config.getInt("Amber", category, 0, 0, 255, "");
		AMETHYST_STRENGTH = config.getInt("Amethyst", category, 0, 0, 255, "");
		ANGELITE_STRENGTH = config.getInt("Angelite", category, 0, 0, 255, "");
		AQUAMARINE_STRENGTH = config.getInt("Aquamarine", category, 0, 0, 255, "");
		BLACK_OPAL_STRENGTH = config.getInt("BlackOpal", category, 0, 0, 255, "");
		CORAL_STRENGTH = config.getInt("Coral", category, 0, 0, 255, ""); 
		DIAMOND_STRENGTH = config.getInt("Diamond", category, 0, 0, 255, "");
		EMERALD_STRENGTH = config.getInt("Emerald", category, 0, 0, 255, "");
		GARNET_STRENGTH = config.getInt("Garnet", category, 0, 0, 255, "");
		JADE_STRENGTH = config.getInt("Jade", category, 0, 0, 255, "");
		LAPIS_STRENGTH = config.getInt("Lapis", category, 0, 0, 255, "");
		MOONSTONE_STRENGTH = config.getInt("Moonstone", category, 0, 0, 255, "");
		OBSIDIAN_STRENGTH = config.getInt("Obsidian", category, 0, 0, 255, "");
		ONYX_STRENGTH = config.getInt("Onyx", category, 0, 0, 255, "");
		OPAL_STRENGTH = config.getInt("Opal", category, 0, 0, 255, "");
		ORANGE_TOPAZ_STRENGTH = config.getInt("OrangeTopaz", category, 0, 0, 255, "");
		PAINITE_STRENGTH = config.getInt("Painite", category, 0, 0, 255, "");
		PERIDOT_STRENGTH = config.getInt("Peridot", category, 0, 0, 255, "");
		RUBY_STRENGTH = config.getInt("Ruby", category, 0, 0, 255, "");
		SAPPHIRE_STRENGTH = config.getInt("Sapphire", category, 0, 0, 255, "");
		TAAFFEITE_STRENGTH = config.getInt("Taafeite", category, 0, 0, 255, "");
		TANZANITE_STRENGTH = config.getInt("Tanzanite", category, 0, 0, 255, "");
		TURQUOISE_STRENGTH = config.getInt("Turquoise", category, 0, 0, 255, "");
		YELLOW_TOPAZ_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		
		category = "Materials Strengths";
		config.addCustomCategoryComment(category, "Set Potion Strengths For Each Material");
		STEEL_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		SILVER_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		GOLD_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		QUICKSILVER_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		MITHRIL_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		COBALT_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		ADMANTIUM_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		EBONY_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		DIVINIUM_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		MALOVENIUM_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		CHANCIUM_STRENGTH = config.getInt("YellowTopaz", category, 0, 0, 255, "");
		
		config.save();
	}
	
	public static void RegisterConfig(FMLPreInitializationEvent event) {
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
	
}

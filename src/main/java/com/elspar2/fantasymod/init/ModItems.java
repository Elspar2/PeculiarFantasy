package com.elspar2.fantasymod.init;

import java.util.ArrayList;
import java.util.List;

import com.elspar2.fantasymod.items.EnchantedItemBase;
import com.elspar2.fantasymod.items.ItemBase;
import com.elspar2.fantasymod.items.jewelry.*;
import com.elspar2.fantasymod.items.tools.*;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item> ();

	//Armor + Tool Materials
	//public static final ArmorMaterial ARMOR_MATERIAL_REDCHAOSGEM = EnumHelper.addArmorMaterial(",armor_material_redchaosgem", Reference.MOD_ID + ":redchaosgem", 15, new int[] {3, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	//Diamond Material 3, 1561, 8.0F, 3.0F, 10
    //Diamond Armor Material Boots, Leggings, Chestplate, Helmet 3,8,6,3
	public static final ToolMaterial MATERIAL_GEM = EnumHelper.addToolMaterial("material_gem", 3, 1600, 9.0F, 4.0F, 22);
	public static final ToolMaterial MATERIAL_SILVER = EnumHelper.addToolMaterial("material_silver", 3, 1600, 8.0F, 6.0F, 22);
	public static final ToolMaterial MATERIAL_QUICKSILVER = EnumHelper.addToolMaterial("material_quicksilver", 3, 700, 10.0F, 5.0F, 30);
	public static final ToolMaterial MATERIAL_MALACHITE = EnumHelper.addToolMaterial("material_malachite", 3, 1400, 9.0F, 6.0F, 22);
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 4, 1800, 10.0F, 7.0F, 10);
	public static final ToolMaterial MATERIAL_MITHRIL = EnumHelper.addToolMaterial("material_mithril", 5, 2048, 11.0F, 8.0F, 30);
	public static final ToolMaterial MATERIAL_COBALT = EnumHelper.addToolMaterial("material_cobalt", 5, 2358, 12.0F, 8.5F, 22);
	public static final ToolMaterial MATERIAL_ADMANTIUM = EnumHelper.addToolMaterial("material_admantium", 6, 3072, 14.0F, 10.0F, 30);
	public static final ToolMaterial MATERIAL_EBONY = EnumHelper.addToolMaterial("material_ebony", 7, 6144, 24.0F, 18.0F, 0);
	
	//The Purifier 
	public static final ToolMaterial MATERIAL_PURIFIER = EnumHelper.addToolMaterial("material_purifier", 5, 32767, 24.0F, 18.0F, 0);
	public static final ItemSword THE_PURIFIER = new EnchantedToolSword ("the_purifier", MATERIAL_PURIFIER);
	
	//The Harbinger
	
	//The Aurelion Bow
	
	//Ingots
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	//public static final Item QUICKSILVER_INGOT = new ItemBase("quicksilver_ingot");
	//public static final Item MALACHITE_INGOT = new ItemBase("malachite_ingot");
	public static final Item STEEL_INGOT = new ItemBase ("steel_ingot");
	public static final Item MITHRIL_INGOT = new EnchantedItemBase("mithril_ingot");
	//public static final Item COBALT_INGOT = new ItemBase("cobalt_ingot");
	//public static final Item ADMANTIUM_INGOT = new ItemBase("admantium_ingot");
	//public static final Item EBONY_INGOT = new ItemBase("ebony_ingot");
	
	//Nuggets
	//public static final Item SILVER_NUGGET = new ItemBase("silver_nugget");
	//public static final Item QUICKSILVER_NUGGET = new ItemBase("quicksilver_nugget");
	//public static final Item MALACHITE_NUGGET = new ItemBase("malachite_nugget");
	//public static final Item MITHRIL_NUGGET = new ItemBase ("mithril_nugget");
	//public static final Item COBALT_NUGGET = new ItemBase("cobalt_nugget");
	//public static final Item ADMANTIUM_NUGGET = new ItemBase("admantium_nugget");
	//public static final Item EBONY_NUGGET = new ItemBase("ebony_nugget");
	//public static final Item DIAMOND_NUGGET = new ItemBase ("diamond_nugget");
	//public static final Item EMERALD_NUGGET = new ItemBase ("emerald_nugget");
	//public static final Item OBSIDIAN_NUGGET = new ItemBase ("obsidian_nugget");
	
	//Wood
	//public static final Item ROWAN_STICK = new ItemBase ("rowan_stick");
	
	//Gems
	//public static final Item ALEXANDRITE = new ItemBase("alexandrite");
	public static final Item AMBER = new ItemBase("amber");
	public static final Item AMETHYST = new ItemBase("amethyst");
	public static final Item ANGELITE = new ItemBase("angelite");
	public static final Item AQUAMARINE = new ItemBase("aquamarine");
	//public static final Item AZURITE = new ItemBase("azurite");
	public static final Item BLACK_OPAL = new ItemBase("black_opal");
	public static final Item CORAL = new ItemBase("coral");
	//public static final Item FLUORITE = new ItemBase("fluorite");
	public static final Item GARNET = new ItemBase("garnet");
	public static final Item JADE = new ItemBase("jade");
	public static final Item MOONSTONE = new ItemBase("moonstone");
	public static final Item ONYX = new ItemBase("onyx");
	public static final Item OPAL = new ItemBase("opal");
	public static final Item ORANGE_TOPAZ = new ItemBase("orange_topaz");
	public static final Item PAINITE = new ItemBase("painite");
	//public static final Item PEARL = new ItemBase("pearl");
	public static final Item PERIDOT = new ItemBase("peridot");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item TAAFFEITE = new ItemBase("taaffeite");
	public static final Item TANZANITE = new ItemBase("tanzanite");
	public static final Item TURQUOISE = new ItemBase("turquoise");
	public static final Item YELLOW_TOPAZ = new ItemBase("yellow_topaz");
	
	//Steel Rings
	//public static final Item STEEL_RING = new Ring("steel_ring", "steel", null);
	//public static final Item STEEL_YELLOW_TOPAZ_RING = new Ring("steel_yellow_topaz_ring", "steel", "yellowTopaz");
	
	//Silver Rings
	public static final Item SILVER_RING = new Ring("silver_ring", "silver", null);
	public static final Item SILVER_AMBER_RING = new Ring("silver_amber_ring", "silver", "amber");
	public static final Item SILVER_AMETHYST_RING = new Ring("silver_amethyst_ring", "silver", "amethyst");
	public static final Item SILVER_ANGELITE_RING = new Ring("silver_angelite_ring", "silver", "angelite");
	public static final Item SILVER_AQUAMARINE_RING = new Ring("silver_aquamarine_ring", "silver", "aquamarine");
	public static final Item SILVER_BLACK_OPAL_RING = new Ring("silver_black_opal_ring", "silver", "blackOpal");
	public static final Item SILVER_CORAL_RING = new Ring("silver_coral_ring", "silver", "coral");
	public static final Item SILVER_DIAMOND_RING = new Ring("silver_diamond_ring", "silver", "diamond");
	public static final Item SILVER_EMERALD_RING = new Ring("silver_emerald_ring", "silver", "emerald");
	public static final Item SILVER_GARNET_RING = new Ring("silver_garnet_ring", "silver", "garnet");
	public static final Item SILVER_JADE_RING = new Ring("silver_jade_ring", "silver", "jade");
	public static final Item SILVER_LAPIS_RING = new Ring("silver_lapis_ring", "silver", "lapis");
	public static final Item SILVER_MOONSTONE_RING = new Ring("silver_moonstone_ring", "silver", "moonstone");
	public static final Item SILVER_OBSIDIAN_RING = new Ring("silver_obsidian_ring", "silver", "obsidian");
	public static final Item SILVER_ONYX_RING = new Ring("silver_onyx_ring", "silver", "onyx");
	public static final Item SILVER_OPAL_RING = new Ring("silver_opal_ring", "silver", "opal");
	public static final Item SILVER_ORANGE_TOPAZ_RING = new Ring("silver_orange_topaz_ring", "silver", "orangeTopaz");
	public static final Item SILVER_PAINITE_RING = new Ring("silver_painite_ring", "silver", "painite");
	public static final Item SILVER_PERIDOT_RING = new Ring("silver_peridot_ring", "silver", "peridot");
	public static final Item SILVER_RUBY_RING = new Ring("silver_ruby_ring", "silver", "ruby");
	public static final Item SILVER_SAPPHIRE_RING = new Ring("silver_sapphire_ring", "silver", "sapphire");
	public static final Item SILVER_TAAFFEITE_RING = new Ring("silver_taaffeite_ring", "silver", "taaffeite");
	public static final Item SILVER_TANZANITE_RING = new Ring("silver_tanzanite_ring", "silver", "tanzanite");
	public static final Item SILVER_TURQUOISE_RING = new Ring("silver_turquoise_ring", "silver", "turquoise");
	public static final Item SILVER_YELLOW_TOPAZ_RING = new Ring("silver_yellow_topaz_ring", "silver", "yellowTopaz");
	
	//Gold Rings
	public static final Item GOLD_RING = new Ring("gold_ring", "gold", null);
	public static final Item GOLD_AMBER_RING = new Ring("gold_amber_ring", "gold", "amber");
	public static final Item GOLD_AMETHYST_RING = new Ring("gold_amethyst_ring", "gold", "amethyst");
	public static final Item GOLD_ANGELITE_RING = new Ring("gold_angelite_ring", "gold", "angelite");
	public static final Item GOLD_AQUAMARINE_RING = new Ring("gold_aquamarine_ring", "gold", "aquamarine");
	public static final Item GOLD_BLACK_OPAL_RING = new Ring("gold_black_opal_ring", "gold", "blackOpal");
	public static final Item GOLD_CORAL_RING = new Ring("gold_coral_ring", "gold", "coral");
	public static final Item GOLD_DIAMOND_RING = new Ring("gold_diamond_ring", "gold", "diamond");
	public static final Item GOLD_EMERALD_RING = new Ring("gold_emerald_ring", "gold", "emerald");
	public static final Item GOLD_GARNET_RING = new Ring("gold_garnet_ring", "gold", "garnet");
	public static final Item GOLD_JADE_RING = new Ring("gold_jade_ring", "gold", "jade");
	public static final Item GOLD_LAPIS_RING = new Ring("gold_lapis_ring", "gold", "lapis");
	public static final Item GOLD_MOONSTONE_RING = new Ring("gold_moonstone_ring", "gold", "moonstone");
	public static final Item GOLD_OBSIDIAN_RING = new Ring("gold_obsidian_ring", "gold", "obsidian");
	public static final Item GOLD_ONYX_RING = new Ring("gold_onyx_ring", "gold", "onyx");
	public static final Item GOLD_OPAL_RING = new Ring("gold_opal_ring", "gold", "opal");
	public static final Item GOLD_ORANGE_TOPAZ_RING = new Ring("gold_orange_topaz_ring", "gold", "orangeTopaz");
	public static final Item GOLD_PAINITE_RING = new Ring("gold_painite_ring", "gold", "painite");
	public static final Item GOLD_PERIDOT_RING = new Ring("gold_peridot_ring", "gold", "peridot");
	public static final Item GOLD_RUBY_RING = new Ring("gold_ruby_ring", "gold", "ruby");
	public static final Item GOLD_SAPPHIRE_RING = new Ring("gold_sapphire_ring", "gold", "sapphire");
	public static final Item GOLD_TAAFFEITE_RING = new Ring("gold_taaffeite_ring", "gold", "taaffeite");
	public static final Item GOLD_TANZANITE_RING = new Ring("gold_tanzanite_ring", "gold", "tanzanite");
	public static final Item GOLD_TURQUOISE_RING = new Ring("gold_turquoise_ring", "gold", "turquoise");
	public static final Item GOLD_YELLOW_TOPAZ_RING = new Ring("gold_yellow_topaz_ring", "gold", "yellowTopaz");
	
	//Quicksilver Rings
	//public static final Item QUICKSILVER_RING = new Ring ("quicksilver_ring", "quicksilver", null);
	//public static final Item QUICKSILVER_AMBER_RING = new Ring ("quicksilver_amber_ring", "quicksilver", "amber");
	
	//Mithril Rings
	public static final Item MITHRIL_RING = new Ring("mithril_ring", "mithril", null);
	public static final Item MITHRIL_AMBER_RING = new Ring("mithril_amber_ring", "mithril", "amber");
	public static final Item MITHRIL_AMETHYST_RING = new Ring("mithril_amethyst_ring", "mithril", "amethyst");
	public static final Item MITHRIL_ANGELITE_RING = new Ring("mithril_angelite_ring", "mithril", "angelite");
	public static final Item MITHRIL_AQUAMARINE_RING = new Ring("mithril_aquamarine_ring", "mithril", "aquamarine");
	public static final Item MITHRIL_BLACK_OPAL_RING = new Ring("mithril_black_opal_ring", "mithril", "blackOpal");
	public static final Item MITHRIL_CORAL_RING = new Ring("mithril_coral_ring", "mithril", "coral");
	public static final Item MITHRIL_DIAMOND_RING = new Ring("mithril_diamond_ring", "mithril", "diamond");
	public static final Item MITHRIL_EMERALD_RING = new Ring("mithril_emerald_ring", "mithril", "emerald");
	public static final Item MITHRIL_GARNET_RING = new Ring("mithril_garnet_ring", "mithril", "garnet");
	public static final Item MITHRIL_JADE_RING = new Ring("mithril_jade_ring", "mithril", "jade");
	public static final Item MITHRIL_LAPIS_RING = new Ring("mithril_lapis_ring", "mithril", "lapis");
	public static final Item MITHRIL_MOONSTONE_RING = new Ring("mithril_moonstone_ring", "mithril", "moonstone");
	public static final Item MITHRIL_OBSIDIAN_RING = new Ring("mithril_obsidian_ring", "mithril", "obsidian");
	public static final Item MITHRIL_ONYX_RING = new Ring("mithril_onyx_ring", "mithril", "onyx");
	public static final Item MITHRIL_OPAL_RING = new Ring("mithril_opal_ring", "mithril", "opal");
	public static final Item MITHRIL_ORANGE_TOPAZ_RING = new Ring("mithril_orange_topaz_ring", "mithril", "orangeTopaz");
	public static final Item MITHRIL_PAINITE_RING = new Ring("mithril_painite_ring", "mithril", "painite");
	public static final Item MITHRIL_PERIDOT_RING = new Ring("mithril_peridot_ring", "mithril", "peridot");
	public static final Item MITHRIL_RUBY_RING = new Ring("mithril_ruby_ring", "mithril", "ruby");
	public static final Item MITHRIL_SAPPHIRE_RING = new Ring("mithril_sapphire_ring", "mithril", "sapphire");
	public static final Item MITHRIL_TAAFFEITE_RING = new Ring("mithril_taaffeite_ring", "mithril", "taffeite");
	public static final Item MITHRIL_TANZANITE_RING = new Ring("mithril_tanzanite_ring", "mithril", "tanzanite");
	public static final Item MITHRIL_TURQUOISE_RING = new Ring("mithril_turquoise_ring", "mithril", "turquoise");
	public static final Item MITHRIL_YELLOW_TOPAZ_RING = new Ring("mithril_yellow_topaz_ring", "mithril", "yellowTopaz");
	
	//Cobalt Rings
	//public static final Item COBALT_RING = new Ring ("cobalt_ring", "cobalt", null);
	//public static final Item COBALT_TANZANITE_RING = new Ring ("cobalt_tanzanite_ring", "cobalt", "tanzanite");
	
	//Admantium Rings
	//public static final Item ADMANTIUM_RING = new Ring ("admantium_ring", "admantium", null);
	//public static final Item ADMANTIUM_PAINITE_RING = new Ring ("admantium_painite_ring", "admantium", "painite");
	
	//Ebony Rings
	//public static final Item EBONY_RING = new Ring ("ebony_ring", "ebony", null);
	//public static final Item EBONY_ONYX_RING = new Ring ("ebony_onyx_ring", "ebony", "onyx");
	
	//Divinium Ring
	//public static final Item DIVINIUM_RING = new Ring ("divinium_ring", "divinium", null);
	//public static final Item DIVINIUM_ANGELITE_RING = new Ring ("divinium_angelite_ring", "divinium", "angelite");
	
	//Malovenium Rings
	//public static final Item MALOVENIUM_RING = new Ring ("malovenium_ring", "malovenium", null);
	//public static final Item MALOVENIUM_BLACK_OPAL_RING = new Ring ("malovanium_black_opal_ring", "malovenium", "blackOpal");
	
	//Chancium Rings
	//public static final Item CHANCIUM_RING = new Ring ("chancium_ring", "chancium", null);
	//public static final Item CHANCIUM_AMETHYST_RING = new Ring ("chancium_amethyst_ring", "chancium", "amethyst");

	//Silver Amulets
	public static final Item SILVER_AMULET = new Amulet("silver_amulet", "silver", null);
	public static final Item SILVER_AMBER_AMULET = new Amulet("silver_amber_amulet", "silver", "amber");
	public static final Item SILVER_AMETHYST_AMULET = new Amulet("silver_amethyst_amulet", "silver", "amethyst");
	public static final Item SILVER_ANGELITE_AMULET = new Amulet("silver_angelite_amulet", "silver", "angelite");
	public static final Item SILVER_AQUAMARINE_AMULET = new Amulet("silver_aquamarine_amulet", "silver", "aquamarine");
	public static final Item SILVER_BLACK_OPAL_AMULET = new Amulet("silver_black_opal_amulet", "silver", "blackOpal");
	public static final Item SILVER_CORAL_AMULET = new Amulet("silver_coral_amulet", "silver", "coral");
	public static final Item SILVER_DIAMOND_AMULET = new Amulet("silver_diamond_amulet", "silver", "diamond");
	public static final Item SILVER_EMERALD_AMULET = new Amulet("silver_emerald_amulet", "silver", "emerald");
	public static final Item SILVER_GARNET_AMULET = new Amulet("silver_garnet_amulet", "silver", "garnet");
	public static final Item SILVER_JADE_AMULET = new Amulet("silver_jade_amulet", "silver", "jade");
	public static final Item SILVER_LAPIS_AMULET = new Amulet("silver_lapis_amulet", "silver", "lapis");
	public static final Item SILVER_MOONSTONE_AMULET = new Amulet("silver_moonstone_amulet", "silver", "moonstone");
	public static final Item SILVER_OBSIDIAN_AMULET = new Amulet("silver_obsidian_amulet", "silver", "obsidian");
	public static final Item SILVER_ONYX_AMULET = new Amulet("silver_onyx_amulet", "silver", "onyx");
	public static final Item SILVER_OPAL_AMULET = new Amulet("silver_opal_amulet", "silver", "opal");
	public static final Item SILVER_ORANGE_TOPAZ_AMULET = new Amulet("silver_orange_topaz_amulet", "silver", "orangeTopaz");
	public static final Item SILVER_PAINITE_AMULET = new Amulet("silver_painite_amulet", "silver", "painite");
	public static final Item SILVER_PERIDOT_AMULET = new Amulet("silver_peridot_amulet", "silver", "peridot");
	public static final Item SILVER_RUBY_AMULET = new Amulet("silver_ruby_amulet", "silver", "ruby");
	public static final Item SILVER_SAPPHIRE_AMULET = new Amulet("silver_sapphire_amulet", "silver", "sapphire");
	public static final Item SILVER_TAAFFEITE_AMULET = new Amulet("silver_taaffeite_amulet", "silver", "taaffeite");
	public static final Item SILVER_TANZANITE_AMULET = new Amulet("silver_tanzanite_amulet", "silver", "tanzanite");
	public static final Item SILVER_TURQUOISE_AMULET = new Amulet("silver_turquoise_amulet", "silver", "turquoise");
	public static final Item SILVER_YELLOW_TOPAZ_AMULET = new Amulet("silver_yellow_topaz_amulet", "silver", "yellowTopaz");
	
	//Gold Amulets
	public static final Item GOLD_AMULET = new Amulet("gold_amulet", "gold", null);
	public static final Item GOLD_AMBER_AMULET = new Amulet("gold_amber_amulet", "gold", "amber");
	public static final Item GOLD_AMETHYST_AMULET = new Amulet("gold_amethyst_amulet", "gold", "amethyst");
	public static final Item GOLD_ANGELITE_AMULET = new Amulet("gold_angelite_amulet", "gold", "angelite");
	public static final Item GOLD_AQUAMARINE_AMULET = new Amulet("gold_aquamarine_amulet", "gold", "aquamarine");
	public static final Item GOLD_BLACK_OPAL_AMULET = new Amulet("gold_black_opal_amulet", "gold", "blackOpal");
	public static final Item GOLD_CORAL_AMULET = new Amulet("gold_coral_amulet", "gold", "coral");
	public static final Item GOLD_DIAMOND_AMULET = new Amulet("gold_diamond_amulet", "gold", "diamond");
	public static final Item GOLD_EMERALD_AMULET = new Amulet("gold_emerald_amulet", "gold", "emerald");
	public static final Item GOLD_GARNET_AMULET = new Amulet("gold_garnet_amulet", "gold", "garnet");
	public static final Item GOLD_JADE_AMULET = new Amulet("gold_jade_amulet", "gold", "jade");
	public static final Item GOLD_LAPIS_AMULET = new Amulet("gold_lapis_amulet", "gold", "lapis");
	public static final Item GOLD_MOONSTONE_AMULET = new Amulet("gold_moonstone_amulet", "gold", "moonstone");
	public static final Item GOLD_OBSIDIAN_AMULET = new Amulet("gold_obsidian_amulet", "gold", "obsidian");
	public static final Item GOLD_ONYX_AMULET = new Amulet("gold_onyx_amulet", "gold", "onyx");
	public static final Item GOLD_OPAL_AMULET = new Amulet("gold_opal_amulet", "gold", "opal");
	public static final Item GOLD_ORANGE_TOPAZ_AMULET = new Amulet("gold_orange_topaz_amulet", "gold", "orangeTopaz");
	public static final Item GOLD_PAINITE_AMULET = new Amulet("gold_painite_amulet", "gold", "painite");
	public static final Item GOLD_PERIDOT_AMULET = new Amulet("gold_peridot_amulet", "gold", "peridot");
	public static final Item GOLD_RUBY_AMULET = new Amulet("gold_ruby_amulet", "gold", "ruby");
	public static final Item GOLD_SAPPHIRE_AMULET = new Amulet("gold_sapphire_amulet", "gold", "sapphire");
	public static final Item GOLD_TAAFFEITE_AMULET = new Amulet("gold_taaffeite_amulet", "gold", "taaffeite");
	public static final Item GOLD_TANZANITE_AMULET = new Amulet("gold_tanzanite_amulet", "gold", "tanzanite");
	public static final Item GOLD_TURQUOISE_AMULET = new Amulet("gold_turquoise_amulet", "gold", "turquoise");
	public static final Item GOLD_YELLOW_TOPAZ_AMULET = new Amulet("gold_yellow_topaz_amulet", "gold", "yellowTopaz");
	
	//Mithril Amulets
	public static final Item MITHRIL_AMULET = new Amulet("mithril_amulet", "mithril", null);
	public static final Item MITHRIL_AMBER_AMULET = new Amulet("mithril_amber_amulet", "mithril", "amber");
	public static final Item MITHRIL_AMETHYST_AMULET = new Amulet("mithril_amethyst_amulet", "mithril", "amethyst");
	public static final Item MITHRIL_ANGELITE_AMULET = new Amulet("mithril_angelite_amulet", "mithril", "angelite");
	public static final Item MITHRIL_AQUAMARINE_AMULET = new Amulet("mithril_aquamarine_amulet", "mithril", "aquamarine");
	public static final Item MITHRIL_BLACK_OPAL_AMULET = new Amulet("mithril_black_opal_amulet", "mithril", "blackOpal");
	public static final Item MITHRIL_CORAL_AMULET = new Amulet("mithril_coral_amulet", "mithril", "coral");
	public static final Item MITHRIL_DIAMOND_AMULET = new Amulet("mithril_diamond_amulet", "mithril", "diamond");
	public static final Item MITHRIL_EMERALD_AMULET = new Amulet("mithril_emerald_amulet", "mithril", "emerald");
	public static final Item MITHRIL_GARNET_AMULET = new Amulet("mithril_garnet_amulet", "mithril", "garnet");
	public static final Item MITHRIL_JADE_AMULET = new Amulet("mithril_jade_amulet", "mithril", "jade");
	public static final Item MITHRIL_LAPIS_AMULET = new Amulet("mithril_lapis_amulet", "mithril", "lapis");
	public static final Item MITHRIL_MOONSTONE_AMULET = new Amulet("mithril_moonstone_amulet", "mithril", "moonstone");
	public static final Item MITHRIL_OBSIDIAN_AMULET = new Amulet("mithril_obsidian_amulet", "mithril", "obsidian");
	public static final Item MITHRIL_ONYX_AMULET = new Amulet("mithril_onyx_amulet", "mithril", "onyx");
	public static final Item MITHRIL_OPAL_AMULET = new Amulet("mithril_opal_amulet", "mithril", "opal");
	public static final Item MITHRIL_ORANGE_TOPAZ_AMULET = new Amulet("mithril_orange_topaz_amulet", "mithril", "orangeTopaz");
	public static final Item MITHRIL_PAINITE_AMULET = new Amulet("mithril_painite_amulet", "mithril", "painite");
	public static final Item MITHRIL_PERIDOT_AMULET = new Amulet("mithril_peridot_amulet", "mithril", "peridot");
	public static final Item MITHRIL_RUBY_AMULET = new Amulet("mithril_ruby_amulet", "mithril", "ruby");
	public static final Item MITHRIL_SAPPHIRE_AMULET = new Amulet("mithril_sapphire_amulet", "mithril", "sapphire");
	public static final Item MITHRIL_TAAFFEITE_AMULET = new Amulet("mithril_taaffeite_amulet", "mithril", "taaffeite");
	public static final Item MITHRIL_TANZANITE_AMULET = new Amulet("mithril_tanzanite_amulet", "mithril", "tanzanite");
	public static final Item MITHRIL_TURQUOISE_AMULET = new Amulet("mithril_turquoise_amulet", "mithril", "turquoise");
	public static final Item MITHRIL_YELLOW_TOPAZ_AMULET = new Amulet("mithril_yellow_topaz_amulet", "mithril", "yellowTopaz");
	
	//Silver Tools/Armor
	public static final ItemSword SILVER_SWORD = new ToolSword ("silver_sword", MATERIAL_SILVER);
	//public static final ItemSpade SILVER_SHOVEL = new ToolSpade("silver_shovel", MATERIAL_SILVER);
	//public static final ItemPickaxe SILVER_PICKAXE = new ToolPickaxe("silver_pickaxe", MATERIAL_SILVER);
	//public static final ItemAxe SILVER_AXE = new ToolAxe("silver_axe", MATERIAL_SILVER);
	//public static final ItemHoe SILVER_HOE = new ToolHoe("silver_hoe", MATERIAL_SILVER);
	
	//Steel Tools/Armor
	public static final ItemSword STEEL_SWORD = new ToolSword ("steel_sword", MATERIAL_STEEL);
	//public static final ItemSpade STEEL_SHOVEL = new ToolSpade("steel_shovel", MATERIAL_STEEL);
	//public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", MATERIAL_STEEL);
	//public static final ItemAxe STEEL_AXE = new ToolAxe("steel_axe", MATERIAL_STEEL);
	//public static final ItemHoe STEEL_HOE = new ToolHoe("steel_hoe", MATERIAL_STEEL);
	
	//Quicksilver Tools/Armor
	public static final ItemSword QUICKSILVER_SWORD = new ToolSword ("quicksilver_sword", MATERIAL_QUICKSILVER);
	//public static final ItemSpade QUICKSILVER_SHOVEL = new ToolSpade("quicksilver_shovel", MATERIAL_QUICKSILVER);
	//public static final ItemPickaxe QUICKSILVER_PICKAXE = new ToolPickaxe("quicksilver_pickaxe", MATERIAL_QUICKSILVER);
	//public static final ItemAxe QUICKSILVER_AXE = new ToolAxe("quicksilver_axe", MATERIAL_QUICKSILVER);
	//public static final ItemHoe QUICKSILVER_HOE = new ToolHoe("quicksilver_hoe", MATERIAL_QUICKSILVER);
	
	//Malachite Tools/Armor
	public static final ItemSword MALACHITE_SWORD = new ToolSword ("malachite_sword", MATERIAL_MALACHITE);
	//public static final ItemSpade MALACHITE_SHOVEL = new ToolSpade("malachite_shovel", MATERIAL_MALACHITE);
	//public static final ItemPickaxe MALACHITE_PICKAXE = new ToolPickaxe("malachite_pickaxe", MATERIAL_MALACHITE);
	//public static final ItemAxe MALACHITE_AXE = new ToolAxe("malachite_axe", MATERIAL_MALACHITE);
	//public static final ItemHoe MALACHITE_HOE = new ToolHoe("malachite_hoe", MATERIAL_MALACHITE);
	
	//Mithril Tools/Armor
	public static final ItemSword MITHRIL_SWORD = new EnchantedToolSword ("mithril_sword", MATERIAL_MITHRIL);
	//public static final ItemSpade MITHRIL_SHOVEL = new EnchantedToolSpade("mithril_shovel", MATERIAL_MITHRIL);
	//public static final ItemPickaxe MITHRIL_PICKAXE = new EnchantedToolPickaxe("mithril_pickaxe", MATERIAL_MITHRIL);
	//public static final ItemAxe MITHRIL_AXE = new EnchantedToolAxe("mithril_axe", MATERIAL_MITHRIL);
	//public static final ItemHoe MITHRIL_HOE = new EnchantedToolHoe("mithril_hoe", MATERIAL_MITHRIL);
	
	//Cobalt Tools/Armor
	public static final ItemSword COBALT_SWORD = new ToolSword("cobalt_sword", MATERIAL_COBALT);
	//public static final ItemSpade COBALT_SHOVEL = new ToolSpade("cobalt_shovel", MATERIAL_COBALT);
	//public static final ItemPickaxe COBALT_PICKAXE = new ToolPickaxe("cobalt_pickaxe", MATERIAL_COBALT);
	//public static final ItemAxe COBALT_AXE = new ToolAxe("cobalt_axe", MATERIAL_COBALT);
	//public static final ItemHoe COBALT_HOE = new ToolHoe("cobalt_hoe", MATERIAL_COBALT);
	
	//Admantium Tools/Armor
	public static final ItemSword ADMANTIUM_SWORD = new ToolSword("admantium_sword", MATERIAL_ADMANTIUM);
	//public static final ItemSpade ADMANTIUM_SHOVEL = new ToolSpade("admantium_shovel", MATERIAL_ADMANTIUM);
	//public static final ItemPickaxe ADMANTIUM_PICKAXE = new ToolPickaxe("admantium_pickaxe", MATERIAL_ADMANTIUM);
	//public static final ItemAxe ADMANTIUM_AXE = new ToolAxe("admantium_axe", MATERIAL_ADMANTIUM);
	//public static final ItemHoe ADMANTIUM_HOE = new ToolHoe("admantium_hoe", MATERIAL_ADMANTIUM);
	
	//Ebony Tools/Armor
	public static final ItemSword EBONY_SWORD = new ToolSword("ebony_sword", MATERIAL_EBONY);
	//public static final ItemSpade EBONY_SHOVEL = new ToolSpade("ebony_shovel", MATERIAL_EBONY);
	//public static final ItemPickaxe EBONY_PICKAXE = new ToolPickaxe("ebony_pickaxe", MATERIAL_EBONY);
	//public static final ItemAxe EBONY_AXE = new ToolAxe("ebony_axe", MATERIAL_EBONY);
	//public static final ItemHoe EBONY_HOE = new ToolHoe("ebony_hoe", MATERIAL_EBONY);
	
	//Gem Tools
	//public static final ItemSword EMERALD_SWORD = new ToolSword
	//public static final ItemSword AMETHYST_SWORD = new ToolSword
	//public static final ItemSword RUBY_SWORD = new ToolSword
	//public static final ItemSword SAPPHIRE_SWORD = new ToolSword
	
	//Gem Armor
	//public static final Item REDCHAOSGEM_HELMET = new ArmorBase("redchaosgem_helmet", ARMOR_MATERIAL_REDCHAOSGEM, 1, EntityEquipmentSlot.HEAD);
	//public static final Item REDCHAOSGEM_CHESTPLATE = new ArmorBase("redchaosgem_chestplate", ARMOR_MATERIAL_REDCHAOSGEM, 1, EntityEquipmentSlot.CHEST);
	//public static final Item REDCHAOSGEM_LEGGINGS = new ArmorBase("redchaosgem_leggings", ARMOR_MATERIAL_REDCHAOSGEM, 2, EntityEquipmentSlot.LEGS);
	//public static final Item REDCHAOSGEM_BOOTS = new ArmorBase("redchaosgem_boots", ARMOR_MATERIAL_REDCHAOSGEM, 1, EntityEquipmentSlot.FEET);
	
	//Food
	//public static final Item GREEN_APPLE = new FoodBase("green_apple", 4, 2.4f, false);
}
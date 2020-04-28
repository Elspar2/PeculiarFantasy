package com.elspar2.fantasymod.util.handlers;

import com.elspar2.fantasymod.init.ModBlocks;
import com.elspar2.fantasymod.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler 
{
	
	public static void registerOreDictionary()
	{
		
		//OreDictionary.registerOre("gemGreenChaos", ModItems.GREENCHAOSGEM);
		//OreDictionary.registerOre("oreGreenChaos", ModBlocks.GREENCHAOSGEM_ORE);
		
		//Ore Blocks
		OreDictionary.registerOre("oreAmber", ModBlocks.AMBER_ORE);
		OreDictionary.registerOre("oreAmethyst", ModBlocks.AMETHYST_ORE);
		OreDictionary.registerOre("oreAngelite", ModBlocks.ANGELITE_ORE);
		OreDictionary.registerOre("oreAquamarine", ModBlocks.AQUAMARINE_ORE);
		OreDictionary.registerOre("oreBlackOpal", ModBlocks.BLACK_OPAL_ORE);
		OreDictionary.registerOre("oreCoral", ModBlocks.CORAL_ORE);
		OreDictionary.registerOre("oreRedGarnet", ModBlocks.GARNET_ORE);
		OreDictionary.registerOre("oreJade", ModBlocks.JADE_ORE);
		OreDictionary.registerOre("oreMoonstone", ModBlocks.MOONSTONE_ORE);
		OreDictionary.registerOre("oreOnyx", ModBlocks.ONYX_ORE);
		OreDictionary.registerOre("oreOpal", ModBlocks.OPAL_ORE);
		OreDictionary.registerOre("oreTopaz", ModBlocks.ORANGE_TOPAZ_ORE);
		OreDictionary.registerOre("oreOrangeTopaz", ModBlocks.ORANGE_TOPAZ_ORE);
		OreDictionary.registerOre("orePainite", ModBlocks.PAINITE_ORE);
		OreDictionary.registerOre("orePeridot", ModBlocks.PERIDOT_ORE);
		OreDictionary.registerOre("oreRuby", ModBlocks.RUBY_ORE);
		OreDictionary.registerOre("oreSapphire", ModBlocks.SAPPHIRE_ORE);
		OreDictionary.registerOre("oreTaaffeite", ModBlocks.TAAFFEITE_ORE);
		OreDictionary.registerOre("oreTanzanite", ModBlocks.TANZANITE_ORE);
		OreDictionary.registerOre("oreTurquoise", ModBlocks.TURQUOISE_ORE);
		OreDictionary.registerOre("oreTopaz", ModBlocks.YELLOW_TOPAZ_ORE);
		OreDictionary.registerOre("oreYellowTopaz", ModBlocks.YELLOW_TOPAZ_ORE);
		OreDictionary.registerOre("oreMithril", ModBlocks.MITHRIL_ORE);
		OreDictionary.registerOre("oreSteel", ModBlocks.STEEL_ORE);
		OreDictionary.registerOre("oreSilver", ModBlocks.SILVER_ORE);
		//OreDictionary.registerOre("oreCobalt", ModBlocks.COBALT_ORE);
		//OreDictionary.registerOre("oreAdmantium", ModBlocks.ADMANTIUM_ORE);
		//OreDictionary.registerOre("oreEbony", ModBlocks.EBONY_ORE);
		//OreDictionary.registerOre("oreMalachite", ModBlocks.MALACHITE_ORE);
		//OreDictionary.registerOre("oreQuicksilver", ModBlocks.QUICKSILVER_ORE);
		
		//Block Blocks
		OreDictionary.registerOre("blockAmber", ModBlocks.AMBER_BLOCK);
		OreDictionary.registerOre("blockAmethyst", ModBlocks.AMETHYST_BLOCK);
		OreDictionary.registerOre("blockAngelite", ModBlocks.ANGELITE_BLOCK);
		OreDictionary.registerOre("blockAquamarine", ModBlocks.AQUAMARINE_BLOCK);
		OreDictionary.registerOre("blockBlackOpal", ModBlocks.BLACK_OPAL_BLOCK);
		OreDictionary.registerOre("blockCoral", ModBlocks.CORAL_BLOCK);
		OreDictionary.registerOre("blockRedGarnet", ModBlocks.GARNET_BLOCK);
		OreDictionary.registerOre("blockJade", ModBlocks.JADE_BLOCK);
		OreDictionary.registerOre("blockMoonstone", ModBlocks.MOONSTONE_BLOCK);
		OreDictionary.registerOre("blockOnyx", ModBlocks.ONYX_BLOCK);
		OreDictionary.registerOre("blockOpal", ModBlocks.OPAL_BLOCK);
		OreDictionary.registerOre("blockTopaz", ModBlocks.ORANGE_TOPAZ_BLOCK);
		OreDictionary.registerOre("blockOrangeTopaz", ModBlocks.ORANGE_TOPAZ_BLOCK);
		OreDictionary.registerOre("blockPainite", ModBlocks.PAINITE_BLOCK);
		OreDictionary.registerOre("blockPeridot", ModBlocks.PERIDOT_BLOCK);
		OreDictionary.registerOre("blockRuby", ModBlocks.RUBY_BLOCK);
		OreDictionary.registerOre("blockSapphire", ModBlocks.SAPPHIRE_BLOCK);
		OreDictionary.registerOre("blockTaaffeite", ModBlocks.TAAFFEITE_BLOCK);
		OreDictionary.registerOre("blockTanzanite", ModBlocks.TANZANITE_BLOCK);
		OreDictionary.registerOre("blockTurquoise", ModBlocks.TURQUOISE_BLOCK);
		OreDictionary.registerOre("blockTopaz", ModBlocks.YELLOW_TOPAZ_BLOCK);
		OreDictionary.registerOre("blockYellowTopaz", ModBlocks.YELLOW_TOPAZ_BLOCK);
		OreDictionary.registerOre("blockMithril", ModBlocks.MITHRIL_BLOCK);
		OreDictionary.registerOre("blockSteel", ModBlocks.STEEL_BLOCK);
		OreDictionary.registerOre("blockSilver", ModBlocks.SILVER_BLOCK);
		//OreDictionary.registerOre("blockCobalt", ModBlocks.COBALT_BLOCK);
		//OreDictionary.registerOre("blockAdmantium", ModBlocks.ADMANTIUM_BLOCK);
		//OreDictionary.registerOre("blockEbony", ModBlocks.EBONY_BLOCK);
		//OreDictionary.registerOre("blockMalachite", ModBlocks.MALACHITE_BLOCK);
		//OreDictionary.registerOre("blockQuicksilver", ModBlocks.QUICKSILVER_BLOCK);
		OreDictionary.registerOre("blockObsidian", Blocks.OBSIDIAN);
		
		//Items
		OreDictionary.registerOre("gemAmber", ModItems.AMBER);
		OreDictionary.registerOre("gemAmethyst", ModItems.AMETHYST);
		OreDictionary.registerOre("gemAngelite", ModItems.ANGELITE);
		OreDictionary.registerOre("gemAquamarine", ModItems.AQUAMARINE);
		OreDictionary.registerOre("gemBlackOpal", ModItems.BLACK_OPAL);
		OreDictionary.registerOre("gemCoral", ModItems.CORAL);
		OreDictionary.registerOre("gemRedGarnet", ModItems.GARNET);
		OreDictionary.registerOre("gemJade", ModItems.JADE);
		OreDictionary.registerOre("gemMoonstone", ModItems.MOONSTONE);
		OreDictionary.registerOre("gemOnyx", ModItems.ONYX);
		OreDictionary.registerOre("gemOpal", ModItems.OPAL);
		OreDictionary.registerOre("gemTopaz", ModItems.ORANGE_TOPAZ);
		OreDictionary.registerOre("gemOrangeTopaz", ModItems.ORANGE_TOPAZ);
		OreDictionary.registerOre("gemPainite", ModItems.PAINITE);
		OreDictionary.registerOre("gemPeridot", ModItems.PERIDOT);
		OreDictionary.registerOre("gemRuby", ModItems.RUBY);
		OreDictionary.registerOre("gemSapphire", ModItems.SAPPHIRE);
		OreDictionary.registerOre("gemTaaffeite", ModItems.TAAFFEITE);
		OreDictionary.registerOre("gemTanzanite", ModItems.TANZANITE);
		OreDictionary.registerOre("gemTurquoise", ModItems.TURQUOISE);
		OreDictionary.registerOre("gemTopaz", ModItems.YELLOW_TOPAZ);
		OreDictionary.registerOre("gemYellowTopaz", ModItems.YELLOW_TOPAZ);
		OreDictionary.registerOre("ingotMithril", ModItems.MITHRIL_INGOT);
		OreDictionary.registerOre("ingotSilver", ModItems.SILVER_INGOT);
		OreDictionary.registerOre("ingotSteel", ModItems.STEEL_INGOT);
		//OreDictionary.registerOre("ingotCobalt", ModItems.COBALT_INGOT);
		//OreDictionary.registerOre("ingotAdmantium", ModItems.ADMANTIUM_INGOT);
		//OreDictionary.registerOre("ingotEbony", ModItems.EBONY_INGOT);
		//OreDictionary.registerOre("gemMalachite", ModItems.MALACHITE_INGOT);
		//OreDictionary.registerOre("ingotQuicksilver", ModItems.QUICKSILVER_INGOT);
		
	}
	
}

package com.elspar2.fantasymod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.MITHRIL_ORE, new ItemStack(ModItems.MITHRIL_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.SILVER_ORE, new ItemStack(ModItems.SILVER_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.STEEL_ORE, new ItemStack(ModItems.STEEL_INGOT, 1), 1.5f);
		//GameRegistry.addSmelting(ModBlocks.COBALT_ORE, new ItemStack(ModItems.COBALT_INGOT, 1), 1.5f);
		//GameRegistry.addSmelting(ModBlocks.ADMANTIUM_ORE, new ItemStack(ModItems.ADMANTIUM_INGOT, 1), 1.5f);
		//GameRegistry.addSmelting(ModBlocks.MALACHITE_ORE, new ItemStack(ModItems.MALACHITE_INGOT, 1), 1.5f);
		//GameRegistry.addSmelting(ModBlocks.QUICKSILVER_ORE, new ItemStack(ModItems.QUICKSILVER_INGOT, 1), 1.5f);
		//GameRegistry.addSmelting(ModBlocks.EBONY_ORE, new ItemStack(ModItems.EBONY_INGOT, 1), 0.0f);
	}
	
}

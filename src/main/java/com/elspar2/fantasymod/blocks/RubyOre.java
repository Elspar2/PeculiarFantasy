package com.elspar2.fantasymod.blocks;

import java.util.Random;

import com.elspar2.fantasymod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends GemOre {

	public RubyOre(String name, Material material)
	{
		super(name, material);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.RUBY;
		//or return ITEMS.STICK; for vanilla items
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		int max = 3;
		int min = 1;
		return rand.nextInt(max) + min;
		//return 1; for 1
	}
	
}

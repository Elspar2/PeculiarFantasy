package com.elspar2.fantasymod.blocks;

import java.util.Random;

import com.elspar2.fantasymod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SteelOre extends BlockBase {

	public SteelOre(String name, Material material)
	{
	super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(11.0F);
		setResistance(120.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(0.0F);
		//setLightOpacity();
		//setBlockUnbreakable();
		
		
	}
	
}

package com.elspar2.fantasymod.blocks;

import java.util.Random;

import com.elspar2.fantasymod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

public class GemBlock extends BlockBase{

	public GemBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(6.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(0.0F);
		//setLightOpacity();
		//setBlockUnbreakable();
	}

	
}

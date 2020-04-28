package com.elspar2.fantasymod.world;

import java.util.Random;
import com.elspar2.fantasymod.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if (world.provider.getDimension() == 0)
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		//Gem Ores
		generateOre(ModBlocks.AMBER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.AMETHYST_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.ANGELITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.AQUAMARINE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.BLACK_OPAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.CORAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 12, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.GARNET_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.JADE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.MOONSTONE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.ONYX_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.OPAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.ORANGE_TOPAZ_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(5) + 1, 3);
		generateOre(ModBlocks.PAINITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.PERIDOT_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.SAPPHIRE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.TAAFFEITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.TANZANITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.TURQUOISE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
		generateOre(ModBlocks.YELLOW_TOPAZ_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 16, random.nextInt(3) + 1, 3);
																									//minY, maxY, 1, 18;
		//Material Ores
		generateOre(ModBlocks.SILVER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 48, random.nextInt(7) + 1, 7);
		generateOre(ModBlocks.STEEL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 48, random.nextInt(6) + 1, 6);
		generateOre(ModBlocks.MITHRIL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 1, 12, random.nextInt(3) + 1, 3);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator =  new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
		
	}
	
}

package com.eternalwolf.moresystems.biomes.decorators.apollo;

import java.util.Random;

import com.eternalwolf.moresystems.enums.EnumOreGenMS;
import com.eternalwolf.moresystems.init.ModBlocks;
import com.eternalwolf.moresystems.world.gen.MapGenCavesMS;
import com.eternalwolf.moresystems.world.worldgen.WorldGenMineableMS;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeDecoratorApollo extends BiomeDecoratorBase {
	
	private static final Block STONE = ModBlocks.APOLLO_STONE;
	
	private WorldGenerator tinGen;
	private WorldGenerator diamondGen;
	private WorldGenerator aluminumGen;
	private WorldGenerator ironGen;
	private WorldGenerator lapisGen;
	
	public boolean generateLakes = false;
	
	public int whiteLavaLakesPerChunk = 1;
	
	public BiomeDecoratorApollo() {
		this.tinGen = new WorldGenMineableMS(ModBlocks.APOLLO_TIN_ORE, STONE, EnumOreGenMS.TIN);
		this.diamondGen = new WorldGenMineableMS(ModBlocks.APOLLO_DIAMOND_ORE, STONE, EnumOreGenMS.DIAMOND);
		this.aluminumGen = new WorldGenMineableMS(ModBlocks.APOLLO_ALUMINUM_ORE, STONE, EnumOreGenMS.ALUMINUM);
		this.ironGen = new WorldGenMineableMS(ModBlocks.APOLLO_IRON_ORE, STONE, EnumOreGenMS.IRON);
		this.lapisGen = new WorldGenMineableMS(ModBlocks.APOLLO_LAPIS_ORE, STONE, EnumOreGenMS.LAPIS);
		
		/*this.goldenConstructGen = new WorldGenMineableMS(ZGBlocks.atheonConstructBlock, STONE,
				EnumOreGenMS.CONSTRUCTED.setBlockCount(20));*/
	}
	
	@Override
	protected void generate(Biome biome, World world, Random rand) {
		int x = rand.nextInt(16) + 8;
		int z = rand.nextInt(16) + 8;
		
		this.generateOre(this.tinGen, EnumOreGenMS.TIN, world, rand);
		this.generateOre(this.diamondGen, EnumOreGenMS.DIAMOND, world, rand);
		this.generateOre(this.aluminumGen, EnumOreGenMS.ALUMINUM, world, rand);
		this.generateOre(this.ironGen, EnumOreGenMS.IRON, world, rand);
		this.generateOre(this.lapisGen, EnumOreGenMS.LAPIS, world, rand);
		
		int genY = 248;
		int y = genY;
		
		/*if (this.generateLakes && this.whiteLavaLakesPerChunk > 0) {
			for (int i = 0; i < this.whiteLavaLakesPerChunk; ++i) {
				y = rand.nextInt(rand.nextInt(genY) + 8);
				
				if (rand.nextInt(130) <= 10) {
					if (y <= 72) {
						(new WorldGenLakesZG(ZGFluids.blockWhiteLavaFluid, STONE)).generate(world, rand,
								this.chunkPos.add(x, y, z));
					}
				}
			}
		}*/
	}
}

package com.eternalwolf.moresystems.biomes.apollo;

import com.eternalwolf.moresystems.celestialbodies.CelestialBodies;
import com.eternalwolf.moresystems.enums.EnumBiomeTypeMS;
import com.eternalwolf.moresystems.init.ModBlocks;

import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;

public class BiomeApollo extends BiomeApolloBase {
	
	public BiomeApollo(BiomeProperties props) {
		super("Apollo", props);
		props.setRainDisabled();
		this.setBiomeHeight(45);
		this.setBiomeType(EnumBiomeTypeMS.DESERT);
		this.setTemp(0.0F);
		this.enableSnow = false;
		this.clearAllSpawning();
		/*this.topBlock = ModBlocks.APOLLO_DUST.getDefaultState();
		this.fillerBlock = ModBlocks.APOLLO_ROCK.getDefaultState();
		this.stoneBlock = ModBlocks.APOLLO_STONE;*/
		this.setPlanetForBiome(CelestialBodies.planetApollo);
	}

	private void setBiomeType(EnumBiomeTypeMS icy) {
		// TODO Auto-generated method stub
		
	}
}

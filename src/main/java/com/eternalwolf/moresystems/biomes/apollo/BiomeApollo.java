package com.eternalwolf.moresystems.biomes.apollo;

import com.eternalwolf.moresystems.celestialbodies.CelestialBodies;
import com.eternalwolf.moresystems.enums.EnumBiomeTypeMS;
import com.eternalwolf.moresystems.init.ModBlocks;

public class BiomeApollo extends BiomeApolloBase {
	
	public BiomeApollo(BiomeProperties props) {
		super("Apollo", props);
		props.setRainDisabled();
		this.setBiomeHeight(45);
		this.setBiomeType(EnumBiomeTypeMS.ICY);
		this.setTemp(400.0F);
		this.enableSnow = false;
		this.clearAllSpawning();
		this.topBlock = ModBlocks.VENERA_DIRT.getDefaultState();
		this.fillerBlock = ModBlocks.VENERA_SANDSTONE.getDefaultState();
		this.stoneBlock = ModBlocks.VENERA_STONE;
		this.setPlanetForBiome(CelestialBodies.planetApollo);
	}

	private void setBiomeType(EnumBiomeTypeMS icy) {
		// TODO Auto-generated method stub
		
	}
}

package com.eternalwolf.moresystems.biomes;

import java.util.LinkedList;
import java.util.List;

import com.eternalwolf.moresystems.biomes.apollo.BiomeApollo;
import com.eternalwolf.moresystems.util.helpers.MSRegisterHelper;

import micdoodle8.mods.galacticraft.api.world.BiomeGenBaseGC;
import micdoodle8.mods.galacticraft.core.world.gen.BiomeFlatMoon;
import micdoodle8.mods.galacticraft.core.world.gen.BiomeMoon;
import micdoodle8.mods.galacticraft.planets.mars.world.gen.BiomeGenFlatMars;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;

public class MSBiomes 
{
	public static final List<BiomeGenBaseGC> biomeList = new LinkedList<>();
	public static final Biome APOLLO = new BiomeApollo(new BiomeProperties("Apollo"));
	private static int totalBiomes = 0;
	
	public static void init() 
	{
		// Apollo
		MSBiomes.addBiome(MSBiomes.APOLLO);
	}
		
		private static void addBiome(Biome biome, BiomeDictionary.Type... biomeType) 
		{
			MSRegisterHelper.registerBiome(biome);
			MSRegisterHelper.registerBiomeType(biome, biomeType);
			totalBiomes++;
		}
}

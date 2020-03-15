package com.eternalwolf.moresystems.world;

import java.util.ArrayList;
import java.util.List;

import com.eternalwolf.moresystems.biomes.apollo.BiomeProviderApollo;
import com.eternalwolf.moresystems.celestialbodies.CelestialBodies;
import com.eternalwolf.moresystems.init.ModBlocks;
import com.eternalwolf.moresystems.star.MSPlanet;

import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeAdaptive;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.client.CloudRenderer;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DimensionType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderApollo extends WorldProviderBase {
	
	@Override
	public float getGravity() {
		return 0.055F;
	}
	
	@Override
	public float getSolarSize() {
		return 4.0F;
	}
	
	@Override
	public double getMeteorFrequency() {
		return 8.0;
	}
	
	@Override
	public double getFuelUsageMultiplier() {
		return 1.2D;
	}
	
	@Override
	public boolean hasBreathableAtmosphere() {
		return this.getPlanet().getIsBreathable();
	}
	
	@Override
	public float getFallDamageModifier() {
		return 0.46F;
	}
	
	@Override
	public float getSoundVolReductionAmount() {
		return 2.0F;
	}
	
	@Override
	public float getThermalLevelModifier() {
		return 5.2F;
	}
	
	@Override
	public float getPlanetTemp() {
		MSPlanet planet = this.getPlanet();
		float planetTemp = planet.getPlanetTemperature();
		if (this.isDaytime()) {
			planetTemp += 10.1F;
		} else {
			planetTemp -= 4.2F;
		}
		return planetTemp;
	}
	
	@Override
	public float getWindLevel() {
		return this.getPlanet().getWindLevel();
	}
	
	@Override
	public double getSolarEnergyMultiplier() {
		return 6.5F;
	}
	
	@Override
	public double getYCoordinateToTeleport() {
		return 150;
	}
	
	@Override
	public float getCloudHeight() {
		return 128F;
	}
	
	@Override
	public Vector3 getSkyColor() {
		float f = 0.6F - this.getStarBrightness(1.0F);
		return new Vector3(80 / 255F * f, 0 / 255F * f, 0 / 255F * f);
	}
	
	@Override
	public Vector3 getFogColor() {
		float f = 1.0F - this.getStarBrightness(1.0F);
		return new Vector3(80 / 255F * f, 0 / 255F * f, 0 / 255F * f);
	}
	
	@Override
	public boolean canRainOrSnow() {
		return this.getPlanet().getHasRain();
	}
	
	@Override
	public boolean hasSunset() {
		return true;
	}
	
	@Override
	public long getDayLength() {
		return 6000L;
	}
	
	@Override
	public boolean shouldDisablePrecipitation() {
		return !this.canRainOrSnow();
	}
	
	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return this.canRainOrSnow();
	}
	
	@Override
	public boolean canRespawnHere() {
		return this.shouldForceRespawn();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public float getStarBrightness(float par1) {
		float var2 = this.world.getCelestialAngle(par1);
		float var3 = 0.1F - (MathHelper.cos(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.25F);
		
		if (var3 < 0.0F) {
			var3 = 0.25F;
		}
		if (var3 > 1.0F) {
			var3 = 0.75F;
		}
		return var3 * var3 * 0.6F;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public float getSunBrightness(float par1) {
		float f1 = this.world.getCelestialAngle(1.0F);
		float f2 = 2.5F - (MathHelper.cos(f1 * (float) Math.PI * 2.0F) * 2.0F + 0.2F);
		
		if (f2 < 0.0F) {
			f2 = 0.6F;
		}
		if (f2 > 1.0F) {
			f2 = 0.95F;
		}
		f2 = 1.95F - f2;
		return f2 * 2.5F;
	}
	
	@Override
	public CelestialBody getCelestialBody() {
		return CelestialBodies.planetApollo;
	}
	
	@Override
	public double getHorizon() {
		return 44.0D;
	}
	
	@Override
	public int getAverageGroundLevel() {
		return 64;
	}
	
	@Override
	public boolean canCoordinateBeSpawn(int var1, int var2) {
		return true;
	}
	
	@Override
	public ResourceLocation getDungeonChestType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Block> getSurfaceBlocks() {
		ArrayList<Block> blockList = new ArrayList<Block>();
		blockList.add(ModBlocks.VENERA_DIRT);
		return blockList;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	protected void renderSky() {
		this.setSkyRenderer(new SkyProviderApollo(this));
	}
	
	@Override
	protected void renderCloud() {
		this.setCloudRenderer(new CloudRenderer());
	}
	
	@Override
	protected void renderWeather() {
	}
	
	@Override
	public DimensionType getDimensionType() {
		return MSDimensions.APOLLO;
	}
	
	@Override
	public boolean isSkyColored() {
		return true;
	}
	
	@Override
	public Class<? extends BiomeProvider> getBiomeProviderClass() 
	{
		BiomeAdaptive.setBodyMultiBiome(CelestialBodies.planetApollo);
		return BiomeProviderApollo.class;
	}
	
	@Override
	public Class<? extends IChunkGenerator> getChunkProviderClass() {
		return ChunkProviderApollo.class;
	}
	
}

package com.eternalwolf.moresystems.world;

import com.eternalwolf.moresystems.star.MSPlanet;

import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IExitHeight;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import micdoodle8.mods.galacticraft.core.event.EventHandlerGC;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class WorldProviderBase extends WorldProviderSpace implements ISolarLevel, IExitHeight {
	
	private static WorldProviderBase instance;
	
	public WorldProviderBase() {
		instance = this;
	}
	
	public static WorldProviderBase instance() {
		return instance;
	}
	
	@Override
	public String getSaveFolder() {
		return "planets/" + this.getPlanet().getName();
	}
	
	public World getWorldObj() {
		return this.world;
	}
	
	@Override
	public boolean shouldForceRespawn() {
		return !ConfigManagerCore.forceOverworldRespawn;
	}
	
	public MSPlanet getPlanet() {
		CelestialBody planet = this.getCelestialBody();
		MSPlanet planetNova = (MSPlanet) planet;
		return planetNova;
	}
	
	@Override
	public float getSolarSize() {
		return 1.0F;
	}
	
	@Override
	public Vector3 getFogColor() {
		return new Vector3(0, 0, 0);
	}
	
	@Override
	public boolean canBlockFreeze(BlockPos pos, boolean byWater) {
		return this.getPlanet().getIsColdPlanet();
	}
	
	@Override
	public void updateWeather() {
		World worldObj = this.getWorldObj();
		WorldInfo worldInfo = worldObj.getWorldInfo();
		if (!this.shouldDisablePrecipitation()) {
			super.updateWeather();
		} else {
			worldInfo.setRainTime(0);
			worldInfo.setRaining(false);
			worldInfo.setThunderTime(0);
			worldInfo.setThundering(false);
			worldObj.rainingStrength = 0.0F;
			worldObj.thunderingStrength = 0.0F;
		}
	}
	
	@Override
	public float getWindLevel() {
		return this.getPlanet().getWindLevel();
	}
	
	@Override
	public Vector3 getSkyColor() {
		return new Vector3(0, 0, 0);
	}
	
	@Override
	public boolean canRespawnHere() {
		if (EventHandlerGC.bedActivated) {
			EventHandlerGC.bedActivated = false;
			return true;
		}
		return false;
	}
	
	@Override
	public double getFuelUsageMultiplier() {
		return 0.5D;
	}
	
	@Override
	public double getMeteorFrequency() {
		return this.getPlanet().getAtmosphericDensity();
	}
	
	@Override
	public float getArrowGravity() {
		return 0.003F;
	}
	
	@Override
	public int getDungeonSpacing() {
		return 704;
	}
	
	@Override
	public boolean hasBreathableAtmosphere() {
		return this.getPlanet().getIsBreathable();
	}
	
	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return tier >= this.getPlanet().getTierRequirement();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IRenderHandler getSkyRenderer() {
		if (super.getSkyRenderer() == null) {
			this.renderSky();
		}
		return super.getSkyRenderer();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IRenderHandler getCloudRenderer() {
		if (super.getCloudRenderer() == null) {
			this.renderCloud();
		}
		return super.getCloudRenderer();
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IRenderHandler getWeatherRenderer() {
		if (super.getWeatherRenderer() == null) {
			this.renderWeather();
		}
		return super.getWeatherRenderer();
	}
	
	@Override
	public boolean hasSkyLight() {
		return true;
	}
	
	protected abstract void renderSky();
	
	protected abstract void renderCloud();
	
	protected abstract void renderWeather();
	
	public float getPlanetTemp() {
		MSPlanet planet = this.getPlanet();
		float planetTemp = planet.getPlanetTemperature();
		
		if (this.isDaytime()) {
			planetTemp /= 2.2F;
		} else {
			planetTemp = planet.getPlanetTemperature();
		}
		
		return planetTemp;
	}
	
	@Override
	public abstract Class<? extends IChunkGenerator> getChunkProviderClass();
	
}

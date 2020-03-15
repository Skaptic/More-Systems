package com.eternalwolf.moresystems.star;

import com.eternalwolf.moresystems.util.Reference;

import micdoodle8.mods.galacticraft.api.galaxies.Moon;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody.ScalableDistance;
import net.minecraft.util.ResourceLocation;

public class MSMoon extends Moon
{
	private float baseRadiation;
	private float windLevel;
	private boolean rains;

	public MSMoon(String moonName) 
	{
		super(moonName);
	}
	
	public MSMoon setMoonIcon(String moonTexture) 
	{
		this.setBodyIcon(new ResourceLocation(Reference.MOD_ID + ":textures/gui/moons/" + moonTexture + ".png"));
		return this;
    }

	public MSMoon setDistanceFromCenter(float par1, float par2) 
	{
		this.setRelativeDistanceFromCenter(new ScalableDistance(par1, par2));
		return this;
	}

	public MSMoon setDistanceFromCenter(float par1) 
	{
		this.setDistanceFromCenter(par1, par1);
		return this;
	}

	public MSMoon setPlanetRadiation(float planetRad) 
	{
		this.baseRadiation = planetRad;
		return this;
	}
	
	public MSMoon setWindLevel(float windLvl) 
	{
		this.windLevel = windLvl;
		return this;
	}
	
	public MSMoon setHasRain(boolean hasRain) {
		this.rains = hasRain;
		return this;
	}
	
}

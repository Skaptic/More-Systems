package com.eternalwolf.moresystems.star;

import java.util.ArrayList;

import com.eternalwolf.moresystems.util.Reference;

import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.world.AtmosphereInfo;
import micdoodle8.mods.galacticraft.api.world.EnumAtmosphericGas;
import net.minecraft.util.ResourceLocation;

public class MSPlanet extends Planet  
{

	public MSPlanet(String planetName) 
	{
		super(planetName);
	}

	public MSPlanet setPlanetIcon(String planetTexture) 
	{
		this.setBodyIcon(new ResourceLocation(Reference.MOD_ID + ":textures/gui/planets/" + planetTexture + ".png"));
		return this;
    }

	public Planet setHasRain(boolean hasRain) 
	{
		this.rains = hasRain;
		return this;
    }
	
	public Planet setPlanetRadiation(float planetRad) 
	{
		this.baseRadiation = planetRad;
		return this;
	}
	
	public Planet setWindLevel(float windLvl) 
	{
		this.windLevel = windLvl;
		return this;
	}
	
	private AtmosphereInfo atmosphere;
	private ArrayList<EnumAtmosphericGas> planetGasses = new ArrayList<EnumAtmosphericGas>();
	private float baseTemp;
	private boolean breathable;
	private float density;
	private boolean rains;
	private float baseRadiation;
	private float windLevel;
	private float baseToxicity;

	public boolean getHasRain() 
	{
		return this.rains;
	}
	
	public float getPlanetTemperature() 
	{
		float planetTemp = this.baseTemp;
		return planetTemp;
	}
	
	public float getWindLevel() 
	{
		return this.windLevel;
	}
	
	public boolean getIsBreathable() 
	{
		return this.breathable;
	}
	
	public float getAtmosphericDensity() 
	{
		return this.density;
	}
	
	public MSPlanet setDistanceFromCenter(float par1, float par2) 
	{
		this.setRelativeDistanceFromCenter(new ScalableDistance(par1, par2));
		return this;
	}

	public MSPlanet setDistanceFromCenter(float par1) 
	{
		this.setDistanceFromCenter(par1, par1);
		return this;
	}

	public boolean getIsColdPlanet() 
	{
		return this.baseTemp <= -25.0F;
	}

	public boolean getIsHotPlanet() 
	{
		return this.baseTemp >= 60.0F;
	}

	public Planet setPlanetTemperature(float planetTemp) 
	{
		this.baseTemp = planetTemp;
		return this;
	}

	public Planet setAtmosphere() 
	{
		this.atmosphere = new AtmosphereInfo(this.getIsBreathable(), this.getHasRain(), this.getIsCorrosive(),
				this.getPlanetTemperature(), this.getWindLevel(), this.getAtmosphericDensity());
		return this;
	}

	public boolean getIsCorrosive() 
	{
		return (this.getIsToxicPlanet() || this.getIsRadioactivePlanet());
	}
	
	public boolean getIsToxicPlanet() 
	{
		return this.baseToxicity >= 15.0F;
	}
	
	public boolean getIsRadioactivePlanet() 
	{
		return this.baseRadiation >= 10.0F;
	}
	
    public float relativeDensity()
    {
        return this.density;
    }
	
}

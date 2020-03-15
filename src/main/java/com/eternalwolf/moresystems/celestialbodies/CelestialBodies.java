package com.eternalwolf.moresystems.celestialbodies;

import com.eternalwolf.moresystems.biomes.MSBiomes;
import com.eternalwolf.moresystems.star.MSMoon;
import com.eternalwolf.moresystems.star.MSPlanet;
import com.eternalwolf.moresystems.star.MSStar;
import com.eternalwolf.moresystems.star.MSStarSystem;
import com.eternalwolf.moresystems.world.WorldProviderApollo;

import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import net.minecraft.init.Biomes;

public class CelestialBodies 
{
	//Declaring Pollux solar system
	public static MSStarSystem systemPollux = new MSStarSystem("PolluxSystem");
	public static MSStar starPollux = new MSStar("Pollux");
	//Declaring Pollux planets
	public static MSPlanet planetApollo = new MSPlanet("planetApollo");
	public static MSPlanet planetVenera = new MSPlanet("planetVenera");
	public static MSPlanet planetAquarius = new MSPlanet("planetAquarius");
	public static MSPlanet planetArctos = new MSPlanet("planetArctos");
	
	//Declaring Pollux moons
	public static MSMoon moonPales = new MSMoon("moonPales");
	public static MSMoon moonJuno = new MSMoon("moonJuno");
	
	public static void initStarSystems() 
	{
		//Pollux
		Vector3 pos = new Vector3();
		pos.x = 1.0D;
		pos.y = 0.8D;
		systemPollux.setMapPosition(pos);
		starPollux.setParentSolarSystem(systemPollux);
		starPollux.setRelativeSize(25.0F);
		systemPollux.setMainStar(starPollux);

	}
	
	public static void initPlanets()
	{
		//Apollo - WIP -----------------------------------
		
		planetApollo.setDimensionInfo(1745, WorldProviderApollo.class);
		planetApollo.setParentSolarSystem(systemPollux);
		planetApollo.setRingColorRGB(0.1F, 0.9F, 2.6F);
		planetApollo.setPhaseShift(5.0F);
		planetApollo.setRelativeOrbitTime(0.14F);
		planetApollo.setDistanceFromCenter(0.4F);
		planetApollo.setTierRequired(4);
		planetApollo.setRelativeSize(7.0F);
		planetApollo.setHasRain(false);
		planetApollo.setPlanetIcon("apollo");
		planetApollo.setBiomeInfo(MSBiomes.APOLLO);
		
		//Venera - WIP -----------------------------------
		
		//planetVenera.setDimensionInfo(INSERT DIMENSION STUFF HERE));
		planetVenera.setParentSolarSystem(systemPollux);
		planetVenera.setRingColorRGB(255F, 255F, 2.6F);
		planetVenera.setPhaseShift(2.0F);
		planetVenera.setRelativeOrbitTime(0.65F);
		planetVenera.setDistanceFromCenter(0.8F);
		planetVenera.setTierRequired(4);
		planetVenera.setRelativeSize(11F);
		planetVenera.setPlanetRadiation(0.5F);
		planetVenera.setWindLevel(6.7F);
		planetVenera.setHasRain(false);
		planetVenera.setPlanetIcon("venera");
		//planetVenera.setBiomeInfo(INSERT BIOME HERE);
		
		//Aquarius - WIP ------------------------------------
		
		//planetVenera.setDimensionInfo(INSERT DIMENSION STUFF HERE));
		planetAquarius.setParentSolarSystem(systemPollux);
		planetAquarius.setRingColorRGB(0.0F, 128F, 0.0F);
		planetAquarius.setPhaseShift(5.0F);
		planetAquarius.setRelativeOrbitTime(1.7F);
		planetAquarius.setDistanceFromCenter(1.1F);
		planetAquarius.setTierRequired(4);
		planetAquarius.setRelativeSize(15F);
		planetAquarius.setPlanetRadiation(0.5F);
		planetAquarius.setWindLevel(6.7F);
		planetAquarius.setHasRain(true);
		planetAquarius.setPlanetIcon("aquarius");
		//planetAquarius.setBiomeInfo(INSERT BIOME HERE);
		
		//Arctos WIP ---------------------------------------
		
		//planetArctos.setDimensionInfo(INSERT DIMENSION STUFF HERE));
		planetArctos.setParentSolarSystem(systemPollux);
		planetArctos.setRingColorRGB(0.1F, 0.9F, 2.6F);
		planetArctos.setPhaseShift(10.0F);
		planetArctos.setRelativeOrbitTime(6.0F);
		planetArctos.setDistanceFromCenter(1.7F);
		planetArctos.setTierRequired(5);
		planetArctos.setRelativeSize(8F);
		planetArctos.setPlanetRadiation(0.5F);
		planetArctos.setWindLevel(6.7F);
		planetArctos.setHasRain(true);
		planetArctos.setPlanetIcon("arctos");
		//planetArctos.setBiomeInfo(INSERT BIOME HERE);
	}
	
	
	public static void initMoons()
	{
		//Pales - WIP ------------------------------------
		
		moonPales.setParentPlanet(planetVenera);
		moonPales.setPhaseShift(2.0F);
		moonPales.setRelativeOrbitTime(25.0F);
		moonPales.setMoonIcon("pales");
		moonPales.setTierRequired(4);
		moonPales.setRelativeSize(15.0F);
		moonPales.setDistanceFromCenter(14.5F);
	    moonPales.setPlanetRadiation(0.5F);
		moonPales.setWindLevel(6.7F);
		moonPales.setHasRain(false);
		
		//Juno - WIP --------------------------------------
		
		moonJuno.setParentPlanet(planetVenera);
		moonJuno.setPhaseShift(2.0F);
		moonJuno.setRelativeOrbitTime(40.0F);
		moonJuno.setMoonIcon("juno");
		moonJuno.setTierRequired(4);
		moonJuno.setRelativeSize(4.5F);
		moonJuno.setDistanceFromCenter(30.0F);
	    moonJuno.setPlanetRadiation(0.5F);
		moonJuno.setWindLevel(6.7F);
		moonJuno.setHasRain(false);
		
	}
	
	public static void registerSystems()
	{
		GalaxyRegistry.registerSolarSystem(systemPollux);
		CelestialBodies.registerPlanets();
	}
	
	public static void registerPlanets()
	{
		GalaxyRegistry.registerPlanet(planetApollo);
		GalaxyRegistry.registerPlanet(planetVenera);
		GalaxyRegistry.registerPlanet(planetAquarius);
		GalaxyRegistry.registerPlanet(planetArctos);
	}
	
	public static void registerMoons()
	{
		GalaxyRegistry.registerMoon(moonPales);
		GalaxyRegistry.registerMoon(moonJuno);
	}
	
	public static void registerTeleportTypes()
	{
		
	}
	
	
	
	
	
	
	//Initializing
	public static void init() 
	{
		CelestialBodies.initStarSystems();
		CelestialBodies.initPlanets();
		CelestialBodies.initMoons();
		CelestialBodies.registerSystems();
		CelestialBodies.registerPlanets();
		CelestialBodies.registerMoons();
		CelestialBodies.registerTeleportTypes();
	}
}

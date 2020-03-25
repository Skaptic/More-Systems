package com.eternalwolf.moresystems.celestialbodies;

import com.eternalwolf.moresystems.biomes.MSBiomes;
import com.eternalwolf.moresystems.star.MSMoon;
import com.eternalwolf.moresystems.star.MSPlanet;
import com.eternalwolf.moresystems.star.MSStar;
import com.eternalwolf.moresystems.star.MSStarSystem;
import com.eternalwolf.moresystems.world.apollo.WorldProviderApollo;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.core.dimension.TeleportTypeMoon;
import net.minecraft.init.Biomes;

public class CelestialBodies 
{
	//Declaring Pollux solar system
	public static MSStarSystem systemPollux = new MSStarSystem("PolluxSystem");
	public static MSStar starPollux = new MSStar("Pollux");
	
	//Declaring TRAPPIST-1 solar system
	public static MSStarSystem systemTRAPPIST_1 = new MSStarSystem("TRAPPIST_1System");
	public static MSStar starTRAPPIST_1 = new MSStar("TRAPPIST_1");
	
	//test
	/*public static MSStarSystem systemTest = new MSStarSystem("Test_system");
	public static MSStar starTest = new MSStar("testStar");*/
	
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
		pos.x = 1.0F;
		pos.y = 0.5F;
		systemPollux.setMapPosition(pos);
		starPollux.setParentSolarSystem(systemPollux);
		starPollux.setRelativeSize(28.0F);
		systemPollux.setMainStar(starPollux);
		
		//TRAPPIST-1
		Vector3 pos1 = new Vector3();
		pos1.x = -1.5F;
		pos1.y = 1.0F;
		systemTRAPPIST_1.setMapPosition(pos1);
		starTRAPPIST_1.setParentSolarSystem(systemTRAPPIST_1);
		starTRAPPIST_1.setRelativeSize(12.0F);
		systemTRAPPIST_1.setMainStar(starTRAPPIST_1);
		
		//test
		/*Vector3 pos2 = new Vector3();
		pos2.x = 1.0F;
		pos2.y = 0.5F;
		systemTest.setMapPosition(pos2);
		starTest.setParentSolarSystem(systemTest);
		starTest.setRelativeSize(12.0F);
		systemTest.setMainStar(starTest);*/
		

	}
	
	public static void initPlanets()
	{
		//Apollo - WIP -----------------------------------
		
		planetApollo.setDimensionInfo(-777, WorldProviderApollo.class);
		planetApollo.setParentSolarSystem(systemPollux);
		planetApollo.setRingColorRGB(0.1F, 0.9F, 2.6F);
		planetApollo.setPhaseShift(4.0F);
		planetApollo.setRelativeOrbitTime(0.14F);
		planetApollo.setDistanceFromCenter(0.4F);
		planetApollo.setTierRequired(4);
		planetApollo.setRelativeSize(1.0F);
		planetApollo.setHasRain(false);
		planetApollo.setPlanetIcon("apollo");
		planetApollo.setPlanetTemperature(0.0F);
		planetApollo.setPlanetRadiation(1.0F);
		planetApollo.setAtmosphere();
		planetApollo.setBiomeInfo(MSBiomes.APOLLO);
		
		//Venera - WIP -----------------------------------
		
		//planetVenera.setDimensionInfo(INSERT DIMENSION STUFF HERE));
		planetVenera.setParentSolarSystem(systemPollux);
		planetVenera.setRingColorRGB(0.0F, 0.0F, 2.6F);
		planetVenera.setPhaseShift(2.0F);
		planetVenera.setRelativeOrbitTime(0.65F);
		planetVenera.setDistanceFromCenter(0.8F);
		planetVenera.setTierRequired(-1);
		planetVenera.setRelativeSize(11.0F);
		planetVenera.setPlanetRadiation(0.5F);
		planetVenera.setWindLevel(6.7F);
		planetVenera.setHasRain(false);
		planetVenera.setPlanetIcon("venera");
		/*planetVenera.setPlanetTemperature(NONE);
		planetVenera.setPlanetRadiation(NONE);
		planetVenera.setAtmosphere();*/
		//planetVenera.setBiomeInfo(INSERT BIOME HERE);
		
		//Aquarius - WIP ------------------------------------
		
		//planetVenera.setDimensionInfo(INSERT DIMENSION STUFF HERE));
		planetAquarius.setParentSolarSystem(systemPollux);
		planetAquarius.setRingColorRGB(0.0F, 0.0F, 0.0F);
		planetAquarius.setPhaseShift(5.0F);
		planetAquarius.setRelativeOrbitTime(1.7F);
		planetAquarius.setDistanceFromCenter(1.7F);
		planetAquarius.setTierRequired(-1);
		planetAquarius.setRelativeSize(15.0F);
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
		planetArctos.setDistanceFromCenter(3.0F);
		planetArctos.setTierRequired(-1);
		planetArctos.setRelativeSize(8.0F);
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
		moonPales.setTierRequired(-1);
		moonPales.setRelativeSize(15.0F);
		moonPales.setDistanceFromCenter(14.5F);
	    moonPales.setPlanetRadiation(0.5F);
		moonPales.setWindLevel(6.7F);
		moonPales.setHasRain(true);
		
		//Juno - WIP --------------------------------------
		
		moonJuno.setParentPlanet(planetVenera);
		moonJuno.setPhaseShift(2.0F);
		moonJuno.setRelativeOrbitTime(40.0F);
		moonJuno.setMoonIcon("juno");
		moonJuno.setTierRequired(-1);
		moonJuno.setRelativeSize(15.0F);
		moonJuno.setDistanceFromCenter(30.0F);
	    moonJuno.setPlanetRadiation(0.5F);
		moonJuno.setWindLevel(6.7F);
		moonJuno.setHasRain(false);
		
	}
	
	public static void registerSystems()
	{
		CelestialBodies.registerPlanets();
		GalaxyRegistry.registerSolarSystem(systemPollux);
		GalaxyRegistry.registerSolarSystem(systemTRAPPIST_1);
		//GalaxyRegistry.registerSolarSystem(systemTest);
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
		//Pollux
		GalacticraftRegistry.registerTeleportType(WorldProviderApollo.class, new TeleportTypeMoon());
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

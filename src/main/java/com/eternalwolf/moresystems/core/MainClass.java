package com.eternalwolf.moresystems.core;

import com.eternalwolf.moresystems.biomes.MSBiomes;
import com.eternalwolf.moresystems.celestialbodies.CelestialBodies;
import com.eternalwolf.moresystems.compat.OreDictionaryCompat;
import com.eternalwolf.moresystems.handlers.RegistryHandler;
import com.eternalwolf.moresystems.init.ModRecipes;
import com.eternalwolf.moresystems.proxy.CommonProxy;
import com.eternalwolf.moresystems.tabs.MoreSystemsTab;
import com.eternalwolf.moresystems.util.Reference;
import com.eternalwolf.moresystems.world.MSDimensions;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES)

public class MainClass 
{
	
	public static final CreativeTabs moresystemstab = new MoreSystemsTab("moresystemstab");
	
	@Instance
	public static MainClass instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		CelestialBodies.init();
		MSBiomes.init();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		OreDictionaryCompat.registerOres();
		ModRecipes.init();
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		MSDimensions.init();
	}
}

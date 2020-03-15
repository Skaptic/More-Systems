package com.eternalwolf.moresystems.compat;

import com.eternalwolf.moresystems.init.ModBlocks;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres()
	{
		OreDictionary.registerOre("cobblestone", ModBlocks.VENERA_COBBLESTONE);
		OreDictionary.registerOre("stone", ModBlocks.VENERA_STONE);
	}
}

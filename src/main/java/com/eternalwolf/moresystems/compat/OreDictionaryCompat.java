package com.eternalwolf.moresystems.compat;

import com.eternalwolf.moresystems.init.ModBlocks;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres()
	{
		//Apollo
		OreDictionary.registerOre("stone", ModBlocks.APOLLO_STONE);
		OreDictionary.registerOre("oreAluminum", ModBlocks.APOLLO_ALUMINUM_ORE);
		OreDictionary.registerOre("oreDiamond", ModBlocks.APOLLO_DIAMOND_ORE);
		OreDictionary.registerOre("oreIron", ModBlocks.APOLLO_IRON_ORE);
		OreDictionary.registerOre("oreLapis", ModBlocks.APOLLO_LAPIS_ORE);
		OreDictionary.registerOre("oreTin", ModBlocks.APOLLO_TIN_ORE);
		
		//Venera
		OreDictionary.registerOre("oreDiamond", ModBlocks.VENERA_DIAMOND_ORE);
		OreDictionary.registerOre("oreCoal", ModBlocks.VENERA_COAL_ORE);
		OreDictionary.registerOre("oreIron", ModBlocks.VENERA_IRON_ORE);
		OreDictionary.registerOre("oreCopper", ModBlocks.VENERA_COPPER_ORE);
		OreDictionary.registerOre("oreSilicon", ModBlocks.VENERA_SILICON_ORE);
		OreDictionary.registerOre("cobblestone", ModBlocks.VENERA_COBBLESTONE);
		OreDictionary.registerOre("stone", ModBlocks.VENERA_STONE);
	}
}

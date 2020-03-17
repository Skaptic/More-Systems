package com.eternalwolf.moresystems.init;

import micdoodle8.mods.galacticraft.core.GCItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		//Apollo 
		GameRegistry.addSmelting(ModBlocks.APOLLO_IRON_ORE, new ItemStack(Items.IRON_INGOT), 0.5F);
		GameRegistry.addSmelting(ModBlocks.APOLLO_DIAMOND_ORE, new ItemStack(Items.DIAMOND), 1.0F);
		GameRegistry.addSmelting(ModBlocks.APOLLO_TIN_ORE, new ItemStack(GCItems.basicItem, 1, 4), 0.5F);
		GameRegistry.addSmelting(ModBlocks.APOLLO_LAPIS_ORE, new ItemStack(Items.DYE, 1, 4), 0.5F);
		GameRegistry.addSmelting(ModBlocks.APOLLO_ALUMINUM_ORE, new ItemStack(GCItems.basicItem, 1, 5), 0.5F);
		
		//Venera
		GameRegistry.addSmelting(ModBlocks.VENERA_COBBLESTONE, new ItemStack(ModBlocks.VENERA_STONE), 0.5F);
		GameRegistry.addSmelting(ModBlocks.VENERA_IRON_ORE, new ItemStack(Items.IRON_INGOT), 0.5F);
		GameRegistry.addSmelting(ModBlocks.VENERA_DIAMOND_ORE, new ItemStack(Items.DIAMOND), 1.0F);
		GameRegistry.addSmelting(ModBlocks.VENERA_SILICON_ORE, new ItemStack(GCItems.basicItem, 1, 2), 0.5F);
		GameRegistry.addSmelting(ModBlocks.VENERA_COPPER_ORE, new ItemStack(GCItems.basicItem, 1, 3), 0.5F);
		GameRegistry.addSmelting(ModBlocks.VENERA_COAL_ORE, new ItemStack(Items.COAL), 0.5F);
		
		
		
		
	}
	

}

package com.eternalwolf.moresystems.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.VENERA_COBBLESTONE, new ItemStack(ModBlocks.VENERA_STONE), 0.5F);
	}
}

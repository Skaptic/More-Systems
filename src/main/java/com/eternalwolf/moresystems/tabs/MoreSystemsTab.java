package com.eternalwolf.moresystems.tabs;

import com.eternalwolf.moresystems.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MoreSystemsTab extends CreativeTabs
{
	public MoreSystemsTab(String label)
	{
		super("moresystemstab");
	}

	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Item.getItemFromBlock(ModBlocks.VENERA_STONEBRICK));
	}
	
}

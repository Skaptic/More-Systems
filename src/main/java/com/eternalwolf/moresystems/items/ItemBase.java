package com.eternalwolf.moresystems.items;

import com.eternalwolf.moresystems.blocks.StairBase;
import com.eternalwolf.moresystems.core.MainClass;
import com.eternalwolf.moresystems.init.ModItems;
import com.eternalwolf.moresystems.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.SEARCH);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		MainClass.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

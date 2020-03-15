package com.eternalwolf.moresystems.blocks;

import java.util.ArrayList;
import java.util.List;

import com.eternalwolf.moresystems.core.MainClass;
import com.eternalwolf.moresystems.init.ModBlocks;
import com.eternalwolf.moresystems.init.ModItems;
import com.eternalwolf.moresystems.tabs.MoreSystemsTab;
import com.eternalwolf.moresystems.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MainClass.moresystemstab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		  
	}

	@Override
	public void registerModels() 
	{
		MainClass.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}

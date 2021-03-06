package com.eternalwolf.moresystems.blocks;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDoubleSlabBase extends BlockSlabBase
{
	public BlockDoubleSlabBase(String name, Material material, CreativeTabs tab, BlockSlab half) 
	{
		super(name, material, half);
		setCreativeTab(tab);
	}
	
	@Override
	public boolean isDouble() 
	{
		return true;
	}
}

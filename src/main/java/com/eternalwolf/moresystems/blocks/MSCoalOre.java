package com.eternalwolf.moresystems.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class MSCoalOre extends BlockBase
{
	public MSCoalOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 1);
		setHardness(3.0F);
		setResistance(3.0F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Items.COAL;
	}
	
	@Override
	protected boolean canSilkHarvest() 
	{
		return true;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) 
	{
		return 3;
	}
}

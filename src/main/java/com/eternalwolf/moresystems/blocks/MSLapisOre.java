package com.eternalwolf.moresystems.blocks;

import java.util.Random;

import micdoodle8.mods.galacticraft.core.GCItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class MSLapisOre extends BlockBase
{
	public MSLapisOre(String name, Material material) 
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
		return Items.DYE;
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return 4;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) 
	{
		return 5;
	}
	
	@Override
	public int quantityDropped(Random random) {
		int max = 3;
		int min = 4;
		return random.nextInt(max) + min;
	}
	
	@Override
	protected boolean canSilkHarvest() 
	{
		return true;
	}
	
}

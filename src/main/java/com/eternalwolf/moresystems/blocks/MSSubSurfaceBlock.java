package com.eternalwolf.moresystems.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MSSubSurfaceBlock extends BlockBase 
{

	public MSSubSurfaceBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 0);
		setHardness(0.8F);
		setResistance(0.8F);
	}
}
	


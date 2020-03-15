package com.eternalwolf.moresystems.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockSand;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VeneraDirt extends BlockBase
{

	public VeneraDirt(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.SAND);
		setHarvestLevel("shovel", 0);
		setHardness(0.5F);
		setResistance(2.5F);
	    
	}
	
	
}

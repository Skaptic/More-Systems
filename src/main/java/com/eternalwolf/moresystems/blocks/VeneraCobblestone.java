package com.eternalwolf.moresystems.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VeneraCobblestone extends BlockBase
{
	public VeneraCobblestone(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 0);
		setHardness(2.0F);
		setResistance(6.0F);
	}
}

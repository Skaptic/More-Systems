package com.eternalwolf.moresystems.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MSTinOre extends BlockBase
{
	public MSTinOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 1);
		setHardness(5.0F);
		setResistance(3.0F);
	}
}

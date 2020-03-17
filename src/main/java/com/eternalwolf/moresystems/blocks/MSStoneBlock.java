package com.eternalwolf.moresystems.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MSStoneBlock extends BlockBase
{
	public MSStoneBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 0);
		setHardness(1.5F);
		setResistance(6.0F);
	}
}

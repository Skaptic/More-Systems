package com.eternalwolf.moresystems.blocks;

import com.eternalwolf.moresystems.core.MainClass;
import com.eternalwolf.moresystems.init.ModBlocks;
import com.eternalwolf.moresystems.init.ModItems;
import com.eternalwolf.moresystems.items.ItemBase;
import com.eternalwolf.moresystems.util.IHasModel;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class StairBase extends BlockStairs implements IHasModel
{
	public StairBase(String name, IBlockState modelState, CreativeTabs tab, float hardness, float resistance, SoundType sound, String toolClass, int level)
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHardness(hardness);
		setResistance(resistance);
		setSoundType(sound);
		setHarvestLevel(toolClass, level);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels()
	{
		MainClass.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}

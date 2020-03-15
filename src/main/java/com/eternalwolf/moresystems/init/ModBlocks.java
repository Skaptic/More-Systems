package com.eternalwolf.moresystems.init;

import java.util.ArrayList;
import java.util.List;

import com.eternalwolf.moresystems.blocks.BlockDoubleSlabBase;
import com.eternalwolf.moresystems.blocks.BlockHalfSlabBase;
import com.eternalwolf.moresystems.blocks.StairBase;
import com.eternalwolf.moresystems.blocks.VeneraCobblestone;
import com.eternalwolf.moresystems.blocks.VeneraDirt;
import com.eternalwolf.moresystems.blocks.VeneraSandstone;
import com.eternalwolf.moresystems.blocks.VeneraStone;
import com.eternalwolf.moresystems.core.MainClass;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block VENERA_DIRT = new VeneraDirt("venera_dirt", Material.SAND);
	public static final Block VENERA_SANDSTONE = new VeneraSandstone("venera_sandstone", Material.ROCK);
	public static final Block VENERA_STONE = new VeneraStone("venera_stone", Material.ROCK);
  //public static final Block VENERA_COAL_ORE = new VeneraCoalOre("venera_coal_ore", Material.ROCK);
  //public static final Block Venera_IRON_ORE = new VeneraIronOre("venera_iron_ore", Material.ROCK);
	public static final Block VENERA_COBBLESTONE = new VeneraCobblestone("venera_cobblestone", Material.ROCK);
	public static final Block VENERA_STONEBRICK = new VeneraStone("venera_stonebrick", Material.ROCK);
	public static final Block VENERA_STONEBRICK_CRACKED = new VeneraStone("venera_stonebrick_cracked", Material.ROCK);
	public static final Block VENERA_STONEBRICK_STAIRS = new StairBase("venera_stonebrick_stairs", ModBlocks.VENERA_STONEBRICK.getDefaultState(), MainClass.moresystemstab, 2.0F, 6.0F, SoundType.STONE, "pickaxe", 0);
	public static final BlockSlab VENERA_STONEBRICK_SLAB_DOUBLE = new BlockDoubleSlabBase("venera_stonebrick_slab_double", Material.ROCK, MainClass.moresystemstab, ModBlocks.VENERA_STONEBRICK_SLAB_HALF);
	public static final BlockSlab VENERA_STONEBRICK_SLAB_HALF = new BlockHalfSlabBase("venera_stonebrick_slab_half", Material.ROCK, MainClass.moresystemstab, ModBlocks.VENERA_STONEBRICK_SLAB_HALF, ModBlocks.VENERA_STONEBRICK_SLAB_DOUBLE);
	
}

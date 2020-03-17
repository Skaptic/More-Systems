package com.eternalwolf.moresystems.init;

import java.util.ArrayList;
import java.util.List;

import com.eternalwolf.moresystems.blocks.BlockDoubleSlabBase;
import com.eternalwolf.moresystems.blocks.BlockHalfSlabBase;
import com.eternalwolf.moresystems.blocks.MSAluminumOre;
import com.eternalwolf.moresystems.blocks.MSCoalOre;
import com.eternalwolf.moresystems.blocks.MSCopperOre;
import com.eternalwolf.moresystems.blocks.MSDiamondOre;
import com.eternalwolf.moresystems.blocks.MSIronOre;
import com.eternalwolf.moresystems.blocks.MSLapisOre;
import com.eternalwolf.moresystems.blocks.MSSiliconOre;
import com.eternalwolf.moresystems.blocks.MSStoneBlock;
import com.eternalwolf.moresystems.blocks.StairBase;
import com.eternalwolf.moresystems.blocks.VeneraCobblestone;
import com.eternalwolf.moresystems.blocks.MSSurfaceBlock;
import com.eternalwolf.moresystems.blocks.MSTinOre;
import com.eternalwolf.moresystems.blocks.MSSubSurfaceBlock;
import com.eternalwolf.moresystems.blocks.MSStoneBlockCobbleReturn;
import com.eternalwolf.moresystems.core.MainClass;

import micdoodle8.mods.galacticraft.core.blocks.BlockBasic;
import micdoodle8.mods.galacticraft.planets.venus.blocks.BlockBasicVenus;
import micdoodle8.mods.galacticraft.planets.venus.blocks.BlockBasicVenus.EnumBlockBasicVenus;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Apollo
	public static final Block APOLLO_DUST = new MSSurfaceBlock("apollo_dust", Material.SAND);
	public static final Block APOLLO_ROCK = new MSSubSurfaceBlock("apollo_rock", Material.ROCK);
	public static final Block APOLLO_STONE = new MSStoneBlock("apollo_stone", Material.ROCK);
	public static final Block APOLLO_ALUMINUM_ORE = new MSAluminumOre("apollo_aluminum_ore", Material.ROCK);
	public static final Block APOLLO_DIAMOND_ORE = new MSDiamondOre("apollo_diamond_ore", Material.ROCK);
	public static final Block APOLLO_IRON_ORE = new MSIronOre("apollo_iron_ore", Material.ROCK);
	public static final Block APOLLO_LAPIS_ORE = new MSLapisOre("apollo_lapis_ore", Material.ROCK);
	public static final Block APOLLO_TIN_ORE = new MSTinOre("apollo_tin_ore", Material.ROCK);
	
	
	//Venera
	public static final Block VENERA_DIRT = new MSSurfaceBlock("venera_dirt", Material.SAND);
	public static final Block VENERA_SANDSTONE = new MSSubSurfaceBlock("venera_sandstone", Material.ROCK);
	public static final Block VENERA_STONE = new MSStoneBlockCobbleReturn("venera_stone", Material.ROCK);
	public static final Block VENERA_COBBLESTONE = new VeneraCobblestone("venera_cobblestone", Material.ROCK);
	public static final Block VENERA_STONEBRICK = new MSStoneBlock("venera_stonebrick", Material.ROCK);
	public static final Block VENERA_STONEBRICK_CRACKED = new MSStoneBlock("venera_stonebrick_cracked", Material.ROCK);
	public static final Block VENERA_STONEBRICK_STAIRS = new StairBase("venera_stonebrick_stairs", ModBlocks.VENERA_STONEBRICK.getDefaultState(), MainClass.moresystemstab, 2.0F, 6.0F, SoundType.STONE, "pickaxe", 0);
	public static final BlockSlab VENERA_STONEBRICK_SLAB_DOUBLE = new BlockDoubleSlabBase("venera_stonebrick_slab_double", Material.ROCK, MainClass.moresystemstab, ModBlocks.VENERA_STONEBRICK_SLAB_HALF);
	public static final BlockSlab VENERA_STONEBRICK_SLAB_HALF = new BlockHalfSlabBase("venera_stonebrick_slab_half", Material.ROCK, MainClass.moresystemstab, ModBlocks.VENERA_STONEBRICK_SLAB_HALF, ModBlocks.VENERA_STONEBRICK_SLAB_DOUBLE);
	public static final Block VENERA_DIAMOND_ORE = new MSDiamondOre("venera_diamond_ore", Material.ROCK);
	public static final Block VENERA_COPPER_ORE = new MSCopperOre("venera_copper_ore", Material.ROCK);
	public static final Block VENERA_SILICON_ORE = new MSSiliconOre("venera_silicon_ore", Material.ROCK);
	public static final Block VENERA_IRON_ORE = new MSIronOre("venera_iron_ore", Material.ROCK);
	public static final Block VENERA_COAL_ORE = new MSCoalOre("venera_coal_ore", Material.ROCK);
	
}

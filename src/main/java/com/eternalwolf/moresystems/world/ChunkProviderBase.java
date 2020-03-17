package com.eternalwolf.moresystems.world;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import micdoodle8.mods.galacticraft.core.perlin.NoiseModule;
import micdoodle8.mods.galacticraft.core.perlin.generator.Gradient;
import micdoodle8.mods.galacticraft.core.world.gen.EnumCraterSize;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorOverworld;
import net.minecraft.world.gen.IChunkGenerator;

public abstract class ChunkProviderBase implements IChunkGenerator
{
    @Override
    @Nullable
    public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position, boolean findUnexplored)
    {
        return null;
    }
    
    // This is something connected with Ocean Monuments, and not used in Galacticraft.
    @Override
    public boolean generateStructures(Chunk chunkIn, int x, int z)
    {
        return false;
    }
    
    /**
     * Override this if you want to implement an advancement using net.minecraft.advancements.critereon.LocationPredicate
     */
    @Override
    public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos)
    {
        return false;
    }
}
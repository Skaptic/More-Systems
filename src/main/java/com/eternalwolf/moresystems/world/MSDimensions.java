package com.eternalwolf.moresystems.world;

import micdoodle8.mods.galacticraft.core.util.WorldUtil;
import net.minecraft.world.DimensionType;

public class MSDimensions 
{
	public static DimensionType APOLLO;
	public static DimensionType VENERA;
	
	public static void init()
	{
		//Apollo
		MSDimensions.APOLLO = MSDimensions.getDimType(-777);
		//Venera
		MSDimensions.VENERA = MSDimensions.getDimType(1746);
	}
	
	
	
	
	
	
	//Defining getDimType()
	public static DimensionType getDimType(int dimId)
	{
		return WorldUtil.getDimensionTypeById(dimId);
	}
	
	
}

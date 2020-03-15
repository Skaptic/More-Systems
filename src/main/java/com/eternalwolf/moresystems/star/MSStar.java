package com.eternalwolf.moresystems.star;

import com.eternalwolf.moresystems.util.Reference;

import micdoodle8.mods.galacticraft.api.galaxies.Star;
import net.minecraft.util.ResourceLocation;

public class MSStar extends Star {
	
	public MSStar(String starName) {
		super(starName);
		this.setBodyIcon(new ResourceLocation(Reference.MOD_ID, "textures/gui/stars/" + starName + ".png"));
		this.setTierRequired(-1);
	}

}

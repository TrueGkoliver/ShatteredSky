package com.gkoliver.shatteredsky.common.world.dim;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.GenerationSettings;

public class SSGenSettings extends GenerationSettings {
	public int getBiomeSize() {
		return 2;
	}
	public int getRiverSize() {
		return 2;
	}
	public int getBiomeID() {
		return -1;
	}
	public BlockPos getSpawnPos() {
		return new BlockPos(0, 0, 0);
	}
	
}

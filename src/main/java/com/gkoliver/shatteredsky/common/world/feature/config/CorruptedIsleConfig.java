package com.gkoliver.shatteredsky.common.world.feature.config;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

import net.minecraft.world.gen.feature.IFeatureConfig;

public class CorruptedIsleConfig implements IFeatureConfig {

	@Override
	public <T> Dynamic<T> serialize(DynamicOps<T> ops) {
		return null;
	}

}

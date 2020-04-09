package com.gkoliver.shatteredsky.common.world.dim;

import java.util.Random;
import java.util.Set;

import com.gkoliver.shatteredsky.core.registry.BiomeRegistry;
import com.google.common.collect.ImmutableSet;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

public class SSBiomeProvider extends BiomeProvider {
	private Random rand;

	public SSBiomeProvider() {
		super(SS_BIOMES);
		rand = new Random();

	}
	
	private static final Set<Biome> SS_BIOMES = ImmutableSet.of(BiomeRegistry.CORRUPTED_DEEP_FOREST.get(), BiomeRegistry.CORRUPTED_ISLES.get());
	@Override
	public Biome getNoiseBiome(int x, int y, int z) {
		
		return BiomeRegistry.CORRUPTED_DEEP_FOREST.get();
	}
	

}

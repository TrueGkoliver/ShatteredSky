package com.gkoliver.shatteredsky.common.world.biome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome.Builder;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Carving;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.Placement;

public class BiomeCorruptedIsles extends Biome {
	public BiomeCorruptedIsles(Builder biomeBuilder) {
		super(biomeBuilder);
		
		this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.END_CITY.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.CHANCE_PASSTHROUGH.configure(new ChanceConfig(1000))));


		
	}
	
	@Override
	public int getGrassColor(double posX, double posZ) {
		// TODO Auto-generated method stub
		return 0x090091;
	}

}

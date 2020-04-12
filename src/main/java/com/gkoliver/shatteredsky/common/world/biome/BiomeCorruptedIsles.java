package com.gkoliver.shatteredsky.common.world.biome;

import com.gkoliver.shatteredsky.core.registry.FeaturesRegistry;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome.Builder;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Carving;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;

public class BiomeCorruptedIsles extends Biome {
	public BiomeCorruptedIsles(Builder biomeBuilder) {
		super(biomeBuilder);
		this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(50))));
		//this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, FeaturesRegistry.SHATTERED_ISLAND.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));

		
	}
	
	@Override
	public int getGrassColor(double posX, double posZ) {
		// TODO Auto-generated method stub
		return 0x7aadff;
	}
	

}

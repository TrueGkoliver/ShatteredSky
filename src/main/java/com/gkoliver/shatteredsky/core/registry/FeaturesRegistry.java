package com.gkoliver.shatteredsky.core.registry;

import com.gkoliver.shatteredsky.common.world.feature.FeatureCorruptedIsle;
import com.gkoliver.shatteredsky.core.SSRef;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FeaturesRegistry {
	public static final DeferredRegister<Feature<?>> REGISTER_FEATURE = new DeferredRegister<Feature<?>>(ForgeRegistries.FEATURES, SSRef.MOD_ID);
	
	public static final RegistryObject<Feature<?>> SHATTERED_ISLAND = REGISTER_FEATURE.register("shattered_island", ()->new FeatureCorruptedIsle(NoFeatureConfig::deserialize)); 
}

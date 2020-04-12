package com.gkoliver.shatteredsky.core.registry;

import com.gkoliver.shatteredsky.common.world.biome.BiomeCorruptedDeepForest;
import com.gkoliver.shatteredsky.common.world.biome.BiomeCorruptedIsles;
import com.gkoliver.shatteredsky.core.SSRef;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeRegistry {
	//Biome builders, aka the bulk
	public static final Biome.Builder CDF_BUILDER = 
			new Biome.Builder()
			.waterColor(0x00418A)
			.waterFogColor(0x00418A)
			.precipitation(RainType.RAIN)
			.scale(1F) //TURN THIS BACK TO 2
			.temperature(0F)
			.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState()))
			.category(Category.FOREST)
			.downfall(0.5F)
			.depth(0.11F)
			.parent(null);
	public static final Biome.Builder CI_BUILDER = 
			new Biome.Builder()
			.waterColor(0x060060)
			.waterFogColor(0x060060)
			.precipitation(RainType.RAIN)
			.scale(1F)
			.temperature(0.2F)
			.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState()))
			.category(Category.PLAINS)
			.downfall(0.5F)
			.depth(0.11F)
			.parent(null);
	
	
	
	
	
	//Biome Registry itself
	public static final DeferredRegister<Biome> REGISTER_BIOME = new DeferredRegister<Biome>(ForgeRegistries.BIOMES,
			SSRef.MOD_ID);

	public static final RegistryObject<Biome> CORRUPTED_DEEP_FOREST = REGISTER_BIOME.register("corrupted_deep_forest",
			() -> new BiomeCorruptedDeepForest(CDF_BUILDER));
	public static final RegistryObject<Biome> CORRUPTED_ISLES = REGISTER_BIOME.register("corrupted_isles",
			() -> new BiomeCorruptedIsles(CI_BUILDER));
	
	public static void registerBiomes() {
		registerBiome(CORRUPTED_DEEP_FOREST.get(), Type.FOREST, Type.DENSE);
		registerBiome(CORRUPTED_ISLES.get(), Type.FOREST, Type.HILLS);
	}
	
	private static void registerBiome(Biome biome, Type... types) {
		BiomeDictionary.addTypes(biome, types);
		
	}
}

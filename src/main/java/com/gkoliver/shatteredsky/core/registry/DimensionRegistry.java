package com.gkoliver.shatteredsky.core.registry;

import com.gkoliver.shatteredsky.common.world.dim.SSDimension;
import com.gkoliver.shatteredsky.common.world.dim.SSModDimension;
import com.gkoliver.shatteredsky.core.SSRef;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.Dimension;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionRegistry {
	public static final DeferredRegister<ModDimension> REGISTER_DIM = new DeferredRegister<ModDimension>(ForgeRegistries.MOD_DIMENSIONS, SSRef.MOD_ID);

	public static final RegistryObject<ModDimension> SHATTERED_SKY = REGISTER_DIM.register("shattered_sky", ()-> new SSModDimension());
	
}

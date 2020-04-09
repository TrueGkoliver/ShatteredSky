package com.gkoliver.shatteredsky.core.handlers;

import com.gkoliver.shatteredsky.ShatteredSky;
import com.gkoliver.shatteredsky.common.item.ItemProperties;
import com.gkoliver.shatteredsky.common.item.ItemSSTest;
import com.gkoliver.shatteredsky.core.SSRef;
import com.gkoliver.shatteredsky.core.registry.DimensionRegistry;
import com.gkoliver.shatteredsky.core.registry.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
@Mod.EventBusSubscriber(modid=SSRef.MOD_ID, bus=Bus.FORGE)
public class RegistryEventHandler {
	@SubscribeEvent
	public static void registerDimension(final RegisterDimensionsEvent event) {
		if (DimensionType.byName(ShatteredSky.SSDIM_TYPE)==null) {
			DimensionManager.registerDimension(ShatteredSky.SSDIM_TYPE, DimensionRegistry.SHATTERED_SKY.get(), null, true);
		}
		ShatteredSky.i.info("Dimensions have been handled.");
	}
	

}

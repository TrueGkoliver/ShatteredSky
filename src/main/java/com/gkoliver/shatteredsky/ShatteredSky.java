package com.gkoliver.shatteredsky;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.gkoliver.shatteredsky.core.SSRef;
import com.gkoliver.shatteredsky.core.handlers.RegistryEventHandler;
import com.gkoliver.shatteredsky.core.registry.BiomeRegistry;
import com.gkoliver.shatteredsky.core.registry.BlockRegistry;
import com.gkoliver.shatteredsky.core.registry.DimensionRegistry;
import com.gkoliver.shatteredsky.core.registry.EntityTypeRegistry;
import com.gkoliver.shatteredsky.core.registry.ItemRegistry;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SSRef.MOD_ID)
@EventBusSubscriber(modid=SSRef.MOD_ID)
public class ShatteredSky {
	
	public static final ResourceLocation SSDIM_TYPE = new ResourceLocation(SSRef.MOD_ID,"shattered_sky");
	public static final Logger i = LogManager.getLogger();
	public ShatteredSky() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		eventBus.addListener(this::setup);
		MinecraftForge.EVENT_BUS.register(this);
		ItemRegistry.REGISTER_ITEM.register(eventBus);
		BiomeRegistry.REGISTER_BIOME.register(eventBus);
		DimensionRegistry.REGISTER_DIM.register(eventBus);
		EntityTypeRegistry.REGISTER_ETYPE.register(eventBus);
		BlockRegistry.REGISTER_BLOCK.register(eventBus);
	}
	@SubscribeEvent
	public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
		BiomeRegistry.registerBiomes();
	}
	private void setup(final FMLCommonSetupEvent event)
    {
        //Here we go...
    }
	
}

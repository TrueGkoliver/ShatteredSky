package com.gkoliver.shatteredsky.core.handlers;

import com.gkoliver.shatteredsky.common.entity.base.ArrowPillarEntity;
import com.gkoliver.shatteredsky.common.entity.render.ArrowPillarRender;
import com.gkoliver.shatteredsky.core.SSRef;
import com.gkoliver.shatteredsky.core.registry.EntityTypeRegistry;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid=SSRef.MOD_ID, bus=Bus.MOD, value=Dist.CLIENT)
public class ClientEventHandler {
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityTypeRegistry.ARROW_PILLAR.get(), ArrowPillarRender::new);
	}
}

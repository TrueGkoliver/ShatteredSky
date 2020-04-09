package com.gkoliver.shatteredsky.core.registry;

import java.util.ArrayList;

import com.gkoliver.shatteredsky.common.item.ItemProperties;
import com.gkoliver.shatteredsky.common.item.ItemSSTest;
import com.gkoliver.shatteredsky.core.SSRef;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
	public static final DeferredRegister<Item> REGISTER_ITEM = new DeferredRegister<Item>(ForgeRegistries.ITEMS, SSRef.MOD_ID);
	
	public static final RegistryObject<Item> RO_TEST = REGISTER_ITEM.register("test", () -> new ItemSSTest("test", ItemProperties.PROP_TEST));
	
	
	
}

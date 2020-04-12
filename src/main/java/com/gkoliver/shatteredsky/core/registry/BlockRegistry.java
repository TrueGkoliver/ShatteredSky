package com.gkoliver.shatteredsky.core.registry;

import com.gkoliver.shatteredsky.common.block.BlockProperties;
import com.gkoliver.shatteredsky.common.item.ItemProperties;
import com.gkoliver.shatteredsky.common.item.ItemSSTest;
import com.gkoliver.shatteredsky.core.SSRef;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
	public static final DeferredRegister<Block> REGISTER_BLOCK = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, SSRef.MOD_ID);
	public static final RegistryObject<Block> DISTORTED_PLANKS = REGISTER_BLOCK.register("distorted_planks", () -> new Block(BlockProperties.PLANKS_PROPERTY));
	
}

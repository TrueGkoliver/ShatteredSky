package com.gkoliver.shatteredsky.common.block;

import com.gkoliver.shatteredsky.core.registry.ItemRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class SSBlock extends Block {

	public SSBlock(String name, Properties properties) {
		super(properties);
		BlockItem item_block = new BlockItem(this, new net.minecraft.item.Item.Properties());
		ItemRegistry.REGISTER_ITEM.register(name, ()->item_block);
	}

}

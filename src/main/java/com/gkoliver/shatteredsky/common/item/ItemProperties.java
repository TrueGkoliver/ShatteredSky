package com.gkoliver.shatteredsky.common.item;

import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;

/**
 * Why do we have to do this dumb stuff? Handler for properties, a thing that should not exist.
 * @author Gkoliver
 *
 */
public class ItemProperties {
	public static final Properties PROP_TEST = new Properties().maxStackSize(32).group(ItemGroup.BREWING);

}

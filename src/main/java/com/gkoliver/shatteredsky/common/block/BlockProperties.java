package com.gkoliver.shatteredsky.common.block;

import net.minecraft.block.Block.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class BlockProperties {
	public static final Properties PLANKS_PROPERTY = Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(1F);

}

package com.gkoliver.shatteredsky.common.world.feature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

import com.mojang.datafixers.Dynamic;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class FeatureCorruptedIsle extends Feature<NoFeatureConfig> {

	public FeatureCorruptedIsle(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn) {
		super(configFactoryIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand,
			BlockPos pos, NoFeatureConfig config) {
		int radius = 5;
		ArrayList<BlockPos> possies = new ArrayList<BlockPos>();
		Iterator<BlockPos> insis = pos.getAllInBox(pos.add(-radius, -radius, -radius), pos.add(radius, radius, radius)).iterator();
		while (insis.hasNext()) {
			BlockPos pos2 = insis.next();
			if (pos2.withinDistance(pos2, radius)) {
				possies.add(pos2);
			}
		}
		for (BlockPos pos3 : possies) {
			if ((pos3.getY()-pos.getY())<0) {
				this.setBlockState(worldIn, pos, Blocks.DIRT.getDefaultState());
			}
		}
		return false;
	}

}

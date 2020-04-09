package com.gkoliver.shatteredsky.common.world.dim;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGenerator;

public class SSDimension extends Dimension {

	public SSDimension(World worldIn, DimensionType typeIn) {
		super(worldIn, typeIn, 0.0F);
	}

	@Override
	public ChunkGenerator<?> createChunkGenerator() {
		return new SSChunkGenerator(world, new SSBiomeProvider(), new SSGenSettings());
	}

	@Override
	public BlockPos findSpawn(ChunkPos chunkPosIn, boolean checkValid) {
		return null;
	}

	@Override
	public BlockPos findSpawn(int posX, int posZ, boolean checkValid) {
		return null;
	}

	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks) {
		return 0;
	}

	@Override
	public boolean isSurfaceWorld() {
		return false;
	}

	@Override
	public Vec3d getFogColor(float celestialAngle, float partialTicks) {
		return Vec3d.ZERO;
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

	@Override
	public boolean doesXZShowFog(int x, int z) {
		return false;
	}
	@Override
	public SleepResult canSleepAt(PlayerEntity player, BlockPos pos) {
		
		return SleepResult.DENY;
	}
	@Override
	public int getHeight() {
		return 256;
	}
	
}

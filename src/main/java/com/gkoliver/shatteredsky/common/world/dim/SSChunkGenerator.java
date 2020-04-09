package com.gkoliver.shatteredsky.common.world.dim;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.EndGenerationSettings;
import net.minecraft.world.gen.NoiseChunkGenerator;

public class SSChunkGenerator extends NoiseChunkGenerator<SSGenSettings> {
	private final BlockPos spawnPoint;

	   public SSChunkGenerator(IWorld worldIn, BiomeProvider biomeProviderIn, SSGenSettings settingsIn) {
	      super(worldIn, biomeProviderIn, 8, 4, 128, settingsIn, true);
	      this.spawnPoint = settingsIn.getSpawnPos();
	   }

	   protected void fillNoiseColumn(double[] noiseColumn, int noiseX, int noiseZ) {
		  //Default: 1368.824D;
		  //Changed to 1400D: No noticable change
	      double d0 = 1368.824D;
	      
	      //Default: 684.412D;
	      //Changed to 700D: No noticable change
	      double d1 = 684.412D;
	      
	      //Default: 17.110300000000002D;
	      //Changed to 18: No noticable difference
	      double d2 = 17.110300000000002D;
	      
	      //Default: 4.277575000000001D;
	      double d3 = 4.277575000000001D;
	      
	      //Default: 64;
	      //Changed to 32; Some changes, but not many
	      int i = 64;
	      
	      //Default: -3000;
	      //Changed to -750
	      int j = -750;
	      
	      
	      
	      
	      this.calcNoiseColumn(noiseColumn, noiseX, noiseZ, d0, d1, d2, d3, i, j);
	   }

	   protected double[] getBiomeNoiseColumn(int noiseX, int noiseZ) {
	      return new double[]{(double)this.biomeProvider.func_222365_c(noiseX, noiseZ), 0.0D};
	   }

	   protected double func_222545_a(double p_222545_1_, double p_222545_3_, int p_222545_5_) {
	      return 8.0D - p_222545_1_;
	   }

	   protected double func_222551_g() {
	      return (double)((int)super.func_222551_g() / 2);
	   }

	   protected double func_222553_h() {
	      return 8.0D;
	   }

	   public int getGroundHeight() {
	      return 50;
	   }

	   public int getSeaLevel() {
	      return 0;
	   }

}

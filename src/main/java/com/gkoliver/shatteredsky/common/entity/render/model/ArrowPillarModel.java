package com.gkoliver.shatteredsky.common.entity.render.model;

import com.gkoliver.shatteredsky.common.entity.base.ArrowPillarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MobEntity;

// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public class ArrowPillarModel<T extends ArrowPillarEntity> extends EntityModel<T> {
	private final ModelRenderer Body;
	private final ModelRenderer bottom;
	private final ModelRenderer middle;
	private int to_up = 20;
	private int to_side = 8;
	public ArrowPillarModel() {
		textureWidth = 16;
		textureHeight = 16;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(-0.5F, -0.5F, 0.5F);
		Body.addChild(bottom);
		bottom.addBox(0-to_side, 0-to_up, 0-to_side, 24, 24, 24);
		//Deprecated method!
		//bottom.cubeList.add(new ModelBox(bottom, 0, 0, -3.0F, -2.5F, -1.0F, 3, 3, 3, 0.0F, false));

		middle = new ModelRenderer(this);
		middle.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(middle);
		middle.addBox(4F-to_side, -16.0F-to_up, 4F-to_side, 16, 16, 16).setTextureOffset(0, 5);
		
		//Deprecated method!
		//middle.cubeList.add(new ModelBox(middle, 0, 6, -3.0F, -5.0F, 0.0F, 2, 2, 2, 0.0F, false));
	}

	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}




	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		Body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
		
	}


	


	




	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// TODO Auto-generated method stub
		
	}
}
package com.gkoliver.shatteredsky.common.entity.render.model;

import com.gkoliver.shatteredsky.common.entity.base.ArrowPillarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MobEntity;

/**
 * Shattered Sky - Gkoliver
 * Created using Tabula 7.1.0
 */

public class ArrowPillarModel<T extends ArrowPillarEntity> extends EntityModel<T> {
	public ModelRenderer bottom;
    public ModelRenderer top;

    public ArrowPillarModel() {
        this.textureWidth = 96;
        this.textureHeight = 96;
        this.top = new ModelRenderer(this, 0, 48);
        this.top.setRotationPoint(3.5F, -16.0F, 3.5F);
        this.top.addBox(0.0F, 0.0F, 0.0F, 16, 16, 16, 0.0F);
        this.bottom = new ModelRenderer(this, 0, 0);
        this.bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottom.addBox(0.0F, 0.0F, 0.0F, 24, 24, 24, 0.0F);
    }


    /**
     * This is a helper function from Tabula to set the rotation of model parts
     * @apiNote Yes it is!
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		
		
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		// TODO Auto-generated method stub
		
	}
}
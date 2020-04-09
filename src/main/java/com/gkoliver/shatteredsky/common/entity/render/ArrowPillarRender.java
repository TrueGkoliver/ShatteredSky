package com.gkoliver.shatteredsky.common.entity.render;

import com.gkoliver.shatteredsky.ShatteredSky;
import com.gkoliver.shatteredsky.common.entity.base.ArrowPillarEntity;
import com.gkoliver.shatteredsky.common.entity.render.model.ArrowPillarModel;
import com.gkoliver.shatteredsky.core.SSRef;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ArrowPillarRender extends MobRenderer<ArrowPillarEntity, ArrowPillarModel<ArrowPillarEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation(SSRef.MOD_ID + ":textures/entity/arrow_pillar.png");
	public ArrowPillarRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new ArrowPillarModel<ArrowPillarEntity>(), 0.5F);
	}
	@Override
	public ResourceLocation getEntityTexture(ArrowPillarEntity entity) {
		return TEXTURE;
	}
	
	
}

package com.gkoliver.shatteredsky.core.registry;

import com.gkoliver.shatteredsky.common.entity.base.ArrowPillarEntity;
import com.gkoliver.shatteredsky.core.SSRef;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypeRegistry {
	public static final DeferredRegister<EntityType<?>> REGISTER_ETYPE = new DeferredRegister<EntityType<?>>(ForgeRegistries.ENTITIES, SSRef.MOD_ID);
	
	public static final RegistryObject<EntityType<ArrowPillarEntity>> ARROW_PILLAR = REGISTER_ETYPE.register("arrow_pillar", ()->EntityType.Builder.<ArrowPillarEntity>create(ArrowPillarEntity::new, EntityClassification.MISC).size(1.6F, 2.4F).build(new ResourceLocation(SSRef.MOD_ID, "arrow_pillar").toString()));

}

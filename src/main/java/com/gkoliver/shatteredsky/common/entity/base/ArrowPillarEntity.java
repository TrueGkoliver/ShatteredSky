package com.gkoliver.shatteredsky.common.entity.base;

import com.gkoliver.shatteredsky.core.registry.EntityTypeRegistry;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.effect.LightningBoltEntity;
public class ArrowPillarEntity extends MonsterEntity {
	
	private MeleeAttackGoal i;
	private int cooldown = 20;
	public ArrowPillarEntity(EntityType<? extends MonsterEntity> type, World worldIn) {
		super(type, worldIn);
		
	}
	public AgeableEntity createChild() {
		ArrowPillarEntity i = new ArrowPillarEntity(EntityTypeRegistry.ARROW_PILLAR.get(),world);
		i.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(i)), SpawnReason.BREEDING, (ILivingEntityData)null, (CompoundNBT)null);
		return null;
	}
	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.i = new MeleeAttackGoal(this, this.interpTargetHeadYaw, false);
		this.goalSelector.addGoal(1, new SwimGoal(this));
		
		this.goalSelector.addGoal(2, i);
		
		
	}
	@Override
	protected void updateAITasks() {
		
		super.updateAITasks();
	}
	@Override
	public void livingTick() {
		if (!this.world.isRemote) {
			
		}
		super.livingTick();
	}
	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30D);
		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4D);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1D);
	}
	@Override
	public void onStruckByLightning(LightningBoltEntity lightningBolt) {
		this.setGlowing(true);
		this.addVelocity(0, 5, 0);
		super.onStruckByLightning(lightningBolt);
	}

}

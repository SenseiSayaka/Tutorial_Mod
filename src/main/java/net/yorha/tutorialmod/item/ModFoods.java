package net.yorha.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MOONSTONE_APPLE = new FoodProperties.Builder().nutrition(6).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 300, 2), 1.0F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 2), 1.0F).effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 2), 1.0F).effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 2), 1.0F).alwaysEat().build();
}

package net.shade.terrapon.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class TerraponFoodProperties {
    public static final FoodProperties GOBBREAD = new FoodProperties.Builder().nutrition(8).saturationMod(20.0f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 5000), 1.0f).build();
}

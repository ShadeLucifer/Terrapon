package net.shade.terrapon.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;


public class TerraponEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Terrapon.MOD_ID);

    public static final RegistryObject<MobEffect> MANARIDIUMOVERFLOW_EFFECT = MOB_EFFECTS.register("manaridiumoverflow",
            () -> new ManaridiumOverflow(MobEffectCategory.NEUTRAL, 0xedb525).addAttributeModifier(Attributes.MOVEMENT_SPEED,
                    "7107DE5E-7CEB-4030-940E-514C1F160890", -1.0f, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static final RegistryObject<MobEffect> THOREK_BOOST_EFFECT = MOB_EFFECTS.register("thorekboost",
            () -> new ThorekBoost(MobEffectCategory.BENEFICIAL, 0x123524).addAttributeModifier(Attributes.ARMOR,
                    "66e4c2f6-7ee5-4dfd-90d7-5be375604b9c", 2.0f, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static final RegistryObject<MobEffect> MANARIDIUMWINGS_EFFECT = MOB_EFFECTS.register("manaridiumwings",
            () -> new ManaridiumWings(MobEffectCategory.BENEFICIAL, 0x0F4D92).addAttributeModifier(Attributes.FLYING_SPEED,
                    "2bca08b8-3ded-41a2-b1ef-dd3734f4ef50", 0.5f, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}

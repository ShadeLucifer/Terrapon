package net.shade.terrapon.effect;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.shade.terrapon.entity.client.armor.EilifligroniumArmorItem;
import org.jetbrains.annotations.NotNull;


public class ManaridiumWings extends MobEffect {

    public ManaridiumWings(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }


    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (pLivingEntity instanceof Player player) {
            if (player.hasEffect(TerraponEffects.MANARIDIUMWINGS_EFFECT.get()))

                // Check if the player already has flight enabled through another means
                if (player.getAbilities().mayfly) return;

            if (player.isCreative() || player.isSpectator()) return;

            if (player.hasEffect(TerraponEffects.MANARIDIUMWINGS_EFFECT.get())) {
                player.getAbilities().mayfly = true;
                player.fallDistance = 0.0f;
                player.getPersistentData();
            } else {// Turn off flight
                if (!player.hasEffect(TerraponEffects.MANARIDIUMWINGS_EFFECT.get())) {
                    player.getAbilities().mayfly = false;
                    if (player.getAbilities().mayfly) return;
                }
            }
            }
        return;
        }
    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {

        return true;
    }
}

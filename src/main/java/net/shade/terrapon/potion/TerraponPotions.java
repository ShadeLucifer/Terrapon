package net.shade.terrapon.potion;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.effect.TerraponEffects;

public class TerraponPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, Terrapon.MOD_ID);

    public static final RegistryObject<Potion> THOREK_POTION = POTIONS.register("thorek_potion",
            () -> new Potion(new MobEffectInstance(TerraponEffects.THOREK_BOOST_EFFECT.get(), 12800, 0)));
    public static final RegistryObject<Potion> MANARIDIUMWINGS_POTION = POTIONS.register("manaridiumwings_potion",
            () -> new Potion(new MobEffectInstance(TerraponEffects.MANARIDIUMWINGS_EFFECT.get(), 12800, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }

}

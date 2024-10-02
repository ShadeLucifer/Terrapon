package net.shade.terrapon.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;


public class TerraponEnchantment {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Terrapon.MOD_ID);

    public static final RegistryObject<Enchantment> SEIDR_WHISPERS =
            ENCHANTMENTS.register("seidr_whispers", () -> new SeidrWhisperEnchantment(Enchantment.Rarity.COMMON,
                    EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus) {
     ENCHANTMENTS.register(eventBus);
    }

}

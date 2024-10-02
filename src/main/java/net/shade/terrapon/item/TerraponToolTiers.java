package net.shade.terrapon.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.util.TerraponTags;

import java.util.List;

public class TerraponToolTiers {
    public static Tier SEIDRILIUM_INGOT = TierSortingRegistry.registerTier(new ForgeTier(6, 3425, 12f, 8f, 40,
            TerraponTags.Blocks.NEEDS_SEIDRILIUM_TOOL, () -> Ingredient.of(ModItems.SEIDRILIUM_INGOT.get())),
            new ResourceLocation(Terrapon.MOD_ID, "seidrilium"), List.of(Tiers.NETHERITE), List.of());
    public static Tier EINVADRIL_INGOT = TierSortingRegistry.registerTier(new ForgeTier(7, 4425, 8f, 12f, 26,
                    TerraponTags.Blocks.NEEDS_SEIDRILIUM_TOOL, () -> Ingredient.of(ModItems.EINVADRIL_INGOT.get())),
            new ResourceLocation(Terrapon.MOD_ID, "einvadril"), List.of(Tiers.NETHERITE), List.of());
    public static Tier HLIFINTITE_INGOT = TierSortingRegistry.registerTier(new ForgeTier(8, 12425, 6f, 4f, 30,
                    TerraponTags.Blocks.NEEDS_EINVADRIL_TOOL, () -> Ingredient.of(ModItems.HLIFINTITE_INGOT.get())),
            new ResourceLocation(Terrapon.MOD_ID, "hlifintite"), List.of(Tiers.NETHERITE), List.of());
    public static Tier EILIFLIGRONIUM_INGOT = TierSortingRegistry.registerTier(new ForgeTier(10, 999999999, 20f, 20f, 100,
                    TerraponTags.Blocks.NEEDS_EINVADRIL_TOOL, () -> Ingredient.of(ModItems.EILIFLIGRONIUM_INGOT.get())),
            new ResourceLocation(Terrapon.MOD_ID, "eilifligronium"), List.of(Tiers.NETHERITE), List.of());
}

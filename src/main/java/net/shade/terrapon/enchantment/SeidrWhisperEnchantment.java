package net.shade.terrapon.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class SeidrWhisperEnchantment extends Enchantment {
    public static final int ALL = 0;
    public static final int UNDEAD = 1;
    public static final int ARTHROPODS = 2;
    private static final String[] NAMES = new String[]{"all", "undead", "arthropods"};
    private static final int[] MIN_COST = new int[]{1, 5, 5};
    private static final int[] LEVEL_COST = new int[]{11, 8, 8};
    private static final int[] LEVEL_COST_SPAN = new int[]{20, 20, 20};
    private int type;

    protected SeidrWhisperEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, EnchantmentCategory.WEAPON, pApplicableSlots);
        this.type = type;
    }

    public int getMaxLevel() {
        return 10;
    }
    public int getMinCost(int pEnchantmentLevel) {
        return 5 + (pEnchantmentLevel - 1) * 9;
    }

    public int getMaxCost(int pEnchantmentLevel) {
        return this.getMinCost(pEnchantmentLevel) + 15;
    }

    @Override
    public float getDamageBonus(int pLevel, @NotNull MobType pCreatureType) {
        if (this.type == 0) {
            return 2.0F + (float) Math.max(0, pLevel - 1) * 2.5F;
        } else if (this.type == 1 && pCreatureType == MobType.UNDEAD) {
            return (float) pLevel * 2.5F;
        } else {
            return this.type == 2 && pCreatureType == MobType.ARTHROPOD ? (float) pLevel * 2.5F : 0.0F;
        }
    }
    public static float getSweepingDamageRatio(int pLevel) {
        return 1.5F - 1.5F / (float)(pLevel + 1.5);
    }



}
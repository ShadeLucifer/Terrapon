package net.shade.terrapon.item;

import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.shade.terrapon.Terrapon;

import java.util.EnumMap;
import java.util.function.Supplier;


public enum TerraponArmorMaterials implements ArmorMaterial {

    SEIDRILIUM("seidrilium", 84, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 6);
        map.put(ArmorItem.Type.LEGGINGS, 8);
        map.put(ArmorItem.Type.CHESTPLATE, 10);
        map.put(ArmorItem.Type.HELMET, 6);
    }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> Ingredient.of(ModItems.SEIDRILIUM_INGOT.get())),
    EINVADRIL("einvadril", 128, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 12);
        map.put(ArmorItem.Type.LEGGINGS, 14);
        map.put(ArmorItem.Type.CHESTPLATE, 16);
        map.put(ArmorItem.Type.HELMET, 12);
    }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.8F, () -> Ingredient.of(ModItems.EINVADRIL_INGOT.get())),
    THORNECKITE("thorneckite", 1080, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 8);
        map.put(ArmorItem.Type.LEGGINGS, 12);
        map.put(ArmorItem.Type.CHESTPLATE, 16);
        map.put(ArmorItem.Type.HELMET, 8);
    }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.8F, () -> Ingredient.of(ModItems.THORNECKITE_INGOT.get())),
    SOLLOGIUM("sollogium", 840, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 10);
        map.put(ArmorItem.Type.LEGGINGS, 14);
        map.put(ArmorItem.Type.CHESTPLATE, 18);
        map.put(ArmorItem.Type.HELMET, 10);
    }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.8F, () -> Ingredient.of(ModItems.SOLLOGIUM_INGOT.get())),
    HLIFINTITE("hlifintite", 4080, Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 24);
        map.put(ArmorItem.Type.LEGGINGS, 26);
        map.put(ArmorItem.Type.CHESTPLATE, 30);
        map.put(ArmorItem.Type.HELMET, 24);
    }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.8F, () -> Ingredient.of(ModItems.HLIFINTITE_INGOT.get())),
    EILIFLIGRONIUM("eilifligronium", -1 ,Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 42);
        map.put(ArmorItem.Type.LEGGINGS, 54);
        map.put(ArmorItem.Type.CHESTPLATE, 62);
        map.put(ArmorItem.Type.HELMET, 42);
    }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.8F, () -> Ingredient.of(ModItems.EILIFLIGRONIUM_INGOT.get()));

    public static final StringRepresentable.EnumCodec<net.minecraft.world.item.ArmorMaterials> CODEC = StringRepresentable.fromEnum(net.minecraft.world.item.ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    TerraponArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionTypeMap,
        int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackRes, Supplier<Ingredient> repairMaterial){
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protectionTypeMap;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackRes;
        this.repairIngredient = repairMaterial;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type p_266752_) {
        { return this.protectionFunctionForType.get(p_266752_); }
    }

    @Override
    public int getEnchantmentValue() {
        { return this.enchantmentValue; }
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        { return this.repairIngredient.get(); }
    }

    @Override
    public String getName() {
        return Terrapon.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
    public String getSerializedName() {
        return Terrapon.MOD_ID + ":" + this.name;
    }
}
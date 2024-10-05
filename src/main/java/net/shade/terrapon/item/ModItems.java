package net.shade.terrapon.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.block.terraponblock;
import net.shade.terrapon.entity.client.armor.*;
import net.shade.terrapon.item.terraponitems.*;
import net.shade.terrapon.sound.TerraponSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Terrapon.MOD_ID);
    public static final RegistryObject<Item> EINVADRIL_INGOT = ITEMS.register("einvadril_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STOKKR_STICK = ITEMS.register("stokkr_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HLIFINTITE_INGOT = ITEMS.register("hlifintite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THORNECKITE_INGOT = ITEMS.register("thorneckite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOLLOGIUM_INGOT = ITEMS.register("sollogium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEIDRILIUM_INGOT = ITEMS.register("seidrilium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_INGOT = ITEMS.register("eilifligronium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SEIDRILIUM = ITEMS.register("raw_seidrilium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_THORNECKITE =  ITEMS.register("raw_thorneckite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_HLIFINTITE = ITEMS.register("raw_hlifintite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_EINVADRIL = ITEMS.register("raw_einvadril",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORBOFSEIDRIL = ITEMS.register("orbofseidril",
            () -> new OrbOfSeidril(new Item.Properties().stacksTo(1).durability(644)));
    public static final RegistryObject<Item> GOBBREAD = ITEMS.register("gobbread",
            () -> new Item(new Item.Properties().food(TerraponFoodProperties.GOBBREAD)));
    public static final RegistryObject<Item> LOPT_FUEL = ITEMS.register("lopt_fuel",
            () -> new LoptFuel(new Item.Properties(), 128000));

    public static final RegistryObject<Item> SEIDRILIUM_SWORD = ITEMS.register("seidrilium_sword",
            () -> new SlowingSwordItem(TerraponToolTiers.SEIDRILIUM_INGOT, 3, 16, new Item.Properties().durability(3425)));
    public static final RegistryObject<Item> SEIDRILIUM_AXE = ITEMS.register("seidrilium_axe",
            () -> new AxeItem(TerraponToolTiers.SEIDRILIUM_INGOT, 8, 16, new Item.Properties().durability(3425)));
    public static final RegistryObject<Item> SEIDRILIUM_SHOVEL = ITEMS.register("seidrilium_shovel",
            () -> new ShovelItem(TerraponToolTiers.SEIDRILIUM_INGOT, 1, 16, new Item.Properties().durability(3425)));
    public static final RegistryObject<Item> SEIDRILIUM_PICKAXE = ITEMS.register("seidrilium_pickaxe",
            () -> new PickaxeItem(TerraponToolTiers.SEIDRILIUM_INGOT, 1, 16, new Item.Properties().durability(3425)));
    public static final RegistryObject<Item> SEIDRILIUM_HOE = ITEMS.register("seidrilium_hoe",
            () -> new HoeItem(TerraponToolTiers.SEIDRILIUM_INGOT, 1, 16, new Item.Properties().durability(3425)));
    public static final RegistryObject<Item> EINVADRIL_SWORD = ITEMS.register("einvadril_sword",
            () -> new DamagingSwordItem(TerraponToolTiers.EINVADRIL_INGOT, 10, 10, new Item.Properties().durability(6850)));
    public static final RegistryObject<Item> EINVADRIL_AXE = ITEMS.register("einvadril_axe",
            () -> new AxeItem(TerraponToolTiers.EINVADRIL_INGOT, 16, 10, new Item.Properties().durability(6850)));
    public static final RegistryObject<Item> EINVADRIL_SHOVEL = ITEMS.register("einvadril_shovel",
            () -> new ShovelItem(TerraponToolTiers.EINVADRIL_INGOT, 1, 10, new Item.Properties().durability(6850)));
    public static final RegistryObject<Item> EINVADRIL_PICKAXE = ITEMS.register("einvadril_pickaxe",
            () -> new PickaxeItem(TerraponToolTiers.EINVADRIL_INGOT, 1, 10, new Item.Properties().durability(6850)));
    public static final RegistryObject<Item> EINVADRIL_HOE = ITEMS.register("einvadril_hoe",
            () -> new HoeItem(TerraponToolTiers.EINVADRIL_INGOT, 1, 10, new Item.Properties().durability(6850)));
    public static final RegistryObject<Item> THORNECKITE_SWORD = ITEMS.register("thorneckite_sword",
            () -> new DamagingSwordItem(TerraponToolTiers.THORNECKITE_INGOT, 5, 4, new Item.Properties().durability(8850)));
    public static final RegistryObject<Item> THORNECKITE_AXE = ITEMS.register("thorneckite_axe",
            () -> new AxeItem(TerraponToolTiers.THORNECKITE_INGOT, 7, 4, new Item.Properties().durability(8850)));
    public static final RegistryObject<Item> THORNECKITE_SHOVEL = ITEMS.register("thorneckite_shovel",
            () -> new ShovelItem(TerraponToolTiers.THORNECKITE_INGOT, 1, 4, new Item.Properties().durability(8850)));
    public static final RegistryObject<Item> THORNECKITE_PICKAXE = ITEMS.register("thorneckite_pickaxe",
            () -> new PickaxeItem(TerraponToolTiers.THORNECKITE_INGOT, 1, 4, new Item.Properties().durability(8850)));
    public static final RegistryObject<Item> THORNECKITE_HOE = ITEMS.register("thorneckite_hoe",
            () -> new HoeItem(TerraponToolTiers.THORNECKITE_INGOT, 1, 4, new Item.Properties().durability(8850)));
    public static final RegistryObject<Item> HLIFINTITE_SWORD = ITEMS.register("hlifintite_sword",
            () -> new WeakeningSwordItem(TerraponToolTiers.HLIFINTITE_INGOT, 3, 1, new Item.Properties().durability(13150)));
    public static final RegistryObject<Item> HLIFINTITE_AXE = ITEMS.register("hlifintite_axe",
            () -> new AxeItem(TerraponToolTiers.HLIFINTITE_INGOT, 8, 1, new Item.Properties().durability(13150)));
    public static final RegistryObject<Item> HLIFINTITE_SHOVEL = ITEMS.register("hlifintite_shovel",
            () -> new ShovelItem(TerraponToolTiers.HLIFINTITE_INGOT, 1, 1, new Item.Properties().durability(13150)));
    public static final RegistryObject<Item> HLIFINTITE_PICKAXE = ITEMS.register("hlifintite_pickaxe",
            () -> new PickaxeItem(TerraponToolTiers.HLIFINTITE_INGOT, 1, 1, new Item.Properties().durability(13150)));
    public static final RegistryObject<Item> HLIFINTITE_HOE = ITEMS.register("hlifintite_hoe",
            () -> new HoeItem(TerraponToolTiers.HLIFINTITE_INGOT, 1, 1, new Item.Properties().durability(13150)));
    public static final RegistryObject<Item> EILIFLIGRONIUM_SWORD = ITEMS.register("eilifligronium_sword",
            () -> new DamningSwordItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 20, 20, new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_AXE = ITEMS.register("eilifligronium_axe",
            () -> new AxeItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 25, 20, new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_SHOVEL = ITEMS.register("eilifligronium_shovel",
            () -> new ShovelItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 1, 20, new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_PICKAXE = ITEMS.register("eilifligronium_pickaxe",
            () -> new PickaxeItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 1, 20, new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_HOE = ITEMS.register("eilifligronium_hoe",
            () -> new HoeItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 1, 20, new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGPAXEL = ITEMS.register("eilifligpaxel",
            () -> new PaxelItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 18, 20, new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_SLEDGE = ITEMS.register("eilifligronium_sledge",
            () -> new HammerItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 18, 20, new Item.Properties()));
    public static final RegistryObject<Item> SEIDRILIUM_HELMET = ITEMS.register("seidrilium_helmet",
            () -> new SeidriliumArmorItem(TerraponArmorMaterials.SEIDRILIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SEIDRILIUM_CHESTPLATE = ITEMS.register("seidrilium_chestplate",
            () -> new SeidriliumArmorItem(TerraponArmorMaterials.SEIDRILIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SEIDRILIUM_LEGGINGS = ITEMS.register("seidrilium_leggings",
            () -> new SeidriliumArmorItem(TerraponArmorMaterials.SEIDRILIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SEIDRILIUM_BOOTS = ITEMS.register("seidrilium_boots",
            () -> new SeidriliumArmorItem(TerraponArmorMaterials.SEIDRILIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> THORNECKITE_HELMET = ITEMS.register("thorneckite_helmet",
            () -> new ThorneckiteArmorItem(TerraponArmorMaterials.THORNECKITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> THORNECKITE_CHESTPLATE = ITEMS.register("thorneckite_chestplate",
            () -> new ThorneckiteArmorItem(TerraponArmorMaterials.THORNECKITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> THORNECKITE_LEGGINGS = ITEMS.register("thorneckite_leggings",
            () -> new ThorneckiteArmorItem(TerraponArmorMaterials.THORNECKITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> THORNECKITE_BOOTS = ITEMS.register("thorneckite_boots",
            () -> new ThorneckiteArmorItem(TerraponArmorMaterials.THORNECKITE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> EINVADRIL_HELMET = ITEMS.register("einvadril_helmet",
            () -> new EinvadrilArmorItem(TerraponArmorMaterials.EINVADRIL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EINVADRIL_CHESTPLATE = ITEMS.register("einvadril_chestplate",
            () -> new EinvadrilArmorItem(TerraponArmorMaterials.EINVADRIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EINVADRIL_LEGGINGS = ITEMS.register("einvadril_leggings",
            () -> new EinvadrilArmorItem(TerraponArmorMaterials.EINVADRIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EINVADRIL_BOOTS = ITEMS.register("einvadril_boots",
            () -> new EinvadrilArmorItem(TerraponArmorMaterials.EINVADRIL, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> HLIFINTITE_HELMET = ITEMS.register("hlifintite_helmet",
            () -> new HlifintiteArmorItem(TerraponArmorMaterials.HLIFINTITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HLIFINTITE_CHESTPLATE = ITEMS.register("hlifintite_chestplate",
            () -> new HlifintiteArmorItem(TerraponArmorMaterials.HLIFINTITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HLIFINTITE_LEGGINGS = ITEMS.register("hlifintite_leggings",
            () -> new HlifintiteArmorItem(TerraponArmorMaterials.HLIFINTITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HLIFINTITE_BOOTS = ITEMS.register("hlifintite_boots",
            () -> new HlifintiteArmorItem(TerraponArmorMaterials.HLIFINTITE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_HELMET = ITEMS.register("eilifligronium_helmet",
            () -> new EilifligroniumArmorItem(TerraponArmorMaterials.EILIFLIGRONIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_CHESTPLATE = ITEMS.register("eilifligronium_chestplate",
            () -> new EilifligroniumArmorItem(TerraponArmorMaterials.EILIFLIGRONIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_LEGGINGS = ITEMS.register("eilifligronium_leggings",
            () -> new EilifligroniumArmorItem(TerraponArmorMaterials.EILIFLIGRONIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_BOOTS = ITEMS.register("eilifligronium_boots",
            () -> new EilifligroniumArmorItem(TerraponArmorMaterials.EILIFLIGRONIUM, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> SEIDRILSCROLL = ITEMS.register("seidrilscroll",
            () -> new SeidrilScroll(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> VIONEASEEDS = ITEMS.register("vioneaseeds",
            () -> new ItemNameBlockItem(terraponblock.VIONEA_CROP.get(),new Item.Properties()));
    public static final RegistryObject<Item> VIONEA_BUSHEL = ITEMS.register("vionea_bushel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DREAMSCAPE_RECORD = ITEMS.register("dreamscape_record",
            () -> new RecordItem(4, TerraponSounds.JETSETRADIO4, new Item.Properties().stacksTo(1), 10380));
    public static final RegistryObject<Item> THUNDERKATANA = ITEMS.register("thunderkatana",
            () -> new SlowingSwordItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 30, 30, new Item.Properties()));
    public static final RegistryObject<Item> MANARIDIUM_GUN = ITEMS.register("manaridium_gun",
            () -> new BowItem(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_SHIELD = ITEMS.register("eilifligronium_shield",
            () -> new ShieldItem(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BLOM_BLAR_DUST = ITEMS.register("blom_blar_dust",
            () -> new Item(new Item.Properties()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}




package net.shade.terrapon.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.item.terraponitems.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Terrapon.MOD_ID);
    public static final RegistryObject<Item> EINVADRIL_INGOT = ITEMS.register("einvadril_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STOKKR_STICK = ITEMS.register("stokkr_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HLIFINTITE_INGOT = ITEMS.register("hlifintite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEIDRILIUM_INGOT = ITEMS.register("seidrilium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EILIFLIGRONIUM_INGOT = ITEMS.register("eilifligronium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SEIDRILIUM = ITEMS.register("raw_seidrilium",
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
            () -> new SwordItem(TerraponToolTiers.SEIDRILIUM_INGOT, 3, 16, new Item.Properties().durability(3425)));
    public static final RegistryObject<Item> SEIDRILIUM_AXE = ITEMS.register("seidrilium_axe",
            () -> new AxeItem(TerraponToolTiers.SEIDRILIUM_INGOT, 8, 16, new Item.Properties().durability(3425)));
    public static final RegistryObject<Item> SEIDRILIUM_SHOVEL = ITEMS.register("seidrilium_shovel",
            () -> new ShovelItem(TerraponToolTiers.SEIDRILIUM_INGOT, 1, 16, new Item.Properties().durability(3425)));
    public static final RegistryObject<Item> SEIDRILIUM_PICKAXE = ITEMS.register("seidrilium_pickaxe",
            () -> new PickaxeItem(TerraponToolTiers.SEIDRILIUM_INGOT, 1, 16, new Item.Properties().durability(3425)));
    public static final RegistryObject<Item> SEIDRILIUM_HOE = ITEMS.register("seidrilium_hoe",
            () -> new HoeItem(TerraponToolTiers.SEIDRILIUM_INGOT, 1, 16, new Item.Properties().durability(3425)));
    public static final RegistryObject<Item> EINVADRIL_SWORD = ITEMS.register("einvadril_sword",
            () -> new SwordItem(TerraponToolTiers.EINVADRIL_INGOT, 10, 10, new Item.Properties().durability(6850)));
    public static final RegistryObject<Item> EINVADRIL_AXE = ITEMS.register("einvadril_axe",
            () -> new AxeItem(TerraponToolTiers.EINVADRIL_INGOT, 16, 10, new Item.Properties().durability(6850)));
    public static final RegistryObject<Item> EINVADRIL_SHOVEL = ITEMS.register("einvadril_shovel",
            () -> new ShovelItem(TerraponToolTiers.EINVADRIL_INGOT, 1, 10, new Item.Properties().durability(6850)));
    public static final RegistryObject<Item> EINVADRIL_PICKAXE = ITEMS.register("einvadril_pickaxe",
            () -> new PickaxeItem(TerraponToolTiers.EINVADRIL_INGOT, 1, 10, new Item.Properties().durability(6850)));
    public static final RegistryObject<Item> EINVADRIL_HOE = ITEMS.register("einvadril_hoe",
            () -> new HoeItem(TerraponToolTiers.EINVADRIL_INGOT, 1, 10, new Item.Properties().durability(6850)));
    public static final RegistryObject<Item> HLIFINTITE_SWORD = ITEMS.register("hlifintite_sword",
            () -> new SwordItem(TerraponToolTiers.HLIFINTITE_INGOT, 3, 1, new Item.Properties().durability(13150)));
    public static final RegistryObject<Item> HLIFINTITE_AXE = ITEMS.register("hlifintite_axe",
            () -> new AxeItem(TerraponToolTiers.HLIFINTITE_INGOT, 8, 1, new Item.Properties().durability(13150)));
    public static final RegistryObject<Item> HLIFINTITE_SHOVEL = ITEMS.register("hlifintite_shovel",
            () -> new ShovelItem(TerraponToolTiers.HLIFINTITE_INGOT, 1, 1, new Item.Properties().durability(13150)));
    public static final RegistryObject<Item> HLIFINTITE_PICKAXE = ITEMS.register("hlifintite_pickaxe",
            () -> new PickaxeItem(TerraponToolTiers.HLIFINTITE_INGOT, 1, 1, new Item.Properties().durability(13150)));
    public static final RegistryObject<Item> HLIFINTITE_HOE = ITEMS.register("hlifintite_hoe",
            () -> new HoeItem(TerraponToolTiers.HLIFINTITE_INGOT, 1, 1, new Item.Properties().durability(13150)));
    public static final RegistryObject<Item> EILIFLIGRONIUM_SWORD = ITEMS.register("eilifligronium_sword",
            () -> new SwordItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 20, 20, new Item.Properties().durability(999999999)));
    public static final RegistryObject<Item> EILIFLIGRONIUM_AXE = ITEMS.register("eilifligronium_axe",
            () -> new AxeItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 25, 20, new Item.Properties().durability(999999999)));
    public static final RegistryObject<Item> EILIFLIGRONIUM_SHOVEL = ITEMS.register("eilifligronium_shovel",
            () -> new ShovelItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 1, 20, new Item.Properties().durability(999999999)));
    public static final RegistryObject<Item> EILIFLIGRONIUM_PICKAXE = ITEMS.register("eilifligronium_pickaxe",
            () -> new PickaxeItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 1, 20, new Item.Properties().durability(999999999)));
    public static final RegistryObject<Item> EILIFLIGRONIUM_HOE = ITEMS.register("eilifligronium_hoe",
            () -> new HoeItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 1, 20, new Item.Properties().durability(999999999)));
    public static final RegistryObject<Item> EILIFLIGPAXEL = ITEMS.register("eilifligpaxel",
            () -> new PaxelItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 18, 20, new Item.Properties().durability(999999999)));
    public static final RegistryObject<Item> EILIFLIGRONIUM_SLEDGE = ITEMS.register("eilifligronium_sledge",
            () -> new HammerItem(TerraponToolTiers.EILIFLIGRONIUM_INGOT, 18, 20, new Item.Properties().durability(999999999)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}




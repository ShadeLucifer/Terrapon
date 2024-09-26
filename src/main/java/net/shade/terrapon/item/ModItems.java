package net.shade.terrapon.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.item.terraponitems.LoptFuel;
import net.shade.terrapon.item.terraponitems.OrbOfSeidril;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Terrapon.MOD_ID);
    public static final RegistryObject<Item> EINVADRIL_INGOT = ITEMS.register("einvadril_ingot",
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}




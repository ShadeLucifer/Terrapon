package net.shade.terrapon;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.shade.terrapon.block.terraponblock;
import net.shade.terrapon.effect.TerraponEffects;
import net.shade.terrapon.enchantment.TerraponEnchantment;
import net.shade.terrapon.item.ModItemProperties;
import net.shade.terrapon.item.ModItems;
import net.shade.terrapon.item.TerraponCreativeModeTabs;
import net.shade.terrapon.loot.TerraponLootModifiers;
import net.shade.terrapon.painting.TerraponPaintings;
import net.shade.terrapon.potion.BetterBrewingRecipe;
import net.shade.terrapon.potion.TerraponPotions;
import net.shade.terrapon.sound.TerraponSounds;
import org.slf4j.Logger;

import static net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext.get;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Terrapon.MOD_ID)
public class Terrapon {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "terrapon";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public Terrapon() {
        IEventBus modEventBus = get().getModEventBus();
        TerraponCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        terraponblock.register(modEventBus);
        TerraponEnchantment.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        TerraponSounds.register(modEventBus);
        TerraponLootModifiers.register(modEventBus);
        TerraponPaintings.register(modEventBus);
        TerraponEffects.register(modEventBus);
        TerraponPotions.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.VIONEA_BUSHEL.get(), 1.0f);
            ComposterBlock.COMPOSTABLES.put(ModItems.VIONEASEEDS.get(), 0.50f);
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, ModItems.LOPT_FUEL.get(), TerraponPotions.THOREK_POTION.get()));
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, ModItems.BLOM_BLAR_DUST.get(), TerraponPotions.MANARIDIUMWINGS_POTION.get()));

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(terraponblock.BLOM_BLAR.getId(), terraponblock.POTTED_BLOM_BLAR);
        });
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {


    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ModItemProperties.addCustomItemProperties();

            });
        }
    }
}

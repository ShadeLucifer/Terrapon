package net.shade.terrapon.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.block.terraponblock;
import net.shade.terrapon.potion.TerraponPotions;

public class TerraponCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Terrapon.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TERRAPON_TAB = CREATIVE_MODE_TABS.register("terrapon_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EILIFLIGRONIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.terrapon_tab")).displayItems((displayParameters, output) -> {
                        output.accept(ModItems.SEIDRILIUM_INGOT.get());
                        output.accept(ModItems.RAW_SEIDRILIUM.get());
                        output.accept(terraponblock.SEIDRILIUM_BLOCK.get());
                        output.accept(terraponblock.SEIDRILIUM_ORE.get());
                        output.accept(ModItems.SEIDRILIUM_HELMET.get());
                        output.accept(ModItems.SEIDRILIUM_CHESTPLATE.get());
                        output.accept(ModItems.SEIDRILIUM_LEGGINGS.get());
                        output.accept(ModItems.SEIDRILIUM_BOOTS.get());
                        output.accept(ModItems.SEIDRILIUM_SWORD.get());
                        output.accept(ModItems.SEIDRILIUM_AXE.get());
                        output.accept(ModItems.SEIDRILIUM_PICKAXE.get());
                        output.accept(ModItems.SEIDRILIUM_SHOVEL.get());
                        output.accept(ModItems.SEIDRILIUM_HOE.get());
                        output.accept(ModItems.EINVADRIL_INGOT.get());
                        output.accept(ModItems.RAW_EINVADRIL.get());
                        output.accept(terraponblock.EINVADRIL_BLOCK.get());
                        output.accept(terraponblock.EINVADRIL_ORE.get());
                        output.accept(ModItems.EINVADRIL_SWORD.get());
                        output.accept(ModItems.EINVADRIL_AXE.get());
                        output.accept(ModItems.EINVADRIL_SHOVEL.get());
                        output.accept(ModItems.EINVADRIL_PICKAXE.get());
                        output.accept(ModItems.EINVADRIL_HOE.get());
                        output.accept(ModItems.EINVADRIL_HELMET.get());
                        output.accept(ModItems.EINVADRIL_CHESTPLATE.get());
                        output.accept(ModItems.EINVADRIL_LEGGINGS.get());
                        output.accept(ModItems.EINVADRIL_BOOTS.get());
                        output.accept(ModItems.THORNECKITE_INGOT.get());
                        output.accept(ModItems.RAW_THORNECKITE.get());
                        output.accept(terraponblock.THORNECKITE_BLOCK.get());
                        output.accept(terraponblock.THORNECKITE_ORE.get());
                        output.accept(ModItems.THORNECKITE_SWORD.get());
                        output.accept(ModItems.THORNECKITE_AXE.get());
                        output.accept(ModItems.THORNECKITE_SHOVEL.get());
                        output.accept(ModItems.THORNECKITE_PICKAXE.get());
                        output.accept(ModItems.THORNECKITE_HOE.get());
                        output.accept(ModItems.THORNECKITE_HELMET.get());
                        output.accept(ModItems.THORNECKITE_CHESTPLATE.get());
                        output.accept(ModItems.THORNECKITE_LEGGINGS.get());
                        output.accept(ModItems.THORNECKITE_BOOTS.get());
                        output.accept(ModItems.HLIFINTITE_INGOT.get());
                        output.accept(ModItems.RAW_HLIFINTITE.get());
                        output.accept(terraponblock.HLIFINTITE_BLOCK.get());
                        output.accept(terraponblock.HLIFINTITE_ORE.get());
                        output.accept(ModItems.HLIFINTITE_SWORD.get());
                        output.accept(ModItems.HLIFINTITE_AXE.get());
                        output.accept(ModItems.HLIFINTITE_SHOVEL.get());
                        output.accept(ModItems.HLIFINTITE_PICKAXE.get());
                        output.accept(ModItems.HLIFINTITE_HOE.get());
                        output.accept(ModItems.HLIFINTITE_HELMET.get());
                        output.accept(ModItems.HLIFINTITE_CHESTPLATE.get());
                        output.accept(ModItems.HLIFINTITE_LEGGINGS.get());
                        output.accept(ModItems.HLIFINTITE_BOOTS.get());
                        output.accept(terraponblock.ALLOY_FUSION_STATION.get());
                        output.accept(ModItems.EILIFLIGRONIUM_INGOT.get());
                        output.accept(terraponblock.EILIFLIGRONIUM_BLOCK.get());
                        output.accept(terraponblock.EILIFLIGRLAMP.get());
                        output.accept(terraponblock.EILIFLIGRONIUM_WALL.get());
                        output.accept(ModItems.EILIFLIGRONIUM_SWORD.get());
                        output.accept(ModItems.EILIFLIGRONIUM_AXE.get());
                        output.accept(ModItems.EILIFLIGRONIUM_SHOVEL.get());
                        output.accept(ModItems.EILIFLIGRONIUM_PICKAXE.get());
                        output.accept(ModItems.EILIFLIGRONIUM_HOE.get());
                        output.accept(ModItems.EILIFLIGPAXEL.get());
                        output.accept(ModItems.EILIFLIGRONIUM_SLEDGE.get());
                        output.accept(ModItems.EILIFLIGRONIUM_SHIELD.get());
                        output.accept(ModItems.EILIFLIGRONIUM_HELMET.get());
                        output.accept(ModItems.EILIFLIGRONIUM_CHESTPLATE.get());
                        output.accept(ModItems.EILIFLIGRONIUM_LEGGINGS.get());
                        output.accept(ModItems.EILIFLIGRONIUM_BOOTS.get());
                        output.accept(ModItems.ORBOFSEIDRIL.get());
                        output.accept(ModItems.SEIDRILSCROLL.get());
                        output.accept(terraponblock.JETSETRADIO_BLOCK.get());
                        output.accept(ModItems.VIONEASEEDS.get());
                        output.accept(ModItems.VIONEA_BUSHEL.get());
                        output.accept(ModItems.GOBBREAD.get());
                        output.accept(ModItems.LOPT_FUEL.get());
                        output.accept(terraponblock.STOKKR_WOOD.get());
                        output.accept(terraponblock.STOKKR_PLANKS.get());
                        output.accept(ModItems.STOKKR_STICK.get());
                        output.accept(terraponblock.STOKKR_DOOR.get());
                        output.accept(terraponblock.STOKKR_TRAPDOOR.get());
                        output.accept(terraponblock.STOKKR_SLAB.get());
                        output.accept(terraponblock.STOKKR_STAIRS.get());
                        output.accept(terraponblock.STOKKR_BUTTON.get());
                        output.accept(terraponblock.STOKKR_PRESSURE_PLATE.get());
                        output.accept(terraponblock.STOKKR_FENCE.get());
                        output.accept(terraponblock.STOKKR_FENCE_GATE.get());
                        output.accept(terraponblock.BLOM_BLAR.get());
                        output.accept(ModItems.BLOM_BLAR_DUST.get());
                        output.accept(ModItems.DREAMSCAPE_RECORD.get());
                        output.accept(ModItems.THUNDERKATANA.get());
                        output.accept(ModItems.MANARIDIUM_GUN.get());


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

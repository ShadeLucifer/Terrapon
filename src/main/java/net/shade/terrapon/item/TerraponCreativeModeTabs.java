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
                        output.accept(ModItems.HLIFINTITE_INGOT.get());
                        output.accept(ModItems.RAW_HLIFINTITE.get());
                        output.accept(terraponblock.HLIFINTITE_BLOCK.get());
                        output.accept(terraponblock.HLIFINTITE_ORE.get());
                        output.accept(ModItems.HLIFINTITE_SWORD.get());
                        output.accept(ModItems.HLIFINTITE_AXE.get());
                        output.accept(ModItems.HLIFINTITE_SHOVEL.get());
                        output.accept(ModItems.HLIFINTITE_PICKAXE.get());
                        output.accept(ModItems.HLIFINTITE_HOE.get());
                        output.accept(ModItems.EILIFLIGRONIUM_INGOT.get());
                        output.accept(terraponblock.EILIFLIGRONIUM_BLOCK.get());
                        output.accept(terraponblock.EILIFLIGRONIUM_WALL.get());
                        output.accept(ModItems.EILIFLIGRONIUM_SWORD.get());
                        output.accept(ModItems.EILIFLIGRONIUM_AXE.get());
                        output.accept(ModItems.EILIFLIGRONIUM_SHOVEL.get());
                        output.accept(ModItems.EILIFLIGRONIUM_PICKAXE.get());
                        output.accept(ModItems.EILIFLIGRONIUM_HOE.get());
                        output.accept(ModItems.EILIFLIGPAXEL.get());
                        output.accept(ModItems.EILIFLIGRONIUM_SLEDGE.get());
                        output.accept(ModItems.ORBOFSEIDRIL.get());
                        output.accept(terraponblock.JETSETRADIO_BLOCK.get());
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


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

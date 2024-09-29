package net.shade.terrapon.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.block.custom.ModFlammableRotatePillarBlock;
import net.shade.terrapon.block.custom.jetsetradio;
import net.shade.terrapon.item.ModItems;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class terraponblock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Terrapon.MOD_ID);


    public static final RegistryObject<Block> SEIDRILIUM_BLOCK = registerBlock("seidrilium_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                    .strength(5.0F, 10.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> HLIFINTITE_BLOCK = registerBlock("hlifintite_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BELL).requiresCorrectToolForDrops()
                    .strength(5.0F, 10.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> EINVADRIL_BLOCK = registerBlock("einvadril_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BANJO).requiresCorrectToolForDrops()
                    .strength(5.0F, 10.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> EILIFLIGRONIUM_BLOCK = registerBlock("eilifligronium_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).instrument(NoteBlockInstrument.BANJO).requiresCorrectToolForDrops()
                    .strength(5.0F, 10.0F).sound(SoundType.METAL)));
    public static final RegistryObject<Block> EINVADRIL_ORE = registerBlock("einvadril_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(8f).requiresCorrectToolForDrops(), UniformInt.of(30,250)));
    public static final RegistryObject<Block> HLIFINTITE_ORE = registerBlock("hlifintite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(8f).requiresCorrectToolForDrops(), UniformInt.of(30,250)));
    public static final RegistryObject<Block> SEIDRILIUM_ORE = registerBlock("seidrilium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(8f).requiresCorrectToolForDrops(), UniformInt.of(30,250)));
    public static final RegistryObject<Block> JETSETRADIO_BLOCK = registerBlock("jetsetradio_block",
            () -> new jetsetradio(BlockBehaviour.Properties.copy(IRON_BLOCK).noLootTable()));
    public static final RegistryObject<Block> STOKKR_WOOD = registerBlock("stokkr_wood",
            () -> new ModFlammableRotatePillarBlock(BlockBehaviour.Properties.copy(OAK_LOG)
                    .strength(7f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STOKKR_PLANKS = registerBlock("stokkr_planks",
            () -> new ModFlammableRotatePillarBlock(BlockBehaviour.Properties.copy(OAK_PLANKS)
                    .strength(7f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STOKKR_STAIRS = registerBlock("stokkr_stairs",
            () -> new StairBlock(() -> terraponblock.STOKKR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(OAK_STAIRS)
                    .strength(7f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STOKKR_SLAB = registerBlock("stokkr_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(OAK_SLAB)
                    .strength(7f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STOKKR_PRESSURE_PLATE = registerBlock("stokkr_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(WARPED_PRESSURE_PLATE).strength(7f).requiresCorrectToolForDrops(), BlockSetType.WARPED));
    public static final RegistryObject<Block> STOKKR_BUTTON = registerBlock("stokkr_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(WARPED_BUTTON).strength(7f).requiresCorrectToolForDrops(),
                    BlockSetType.WARPED,10, true));
    public static final RegistryObject<Block> STOKKR_FENCE = registerBlock("stokkr_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(WARPED_FENCE).strength(7f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STOKKR_FENCE_GATE = registerBlock("stokkr_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(WARPED_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> STOKKR_DOOR = registerBlock("stokkr_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(WARPED_DOOR), BlockSetType.WARPED));
    public static final RegistryObject<Block> STOKKR_TRAPDOOR = registerBlock("stokkr_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(WARPED_TRAPDOOR), BlockSetType.WARPED));


    public static final RegistryObject<Block> EILIFLIGRONIUM_WALL = registerBlock("eilifligronium_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(IRON_BLOCK).strength(7f).requiresCorrectToolForDrops()));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }



    }

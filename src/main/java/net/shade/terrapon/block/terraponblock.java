package net.shade.terrapon.block;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.block.custom.jetsetradio;
import net.shade.terrapon.item.ModItems;

import javax.swing.*;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

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
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(30,250)));
    public static final RegistryObject<Block> HLIFINTITE_ORE = registerBlock("hlifintite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(30,250)));
    public static final RegistryObject<Block> SEIDRILIUM_ORE = registerBlock("seidrilium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(30,250)));
    public static final RegistryObject<Block> JETSETRADIO_BLOCK = registerBlock("jetsetradio_block",
            () -> new jetsetradio(BlockBehaviour.Properties.copy(IRON_BLOCK)));


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

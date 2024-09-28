package net.shade.terrapon.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.block.terraponblock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Terrapon.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(terraponblock.EILIFLIGRONIUM_BLOCK);
        blockWithItem(terraponblock.EINVADRIL_BLOCK);
        blockWithItem(terraponblock.SEIDRILIUM_BLOCK);
        blockWithItem(terraponblock.HLIFINTITE_BLOCK);
        blockWithItem(terraponblock.HLIFINTITE_ORE);
        blockWithItem(terraponblock.EINVADRIL_ORE);
        blockWithItem(terraponblock.SEIDRILIUM_ORE);
        blockWithItem(terraponblock.JETSETRADIO_BLOCK);
        blockWithItem(terraponblock.STOKKR_PLANKS);
        blockWithItem(terraponblock.STOKKR_WOOD);
        stairsBlock((StairBlock) terraponblock.STOKKR_STAIRS.get(), blockTexture(terraponblock.STOKKR_PLANKS.get()));
        slabBlock(((SlabBlock) terraponblock.STOKKR_SLAB.get()), blockTexture(terraponblock.STOKKR_PLANKS.get()), blockTexture(terraponblock.STOKKR_PLANKS.get()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

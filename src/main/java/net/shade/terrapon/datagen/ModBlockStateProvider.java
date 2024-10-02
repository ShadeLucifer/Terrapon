package net.shade.terrapon.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.block.custom.EilifligroniumLampBlock;
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
        customLamp();
    }

     private void customLamp() {
        getVariantBuilder(terraponblock.EILIFLIGRLAMP.get()).forAllStates(state -> {
            if(state.getValue(EilifligroniumLampBlock.CLICKED)) {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("eilifligrlamp_on",
                        new ResourceLocation(Terrapon.MOD_ID, "block/" + "eilifligrlamp_on")))};
            } else {
                return new ConfiguredModel[]{new ConfiguredModel(models().cubeAll("eilifligrlamp_off",
                        new ResourceLocation(Terrapon.MOD_ID, "block/" + "eilifligrlamp_off")))};
            }
        });
     }



    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));


    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));


    }
}

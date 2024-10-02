package net.shade.terrapon.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.block.terraponblock;
import net.shade.terrapon.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Terrapon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    handheldItem(ModItems.SEIDRILIUM_SWORD);
    handheldItem(ModItems.SEIDRILIUM_AXE);
    handheldItem(ModItems.SEIDRILIUM_PICKAXE);
    handheldItem(ModItems.SEIDRILIUM_SHOVEL);
    handheldItem(ModItems.SEIDRILIUM_HOE);
    simpleItem(ModItems.STOKKR_STICK);
    handheldItem(ModItems.EINVADRIL_SWORD);
    handheldItem(ModItems.EINVADRIL_AXE);
    handheldItem(ModItems.EINVADRIL_SHOVEL);
    handheldItem(ModItems.EINVADRIL_PICKAXE);
    handheldItem(ModItems.EINVADRIL_HOE);
    handheldItem(ModItems.HLIFINTITE_SWORD);
    handheldItem(ModItems.HLIFINTITE_AXE);
    handheldItem(ModItems.HLIFINTITE_SHOVEL);
    handheldItem(ModItems.HLIFINTITE_PICKAXE);
    handheldItem(ModItems.HLIFINTITE_HOE);
    handheldItem(ModItems.EILIFLIGRONIUM_SWORD);
    handheldItem(ModItems.EILIFLIGRONIUM_AXE);
    handheldItem(ModItems.EILIFLIGRONIUM_SHOVEL);
    handheldItem(ModItems.EILIFLIGRONIUM_PICKAXE);
    handheldItem(ModItems.EILIFLIGRONIUM_HOE);
    handheldItem(ModItems.EILIFLIGPAXEL);
    handheldItem(ModItems.EILIFLIGRONIUM_SLEDGE);
    simpleItem(ModItems.SEIDRILSCROLL);

    }
    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Terrapon.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

        public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
            this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                    .texture("texture",  new ResourceLocation(Terrapon.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
        }
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Terrapon.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Terrapon.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Terrapon.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Terrapon.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Terrapon.MOD_ID, "item/" + item.getId().getPath()));

    }

}

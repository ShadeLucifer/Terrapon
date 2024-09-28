package net.shade.terrapon.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
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
        simpleItem(ModItems.RAW_EINVADRIL);
        simpleItem(ModItems.RAW_HLIFINTITE);
        simpleItem(ModItems.RAW_SEIDRILIUM);
        simpleItem(ModItems.EINVADRIL_INGOT);
        simpleItem(ModItems.SEIDRILIUM_INGOT);
        simpleItem(ModItems.HLIFINTITE_INGOT);
        simpleItem(ModItems.EILIFLIGRONIUM_INGOT);
        simpleItem(ModItems.GOBBREAD);
        simpleItem(ModItems.ORBOFSEIDRIL);
        simpleItem(ModItems.LOPT_FUEL);


    }
    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Terrapon.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
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

}

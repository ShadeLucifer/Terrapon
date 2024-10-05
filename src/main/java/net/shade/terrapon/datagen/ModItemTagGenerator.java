package net.shade.terrapon.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.item.ModItems;
import net.shade.terrapon.util.TerraponTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, Terrapon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SEIDRILIUM_HELMET.get(),
                ModItems.SEIDRILIUM_CHESTPLATE.get(),
                ModItems.SEIDRILIUM_LEGGINGS.get(),
                ModItems.SEIDRILIUM_BOOTS.get(),
                ModItems.EINVADRIL_HELMET.get(),
                ModItems.EINVADRIL_CHESTPLATE.get(),
                ModItems.EINVADRIL_LEGGINGS.get(),
                ModItems.EINVADRIL_BOOTS.get(),
                ModItems.HLIFINTITE_HELMET.get(),
                ModItems.HLIFINTITE_CHESTPLATE.get(),
                ModItems.HLIFINTITE_LEGGINGS.get(),
                ModItems.HLIFINTITE_BOOTS.get(),
                ModItems.EILIFLIGRONIUM_HELMET.get(),
                ModItems.EILIFLIGRONIUM_CHESTPLATE.get(),
                ModItems.EILIFLIGRONIUM_LEGGINGS.get(),
                ModItems.EILIFLIGRONIUM_BOOTS.get());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}

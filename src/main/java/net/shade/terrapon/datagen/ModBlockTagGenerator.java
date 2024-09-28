package net.shade.terrapon.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.block.terraponblock;
import net.shade.terrapon.util.TerraponTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Terrapon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(TerraponTags.Blocks.ORBOFSEIDRIL_VALUABLES)
                .add(terraponblock.EINVADRIL_ORE.get()).add(terraponblock.HLIFINTITE_ORE.get()).add(terraponblock.SEIDRILIUM_ORE.get())
                .addTag(Tags.Blocks.ORES);
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(terraponblock.EINVADRIL_ORE.get(),
                terraponblock.HLIFINTITE_ORE.get(),
                terraponblock.SEIDRILIUM_ORE.get(),
                terraponblock.SEIDRILIUM_BLOCK.get(),
                terraponblock.EILIFLIGRONIUM_BLOCK.get(),
                terraponblock.EINVADRIL_BLOCK.get(),
                terraponblock.HLIFINTITE_BLOCK.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                 .add(terraponblock.EINVADRIL_ORE.get(),
                 terraponblock.HLIFINTITE_ORE.get(),
                 terraponblock.SEIDRILIUM_ORE.get(),
                 terraponblock.SEIDRILIUM_BLOCK.get(),
                 terraponblock.EILIFLIGRONIUM_BLOCK.get(),
                 terraponblock.EINVADRIL_BLOCK.get(),
                 terraponblock.HLIFINTITE_BLOCK.get(),
                 terraponblock.STOKKR_PLANKS.get(),
                 terraponblock.STOKKR_WOOD.get(),
                 terraponblock.STOKKR_SLAB.get(),
                 terraponblock.STOKKR_STAIRS.get());
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(terraponblock.STOKKR_WOOD.get(),
                terraponblock.STOKKR_PLANKS.get(),
                terraponblock.STOKKR_SLAB.get(),
                terraponblock.STOKKR_STAIRS.get());
        this.tag(BlockTags.STAIRS)
                .add(terraponblock.STOKKR_STAIRS.get());
        this.tag(BlockTags.SLABS)
                .add(terraponblock.STOKKR_SLAB.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}

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
                terraponblock.HLIFINTITE_BLOCK.get(),
                terraponblock.EILIFLIGRONIUM_WALL.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(terraponblock.SEIDRILIUM_ORE.get(),
                 terraponblock.SEIDRILIUM_BLOCK.get());

        this.tag(TerraponTags.Blocks.NEEDS_SEIDRILIUM_TOOL)
                 .add(terraponblock.EINVADRIL_ORE.get());

        this.tag(TerraponTags.Blocks.NEEDS_EINVADRIL_TOOL)
                .add(terraponblock.HLIFINTITE_ORE.get());

        this.tag(TerraponTags.Blocks.NEEDS_HLIFINTITE_TOOL)
                .add(terraponblock.STOKKR_WOOD.get(),
                        terraponblock.STOKKR_PLANKS.get(),
                        terraponblock.STOKKR_SLAB.get(),
                        terraponblock.STOKKR_STAIRS.get(),
                        terraponblock.STOKKR_FENCE.get(),
                        terraponblock.STOKKR_PRESSURE_PLATE.get(),
                        terraponblock.STOKKR_BUTTON.get(),
                        terraponblock.STOKKR_FENCE_GATE.get(),
                        terraponblock.STOKKR_TRAPDOOR.get(),
                        terraponblock.STOKKR_DOOR.get());
        this.tag(TerraponTags.Blocks.EILIFLIGPAXEL_MINEABLE)
                .addTags(BlockTags.MINEABLE_WITH_AXE, BlockTags.MINEABLE_WITH_PICKAXE, BlockTags.MINEABLE_WITH_SHOVEL, BlockTags.MINEABLE_WITH_HOE);

        this.tag(TerraponTags.Blocks.NEEDS_EILIFLIGRONIUM_TOOL)
                .add(terraponblock.EILIFLIGRONIUM_WALL.get(),
                terraponblock.EILIFLIGRONIUM_WALL.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(terraponblock.STOKKR_WOOD.get(),
                terraponblock.STOKKR_PLANKS.get(),
                terraponblock.STOKKR_SLAB.get(),
                terraponblock.STOKKR_STAIRS.get(),
                terraponblock.STOKKR_FENCE.get(),
                terraponblock.STOKKR_PRESSURE_PLATE.get(),
                terraponblock.STOKKR_BUTTON.get(),
                terraponblock.STOKKR_FENCE_GATE.get(),
                terraponblock.STOKKR_TRAPDOOR.get(),
                terraponblock.STOKKR_DOOR.get());

        this.tag(BlockTags.STAIRS)
                .add(terraponblock.STOKKR_STAIRS.get());
        this.tag(BlockTags.SLABS)
                .add(terraponblock.STOKKR_SLAB.get());



        this.tag(BlockTags.FENCES)
                .add(terraponblock.STOKKR_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(terraponblock.STOKKR_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(terraponblock.EILIFLIGRONIUM_WALL.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}

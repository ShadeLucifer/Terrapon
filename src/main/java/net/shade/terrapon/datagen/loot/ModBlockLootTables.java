package net.shade.terrapon.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.block.terraponblock;
import net.shade.terrapon.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(terraponblock.EILIFLIGRONIUM_BLOCK.get());
        this.dropSelf(terraponblock.EINVADRIL_BLOCK.get());
        this.dropSelf(terraponblock.HLIFINTITE_BLOCK.get());
        this.dropSelf(terraponblock.SEIDRILIUM_BLOCK.get());
        this.dropSelf(terraponblock.STOKKR_PLANKS.get());
        this.dropSelf(terraponblock.STOKKR_WOOD.get());
        this.dropSelf(terraponblock.STOKKR_STAIRS.get());
        this.add(terraponblock.EINVADRIL_ORE.get(),
                block -> createOreDrop(terraponblock.EINVADRIL_ORE.get(), ModItems.RAW_EINVADRIL.get()));
        this.add(terraponblock.SEIDRILIUM_ORE.get(),
                block -> createOreDrop(terraponblock.SEIDRILIUM_ORE.get(), ModItems.RAW_SEIDRILIUM.get()));
        this.add(terraponblock.HLIFINTITE_ORE.get(),
                block -> createOreDrop(terraponblock.HLIFINTITE_ORE.get(), ModItems.RAW_HLIFINTITE.get()));
        this.add(terraponblock.STOKKR_SLAB.get(),
             block -> createSlabItemTable(terraponblock.STOKKR_SLAB.get()));
        this.dropSelf(terraponblock.STOKKR_BUTTON.get());
        this.dropSelf(terraponblock.STOKKR_PRESSURE_PLATE.get());
        this.dropSelf(terraponblock.EILIFLIGRONIUM_WALL.get());
        this.dropSelf(terraponblock.STOKKR_FENCE.get());
        this.dropSelf(terraponblock.STOKKR_FENCE_GATE.get());
        this.dropSelf(terraponblock.STOKKR_TRAPDOOR.get());
        this.dropSelf(terraponblock.EILIFLIGRLAMP.get());

        this.add(terraponblock.STOKKR_DOOR.get(),
              block -> createDoorTable(terraponblock.STOKKR_DOOR.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return terraponblock.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

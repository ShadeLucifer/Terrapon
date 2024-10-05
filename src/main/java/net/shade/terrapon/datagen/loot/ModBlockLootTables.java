package net.shade.terrapon.datagen.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.block.custom.VioneaCrop;
import net.shade.terrapon.block.terraponblock;
import net.shade.terrapon.item.ModItems;

import java.util.Set;
import java.util.function.Function;

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
        this.dropSelf(terraponblock.BLOM_BLAR.get());
        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(terraponblock.VIONEA_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(VioneaCrop.AGE, 4));
        this.add(terraponblock.VIONEA_CROP.get(), createCropDrops(terraponblock.VIONEA_CROP.get(), ModItems.VIONEA_BUSHEL.get(),
                ModItems.VIONEASEEDS.get(), lootitemcondition$builder));
        this.add(terraponblock.STOKKR_DOOR.get(),
                block -> createDoorTable(terraponblock.STOKKR_DOOR.get()));
        this.dropSelf(terraponblock.ALLOY_FUSION_STATION.get());
        this.dropSelf(terraponblock.BLOM_BLAR.get());
        this.add(terraponblock.POTTED_BLOM_BLAR.get(), createPotFlowerItemTable(terraponblock.BLOM_BLAR.get()));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return terraponblock.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

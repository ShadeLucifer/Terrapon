package net.shade.terrapon.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.shade.terrapon.block.terraponblock;
import net.shade.terrapon.item.ModItems;

import java.util.List;
import java.util.function.Consumer;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> EINVADRIL_SMELTABLES = List.of(ModItems.RAW_EINVADRIL.get(), terraponblock.EINVADRIL_ORE.get());
    private static final List<ItemLike> SEIDRILIUM_SMELTABLES = List.of(ModItems.RAW_SEIDRILIUM.get(), terraponblock.SEIDRILIUM_ORE.get());
    private static final List<ItemLike> HLIFINTITE_SMELTABLES = List.of(ModItems.RAW_HLIFINTITE.get(), terraponblock.HLIFINTITE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, terraponblock.EINVADRIL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.EINVADRIL_INGOT.get())
                .unlockedBy("has_einvadril", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.EINVADRIL_INGOT.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EINVADRIL_INGOT.get())
                .requires(terraponblock.EINVADRIL_BLOCK.get())
                .unlockedBy("has_einvadril_block", inventoryTrigger(ItemPredicate.Builder.item().of(terraponblock.EILIFLIGRONIUM_BLOCK.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, terraponblock.HLIFINTITE_BLOCK.get())
                .pattern("HHH")
                .pattern("HHH")
                .pattern("HHH")
                .define('H', ModItems.HLIFINTITE_INGOT.get())
                .unlockedBy("has_hlifintite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.HLIFINTITE_INGOT.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HLIFINTITE_INGOT.get())
                .requires(terraponblock.HLIFINTITE_BLOCK.get())
                .unlockedBy("has_hlifintite_block", inventoryTrigger(ItemPredicate.Builder.item().of(terraponblock.EINVADRIL_BLOCK.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, terraponblock.EILIFLIGRONIUM_BLOCK.get())
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ModItems.EILIFLIGRONIUM_INGOT.get())
                .unlockedBy("has_eilifligronium", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.EILIFLIGRONIUM_INGOT.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EILIFLIGRONIUM_INGOT.get())
                .requires(terraponblock.EILIFLIGRONIUM_BLOCK.get())
                .unlockedBy("has_eilifligronium_block", inventoryTrigger(ItemPredicate.Builder.item().of(terraponblock.EINVADRIL_BLOCK.get()).build()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, terraponblock.SEIDRILIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SEIDRILIUM_INGOT.get())
                .unlockedBy("has_seidrilium", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.SEIDRILIUM_INGOT.get()).build()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SEIDRILIUM_INGOT.get())
                .requires(terraponblock.SEIDRILIUM_BLOCK.get())
                .unlockedBy("has_eilifligronium_block", inventoryTrigger(ItemPredicate.Builder.item().of(terraponblock.EINVADRIL_BLOCK.get()).build()))
                .save(pWriter);

        oreSmelting(pWriter, EINVADRIL_SMELTABLES, RecipeCategory.MISC, ModItems.EINVADRIL_INGOT.get(), 220.0f, 900, "einvadril");
        oreBlasting(pWriter, EINVADRIL_SMELTABLES, RecipeCategory.MISC, ModItems.EINVADRIL_INGOT.get(), 220.0f, 100, "einvadril");
        oreSmelting(pWriter, HLIFINTITE_SMELTABLES, RecipeCategory.MISC, ModItems.HLIFINTITE_INGOT.get(), 460.0f, 1200, "hlifintite");
        oreBlasting(pWriter, HLIFINTITE_SMELTABLES, RecipeCategory.MISC, ModItems.HLIFINTITE_INGOT.get(), 460.0f, 150, "hlifintite");
        oreSmelting(pWriter, SEIDRILIUM_SMELTABLES, RecipeCategory.MISC, ModItems.SEIDRILIUM_INGOT.get(), 340.0f, 600, "seidrilium");
        oreBlasting(pWriter, SEIDRILIUM_SMELTABLES, RecipeCategory.MISC, ModItems.SEIDRILIUM_INGOT.get(), 340.0f, 50, "seidrilium");
    }
}
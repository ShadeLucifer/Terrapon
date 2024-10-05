package net.shade.terrapon.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.shade.terrapon.Terrapon;

public class TerraponTags {
    public static class Blocks {
        public static final TagKey<Block> ORBOFSEIDRIL_VALUABLES = tag("orbofseidril_valuables");
        public static final TagKey<Block> NEEDS_SEIDRILIUM_TOOL = tag("needs_seidrilium_tool");
        public static final TagKey<Block> NEEDS_EINVADRIL_TOOL = tag("needs_einvadril_tool");
        public static final TagKey<Block> NEEDS_THORNECKITE_TOOL = tag("needs_thorneckite_tool");
        public static final TagKey<Block> NEEDS_HLIFINTITE_TOOL = tag("needs_hlifintite_tool");
        public static final TagKey<Block> NEEDS_EILIFLIGRONIUM_TOOL = tag("needs_eilifligronium_tool");
        public static final TagKey<Block> EILIFLIGPAXEL_MINEABLE = tag("mineable/eilifligpaxel");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Terrapon.MOD_ID, name));
        }
    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Terrapon.MOD_ID, name));
        }
    }
    }
}
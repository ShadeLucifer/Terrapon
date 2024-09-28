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
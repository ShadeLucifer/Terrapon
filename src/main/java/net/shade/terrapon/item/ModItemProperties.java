package net.shade.terrapon.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.shade.terrapon.Terrapon;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.SEIDRILSCROLL.get(), new ResourceLocation(Terrapon.MOD_ID, "on"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.hasTag() ? 1f : 0f );

    }
}

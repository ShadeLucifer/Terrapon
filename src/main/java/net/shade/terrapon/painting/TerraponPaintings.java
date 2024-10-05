package net.shade.terrapon.painting;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;

public class TerraponPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Terrapon.MOD_ID);

public static final RegistryObject<PaintingVariant> DEEZ_NUTS = PAINTING_VARIANTS.register("deez_nuts",
        () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> HOLY_COW = PAINTING_VARIANTS.register("holy_cow",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> PP = PAINTING_VARIANTS.register("pp",
            () -> new PaintingVariant(32, 32));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}

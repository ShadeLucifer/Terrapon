package net.shade.terrapon.entity.client.armor;

import net.shade.terrapon.Terrapon;
import net.shade.terrapon.entity.client.armor.SeidriliumArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SeidriliumArmorModel extends GeoModel<SeidriliumArmorItem> {
    @Override
    public ResourceLocation getModelResource(SeidriliumArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "geo/seidrilium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SeidriliumArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "textures/armor/seidrilium_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SeidriliumArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "animations/seidrilium_armor.animation.json");
    }
}
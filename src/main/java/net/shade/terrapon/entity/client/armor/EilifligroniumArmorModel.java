package net.shade.terrapon.entity.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.shade.terrapon.Terrapon;
import software.bernie.geckolib.model.GeoModel;

public class EilifligroniumArmorModel extends GeoModel<EilifligroniumArmorItem> {
    @Override
    public ResourceLocation getModelResource(EilifligroniumArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "geo/eilifligronium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EilifligroniumArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "textures/armor/eilifligronium_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EilifligroniumArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "animations/eilifligronium_armor.animation.json");
    }
}
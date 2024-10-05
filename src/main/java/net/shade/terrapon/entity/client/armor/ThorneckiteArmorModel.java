package net.shade.terrapon.entity.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.shade.terrapon.Terrapon;
import software.bernie.geckolib.model.GeoModel;

public class ThorneckiteArmorModel extends GeoModel<ThorneckiteArmorItem> {
    @Override
    public ResourceLocation getModelResource(ThorneckiteArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "geo/thorneckite_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ThorneckiteArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "textures/armor/thorneckite_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ThorneckiteArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "animations/thorneckite_armor.animation.json");
    }
}
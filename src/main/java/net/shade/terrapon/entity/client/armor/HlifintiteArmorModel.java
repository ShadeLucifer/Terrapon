package net.shade.terrapon.entity.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.shade.terrapon.Terrapon;
import software.bernie.geckolib.model.GeoModel;

public class HlifintiteArmorModel extends GeoModel<HlifintiteArmorItem> {
    @Override
    public ResourceLocation getModelResource(HlifintiteArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "geo/hlifintite_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HlifintiteArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "textures/armor/hlifintite_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HlifintiteArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "animations/hlifintite_armor.animation.json");
    }
}
package net.shade.terrapon.entity.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.shade.terrapon.Terrapon;
import software.bernie.geckolib.model.GeoModel;

public class SollogiumArmorModel extends GeoModel<SollogiumArmorItem> {
    @Override
    public ResourceLocation getModelResource(SollogiumArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "geo/sollogium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SollogiumArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "textures/armor/sollogium_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SollogiumArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "animations/sollogium_armor.animation.json");
    }
}
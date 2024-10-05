package net.shade.terrapon.entity.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.shade.terrapon.Terrapon;
import software.bernie.geckolib.model.GeoModel;

public class EinvadrilArmorModel extends GeoModel<EinvadrilArmorItem> {
    @Override
    public ResourceLocation getModelResource(EinvadrilArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "geo/einvadril_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EinvadrilArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "textures/armor/einvadril_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EinvadrilArmorItem animatable) {
        return new ResourceLocation(Terrapon.MOD_ID, "animations/einvadril_armor.animation.json");
    }
}
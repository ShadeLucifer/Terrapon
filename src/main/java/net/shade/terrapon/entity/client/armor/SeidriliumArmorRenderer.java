package net.shade.terrapon.entity.client.armor;

import net.shade.terrapon.entity.client.armor.SeidriliumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SeidriliumArmorRenderer extends GeoArmorRenderer<SeidriliumArmorItem> {
    public SeidriliumArmorRenderer() {
        super(new SeidriliumArmorModel());
    }
}
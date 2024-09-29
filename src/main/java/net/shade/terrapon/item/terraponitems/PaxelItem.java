package net.shade.terrapon.item.terraponitems;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.block.Block;
import net.shade.terrapon.util.TerraponTags;

public class PaxelItem extends DiggerItem implements Vanishable {
    public PaxelItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, TerraponTags.Blocks.EILIFLIGPAXEL_MINEABLE, pProperties);
    }
}

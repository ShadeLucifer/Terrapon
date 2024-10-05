package net.shade.terrapon.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.shade.terrapon.Terrapon;
import net.shade.terrapon.sound.TerraponSounds;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class jetsetradio extends Block {
    public jetsetradio(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(!pLevel.isClientSide() && pHand == InteractionHand.MAIN_HAND) {
            if(pPlayer.isCrouching()) {
                pLevel.playSound(null, pPos, TerraponSounds.JETSETRADIO2.get(), SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            } else {
                pLevel.playSound(null, pPos, TerraponSounds.JETSETRADIO1.get(), SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.CONSUME;
            }
        }

        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
      pLevel.playSound(pEntity, pPos, TerraponSounds.JETSETRADIO3.get(), SoundSource.BLOCKS, 1f, 1f);
        super.stepOn(pLevel, pPos, pState, pEntity);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        pTooltip.add(Component.translatable("tooltip.terrapon.jetsetradio_block"));
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);

    }
}

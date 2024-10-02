package net.shade.terrapon.item.terraponitems;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.shade.terrapon.item.ModItems;
import net.shade.terrapon.util.InventoryUtil;
import net.shade.terrapon.util.TerraponTags;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class OrbOfSeidril extends Item {
    public OrbOfSeidril(Properties pProperties) {super(pProperties);}

    

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState blockState = pContext.getLevel().getBlockState(positionClicked.below(i));

                if(isValuableBlock(blockState)) {
                    outputValuableCoordinates(positionClicked.below(i), player, blockState.getBlock());
                    foundBlock = true;

                    if(InventoryUtil.hasPlayerStackInInventory(player, ModItems.SEIDRILSCROLL.get())) {
                        addInfoToSeidrilScroll(player, positionClicked.below(i), blockState.getBlock());
                    }

                    break;
                }
            }
            if(!foundBlock) {
                outputNoValuableFound(player);
            }

        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                player -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return InteractionResult.SUCCESS;


    }

    private void addInfoToSeidrilScroll(Player player, BlockPos below, Block block) {
        ItemStack seidrilScroll = player.getInventory().getItem(InventoryUtil.getFirstInventoryIndex(player, ModItems.SEIDRILSCROLL.get()));

        CompoundTag info = new CompoundTag();
        info.putString("terrapon.found_ore","Important Component Found: " + I18n.get(block.getDescriptionId())
                + " at (" + below.getX() + ", " + below.getY() + ", " + below.getZ() + ")");

        seidrilScroll.setTag(info);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.terrapon.orbofseidril.tooltip.shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.terrapon.orbofseidril.tooltip"));
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    private void outputNoValuableFound(Player player) {
        player.sendSystemMessage(Component.translatable("item.terrapon.orbofseidril.no_valuables"));
    }

    private void outputValuableCoordinates(BlockPos below, Player player, Block block) {
        player.sendSystemMessage(Component.literal("Important Component Found: " + I18n.get(block.getDescriptionId())
        + " at (" + below.getX() + ", " + below.getY() + ", " + below.getZ() + ")"));
    }

    private boolean isValuableBlock(BlockState blockState) {
        return blockState.is(TerraponTags.Blocks.ORBOFSEIDRIL_VALUABLES);
    }
}

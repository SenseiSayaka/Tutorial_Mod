package net.yorha.tutorialmod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class MoonstoneMagneticItem extends Item {
    public MoonstoneMagneticItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext){
        Level world = pContext.getLevel();
        Player player = pContext.getPlayer();
        BlockPos pos = pContext.getClickedPos();
        if(!world.isClientSide && player != null){
            double radius = 6.5;
            double speed = 0.5;
            AABB searchBox = new AABB(player.getX() - radius, player.getY() - radius, player.getZ() - radius,
                                      player.getX() + radius, player.getY() + radius, player.getZ() + radius);
            for(ItemEntity itemEntity : world.getEntitiesOfClass(ItemEntity.class, searchBox)){
                Vec3 playerPos = player.position();
                Vec3 itemPos = itemEntity.position();
                Vec3 direction = playerPos.subtract(itemPos).normalize().scale(speed);

                itemEntity.setDeltaMovement(direction);

            }
        }
        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), player1 -> player.broadcastBreakEvent(player.getUsedItemHand()));


        return InteractionResult.SUCCESS;
    }
}

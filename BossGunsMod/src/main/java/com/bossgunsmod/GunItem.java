package com.bossgunsmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class GunItem extends Item {

    public GunItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClientSide) {
            String gun = this.getRegistryName().getPath();
            switch (gun) {
                case "blaster":
                    world.explode(null, player.getX(), player.getY(), player.getZ() + 2, 1.0F, false);
                    break;
                case "rocket_launcher":
                    world.explode(null, player.getX(), player.getY(), player.getZ() + 5, 5.0F, true);
                    break;
                case "sniper_beam":
                    player.giveExperiencePoints(100);
                    break;
                case "flamethrower":
                    for (int i = -2; i <= 2; i++) {
                        for (int j = -2; j <= 2; j++) {
                            world.setBlockAndUpdate(player.blockPosition().offset(i, 0, j), net.minecraft.block.Blocks.FIRE.defaultBlockState());
                        }
                    }
                    break;
            }
        }
        return ActionResult.success(player.getItemInHand(hand));
    }

    @Override
    public UseAction getUseAnimation(ItemStack stack) {
        return UseAction.BOW;
    }
}
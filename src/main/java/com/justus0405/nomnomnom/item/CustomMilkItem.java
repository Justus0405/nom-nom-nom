package com.justus0405.nomnomnom.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class CustomMilkItem extends Item {

    public CustomMilkItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, World world, LivingEntity entity) {
        // Trigger consumption criteria and award stats for ServerPlayerEntity
        if (entity instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayer = (ServerPlayerEntity) entity;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, itemStack);
            serverPlayer.awardStat(Stats.ITEM_USED.get(this));
        }

        // Decrease item stack size if the player is not in creative mode
        if (entity instanceof PlayerEntity && !((PlayerEntity) entity).abilities.instabuild) {
            itemStack.shrink(1);
        }

        // Remove all effects from the entity if on the server side
        if (!world.isClientSide) {
            entity.removeAllEffects();
        }

        // Return an empty bucket if the item stack is empty, otherwise return the current item stack
        return itemStack.isEmpty() ? new ItemStack(Items.BUCKET) : itemStack;
    }

    @Override
    public int getUseDuration(ItemStack itemStack) {
        return 32;  // Duration for using the item
    }

    @Override
    public UseAction getUseAnimation(ItemStack itemStack) {
        return UseAction.DRINK;  // Animation for using the item
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        return DrinkHelper.useDrink(world, player, hand);  // Handle item use action
    }
}

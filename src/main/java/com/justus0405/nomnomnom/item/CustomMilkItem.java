package com.justus0405.nomnomnom.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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

    // Called when the player finishes using this item
    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, World world, LivingEntity entityLiving) {

        // Trigger criteria for consuming the item and award stat to player if applicable
        if (entityLiving instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayer = (ServerPlayerEntity) entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, itemStack);
            serverPlayer.awardStat(Stats.ITEM_USED.get(this));
        }

        // Decrease item stack size if the player is not in creative mode
        if (entityLiving instanceof PlayerEntity && !((PlayerEntity) entityLiving).abilities.instabuild) {
            itemStack.shrink(1);
        }

        // Remove all effects from the entityLiving if on the server side
        if (!world.isClientSide) {
            entityLiving.removeAllEffects();
        }

        return itemStack;
    }

    // Returns the duration in ticks for which this item can be used
    @Override
    public int getUseDuration(ItemStack itemStack) {
        return 32;
    }

    // Returns the animation type (UseAction) for this item when being used
    @Override
    public UseAction getUseAnimation(ItemStack itemStack) {
        return UseAction.DRINK;
    }

    // Handles the action when the player uses this item. Delegates to DrinkHelper for processing
    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        return DrinkHelper.useDrink(world, player, hand);
    }
}

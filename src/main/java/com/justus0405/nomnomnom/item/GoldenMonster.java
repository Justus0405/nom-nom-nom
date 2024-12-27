package com.justus0405.nomnomnom.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class GoldenMonster extends Item {

    public GoldenMonster(Item.Properties properties) {
        super(properties);
    }

    // Called when the player finishes using this item
    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, World world, LivingEntity entityLiving) {
        super.finishUsingItem(itemStack, world, entityLiving);

        // Trigger criteria for consuming the item and award stat to player if applicable
        if (entityLiving instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayer = (ServerPlayerEntity) entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, itemStack);
            serverPlayer.awardStat(Stats.ITEM_USED.get(this));
        }

        // Decrease item itemStack size if the player is not in creative mode
        if (entityLiving instanceof PlayerEntity && !((PlayerEntity) entityLiving).abilities.instabuild) {
            itemStack.shrink(1);
        }

        // Apply a movement speed effect to entityLiving for a duration (in ticks)
        if (!world.isClientSide) {
            entityLiving.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 2400, 1));
            entityLiving.addEffect(new EffectInstance(Effects.ABSORPTION, 2400, 0));
            entityLiving.addEffect(new EffectInstance(Effects.REGENERATION, 100, 1));
        }

        return itemStack;
    }

    // Adds item tooltips
    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tooltip.nomnomnom.goldenmonster1"));
        tooltip.add(new TranslationTextComponent("tooltip.nomnomnom.goldenmonster2"));
        tooltip.add(new TranslationTextComponent("tooltip.nomnomnom.goldenmonster3"));
        tooltip.add(new TranslationTextComponent("tooltip.nomnomnom.goldenmonster4"));
        tooltip.add(new TranslationTextComponent("tooltip.nomnomnom.goldenmonster5"));
        tooltip.add(new TranslationTextComponent("tooltip.nomnomnom.goldenmonster6"));
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
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

    // Returns the sound played when this item is consumed as a drink
    @Override
    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    // Returns the sound played when this item is consumed as food
    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    // Handles the action when the player uses this item. Delegates to DrinkHelper for processing
    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        return DrinkHelper.useDrink(world, player, hand);
    }
}
package com.justus0405.nomnomnom.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup NOMNOMNOM_GROUP = new ItemGroup("nomNomNomTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CAKE_CHEESE.get());
        }
    };
}

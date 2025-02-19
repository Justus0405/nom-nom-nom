package com.justus0405.nomnomnom.item;

import com.justus0405.nomnomnom.NomNomNom;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NomNomNom.MOD_ID);

    //CAKES
    public static final RegistryObject<Item> CAKE_CHEESE = ITEMS.register("cake_cheese",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(12).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> CAKE_CHOCOLATE = ITEMS.register("cake_chocolate",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(12).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> CAKE_VANILLA = ITEMS.register("cake_vanilla",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(12).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> CAKE_STRAWBERRY = ITEMS.register("cake_strawberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(12).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //COOKIES
    public static final RegistryObject<Item> COOKIE_AXOLOTL = ITEMS.register("cookie_axolotl",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> COOKIE_CHEESE = ITEMS.register("cookie_cheese",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> COOKIE_CHOCOLATE = ITEMS.register("cookie_chocolate",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> COOKIE_STRAWBERRY = ITEMS.register("cookie_strawberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> COOKIE_URANIUM = ITEMS.register("cookie_uranium",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> COOKIE_VANILLA = ITEMS.register("cookie_vanilla",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //MILK
    public static final RegistryObject<Item> MILK_CHEESE = ITEMS.register("milk_cheese",
            () -> new CustomMilkItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILK_CHOCOLATE = ITEMS.register("milk_chocolate",
            () -> new CustomMilkItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILK_STRAWBERRY = ITEMS.register("milk_strawberry",
            () -> new CustomMilkItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILK_VANILLA = ITEMS.register("milk_vanilla",
            () -> new CustomMilkItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //MILKSHAKES
    public static final RegistryObject<Item> MILKSHAKE_CHEESE = ITEMS.register("milkshake_cheese",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(8).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILKSHAKE_CHOCOLATE = ITEMS.register("milkshake_chocolate",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(8).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILKSHAKE_STRAWBERRY = ITEMS.register("milkshake_strawberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(8).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILKSHAKE_URANIUM = ITEMS.register("milkshake_uranium",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(8).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILKSHAKE_VANILLA = ITEMS.register("milkshake_vanilla",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(8).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //MONSTER
    public static final RegistryObject<Item> MONSTER_GREEN = ITEMS.register("monster_green",
            () -> new CustomEnergyItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MONSTER_MANGO = ITEMS.register("monster_mango",
            () -> new CustomEnergyItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MONSTER_PINK = ITEMS.register("monster_pink",
            () -> new CustomEnergyItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MONSTER_WHITE = ITEMS.register("monster_white",
            () -> new CustomEnergyItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MONSTER_GOLDEN = ITEMS.register("monster_golden",
            () -> new GoldenMonster(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MONSTER_ENCHANTED_GOLDEN = ITEMS.register("monster_enchanted_golden",
            () -> new EnchantedGoldenMonster(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //MUFFINS
    public static final RegistryObject<Item> MUFFIN_CHEESE = ITEMS.register("muffin_cheese",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MUFFIN_CHOCOLATE = ITEMS.register("muffin_chocolate",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MUFFIN_STRAWBERRY = ITEMS.register("muffin_strawberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MUFFIN_VANILLA = ITEMS.register("muffin_vanilla",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //TOAST
    public static final RegistryObject<Item> TOAST_BASIC = ITEMS.register("toast_basic",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> TOAST_BLUEBERRY = ITEMS.register("toast_blueberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(8).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> TOAST_PEACH = ITEMS.register("toast_peach",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(8).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> TOAST_RASPBERRY = ITEMS.register("toast_raspberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(8).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> TOAST_STRAWBERRY = ITEMS.register("toast_strawberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(8).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    // FAST FOOD
    public static final RegistryObject<Item> KEBAB = ITEMS.register("kebab",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(10).saturationMod(2).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> PIZZA_COOKED = ITEMS.register("pizza_cooked",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(8).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    // SUSHI
    public static final RegistryObject<Item> MAKI_FISH = ITEMS.register("maki_fish",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MAKI_VEGAN = ITEMS.register("maki_vegan",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> URAMAKI = ITEMS.register("uramaki",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //OTHER
    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee",
            () -> new CustomEnergyItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> TEA = ITEMS.register("tea",
            () -> new CustomMilkItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().nutrition(6).saturationMod(1).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //EventBus Registration
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

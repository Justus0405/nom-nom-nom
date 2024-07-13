package com.justus0405.nomnomnom.item;

import com.justus0405.nomnomnom.NomNomNom;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.MilkBucketItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//This code needs some drying up -Justus

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NomNomNom.MOD_ID);

    //CAKES
    public static final RegistryObject<Item> CAKE_CHEESE = ITEMS.register("cake_cheese",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(10).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> CAKE_CHOCOLATE = ITEMS.register("cake_chocolate",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(10).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> CAKE_VANILLA = ITEMS.register("cake_vanilla",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(10).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> CAKE_STRAWBERRY = ITEMS.register("cake_strawberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(10).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //COOKIES
    public static final RegistryObject<Item> COOKIE_AXOLOTL = ITEMS.register("cookie_axolotl",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> COOKIE_CHEESE = ITEMS.register("cookie_cheese",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> COOKIE_CHOCOLATE = ITEMS.register("cookie_chocolate",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> COOKIE_STRAWBERRY = ITEMS.register("cookie_strawberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> COOKIE_URANIUM = ITEMS.register("cookie_uranium",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> COOKIE_VANILLA = ITEMS.register("cookie_vanilla",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //MILK - DOESNT WORK BECAUSE IM DUMB
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
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILKSHAKE_CHOCOLATE = ITEMS.register("milkshake_chocolate",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILKSHAKE_STRAWBERRY = ITEMS.register("milkshake_strawberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILKSHAKE_URANIUM = ITEMS.register("milkshake_uranium",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MILKSHAKE_VANILLA = ITEMS.register("milkshake_vanilla",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //MONSTER - DOESNT WORK BECAUSE IM DUMB x2
    public static final RegistryObject<MilkBucketItem> MONSTER_GREEN = ITEMS.register("monster_green",
            () -> new MilkBucketItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<MilkBucketItem> MONSTER_WHITE = ITEMS.register("monster_white",
            () -> new MilkBucketItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //MUFFINS
    public static final RegistryObject<Item> MUFFIN_CHEESE = ITEMS.register("muffin_cheese",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MUFFIN_CHOCOLATE = ITEMS.register("muffin_chocolate",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MUFFIN_STRAWBERRY = ITEMS.register("muffin_strawberry",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<Item> MUFFIN_VANILLA = ITEMS.register("muffin_vanilla",
            () -> new Item(new Item.Properties().food
                    (new Food.Builder().alwaysEat().nutrition(5).build()).tab(ModItemGroup.NOMNOMNOM_GROUP)));

    //OTHER - DOESNT WORK BECAUSE IM DUMB x3
    public static final RegistryObject<MilkBucketItem> COFFEE = ITEMS.register("coffee",
            () -> new MilkBucketItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));

    public static final RegistryObject<MilkBucketItem> TEA = ITEMS.register("tea",
            () -> new MilkBucketItem(new Item.Properties().tab(ModItemGroup.NOMNOMNOM_GROUP)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

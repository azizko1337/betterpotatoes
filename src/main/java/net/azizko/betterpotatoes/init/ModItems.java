package net.azizko.betterpotatoes.init;

import net.azizko.betterpotatoes.BetterPotatoes;
import net.azizko.betterpotatoes.items.*;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterPotatoes.MODID);

    public static final RegistryObject<Item> FRIES = ITEMS.register("fries", () -> new FriesItem(new Item.Properties()));
    public static final RegistryObject<Item> FRY = ITEMS.register("fry", () -> new FryItem(new Item.Properties()));
    public static final RegistryObject<Item> RAW_FRY = ITEMS.register("raw_fry", () -> new RawFryItem(new Item.Properties()));

    public static final RegistryObject<Item> CRISPS = ITEMS.register("crisps", () -> new CrispsItem(new Item.Properties()));
    public static final RegistryObject<Item> CRISP = ITEMS.register("crisp", () -> new CrispItem(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CRISP = ITEMS.register("raw_crisp", () -> new RawCrispItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

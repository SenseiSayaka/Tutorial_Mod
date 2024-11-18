package net.yorha.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yorha.tutorialmod.TutorialMod;
import net.yorha.tutorialmod.item.custom.MoonstoneFuelCoreItem;
import net.yorha.tutorialmod.item.custom.MoonstoneMagneticItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID
            );

    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MOONSTONE = ITEMS.register("raw_moonstone",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE_MAGNETIC  = ITEMS.register("moonstone_magnetic", () -> new MoonstoneMagneticItem( new Item.Properties().durability(100)));

    public static final RegistryObject<Item> MOONSTONE_APPLE = ITEMS.register("moonstone_apple", () -> new Item(new Item.Properties().food(ModFoods.MOONSTONE_APPLE)));

    public static final RegistryObject<Item> MOONSTONE_FUEL_CORE = ITEMS.register("moonstone_fuel_core", () -> new MoonstoneFuelCoreItem(new Item.Properties(), 4000));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

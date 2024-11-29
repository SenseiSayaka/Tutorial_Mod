package net.yorha.tutorialmod.item;

import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> MOONSTONE_STAFF = ITEMS.register("moonstone_staff", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE_SWORD = ITEMS.register("moonstone_sword", () -> new SwordItem(ModToolTiers.MOONSTONE, 6, 7,  new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE_PICKAXE = ITEMS.register("moonstone_pickaxe", () -> new PickaxeItem(ModToolTiers.MOONSTONE, 3, 2,  new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE_AXE = ITEMS.register("moonstone_axe", () -> new AxeItem(ModToolTiers.MOONSTONE, 11, 4,  new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE_SHOVEL = ITEMS.register("moonstone_shovel", () -> new ShovelItem(ModToolTiers.MOONSTONE, 5, 3,  new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE_HOE = ITEMS.register("moonstone_hoe", () -> new SwordItem(ModToolTiers.MOONSTONE, 4, 3,  new Item.Properties()));


    public static final RegistryObject<Item> MOONSTONE_HELMET = ITEMS.register("moonstone_helmet", () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE_CHESTPLATE = ITEMS.register("moonstone_chestplate", () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE_LEGGINGS = ITEMS.register("moonstone_leggings", () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE_BOOTS = ITEMS.register("moonstone_boots", () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

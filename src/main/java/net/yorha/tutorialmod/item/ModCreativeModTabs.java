package net.yorha.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yorha.tutorialmod.TutorialMod;
import net.yorha.tutorialmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab", () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.MOONSTONE.get()))
            .title(Component.translatable("creativetab.tutorial_tab"))
            .displayItems((pParameters, pOutput) ->{
                pOutput.accept(ModItems.MOONSTONE.get());
                pOutput.accept(ModItems.RAW_MOONSTONE.get());
                pOutput.accept(ModBlocks.MOONSTONE_ORE.get());
                pOutput.accept(ModBlocks.MOONSTONE_BLOCK.get());
                pOutput.accept(ModBlocks.RAW_MOONSTONE_BLOCK.get());
                pOutput.accept(ModBlocks.DEEPSLATE_MOONSTONE_ORE.get());
                pOutput.accept(ModBlocks.NETHER_MOONSTONE_ORE.get());
                pOutput.accept(ModBlocks.END_MOONSTONE_ORE.get());
                pOutput.accept(ModItems.MOONSTONE_MAGNETIC.get());
                pOutput.accept(ModBlocks.HEALING_MOONSTONE_BLOCK.get());
                pOutput.accept(ModItems.MOONSTONE_APPLE.get());
                pOutput.accept(ModItems.MOONSTONE_FUEL_CORE.get());
                pOutput.accept(ModBlocks.MOONSTONE_BUTTON.get());
                pOutput.accept(ModBlocks.MOONSTONE_DOOR.get());
                pOutput.accept(ModBlocks.MOONSTONE_TRAP_DOOR.get());
                pOutput.accept(ModBlocks.MOONSTONE_WALL.get());
                pOutput.accept(ModBlocks.MOONSTONE_FENCE.get());
                pOutput.accept(ModBlocks.MOONSTONE_FENCE_GATE.get());
                pOutput.accept(ModBlocks.MOONSTONE_SLAB.get());
                pOutput.accept(ModBlocks.MOONSTONE_PRESSURE_PLATE.get());
                pOutput.accept(ModBlocks.MOONSTONE_STAIRS.get());
                pOutput.accept(ModItems.MOONSTONE_STAFF.get());
                pOutput.accept(ModItems.MOONSTONE_SWORD.get());
                pOutput.accept(ModItems.MOONSTONE_PICKAXE.get());
                pOutput.accept(ModItems.MOONSTONE_AXE.get());
                pOutput.accept(ModItems.MOONSTONE_SHOVEL.get());
                pOutput.accept(ModItems.MOONSTONE_HOE.get());
                pOutput.accept(ModItems.MOONSTONE_HELMET.get());
                pOutput.accept(ModItems.MOONSTONE_CHESTPLATE.get());
                pOutput.accept(ModItems.MOONSTONE_LEGGINGS.get());
                pOutput.accept(ModItems.MOONSTONE_BOOTS.get());

            })
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register((eventBus));
    }
}

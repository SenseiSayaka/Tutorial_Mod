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
            })
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register((eventBus));
    }
}

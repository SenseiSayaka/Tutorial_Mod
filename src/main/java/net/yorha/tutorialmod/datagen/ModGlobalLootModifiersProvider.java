package net.yorha.tutorialmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.yorha.tutorialmod.TutorialMod;
import net.yorha.tutorialmod.item.ModItems;
import net.yorha.tutorialmod.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider   {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, TutorialMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("moonstone_fuel_core_from_stone", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.STONE).build(),
                LootItemRandomChanceCondition.randomChance(0.28f).build()} , ModItems.MOONSTONE_FUEL_CORE.get()));

        add("moonstone_fuel_core_from_zombie", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build()} , ModItems.MOONSTONE_FUEL_CORE.get()));


        add("moonstone_magnetic_from_desert_pyramid_chest", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build()} , ModItems.MOONSTONE_MAGNETIC.get()));
    }
}

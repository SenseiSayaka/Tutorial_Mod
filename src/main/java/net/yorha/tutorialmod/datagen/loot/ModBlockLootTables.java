package net.yorha.tutorialmod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.yorha.tutorialmod.block.ModBlocks;
import net.yorha.tutorialmod.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.MOONSTONE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_MOONSTONE_BLOCK.get());
//        this.dropSelf(ModBlocks.HEALING_MOONSTONE_BLOCK.get());

        this.add(ModBlocks.MOONSTONE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.MOONSTONE_ORE.get(),ModItems.RAW_MOONSTONE.get()));

        this.add(ModBlocks.DEEPSLATE_MOONSTONE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_MOONSTONE_ORE.get(),ModItems.RAW_MOONSTONE.get()));

        this.add(ModBlocks.NETHER_MOONSTONE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NETHER_MOONSTONE_ORE.get(),ModItems.RAW_MOONSTONE.get()));

        this.add(ModBlocks.END_MOONSTONE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.END_MOONSTONE_ORE.get(),ModItems.RAW_MOONSTONE.get()));
        this.dropSelf(ModBlocks.MOONSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.MOONSTONE_BUTTON.get());
        this.dropSelf(ModBlocks.MOONSTONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MOONSTONE_TRAP_DOOR.get());
        this.dropSelf(ModBlocks.MOONSTONE_FENCE.get());
        this.dropSelf(ModBlocks.MOONSTONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MOONSTONE_WALL.get());


        this.add(ModBlocks.MOONSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOONSTONE_SLAB.get()));
        this.add(ModBlocks.MOONSTONE_DOOR.get(),
                block -> createDoorTable(ModBlocks.MOONSTONE_DOOR.get()));

    }
    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        List<Block> knownBlocks = new ArrayList<>();

        // Добавляем все блоки, зарегистрированные в ModBlocks, кроме тех, у которых нет таблиц лута
        ModBlocks.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .filter(block -> block != ModBlocks.HEALING_MOONSTONE_BLOCK.get()) // Исключаем блок без таблицы лута
                .forEach(knownBlocks::add);

        return knownBlocks;
    }
}

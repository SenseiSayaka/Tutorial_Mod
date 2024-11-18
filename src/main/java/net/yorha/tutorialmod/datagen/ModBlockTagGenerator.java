package net.yorha.tutorialmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.yorha.tutorialmod.TutorialMod;
import net.yorha.tutorialmod.block.ModBlocks;
import net.yorha.tutorialmod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.MOONSTONE_BLOCK_ORES).add(ModBlocks.MOONSTONE_ORE.get()).addTag(Tags.Blocks.ORES);
        this.tag(ModTags.Blocks.MOONSTONE_BLOCK_ORES).add(ModBlocks.RAW_MOONSTONE_BLOCK.get()).addTag(Tags.Blocks.STORAGE_BLOCKS_RAW_IRON);
        this.tag(ModTags.Blocks.MOONSTONE_BLOCK_ORES).add(ModBlocks.NETHER_MOONSTONE_ORE.get()).addTag(Tags.Blocks.ORES);
        this.tag(ModTags.Blocks.MOONSTONE_BLOCK_ORES).add(ModBlocks.DEEPSLATE_MOONSTONE_ORE.get()).addTag(Tags.Blocks.ORES);
        this.tag(ModTags.Blocks.MOONSTONE_BLOCK_ORES).add(ModBlocks.END_MOONSTONE_ORE.get()).addTag(Tags.Blocks.ORES);
        this.tag(ModTags.Blocks.MOONSTONE_BLOCK_ORES).add(ModBlocks.MOONSTONE_BLOCK.get()).addTag(Tags.Blocks.STORAGE_BLOCKS);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.MOONSTONE_BLOCK.get(),
                ModBlocks.RAW_MOONSTONE_BLOCK.get(),
                ModBlocks.MOONSTONE_BLOCK.get(),
                ModBlocks.MOONSTONE_ORE.get(),
                ModBlocks.DEEPSLATE_MOONSTONE_ORE.get(),
                ModBlocks.NETHER_MOONSTONE_ORE.get(),
                ModBlocks.END_MOONSTONE_ORE.get(),
                ModBlocks.HEALING_MOONSTONE_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.MOONSTONE_BLOCK.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.RAW_MOONSTONE_BLOCK.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.MOONSTONE_ORE.get()).addTag(Tags.Blocks.ORES);
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.DEEPSLATE_MOONSTONE_ORE.get()).addTag(Tags.Blocks.ORES);
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.NETHER_MOONSTONE_ORE.get()).addTag(Tags.Blocks.ORES);
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.END_MOONSTONE_ORE.get()).addTag(Tags.Blocks.ORES);

    }
}

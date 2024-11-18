package net.yorha.tutorialmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.yorha.tutorialmod.TutorialMod;
import net.yorha.tutorialmod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output,ExistingFileHelper exFileHelper) {
        super(output, TutorialMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.MOONSTONE_BLOCK);
        blockWithItem(ModBlocks.RAW_MOONSTONE_BLOCK);

        blockWithItem(ModBlocks.MOONSTONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MOONSTONE_ORE);
        blockWithItem(ModBlocks.NETHER_MOONSTONE_ORE);
        blockWithItem(ModBlocks.END_MOONSTONE_ORE);

        blockWithItem(ModBlocks.HEALING_MOONSTONE_BLOCK);





    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

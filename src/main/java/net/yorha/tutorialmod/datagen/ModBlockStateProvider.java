package net.yorha.tutorialmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
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


        stairsBlock(((StairBlock) ModBlocks.MOONSTONE_STAIRS.get()), blockTexture(ModBlocks.MOONSTONE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.MOONSTONE_SLAB.get()), blockTexture(ModBlocks.MOONSTONE_BLOCK.get()), blockTexture(ModBlocks.MOONSTONE_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.MOONSTONE_BUTTON.get()), blockTexture(ModBlocks.MOONSTONE_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.MOONSTONE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.MOONSTONE_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.MOONSTONE_FENCE.get()), blockTexture(ModBlocks.MOONSTONE_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.MOONSTONE_FENCE_GATE.get()), blockTexture(ModBlocks.MOONSTONE_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.MOONSTONE_WALL.get()), blockTexture(ModBlocks.MOONSTONE_BLOCK.get()));


        doorBlockWithRenderType(((DoorBlock) ModBlocks.MOONSTONE_DOOR.get()), modLoc("block/moonstone_door_bottom"), modLoc("block/moonstone_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.MOONSTONE_TRAP_DOOR.get()), modLoc("block/moonstone_trapdoor"), true, "cutout");







    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

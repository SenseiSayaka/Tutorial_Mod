package net.yorha.tutorialmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yorha.tutorialmod.TutorialMod;
import net.yorha.tutorialmod.block.custom.MoonstoneHealingBlock;
import net.yorha.tutorialmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID
            );

    public static final RegistryObject<Block> MOONSTONE_BLOCK =registerBlock("moonstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RAW_MOONSTONE_BLOCK =registerBlock("raw_moonstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> MOONSTONE_ORE =registerBlock("moonstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(), UniformInt.of(7, 10)));

    public static final RegistryObject<Block> DEEPSLATE_MOONSTONE_ORE =registerBlock("deepslate_moonstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(3f).requiresCorrectToolForDrops(), UniformInt.of(8, 12)));

    public static final RegistryObject<Block> NETHER_MOONSTONE_ORE =registerBlock("nether_moonstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(1f).requiresCorrectToolForDrops(), UniformInt.of(9, 14)));

    public static final RegistryObject<Block> END_MOONSTONE_ORE =registerBlock("end_moonstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(5f).requiresCorrectToolForDrops(), UniformInt.of(12, 17)));

    public static final RegistryObject<Block> HEALING_MOONSTONE_BLOCK =registerBlock("healing_moonstone_block",
            () -> new MoonstoneHealingBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).sound(SoundType.AMETHYST)));


    private static<T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static<T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

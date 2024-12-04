package net.yorha.tutorialmod.datagen;



import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.yorha.tutorialmod.TutorialMod;
import net.yorha.tutorialmod.block.ModBlocks;
import net.yorha.tutorialmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> MOONSTONE_SMELTABLES = List.of(ModItems.RAW_MOONSTONE.get(), ModBlocks.MOONSTONE_ORE.get(),ModBlocks.DEEPSLATE_MOONSTONE_ORE.get(),ModBlocks.NETHER_MOONSTONE_ORE.get(),
            ModBlocks.END_MOONSTONE_ORE.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, MOONSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.MOONSTONE.get(), 0.25f, 125,"moonstone");
        oreBlasting(pWriter, MOONSTONE_SMELTABLES, RecipeCategory.MISC, ModItems.MOONSTONE.get(), 0.25f, 70,"moonstone");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MOONSTONE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.MOONSTONE.get())
                .unlockedBy(getHasName(ModItems.MOONSTONE.get()), has(ModItems.MOONSTONE.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MOONSTONE.get(), 9)
                .requires(ModBlocks.MOONSTONE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.MOONSTONE_BLOCK.get()), has(ModBlocks.MOONSTONE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_FUEL_CORE.get())
                .pattern("DCD")
                .pattern("CAC")
                .pattern("DCD")
                .define('C', ModItems.MOONSTONE.get())
                .define('D', Blocks.COAL_BLOCK)
                .define('A', Items.REDSTONE)
                .unlockedBy(getHasName((ModItems.MOONSTONE_FUEL_CORE.get())), has(ModItems.MOONSTONE_FUEL_CORE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.MOONSTONE_APPLE.get())
                .pattern("DCD")
                .pattern("CAC")
                .pattern("DCD")
                .define('C', ModItems.MOONSTONE.get())
                .define('D', Items.DIAMOND)
                .define('A', Items.GOLDEN_APPLE)
                .unlockedBy(getHasName((ModItems.MOONSTONE_APPLE.get())), has(ModItems.MOONSTONE_APPLE.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_MOONSTONE.get(), 9)
                .requires(ModBlocks.RAW_MOONSTONE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.RAW_MOONSTONE.get()), has(ModItems.RAW_MOONSTONE.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_INGOT.get())
                .pattern(" C ")
                .pattern("CAC")
                .pattern(" C ")
                .define('C', ModItems.MOONSTONE.get())
                .define('A', Items.DIAMOND)
                .unlockedBy(getHasName((ModItems.MOONSTONE_INGOT.get())), has(ModItems.MOONSTONE_INGOT.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MOONSTONE_ROD.get())
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" C ")
                .define('C', ModItems.MOONSTONE_INGOT.get())
                .unlockedBy(getHasName((ModItems.MOONSTONE_ROD.get())), has(ModItems.MOONSTONE_ROD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MOONSTONE_PICKAXE.get())
                .pattern("CCC")
                .pattern(" A ")
                .pattern(" A ")
                .define('C', ModItems.MOONSTONE_INGOT.get())
                .define('A', ModItems.MOONSTONE_ROD.get())
                .unlockedBy(getHasName((ModItems.MOONSTONE_PICKAXE.get())), has(ModItems.MOONSTONE_PICKAXE.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MOONSTONE_AXE.get())
                .pattern(" CC")
                .pattern(" AC")
                .pattern(" A ")
                .define('C', ModItems.MOONSTONE_INGOT.get())
                .define('A', ModItems.MOONSTONE_ROD.get())
                .unlockedBy(getHasName((ModItems.MOONSTONE_AXE.get())), has(ModItems.MOONSTONE_AXE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MOONSTONE_SWORD.get())
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" A ")
                .define('C', ModItems.MOONSTONE_INGOT.get())
                .define('A', ModItems.MOONSTONE_ROD.get())
                .unlockedBy(getHasName((ModItems.MOONSTONE_SWORD.get())), has(ModItems.MOONSTONE_SWORD.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MOONSTONE_SHOVEL.get())
                .pattern(" C ")
                .pattern(" A ")
                .pattern(" A ")
                .define('C', ModItems.MOONSTONE_INGOT.get())
                .define('A', ModItems.MOONSTONE_ROD.get())
                .unlockedBy(getHasName((ModItems.MOONSTONE_SHOVEL.get())), has(ModItems.MOONSTONE_SHOVEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MOONSTONE_HOE.get())
                .pattern(" CC")
                .pattern(" A ")
                .pattern(" A ")
                .define('C', ModItems.MOONSTONE_INGOT.get())
                .define('A', ModItems.MOONSTONE_ROD.get())
                .unlockedBy(getHasName((ModItems.MOONSTONE_HOE.get())), has(ModItems.MOONSTONE_HOE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MOONSTONE_HELMET.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("   ")
                .define('C', ModItems.MOONSTONE_INGOT.get())
                .unlockedBy(getHasName((ModItems.MOONSTONE_HELMET.get())), has(ModItems.MOONSTONE_HELMET.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MOONSTONE_CHESTPLATE.get())
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.MOONSTONE_INGOT.get())
                .unlockedBy(getHasName((ModItems.MOONSTONE_CHESTPLATE.get())), has(ModItems.MOONSTONE_CHESTPLATE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MOONSTONE_LEGGINGS.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .define('C', ModItems.MOONSTONE_INGOT.get())
                .unlockedBy(getHasName((ModItems.MOONSTONE_LEGGINGS.get())), has(ModItems.MOONSTONE_LEGGINGS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.MOONSTONE_BOOTS.get())
                .pattern("   ")
                .pattern("C C")
                .pattern("C C")
                .define('C', ModItems.MOONSTONE_INGOT.get())
                .unlockedBy(getHasName((ModItems.MOONSTONE_BOOTS.get())), has(ModItems.MOONSTONE_BOOTS.get()))
                .save(pWriter);



    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer, TutorialMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}

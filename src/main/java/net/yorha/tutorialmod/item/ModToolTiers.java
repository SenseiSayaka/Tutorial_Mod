package net.yorha.tutorialmod.item;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.yorha.tutorialmod.TutorialMod;
import net.yorha.tutorialmod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier MOONSTONE = TierSortingRegistry.registerTier(
            new ForgeTier(5,1600,6f,5f, 28,
                    ModTags.Blocks.NEEDS_MOONSTONE_TOOL, () -> Ingredient.of(ModItems.MOONSTONE.get())),
            new ResourceLocation(TutorialMod.MOD_ID, "moonstone"), List.of(Tiers.NETHERITE),List.of());
}

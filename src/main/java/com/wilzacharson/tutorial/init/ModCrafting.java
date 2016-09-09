package com.wilzacharson.tutorial.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cheese),"CCC", "CCC", "CCC", 'C', ModItems.cheese);
		/*
		 * GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.jar), " C ", "GGG", "CCC. 'C', ModItems.COAL_BLOCK, 'G' new ItemStack(Blocks.STAINED_GLASS, 1, 0)); 															
		 */
	}
}

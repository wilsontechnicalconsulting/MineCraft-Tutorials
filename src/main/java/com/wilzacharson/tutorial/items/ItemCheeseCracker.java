package com.wilzacharson.tutorial.items;

import com.wilzacharson.tutorial.Reference;

import net.minecraft.item.ItemFood;

public class ItemCheeseCracker extends ItemFood {

	public ItemCheeseCracker() {
		super(4, 1.0f, true	 );
		setUnlocalizedName(Reference.TutorialItems.CHEESE_AND_CRACKER.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.CHEESE_AND_CRACKER.getRegistryName());
		
	}
}

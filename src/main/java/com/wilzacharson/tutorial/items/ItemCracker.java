package com.wilzacharson.tutorial.items;

import com.wilzacharson.tutorial.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCracker extends ItemFood {

	public ItemCracker() {
		super(1, false);
		setUnlocalizedName(Reference.TutorialItems.CRACKER.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.CRACKER.getRegistryName());
	}
}

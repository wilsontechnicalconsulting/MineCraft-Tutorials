package com.wilzacharson.tutorial.init;

import com.wilzacharson.tutorial.Reference;
import com.wilzacharson.tutorial.items.ItemCheese;
import com.wilzacharson.tutorial.items.ItemCheeseCracker;
import com.wilzacharson.tutorial.items.ItemCracker;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item cheese;
	public static Item cracker;
	public static Item cheese_and_cracker;
	

	public static void init() {
		cheese = new ItemCheese();
		cracker = new ItemCracker();
		cheese_and_cracker = new ItemCheeseCracker();
		
		
	}
	
	public static void register() {
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
		GameRegistry.register(cheese_and_cracker);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(cracker);
		registerRender(cheese_and_cracker);
	}
	
	public static void registerRender(Item item) {
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0, new ModelResourceLocation(Reference.MOD_ID + ":"+ item.getUnlocalizedName().substring(5), "inventory"));
	}
}

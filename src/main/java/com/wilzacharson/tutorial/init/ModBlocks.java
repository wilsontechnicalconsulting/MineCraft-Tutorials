package com.wilzacharson.tutorial.init;

import com.wilzacharson.tutorial.Reference;
import com.wilzacharson.tutorial.blocks.BlockCheese;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block cheese;
	

	public static void init() {
		cheese = new BlockCheese();
		
		
	}
	
	public static void register() {
		registerBlock(cheese);
	}
	
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
	}
	
	public static void registerRender(Block block) {
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		Item item = Item.getItemFromBlock(block); 
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getRegistryName(). toString().substring(5),"inventory"));
	}
}

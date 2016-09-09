package com.wilzacharson.tutorial.proxy;

import com.wilzacharson.tutorial.init.ModBlocks;
import com.wilzacharson.tutorial.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}

}

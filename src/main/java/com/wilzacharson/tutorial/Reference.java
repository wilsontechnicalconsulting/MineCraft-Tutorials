package com.wilzacharson.tutorial;

public class Reference {
	
	public static final String MOD_ID = "wilzacharsonmod";
	public static final String NAME = "zachtutmod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.9.4]";
	
	public static final String CLIENT_PROXY_CLASS = "com.wilzacharson.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.wilzahcarson.tutorial.proxy.ServerProxy";
	
	public static enum TutorialItems {
		CHEESE("cheese", "ItemCheese"),
		CRACKER("cracker", "ItemCracker"),
		CHEESE_AND_CRACKER("cheese_n_cracker", "ItemCheeseCracker");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum TutorialBlocks {
		CHEESE("cheese", "BlockCheese");
		
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		public String getRegistryName() {
			return registryName;
		}
	}

}

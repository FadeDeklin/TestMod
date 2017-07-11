package fadedeklin.soulfantasy.common.asset;

import fadedeklin.soulfantasy.common.core.handler.BlockRegsterHandler;
import fadedeklin.soulfantasy.common.core.handler.CreativeTabHandler;
import fadedeklin.soulfantasy.common.core.handler.ItemRegsterHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class RegisterAll {
										//<This is for BLOCKS>//
		//init your item using Blockbase.java
		//Material mat, String name, float hardness, float resistance, CreativeTabs tab, int harvest, String tool
		public static Block testblock = 
				new BlockBase(Material.ROCK, "test_block", 2F, 10F, CreativeTabHandler.soulfantasy, 2, "pickaxe");
		public static Block testblock2 = 
				new BlockBase(Material.ROCK, "test_block", 2F, 10F, CreativeTabHandler.soulfantasy);
				
		//Register Here
		public static void HashMapRegBlock() {
			if(!BlockRegsterHandler.BLOCKS.isEmpty()) return;
			
			BlockRegsterHandler.regBlock(testblock);
			BlockRegsterHandler.regBlock(testblock2);
		}
										//<This is for ITEMS>//
		//init your item using Itembase.java
		//name, creative tab, maxStack number(Default 64 if null)
		public static final Item bloodbottle = new ItemBase("blood_bottle", CreativeTabHandler.soulfantasy);
		public static final Item greenbottle = new ItemBase("green_bottle", CreativeTabHandler.soulfantasy, 1);
		
		//Register Here
				public static void HashMapRegItem() {
					if(!ItemRegsterHandler.ITEMS.isEmpty()) return;
					
					ItemRegsterHandler.regItem(greenbottle);
					ItemRegsterHandler.regItem(bloodbottle);
				}
}

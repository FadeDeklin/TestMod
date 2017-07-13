package fadedeklin.soulfantasy.common.asset;

import fadedeklin.soulfantasy.common.core.base.BlockBase;
import fadedeklin.soulfantasy.common.core.base.CropBlockBase;
import fadedeklin.soulfantasy.common.core.base.CropFoodBase;
import fadedeklin.soulfantasy.common.core.base.CropSeedBase;
import fadedeklin.soulfantasy.common.core.base.ItemBase;
import fadedeklin.soulfantasy.common.core.handler.BlockRegsterHandler;
import fadedeklin.soulfantasy.common.core.handler.CreativeTabHandler;
import fadedeklin.soulfantasy.common.core.handler.CropRegisterHandler;
import fadedeklin.soulfantasy.common.core.handler.ItemRegsterHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class RegisterAll {
										//<This is for BLOCKS>//
		//init your item using Blockbase.java
		//Material mat, String name"Define the id", float hardness, float resistance, CreativeTabs tab, int harvest, String tool
		public static Block testblock = 
				new BlockBase(Material.ROCK, "test_block", 2F, 10F, CreativeTabHandler.soulfantasy, 2, "pickaxe");
		public static Block testblock2 = 
				new BlockBase(Material.ROCK, "test_block1", 2F, 10F, CreativeTabHandler.soulfantasy);
				
		//Register Here
		public static void HashMapRegBlock() {
			if(!BlockRegsterHandler.BLOCKS.isEmpty()) return;
			
			BlockRegsterHandler.regBlock(testblock);
			BlockRegsterHandler.regBlock(testblock2);
		}
										//<This is for ITEMS>//
		//init your item using Itembase.java
		//name, creative tab, maxStack number(Default 64 if null)
		//Item bloodbottle(for class name) = new ItemBase("blood_bottle"<(recognize your pics)
		public static final Item bloodbottle = new ItemBase("blood_bottle", CreativeTabHandler.soulfantasy);
		public static final Item greenbottle = new ItemBase("green_bottle", CreativeTabHandler.soulfantasy, 1);
		
		//Register Here
				public static void HashMapRegItem() {
					if(!ItemRegsterHandler.ITEMS.isEmpty()) return;
					
					ItemRegsterHandler.regItem(greenbottle);
					ItemRegsterHandler.regItem(bloodbottle);
				}
				
										//<This is for CROPS Block>//
						//<name, CreativeTabs tab, heal, hunger, boolean isWolfFood>//
			//<name, CreativeTabs tab, which block you plant, MUST Blocks.FARMLAND funtion for farm in mc>//
		public static BlockCrops BlockCropCorn = new CropBlockBase("crop_corn", CreativeTabHandler.soulfantasy);
		public static Item ItemCorn = new CropFoodBase("corn", CreativeTabHandler.soulfantasy, 0, 0, false);
		public static Item ItemCornSeed = new CropSeedBase("corn_seed", CreativeTabHandler.soulfantasy, BlockCropCorn, Blocks.FARMLAND);		
		
		public static void HashMapRegCropItem() {
			if(!CropRegisterHandler.CROPS.isEmpty()) return;
			
			CropRegisterHandler.regItem(ItemCorn);
			CropRegisterHandler.regItem(ItemCornSeed);
		}
		
		public static void HashMapRegCropBlock() {
					
			CropRegisterHandler.regBlock(BlockCropCorn);
		}
}

package fadedeklin.soulfantasy.common.core.handler;

import java.util.HashMap;
import java.util.Map;

import fadedeklin.soulfantasy.common.SoulFantasy;
import fadedeklin.soulfantasy.common.asset.RegisterAll;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class CropRegisterHandler {
	
	//Contains all items
	public static Map<String, Item> CROPS = new HashMap<String, Item>();
	public static Map<String, BlockCrops> BLOCKCROPS = new HashMap<String, BlockCrops>();
	
	//New instance of a item for every item passed through Main Register Part using HashMap
		public static void regItem(Item item) {
			CROPS.put(item.getRegistryName().getResourcePath().toLowerCase(), item);
		}
	//Crop does not have an item block so only register block
		public static void regBlock(BlockCrops blockcrop) {
			BLOCKCROPS.put(blockcrop.getRegistryName().getResourcePath().toLowerCase(), blockcrop);
		}

	@SubscribeEvent
	public static void regCropItems(RegistryEvent.Register<Item> event) {
		RegisterAll.HashMapRegCropItem();
		SoulFantasy.LOGGER.info("Registering CropItems: ");
        IForgeRegistry<Item> registry = event.getRegistry();
        
        for(Item item : CROPS.values()) {
        	
        	SoulFantasy.LOGGER.info("\tRegistering " + item.getUnlocalizedName().substring(5));
        	registry.register(item);
        	SoulFantasy.LOGGER.info("\t\tRegistered!");
        	
        	ModelLoader.setCustomModelResourceLocation(item, 0, 
					new ModelResourceLocation(item.getRegistryName(),"inventory"));
			SoulFantasy.LOGGER.info("\t\t\tModel Registered!");
        }
	}
	
	//Main Register Part
	@SubscribeEvent
	public static void regCropBlocks(RegistryEvent.Register<Block> event) {
		RegisterAll.HashMapRegCropBlock();
		SoulFantasy.LOGGER.info("Registering CropBlocks: ");
		IForgeRegistry<Block> registry = event.getRegistry();
		
		for(BlockCrops block : BLOCKCROPS.values()) {
			SoulFantasy.LOGGER.info("\tRegistering " + block.getUnlocalizedName().substring(5));
			registry.register(block);
			SoulFantasy.LOGGER.info("\t\tRegistered!");
			
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
					new ModelResourceLocation(block.getRegistryName(),""));
			SoulFantasy.LOGGER.info("\t\t\t" + block.getUnlocalizedName().substring(5) + "\tModel Registered!");
			
			}
		}
}
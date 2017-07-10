package fadedeklin.soulfantasy.common.core;

import fadedeklin.soulfantasy.common.SoulFantasy;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class RegisterUtil {
	
	public static void registerAll(FMLPreInitializationEvent event){
		
		registerItems(event, CreativeTabHandler.bloodbottle);
		registerItems(event, CreativeTabHandler.greenbottle);
		
	}

	private static void registerBlocks(FMLPreInitializationEvent event, Block...blocks){
		SoulFantasy.LOGGER.info("Registering Blocks: ");
		for(Block block : blocks){//New instance of a block for every block passed through
			SoulFantasy.LOGGER.info("\tRegistering " + block.getUnlocalizedName().substring(5));
			final ItemBlock itemblock = new ItemBlock(block);
			if(event.getSide() == Side.CLIENT){
				GameRegistry.register(block);
				GameRegistry.register(itemblock, block.getRegistryName());
				SoulFantasy.LOGGER.info("\t\tRegistered!");
				ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
						new ModelResourceLocation(block.getRegistryName(),"inventory"));
			}
		}
	}
	
	private static void registerItems(FMLPreInitializationEvent event, Item...items){
		SoulFantasy.LOGGER.info("Registering Items: ");
		for(Item item : items){
			SoulFantasy.LOGGER.info("\tRegistering " + item.getUnlocalizedName().substring(5));
			if(event.getSide() == Side.CLIENT){
				GameRegistry.register(item);
				SoulFantasy.LOGGER.info("\t\tRegistered!");
				ModelLoader.setCustomModelResourceLocation(item, 0, 
						new ModelResourceLocation(item.getRegistryName(),"inventory"));
				SoulFantasy.LOGGER.info("\t\tModel Registered!");
			}
		}
	}
}

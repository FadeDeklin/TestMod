package fadedeklin.soulfantasy.common.core.handler;

import java.util.HashMap;
import java.util.Map;

import fadedeklin.soulfantasy.common.SoulFantasy;
import fadedeklin.soulfantasy.common.item.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class BlockRegsterHandler {
	
	public static Map<String, Block> BLOCKS = new HashMap<String, Block>();
	public static Map<String, ItemBlock> ITEM_BLOCKS = new HashMap<String, ItemBlock>();
	
	//init your item using Blockbase.java "name,which creative tab, maxstack number
	//Material mat, String name, float hardness, float resistance, CreativeTabs tab, int harvest, String tool
			public static Block testblock = 
					new BlockBase(Material.ROCK, "test_block", 2F, 10F, CreativeTabHandler.soulfantasy, 2, "pickaxe");
			
	
	public static void HashMapReg() {
		if(!BLOCKS.isEmpty()) return;
		
		regBlock(testblock);
	}
		
		public static void regBlock(Block block) {
			BLOCKS.put(block.getRegistryName().getResourcePath(), block);
			ITEM_BLOCKS.put(block.getRegistryName().getResourcePath(), (ItemBlock)
					new ItemBlock(block).setRegistryName(block.getRegistryName()));
		}
		
	@SubscribeEvent
	public static void regItemBlocks(RegistryEvent.Register<Item> event) {
		HashMapReg();
		SoulFantasy.LOGGER.info("Registering ItemBlocks: ");
		IForgeRegistry<Item> registry = event.getRegistry();
		for(Item item : ITEM_BLOCKS.values()) {//New instance of a block for every block passed through
			SoulFantasy.LOGGER.info("\tRegistering " + item.getUnlocalizedName().substring(5));
			registry.register(item);

			ModelLoader.setCustomModelResourceLocation(item, 0, 
					new ModelResourceLocation(item.getRegistryName(),"inventory"));
			SoulFantasy.LOGGER.info("\t\t\tItemBlocks Model Registered!");
		}
    }
	
	@SubscribeEvent
	public static void regBlocks(RegistryEvent.Register<Block> event) {
		HashMapReg();
		SoulFantasy.LOGGER.info("Registering Blocks: ");
		IForgeRegistry<Block> registry = event.getRegistry();
		for(Block block : BLOCKS.values()) {
		registry.register(block);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(),"inventory"));
		SoulFantasy.LOGGER.info("\t\t\tItemBlocks Model Registered!");
		
		}
	}
}
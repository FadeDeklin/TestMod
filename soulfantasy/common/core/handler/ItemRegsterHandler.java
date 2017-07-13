package fadedeklin.soulfantasy.common.core.handler;

import java.util.HashMap;
import java.util.Map;

import fadedeklin.soulfantasy.common.SoulFantasy;
import fadedeklin.soulfantasy.common.asset.RegisterAll;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class ItemRegsterHandler {
	
	//Contains all items
	public static Map<String, Item> ITEMS = new HashMap<String, Item>();
	
	//New instance of a block for every block passed through Main Register Part using HashMap
		public static void regItem(Item item) {
			ITEMS.put(item.getRegistryName().getResourcePath().toLowerCase(), item);
		}

	@SubscribeEvent
	public static void regItems(RegistryEvent.Register<Item> event) {
		RegisterAll.HashMapRegItem();
		SoulFantasy.LOGGER.info("Registering Items: ");
        IForgeRegistry<Item> registry = event.getRegistry();
        
        for(Item item : ITEMS.values()) {
        	
        	SoulFantasy.LOGGER.info("\tRegistering " + item.getUnlocalizedName().substring(5));
        	registry.register(item);
        	SoulFantasy.LOGGER.info("\t\tRegistered!");
        	
        	ModelLoader.setCustomModelResourceLocation(item, 0, 
					new ModelResourceLocation(item.getRegistryName(),"inventory"));
			SoulFantasy.LOGGER.info("\t\t\tModel Registered!");
        }
	}
}
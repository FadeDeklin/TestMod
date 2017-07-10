package fadedeklin.soulfantasy.common.core.handler;

import fadedeklin.soulfantasy.common.SoulFantasy;
import fadedeklin.soulfantasy.common.item.ItemBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class ItemRegsterHandler {
	
		//init your item using Itembase.java with name,which creative tab, maxstack number
		public static final Item bloodbottle = new ItemBase("blood_bottle", CreativeTabHandler.soulfantasy);
		public static final Item greenbottle = new ItemBase("green_bottle", CreativeTabHandler.soulfantasy, 1);

	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event) {
		//call back the method below to event bus for register
		//each item you add must add a line in here
		regItems(event, ItemRegsterHandler.greenbottle);
		regItems(event, ItemRegsterHandler.bloodbottle);
		}
	
		//this method do all the register and model rendering
    public static void regItems(RegistryEvent.Register<Item> event, Item...items) {
			SoulFantasy.LOGGER.info("Registering Items: ");
	        IForgeRegistry<Item> registry = event.getRegistry();
	        
	        for(Item item : items) {
	        	
	        	SoulFantasy.LOGGER.info("\tRegistering " + item.getUnlocalizedName().substring(5));
	        	registry.register(item);
	        	SoulFantasy.LOGGER.info("\t\tRegistered!");
	        	
	        	ModelLoader.setCustomModelResourceLocation(item, 0, 
						new ModelResourceLocation(item.getRegistryName(),"inventory"));
				SoulFantasy.LOGGER.info("\t\t\tModel Registered!");
	        } 

    }
}
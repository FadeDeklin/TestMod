package fadedeklin.soulfantasy.common.core.handler;

import fadedeklin.soulfantasy.common.asset.CropBlockRegister;
import fadedeklin.soulfantasy.common.asset.CropItemRegister;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class CropRegHand {
	@SubscribeEvent
			public static void registerItems(RegistryEvent.Register<Item> event) {
				CropItemRegister.register(event.getRegistry());
				CropBlockRegister.registerItemBlocks(event.getRegistry());
			}
	
			@SubscribeEvent
			public static void registerBlocks(RegistryEvent.Register<Block> event) {
				CropBlockRegister.register(event.getRegistry());
			}
	
			@SubscribeEvent
			public static void registerModels(ModelRegistryEvent event) {
				CropItemRegister.registerModels();
			}
	
}
package fadedeklin.soulfantasy.common.asset;

import fadedeklin.soulfantasy.common.asset.crop.BlockCropGreenCorn;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class CropBlockRegister {
	
	public static BlockCropGreenCorn cropGreenCorn = new BlockCropGreenCorn();
	
		public static void register(IForgeRegistry<Block> registry) {
			registry.register(cropGreenCorn);
		}
		
		public static void registerItemBlocks(IForgeRegistry<Item> registry) {
			registry.registerAll();
			
			
		}
}
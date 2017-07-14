package fadedeklin.soulfantasy.common.asset;

import fadedeklin.soulfantasy.common.asset.item.ItemGreenCorn;
import fadedeklin.soulfantasy.common.asset.item.ItemGreenCornSeed;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class CropItemRegister {
	public static ItemGreenCorn greencorn = new ItemGreenCorn();
	public static ItemGreenCornSeed green_corn_seed = new ItemGreenCornSeed();
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				greencorn,
				green_corn_seed
				);
		}

	public static void registerModels() {
		greencorn.registerItemModel(greencorn);
		green_corn_seed.registerItemModel(green_corn_seed);
	}
}
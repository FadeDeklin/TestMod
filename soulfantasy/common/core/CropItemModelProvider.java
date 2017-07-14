package fadedeklin.soulfantasy.common.core;

import net.minecraft.item.Item;

public interface CropItemModelProvider {

	void registerItemModel(Item item);
	public static void registerItemRenderer(Item item, int meta, String id) {

	}

}
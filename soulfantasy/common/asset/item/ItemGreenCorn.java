package fadedeklin.soulfantasy.common.asset.item;

import fadedeklin.soulfantasy.common.core.CropItemModelProvider;
import fadedeklin.soulfantasy.common.core.handler.CreativeTabHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemGreenCorn extends ItemFood implements CropItemModelProvider{
	public ItemGreenCorn() {
		super(3, 0.6f, false);
		setUnlocalizedName("greencorn");
		setRegistryName("greencorn");
		setCreativeTab(CreativeTabHandler.soulfantasy);
	}

	@Override
	public void registerItemModel(Item item) {
		CropItemModelProvider.registerItemRenderer(this, 0, "corn");
	}
	
}
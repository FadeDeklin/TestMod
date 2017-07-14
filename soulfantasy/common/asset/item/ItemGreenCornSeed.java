package fadedeklin.soulfantasy.common.asset.item;

import fadedeklin.soulfantasy.common.asset.CropBlockRegister;
import fadedeklin.soulfantasy.common.core.CropItemModelProvider;
import fadedeklin.soulfantasy.common.core.handler.CreativeTabHandler;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemGreenCornSeed extends ItemSeeds implements CropItemModelProvider{
	
	public ItemGreenCornSeed() {
		super(CropBlockRegister.cropGreenCorn, Blocks.FARMLAND);
		setUnlocalizedName("green_corn_seed");
		setRegistryName("green_corn_seed");
		setCreativeTab(CreativeTabHandler.soulfantasy);
	}
	
	@Override
	public void registerItemModel(Item item) {
		CropItemModelProvider.registerItemRenderer(item, 0, "green_corn_seed");
	}
}

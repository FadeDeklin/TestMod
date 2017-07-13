package fadedeklin.soulfantasy.common.asset.crop;

import fadedeklin.soulfantasy.common.asset.RegisterAll;
import fadedeklin.soulfantasy.common.core.base.CropBlockBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockCropCorn extends CropBlockBase{
	
	public BlockCropCorn (String name, CreativeTabs tab) {
		 super(name, tab, 1);
	}

	@Override
	protected Item getSeed() {
		return RegisterAll.ItemCornSeed;
	}
	@Override
	protected Item getCrop() {
		return RegisterAll.ItemCorn;
	}
	
}

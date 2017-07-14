package fadedeklin.soulfantasy.common.asset.crop;

import fadedeklin.soulfantasy.common.asset.CropItemRegister;
import fadedeklin.soulfantasy.common.core.handler.CreativeTabHandler;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropGreenCorn extends BlockCrops {

	public BlockCropGreenCorn() {
		setUnlocalizedName("cropGreenCorn");
		setRegistryName("cropGreenCorn");

		setCreativeTab(CreativeTabHandler.soulfantasy);
	}

	@Override
	protected Item getSeed() {
		return CropItemRegister.green_corn_seed;
	}

	@Override
	protected Item getCrop() {
		return CropItemRegister.greencorn;
	}

}
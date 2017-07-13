package fadedeklin.soulfantasy.common.core.base;

import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class CropBlockBase extends BlockCrops{
	public CropBlockBase(String name, CreativeTabs tab) {
		this(name, tab, 7);
	}
	
	public CropBlockBase(String name, CreativeTabs tab, int getMaxAge) {
		setUnlocalizedName(name);
        setCreativeTab(tab);
        setRegistryName(name);
	}

	
}


package fadedeklin.soulfantasy.common.core.base;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class CropSeedBase extends ItemSeeds{
	
	public CropSeedBase(String name, CreativeTabs tab, Block crops, Block soil) {
		super(crops, soil);
		setUnlocalizedName(name);
        setCreativeTab(tab);
        setRegistryName(name);
	}
}
package fadedeklin.soulfantasy.common.core.base;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class CropFoodBase extends ItemFood{

	public CropFoodBase(String name, CreativeTabs tab, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);	
		setUnlocalizedName(name);
        setCreativeTab(tab);
        setRegistryName(name);
	}
}

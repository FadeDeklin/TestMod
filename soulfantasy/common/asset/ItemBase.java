package fadedeklin.soulfantasy.common.asset;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

//this class is pre set all your item stats, do not change anything here
@EventBusSubscriber
public class ItemBase extends Item{
	public ItemBase(String name, CreativeTabs tab) {
		this(name, tab, 64);
	}
	
	public ItemBase(String name, CreativeTabs tab, int maxSize) {
		setUnlocalizedName(name);
        setMaxStackSize(maxSize);
        setCreativeTab(tab);
        setRegistryName(name);
	}

}
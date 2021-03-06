package fadedeklin.soulfantasy.common.core.handler;

import fadedeklin.soulfantasy.common.asset.RegisterAll;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class CreativeTabHandler{
	//register your tabs, if you have muti tab, copy line11-18
	public static final CreativeTabs soulfantasy = new CreativeTabs("soulfantasy") {
		
		//Set Tab Icon
		@Override
		public ItemStack getTabIconItem() {
			//in this itemstack you can put your creative icon
			//but only item or block that registered
			return new ItemStack(RegisterAll.bloodbottle);
		}
		
		//Advanced CreativeTab: This allow us to type in our tab and filter the visible items 
		@Override
		public boolean hasSearchBar() {
			return true;
		}
		
	};
}
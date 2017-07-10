package fadedeklin.soulfantasy.common.core.handler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class CreativeTabHandler{
	
	//register your tabs, if you have muti tab, copy line11-18
	public static final CreativeTabs soulfantasy = new CreativeTabs("soulfantasy") {
		@Override
		public ItemStack getTabIconItem() {
			//in this itemstack you can put your creative icon
			//but only item or block that registered
			return new ItemStack(RegsterHandler.bloodbottle);
		}
	};
}
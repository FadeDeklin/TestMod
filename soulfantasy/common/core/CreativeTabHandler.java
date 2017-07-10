package fadedeklin.soulfantasy.common.core;

import fadedeklin.soulfantasy.common.item.general.ItemBloodBottle;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabHandler{

	public static final CreativeTabs soulfantasy = new CreativeTabs("soulfantasy") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(CreativeTabHandler.bloodbottle);
		}
	};
	public static final Item bloodbottle = new ItemBloodBottle("blood_bottle", CreativeTabHandler.soulfantasy);
	public static final Item greenbottle = new ItemBloodBottle("green_bottle", CreativeTabHandler.soulfantasy);
}
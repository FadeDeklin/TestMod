package fadedeklin.soulfantasy.common.core.base;

import fadedeklin.soulfantasy.common.core.CropItemBlockProvider;
import fadedeklin.soulfantasy.common.core.CropItemModelProvider;
import fadedeklin.soulfantasy.common.core.handler.CreativeTabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class CropBlockBaseNew extends Block implements CropItemModelProvider, CropItemBlockProvider{
	
	protected String name;

	public CropBlockBaseNew(Material material, String name) {
		super(material);

		this.name = name;

		setUnlocalizedName(name);
		setRegistryName(name);

		setCreativeTab(CreativeTabHandler.soulfantasy);
	}

	@Override
	public void registerItemModel(Item item) {

}

	@Override
	public CropBlockBaseNew setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}

	@Override
	public Item getItemBlock() {
		return Item.getItemFromBlock(this);
	}

}
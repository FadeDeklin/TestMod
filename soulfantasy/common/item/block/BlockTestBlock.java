package fadedeklin.soulfantasy.common.item.block;

import fadedeklin.soulfantasy.common.item.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTestBlock extends BlockBase{
	public BlockTestBlock(Material mat, String name, float hardness, float resistance, int harvest, CreativeTabs tab, String tool) {
		super(mat, name, hardness, resistance, tab, harvest, "pickaxe");
	}
}

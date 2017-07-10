package fadedeklin.soulfantasy.common.item;

import fadedeklin.soulfantasy.common.core.handler.CreativeTabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

//this class is pre set all your item stats, do not change anything here
@EventBusSubscriber
public class BlockBase extends Block{
	public BlockBase(Material mat, String name, float hardness, float resistance) {
		this(mat, name, hardness, resistance, CreativeTabHandler.soulfantasy, 0, "tool");
	}	
	
	public BlockBase(Material mat, String name, float hardness, float resistance, CreativeTabs tab) {
		  super(mat);
		  setUnlocalizedName(name);
		  setRegistryName(name);
		  setCreativeTab(tab);
		  setHardness(hardness);
		  setResistance(resistance);
		 }

	public BlockBase(Material mat, String name, float hardness, float resistance, CreativeTabs tab, int harvest, String tool) {
		super(mat);
		setUnlocalizedName(name);
        setCreativeTab(tab);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, harvest);
	}
}
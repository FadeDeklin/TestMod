package fadedeklin.soulfantasy.common.item.general;

import java.util.Random;

import fadedeklin.soulfantasy.common.item.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemBloodBottle extends ItemBase{
	public ItemBloodBottle(String name, CreativeTabs tab) {
		  super(name, tab, 1);
		 }
	@Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
    	if(!world.isRemote){
        	ItemStack item = player.getHeldItemMainhand();
        	if(item.getTagCompound()==null){
    			item.setTagCompound(new NBTTagCompound());
    			NBTTagCompound nbt = new NBTTagCompound();
    			item.getTagCompound().setTag(player.getDisplayNameString(), nbt);
    			nbt.setInteger("bloodsave", 0);
    		}
    		if(player.isSneaking() && item.getTagCompound().getInteger("bloodsave")<20){
    			int damage = new Random().nextInt(10)+1;      		
    			player.sendMessage(new TextComponentString("damage:"+damage));        		
    			player.setHealth(player.getHealth()-damage);
    			if(item.getTagCompound().getInteger("bloodsave") + damage/2 > 20){
    				item.getTagCompound().setInteger("bloodsave", 20);        			
    				player.sendMessage(new TextComponentString("save:"+item.getTagCompound().getInteger("bloodsave")));
    			}else{
    				item.getTagCompound().setInteger("bloodsave", (item.getTagCompound().getInteger("bloodsave") + damage/2));        			
    				player.sendMessage(new TextComponentString("save:"+item.getTagCompound().getInteger("bloodsave")));
    			}
        		
    		}else if(!player.isSneaking() && item.getTagCompound().getInteger("bloodsave")>0){
    			if(player.getMaxHealth()-player.getHealth()>item.getTagCompound().getInteger("bloodsave")){
    				player.heal(item.getTagCompound().getInteger("bloodsave"));
    				player.sendMessage(new TextComponentString("heal:"+(player.getMaxHealth()-player.getHealth())));
    				item.getTagCompound().setInteger("bloodsave", 0);
    				player.sendMessage(new TextComponentString("save:"+item.getTagCompound().getInteger("bloodsave")));
    			}else{
    				player.sendMessage(new TextComponentString("heal:"+(player.getMaxHealth()-player.getHealth())));
    				item.getTagCompound().setInteger("bloodsave",(item.getTagCompound().getInteger("bloodsave")-(int)(player.getMaxHealth()-player.getHealth())));
   					player.setHealth(player.getMaxHealth()); 
   					player.sendMessage(new TextComponentString("save:"+item.getTagCompound().getInteger("bloodsave")));
    			}	
    		}  
    	}
    	return super.onItemRightClick(world, player, hand);
    }
}
package fadedeklin.soulfantasy.common.core.proxy;

import fadedeklin.soulfantasy.common.core.RegisterUtil;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

public class ServerProxy {
	public void preInit(FMLPreInitializationEvent event) {
		RegisterUtil.registerAll(event);
	}
	
	public void init(FMLInitializationEvent event) {}
	
	public void postInit(FMLPostInitializationEvent event) {}
	
	public void serverStarting(FMLServerStartingEvent event) {
		
	}
	
	public void serverStopping(FMLServerStoppingEvent event) {
		
	}

}
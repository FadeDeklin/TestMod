package fadedeklin.soulfantasy.common.core.proxy;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;


public class ServerProxy {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {	
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {	
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
	}
	
	@EventHandler
	public void serverStopping(FMLServerStoppingEvent event) {	
	}

}
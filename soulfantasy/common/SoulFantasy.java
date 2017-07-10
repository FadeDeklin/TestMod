package fadedeklin.soulfantasy.common;

import org.apache.logging.log4j.LogManager;

import fadedeklin.soulfantasy.common.core.proxy.ServerProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


//refer to Ref.java to get the id
@Mod(modid = Ref.MOD_ID, name = Ref.NAME, version = Ref.VERSION, acceptedMinecraftVersions = Ref.ACCEPTED_VERSIONS)
public class SoulFantasy {

	//refer to Ref.java and tell forge where is server/client side
	@SidedProxy(serverSide = Ref.SERVER_PROXY, clientSide = Ref.CLIENT_PROXY)
	public static ServerProxy proxy;
	
	@Instance(Ref.MOD_ID)
	public static SoulFantasy instance;
	
	//Logger
	public static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(Ref.MOD_ID);
	
	//Before Game's Registries
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(Ref.NAME + " is charging soul power to start up the world!");
		LOGGER.info("Starting Pre-Initialization...");
		proxy.preInit(event);
	}
	
	//Tile Entities & anything done in game
	@EventHandler
	 public void init(FMLInitializationEvent event){
		LOGGER.info("Starting Initialization...");
		proxy.init(event);
	}
	
	//recipes like crafting & smelting
	@EventHandler
	 public void postInit(FMLPostInitializationEvent event){
		LOGGER.info("Starting Post-Initialization...");
		proxy.postInit(event);
	}
}
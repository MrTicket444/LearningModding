package mrticket.learningmod;

import net.minecraft.creativetab.CreativeTabs;
import mrticket.learningmod.blocks.ModBlocks;
import mrticket.learningmod.core.proxy.CommonProxy;
import mrticket.learningmod.creativetab.CreativeTabLearningMod;
import mrticket.learningmod.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class LearningMod {
	
	public static CreativeTabs ctab = new CreativeTabLearningMod(CreativeTabs.getNextID(), Reference.MOD_ID);
	
	@Instance(Reference.MOD_ID)
	public static LearningMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent e) {
	}
	
	@Init
	public void init(FMLInitializationEvent e) {
		proxy.registerRenderThings();
		ModBlocks.load();
		LanguageRegistry.instance().addStringLocalization("itemGroup." + Reference.MOD_ID, "en_US", "Learning Mod");
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
}

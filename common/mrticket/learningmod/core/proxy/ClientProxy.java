package mrticket.learningmod.core.proxy;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderThings() {
		MinecraftForgeClient.preloadTexture("/textures/terrain.png");
	}
	
}

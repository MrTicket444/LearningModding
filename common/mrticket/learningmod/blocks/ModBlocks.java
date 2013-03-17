package mrticket.learningmod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block superFurnace;
	
	public static void load() {
		superFurnace = new BlockSuperFurnace(250, 0);
		
		GameRegistry.registerBlock(superFurnace, "SuperFurnace");
		
		LanguageRegistry.addName(superFurnace, "Super Furnace");
		
		
	}
}

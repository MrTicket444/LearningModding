package mrticket.learningmod.blocks;

import mrticket.learningmod.LearningMod;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

public class BlockSuperFurnace extends Block {
	public BlockSuperFurnace(int id, int texture) {
		super(id, texture, Material.rock);
		this.setCreativeTab(LearningMod.ctab);
		this.setHardness(5F);
		this.setResistance(0.5F);
		this.setBlockName("Superfurnace");
	}
	
	public String getTextureFile() {
		return "/textures/terrain.png";
	}
}

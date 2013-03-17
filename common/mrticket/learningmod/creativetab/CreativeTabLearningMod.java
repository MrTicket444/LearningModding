package mrticket.learningmod.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabLearningMod extends CreativeTabs{
	public CreativeTabLearningMod(int par1, String par2) {
		super(par1, par2);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex() {
		return 250;
	}
}

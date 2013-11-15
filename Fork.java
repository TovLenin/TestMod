package assets.testmod.src;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemAxe;

public class Fork extends ItemAxe {

	public Fork(int par1) {
		super(par1, TestMod.TEST);
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":fork");
	}
}

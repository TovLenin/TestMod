package assets.testmod.src;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class SweetBread extends ItemFood
{
	public SweetBread(int par1, int par2, float par3, boolean par4)
	{
		super(par1, par2, par4);
		maxStackSize = 64;
		this.setCreativeTab(CreativeTabs.tabFood);
	}
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
		{
			this.itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":sweetBread");
		}
}

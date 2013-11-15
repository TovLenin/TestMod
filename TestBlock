package assets.testmod.src;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TestBlock extends Block
{
    protected TestBlock(int par1)
    {
        super(par1, Material.ground); // Материал
        this.setCreativeTab(CreativeTabs.tabBlock); // Таблица в креативе
    }
    /*
   * Текстура
   */
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {
    	this.blockIcon = ir.registerIcon(ModInfo.MODID + ":testBlock");
    }
}

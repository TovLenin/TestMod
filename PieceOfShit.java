package assets.testmod.src;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PieceOfShit extends Item
{
    public PieceOfShit(int par1)
    {
        super(par1);
        this.maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityPieceOfShit(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
                                    this.itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":pieceOfShit");
    }
    
}


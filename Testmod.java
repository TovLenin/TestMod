package assets.testmod.src;

import assets.testmod.src.Fork;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.EnumHelper;
@Mod(modid=ModInfo.MODID, name=ModInfo.NAME, version=ModInfo.VERSION)

public class TestMod {
	public static Item fork = new Fork(3200).setUnlocalizedName("ChistiСhisti");
	public static final Block testBlock = new TestBlock(2000).setUnlocalizedName("testBlock");
	public static Item sladkyHleb = new SweetBread(2022, 1, 0.4F, false).setUnlocalizedName("Sweet bread");
	public static final EnumToolMaterial TEST = EnumHelper.addToolMaterial("TEST", 4, 2000, 10.0F, 5.0F, 10);
	public static final Block shitOre = new ShitOre(2001).setUnlocalizedName("shitOre");
	@Mod.Instance(ModInfo.MODID)
	public static TestMod mod;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.registerBlock(testBlock);
		GameRegistry.registerBlock(shitOre);
		LanguageRegistry.addName(testBlock, "Test Block");
		LanguageRegistry.addName(fork, "Чисти-чисти");
		LanguageRegistry.addName(sladkyHleb, "Сладкий хлебушек");
		LanguageRegistry.addName(shitOre, "Говноруда");
		GameRegistry.registerWorldGenerator(new ShitOreGenerator());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{

	}
}

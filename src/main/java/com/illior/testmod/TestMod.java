package com.illior.testmod;

import com.illior.testmod.recipes.ModRecipes;
import com.illior.testmod.world.gen.TestWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Mod(modid = TestMod.MODID, name = TestMod.NAME, version = TestMod.VERSION, acceptedMinecraftVersions = TestMod.MC_VERSION)
public class TestMod {
	public static final String MODID = "test_mod";
	public static final String NAME = "Test mod";
	public static final String VERSION = "1.0.0";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(TestMod.MODID);

	public static final CreativeTabs TEST_TAB = new TestModTab();

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new TestWorldGen(), 0);

		ModRecipes.initSmelting();

		LOGGER.info(TestMod.NAME + " says hi!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}

package com.illior.testmod.client;

import com.illior.testmod.TestMod;
import com.illior.testmod.init.ModBlocks;
import com.illior.testmod.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = TestMod.MODID)
public class ModelRegistrationHandler {
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.FIRST_ITEM, 0);

		registerModel(ModItems.TEST_PICKAXE, 0);
		registerModel(ModItems.TEST_AXE, 0);
		registerModel(ModItems.TEST_HOE, 0);
		registerModel(ModItems.TEST_SHOVEL, 0);
		registerModel(ModItems.TEST_SWORD, 0);

		registerModel(ModItems.TEST_HELMET, 0);
		registerModel(ModItems.TEST_CHESTPLATE, 0);
		registerModel(ModItems.TEST_LEGGINGS, 0);
		registerModel(ModItems.TEST_BOOTS, 0);

		registerModel(Item.getItemFromBlock(ModBlocks.FIRST_BLOCK), 0);
	}

	private static void registerModel(Item item, int meta) {
		TestMod.LOGGER.info("register " + item.getRegistryName());
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

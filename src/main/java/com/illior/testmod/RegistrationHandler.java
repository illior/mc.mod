package com.illior.testmod;

import com.illior.testmod.init.ModBlocks;
import com.illior.testmod.item.*;
import com.illior.testmod.materials.TestMaterials;
import com.illior.testmod.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = TestMod.MODID)
public class RegistrationHandler {
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				RegistryUtil.createItem("first_item").setCreativeTab(TestMod.TEST_TAB),

				new ItemTestPickaxe(TestMaterials.TEST_TOOL).setRegistryName(TestMod.MODID, "test_pickaxe").setTranslationKey(TestMod.MODID + "." + "test_pickaxe").setCreativeTab(TestMod.TEST_TAB),
				new ItemTestAxe(TestMaterials.TEST_TOOL, 17F, 20F).setRegistryName(TestMod.MODID, "test_axe").setTranslationKey(TestMod.MODID + "." + "test_axe").setCreativeTab(TestMod.TEST_TAB),
				new ItemTestHoe(TestMaterials.TEST_TOOL).setRegistryName(TestMod.MODID, "test_hoe").setTranslationKey(TestMod.MODID + "." + "test_hoe").setCreativeTab(TestMod.TEST_TAB),
				new ItemTestShovel(TestMaterials.TEST_TOOL).setRegistryName(TestMod.MODID, "test_shovel").setTranslationKey(TestMod.MODID + "." + "test_shovel").setCreativeTab(TestMod.TEST_TAB),
				new ItemTestSword(TestMaterials.TEST_TOOL).setRegistryName(TestMod.MODID, "test_sword").setTranslationKey(TestMod.MODID + "." + "test_sword").setCreativeTab(TestMod.TEST_TAB),

				new ItemTestArmor(TestMaterials.TEST_ARMOR, EntityEquipmentSlot.HEAD).setRegistryName(TestMod.MODID, "test_helmet").setTranslationKey(TestMod.MODID + "." + "test_helmet").setCreativeTab(TestMod.TEST_TAB),
				new ItemTestArmor(TestMaterials.TEST_ARMOR, EntityEquipmentSlot.CHEST).setRegistryName(TestMod.MODID, "test_chestplate").setTranslationKey(TestMod.MODID + "." + "test_chestplate").setCreativeTab(TestMod.TEST_TAB),
				new ItemTestArmor(TestMaterials.TEST_ARMOR, EntityEquipmentSlot.LEGS).setRegistryName(TestMod.MODID, "test_leggings").setTranslationKey(TestMod.MODID + "." + "test_leggings").setCreativeTab(TestMod.TEST_TAB),
				new ItemTestArmor(TestMaterials.TEST_ARMOR, EntityEquipmentSlot.FEET).setRegistryName(TestMod.MODID, "test_boots").setTranslationKey(TestMod.MODID + "." + "test_boots").setCreativeTab(TestMod.TEST_TAB)
		};

		final Item[] itemBlocks = {
				new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName(ModBlocks.FIRST_BLOCK.getRegistryName())
		};

		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}

	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				RegistryUtil.createBlock(Material.ROCK, "first_block").setCreativeTab(TestMod.TEST_TAB).setHardness(10).setLightLevel(1/16)
		};

		event.getRegistry().registerAll(blocks);
	}
}

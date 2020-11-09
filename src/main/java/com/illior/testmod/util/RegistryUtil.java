package com.illior.testmod.util;

import com.illior.testmod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class RegistryUtil {
	public static Item createItem(String name) {
		Item item = new Item().setRegistryName(TestMod.MODID, name).setTranslationKey(TestMod.MODID + "." + name);

		return item;
	}

	public static Block createBlock(Material material, String name) {
		Block block = new Block(material).setRegistryName(TestMod.MODID, name).setTranslationKey(TestMod.MODID + "." + name);

		return block;
	}
}

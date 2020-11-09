package com.illior.testmod.materials;

import com.illior.testmod.TestMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TestMaterials {
	public static final ToolMaterial TEST_TOOL = EnumHelper.addToolMaterial(TestMod.MODID + ":" + "test_tool", 3, 2048, 20.0F, 17F, 30);
	public static final ArmorMaterial TEST_ARMOR = EnumHelper.addArmorMaterial(TestMod.MODID + ":" + "test_tool", TestMod.MODID + ":test", 25, new int[]{25, 25, 25, 25}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
}

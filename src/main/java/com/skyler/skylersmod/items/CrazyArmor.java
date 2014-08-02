package com.skyler.skylersmod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.skyler.skylersmod.SkylersMod;

public class CrazyArmor extends ItemArmor {

	// private String[]armorTypes = {"crazzyHelm", "crazyChest", "crazyLegs",
	// "crazyBoots"};

	public CrazyArmor(ArmorMaterial material, int armorIndex, int armorType) {
		super(material, armorIndex, armorType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String layer) {
		if (stack.getItem().equals(SkylersMod.crazyHelm)
				|| stack.getItem().equals(SkylersMod.crazyChest)
				|| stack.getItem().equals(SkylersMod.crazyBoots)) {
			return ("skylersmod:textures/models/armor/CrazyArmorLayer1.png");
		} else if (stack.getItem().equals(SkylersMod.crazyLegs)) {
			return ("skylersmod:textures/models/armor/CrazyArmorLayer2.png");
		} else
			return null;
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		if (this == SkylersMod.crazyHelm)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "skylersHelmet");
		else if (this == SkylersMod.crazyChest)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "skylersChestplate");
		else if (this == SkylersMod.crazyLegs)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "skylersLeggings");
		else if (this == SkylersMod.crazyBoots)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "skylersBoots");
	}
}

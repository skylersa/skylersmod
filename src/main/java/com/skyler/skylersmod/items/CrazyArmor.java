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
		if (stack.getItem().equals(SkylersMod.crazyHelmetArmor)
				|| stack.getItem().equals(SkylersMod.crazyChestPlateArmor)
				|| stack.getItem().equals(SkylersMod.crazyBootsArmor)) {
			return ("skylersmod:textures/models/armor/crazy_armor_layer1.png");
		} else if (stack.getItem().equals(SkylersMod.crazyLeggingsArmor)) {
			return ("skylersmod:textures/models/armor/crazy_armor_layer2.png");
		} else
			return null;
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		if (this == SkylersMod.crazyHelmetArmor)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "crazy_helmet");
		else if (this == SkylersMod.crazyChestPlateArmor)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "crazy_chest_plate");
		else if (this == SkylersMod.crazyLeggingsArmor)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "crazy_leggings");
		else if (this == SkylersMod.crazyBootsArmor)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "crazy_boots");
	}
}

package com.skyler.skylersmod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.skyler.skylersmod.SkylersMod;

public class RubyArmor extends ItemArmor {

	// private String[]armorTypes = {"rubyHelm", "rubyChest", "rubyLegs",
	// "rubyBoots"};

	public RubyArmor(ArmorMaterial material, int armorIndex, int armorType) {
		super(material, armorIndex, armorType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String layer) {
		if (stack.getItem().equals(SkylersMod.rubyHelmetArmor)
				|| stack.getItem().equals(SkylersMod.rubyChestPlateArmor)
				|| stack.getItem().equals(SkylersMod.rubyBootsArmor)) {
			return ("skylersmod:textures/models/armor/ruby_armor_layer1.png");
		} else if (stack.getItem().equals(SkylersMod.rubyLeggingsArmor)) {
			return ("skylersmod:textures/models/armor/ruby_armor_layer2.png");
		} else
			return null;
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		if (this == SkylersMod.rubyHelmetArmor)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "ruby_helmet");
		else if (this == SkylersMod.rubyChestPlateArmor)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "ruby_chest_plate");
		else if (this == SkylersMod.rubyLeggingsArmor)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "ruby_leggings");
		else if (this == SkylersMod.rubyBootsArmor)
			this.itemIcon = reg.registerIcon(SkylersMod.modid + ":"
					+ "ruby_boots");
	}
}

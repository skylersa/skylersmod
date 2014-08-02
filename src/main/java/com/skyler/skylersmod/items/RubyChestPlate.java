package com.skyler.skylersmod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.IIcon;

import com.skyler.skylersmod.SkylersMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RubyChestPlate extends ItemArmor {

	public RubyChestPlate(ArmorMaterial material, int diamond, int chestplate) {
		super(material, diamond, chestplate);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(SkylersMod.modid + ":" + "ruby_chest_plate");
		this.setUnlocalizedName("ruby_chest_plate");
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(SkylersMod.modid + ':'
				+ "ruby_chest_plate");
	}

}

package com.skyler.skylersmod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.skyler.skylersmod.SkylersMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ZagaraniteIngot extends Item {
	public ZagaraniteIngot() {
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(SkylersMod.modid + ":" + "zagaranite_ingot");
		this.setUnlocalizedName("Zagaranite Ingot");
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(SkylersMod.modid + ':'
				+ "zagaranite_ore");
	}

}

package com.skyler.skylersmod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.skyler.skylersmod.SkylersMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomSwordHandle extends Item {

	public CustomSwordHandle() {
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(SkylersMod.modid + ":" + "custom_sword_handle");
		this.setUnlocalizedName("custom_sword_handle");
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(SkylersMod.modid + ':'
				+ "custom_sword_handle");
	}
}

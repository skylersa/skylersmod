package com.skyler.skylersmod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.IIcon;

import com.skyler.skylersmod.SkylersMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RubyHoe extends ItemHoe {

	public RubyHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName(SkylersMod.modid + ":" + "ruby_hoe");
		this.setUnlocalizedName("ruby_hoe");
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(SkylersMod.modid + ':'
				+ "ruby_hoe");
	}
}

package com.skyler.skylersmod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.util.IIcon;

import com.skyler.skylersmod.SkylersMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RubySword extends ItemSword {
	public RubySword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName(SkylersMod.modid + ":" + "ruby_sword");
		this.setUnlocalizedName("ruby_sword");
	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(SkylersMod.modid + ':'
				+ "ruby_sword");
	}

}

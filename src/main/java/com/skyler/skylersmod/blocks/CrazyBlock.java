package com.skyler.skylersmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

import com.skyler.skylersmod.SkylersMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CrazyBlock extends Block {

	public CrazyBlock(Material material) {
		super(material);
		this.setBlockName("Crazy Block");
		this.setHardness(10F);
		this.setBlockTextureName(SkylersMod.modid + ":" + "crazy_block");
		this.setCreativeTab(CreativeTabs.tabBlock);

	}

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {

		this.blockIcon = par1IconRegister.registerIcon(SkylersMod.modid + ':'
				+ "crazy_block");
	}
}

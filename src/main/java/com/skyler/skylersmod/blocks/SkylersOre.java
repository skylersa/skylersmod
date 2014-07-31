package com.skyler.skylersmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

import com.skyler.skylersmod.SkylersMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SkylersOre extends Block{

	public SkylersOre(Material material){
		super(material);
		this.setBlockName("skylers_ore");
		this.setHardness(5F);
		this.setBlockTextureName(SkylersMod.modid + ":" + "skylers_ore");
		this.setCreativeTab(CreativeTabs.tabBlock);

	}

		@SideOnly(Side.CLIENT)
		private IIcon[] icons;
		@SideOnly(Side.CLIENT)
		public void registerIcons(IIconRegister par1IconRegister)
		{
			this.blockIcon = par1IconRegister.registerIcon(SkylersMod.modid +
					':'+"skylers_ore");
		}

}



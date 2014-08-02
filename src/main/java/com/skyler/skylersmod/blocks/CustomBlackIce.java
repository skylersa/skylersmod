package com.skyler.skylersmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CustomBlackIce extends Block {

	public CustomBlackIce(Material material) {
		super(material);
		this.setBlockName("CusTOM Black Ice");
		this.slipperiness = 10F;
		this.setHardness(2F);
		this.setBlockTextureName("cactus_side");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

}

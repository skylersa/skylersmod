package com.skyler.skylersmod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.skyler.skylersmod.SkylersMod;

public class SkylersArmor extends ItemArmor{

//	private String[]armorTypes = {"rubyHelm", "rubyChest", "rubyLegs", "rubyBoots"};

	public SkylersArmor(ArmorMaterial material, int armorIndex,
			int armorType) {
		super(material, armorIndex, armorType);
	}

@Override
        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
        {
                if (stack.getItem().equals(SkylersMod.rubyHelm) || stack.getItem().equals(SkylersMod.rubyChest) || stack.getItem().equals(SkylersMod.rubyBoots))
                {
                        return ("skylersmod:textures/models/armor/SkylersArmorLayer1.png");
                }
                else if (stack.getItem().equals(SkylersMod.rubyLegs))
                {
                        return ("skylersmod:textures/models/armor/SkylersArmorLayer2.png");
                }
                else
                        return null;
        }

        @Override
        public void registerIcons(IIconRegister reg)
        {
                if (this == SkylersMod.rubyHelm)
                        this.itemIcon = reg.registerIcon(SkylersMod.modid + ":" + "skylersHelmet");
                else if (this == SkylersMod.rubyChest)
                        this.itemIcon = reg.registerIcon(SkylersMod.modid + ":" + "skylersChestplate");
                else if (this == SkylersMod.rubyLegs)
                        this.itemIcon = reg.registerIcon(SkylersMod.modid + ":" + "skylers Leggings");
                else if (this == SkylersMod.rubyBoots)
                        this.itemIcon = reg.registerIcon(SkylersMod.modid + ":" + "skylersBoots");
        }
}

package com.skyler.skylersmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.skyler.skylersmod.blocks.CrazyBlock;
import com.skyler.skylersmod.blocks.CrazyOre;
import com.skyler.skylersmod.blocks.CustomBlackIce;
import com.skyler.skylersmod.blocks.RubyBlock;
import com.skyler.skylersmod.blocks.RubyOre;
import com.skyler.skylersmod.items.CrazyArmor;
import com.skyler.skylersmod.items.CrazyAxe;
import com.skyler.skylersmod.items.CrazyBlade;
import com.skyler.skylersmod.items.CrazyPick;
import com.skyler.skylersmod.items.CrazySpade;
import com.skyler.skylersmod.items.CrazySword;
import com.skyler.skylersmod.items.CustomSwordHandle;
import com.skyler.skylersmod.items.CustomWithersEndPick;
import com.skyler.skylersmod.items.RubyArmor;
import com.skyler.skylersmod.items.RubyAxe;
import com.skyler.skylersmod.items.RubyBlade;
import com.skyler.skylersmod.items.RubyHoe;
import com.skyler.skylersmod.items.RubyIngot;
import com.skyler.skylersmod.items.RubyPick;
import com.skyler.skylersmod.items.RubySpade;
import com.skyler.skylersmod.items.RubySword;
import com.skyler.skylersmod.items.CrazyIngot;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = SkylersMod.modid, name = SkylersMod.name, version = SkylersMod.version)
public class SkylersMod {
	public static final String modid = "skylersmod";
	public static final String name = "Awesome Mod by dduckie";
	public static final String version = "0.0.1";

	public static final ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY",
			3, 2000, 30.0F, 8.0F, 20);
	public static final ToolMaterial RUBY2 = EnumHelper.addToolMaterial(
			"RUBY2", 3, 20000, 1000.0F, 8.0F, 20);
	public static final ArmorMaterial RUBY3 = EnumHelper.addArmorMaterial(
			"RUBY3", 50, new int[] { 4, 10, 8, 6 }, 40);

	public static final Item rubyHelmetArmor = new RubyArmor(RUBY3, 5, 0)
			.setUnlocalizedName("ruby_helmet_armor");
	public static final Item rubyChestPlateArmor = new RubyArmor(RUBY3, 5, 1)
			.setUnlocalizedName("ruby_chest_plate_armor");
	public static final Item rubyLeggingsArmor = new RubyArmor(RUBY3, 5, 2)
			.setUnlocalizedName("ruby_leggings_armor");
	public static final Item rubyBootsArmor = new RubyArmor(RUBY3, 3, 3)
			.setUnlocalizedName("ruby_boots_armor");

	public static final Item crazyHelmetArmor = new CrazyArmor(RUBY3, 5, 0)
			.setUnlocalizedName("crazy_helmet_armor");
	public static final Item crazyChestPlateArmor = new CrazyArmor(RUBY3, 5, 1)
			.setUnlocalizedName("crazy_chest_plate_armor");
	public static final Item crazyLeggingsArmor = new CrazyArmor(RUBY3, 5, 2)
			.setUnlocalizedName("crazy_leggings_armor");
	public static final Item crazyBootsArmor = new CrazyArmor(RUBY3, 5, 3)
			.setUnlocalizedName("crazy_boots_armor");

	public static final Block rubyOre = new RubyOre(Material.ground);
	public static final Item rubyIngot = new RubyIngot();
	public static final Item rubyPick = new RubyPick(RUBY);
	public static final Item rubySword = new RubySword(RUBY);
	public static final Item rubyAxe = new RubyAxe(RUBY);
	public static final Item rubySpade = new RubySpade(RUBY);
	public static final Item rubyHoe = new RubyHoe(RUBY);
	public static final Block rubyBlock = new RubyBlock(Material.ground);
	public static final Item customSwordHandle = new CustomSwordHandle();
	public static final Item rubyBlade = new RubyBlade();
	public static final Item crazyBlade = new CrazyBlade();
	
	
	
	
	
	
	
	
	// public static final Item rubyHelmet = new
	// RubyHelmet(ArmorMaterial.DIAMOND,
	// 3, 0);
	// public static final Item rubyChestPlate = new RubyChestPlate(
	// ArmorMaterial.DIAMOND, 3, 1);
	// public static final Item rubyLeggings = new RubyLeggings(
	// ArmorMaterial.DIAMOND, 3, 2);
	// public static final Item rubyBoots = new RubyBoots(ArmorMaterial.DIAMOND,
	// 3, 3);
	public static final Item customWithersEndPick = new CustomWithersEndPick(
			RUBY2);
	public static final Block crazyBlock = new CrazyBlock(Material.ground);
	public static final Item crazySpade = new CrazySpade(RUBY2);
	public static final Item crazySword = new CrazySword(RUBY2);
	public static final Block crazyOre = new CrazyOre(Material.ground);
	public static final Item crazyPick = new CrazyPick(RUBY2);
	public static final Item crazyAxe = new CrazyAxe(RUBY2);
	public static final Item crazyIngot = new CrazyIngot();
	
	
	@Instance(value = "SkylersMod")
	public static SkylersMod instance;

	@SidedProxy(clientSide = "com.skyler.client.SkylersClientProxy", serverSide = "com.skyler.skylersmod.SkylersCommonProxy")
	public static SkylersCommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		RenderingRegistry.addNewArmourRendererPrefix("5");
		MyBlocks();
		MyRecipes();
		MyItems();
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new SkylersOreGenerator(), 1);
		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

	public void MyRecipes() {
		// GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond),
		// new Object[] {Blocks.brick_stairs, Blocks.vine});
		
		
		GameRegistry.addRecipe(new ItemStack(rubyAxe), new Object[] { "AA ",
				"BA ", "B  ", 'A', rubyIngot, 'B', Items.stick });
		
		GameRegistry.addRecipe(new ItemStack(rubyPick), new Object[] { "AAA",
				" B ", " B ", 'A', rubyIngot, 'B', Items.stick });
		
		GameRegistry.addRecipe(new ItemStack(rubySpade), new Object[] { " A ",
				" B ", " B ", 'A', rubyIngot, 'B', Items.stick });
		
		GameRegistry.addRecipe(new ItemStack(rubyHoe), new Object[] { "AA ",
				" B ", " B ", 'A', rubyIngot, 'B', Items.stick });
		
		GameRegistry.addRecipe(new ItemStack(customSwordHandle), new Object[] {
				"A  ", " B ", "A A", 'A', Items.stick, 'B',
				(new ItemStack(Items.skull, 1, 1)) });
		
		GameRegistry.addRecipe(new ItemStack(rubyBlade), new Object[] { " A ",
				"CAC", " B ", 'A', rubyIngot, 'B', rubyBlock, 'C',
				Items.diamond });
		GameRegistry.addRecipe(new ItemStack(rubySword), new Object[] { " A ",
				" B ", 'A', rubyBlade, 'B', customSwordHandle });
		
		GameRegistry.addRecipe(new ItemStack(rubyBlock), new Object[] { "AAA",
				"AAA", "AAA", 'A', rubyIngot });
		
		GameRegistry.addRecipe(new ItemStack(rubyHelmetArmor), new Object[] {
				"AAA", "A A", 'A', rubyIngot });
		
		GameRegistry.addRecipe(new ItemStack(rubyChestPlateArmor),
				new Object[] { "A A", "AAA", "AAA", 'A', rubyIngot });
		
		GameRegistry.addRecipe(new ItemStack(rubyLeggingsArmor), new Object[] {
				"AAA", "A A", "A A", 'A', rubyIngot });
		
		GameRegistry.addRecipe(new ItemStack(rubyBootsArmor), new Object[] {
				"A A", "A A", 'A', rubyIngot });
		
		GameRegistry.addRecipe(new ItemStack(crazyPick), new Object[] {
			"A A", "A A", 'A', crazyIngot });
		
		GameRegistry.addRecipe(new ItemStack(crazyBootsArmor), new Object[] {
			"A A", "A A", 'A', crazyIngot });
		
		GameRegistry.addRecipe(new ItemStack(crazyLeggingsArmor), new Object[] {
			"AAA", "A A", "A A", 'A', crazyIngot });
		
		GameRegistry.addRecipe(new ItemStack(crazyChestPlateArmor),
				new Object[] { "A A", "AAA", "AAA", 'A', crazyIngot });

		GameRegistry.addRecipe(new ItemStack(crazyHelmetArmor), new Object[] {
			"AAA", "A A", 'A', crazyIngot });
		
		GameRegistry.addRecipe(new ItemStack(crazyBlock), new Object[] { "AAA",
			"AAA", "AAA", 'A', crazyIngot });

		GameRegistry.addRecipe(new ItemStack(crazySword), new Object[] { " A ",
			" B ", 'A', crazyBlade, 'B', customSwordHandle });
		
		GameRegistry.addRecipe(new ItemStack(crazyBlade), new Object[] { " A ",
			"CAC", " B ", 'A', crazyIngot, 'B', crazyBlock, 'C', Items.diamond});
		
		GameRegistry.addRecipe(new ItemStack(crazySpade), new Object[] { " A ",
			" B ", " B ", 'A', crazyIngot, 'B', Items.stick });
		
		GameRegistry.addRecipe(new ItemStack(crazyAxe), new Object[] { "AA ",
			"BA ", "B  ", 'A', crazyIngot, 'B', Items.stick });
		
		
		
		
		
		
		GameRegistry.addSmelting(crazyOre, new ItemStack(crazyIngot), 1000F);
		GameRegistry.addSmelting(rubyOre, new ItemStack(rubyIngot), 1000F);
		

		ItemStack Fishis = new ItemStack(Items.stick);
		Fishis.addEnchantment(Enchantment.knockback, 100);

		GameRegistry.addShapelessRecipe(Fishis, new Object[] { Items.stick });
	}

	public void MyBlocks() {
		Block customBlackIce = new CustomBlackIce(Material.ground);
		GameRegistry.registerBlock(crazyBlock, "Crazy Block");
		GameRegistry.registerBlock(crazyOre, "Crazy Ore");

		GameRegistry.registerBlock(customBlackIce, "Custom Black Ice");

		GameRegistry.registerBlock(rubyBlock, "Ruby Block");
		GameRegistry.registerBlock(rubyOre, "Ruby Ore");
	}

	public void MyItems() {
		// Crazy items
		GameRegistry.registerItem(crazyPick, "Crazy Pick");
		GameRegistry.registerItem(crazySpade, "Crazy Spade");
		GameRegistry.registerItem(crazySword, "Crazy Sword");
		GameRegistry.registerItem(crazyIngot, "Crazy Ingot");
		GameRegistry.registerItem(crazyAxe, "Crazy Axe");
		GameRegistry.registerItem(crazyBlade, "Crazy Blade");
		
		
		
		// Crazy armor
		GameRegistry.registerItem(crazyBootsArmor, "Crazy Boots");
		GameRegistry.registerItem(crazyChestPlateArmor, "Crazy Chest");
		GameRegistry.registerItem(crazyHelmetArmor, "Crazy Helmet");
		GameRegistry.registerItem(crazyLeggingsArmor, "Crazy Legs");

		
		// Miscellaneous custom stuff
		GameRegistry.registerItem(customSwordHandle, "Custom Sword Handle");
		GameRegistry.registerItem(customWithersEndPick,
				"Custom Wither's End Pick");

		// Ruby items
		GameRegistry.registerItem(rubyAxe, "Ruby Axe");
		GameRegistry.registerItem(rubyBlade, "Ruby Blade");
		GameRegistry.registerItem(rubyHoe, "Ruby Hoe");
		GameRegistry.registerItem(rubyIngot, "Ruby Ingot");
		GameRegistry.registerItem(rubyPick, "Ruby Pick");
		GameRegistry.registerItem(rubySpade, "Ruby Spade");
		GameRegistry.registerItem(rubySword, "Ruby Sword");
		
		
		
		
		
		// Ruby armor
		GameRegistry.registerItem(rubyBootsArmor, "Ruby Boots ARMOR");
		GameRegistry
				.registerItem(rubyChestPlateArmor, "Ruby Chest Plate ARMOR");
		GameRegistry.registerItem(rubyHelmetArmor, "Ruby Helmet ARMOR");
		GameRegistry.registerItem(rubyLeggingsArmor, "Ruby Legs ARMOR");

		// GameRegistry.registerItem(rubyBoots, "Ruby Boots ITEM");
		// GameRegistry.registerItem(rubyChestPlate, "Ruby Chest Plate ITEM");
		// GameRegistry.registerItem(rubyHelmet, "Ruby Helmet ITEM");
		// GameRegistry.registerItem(rubyLeggings, "Ruby Leggings ITEM");
	}

}

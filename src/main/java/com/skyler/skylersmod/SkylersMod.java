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

import com.skyler.skylersmod.blocks.BlackIce;
import com.skyler.skylersmod.blocks.SkylersBlock;
import com.skyler.skylersmod.blocks.SkylersOre;
import com.skyler.skylersmod.blocks.SuperAwesomeThing;
import com.skyler.skylersmod.blocks.ZagaraniteOre;
import com.skyler.skylersmod.items.RubyBlade;
import com.skyler.skylersmod.items.SkylersArmor;
import com.skyler.skylersmod.items.SkylersAxe;
import com.skyler.skylersmod.items.SkylersBoots;
import com.skyler.skylersmod.items.SkylersChestplate;
import com.skyler.skylersmod.items.SkylersHelmet;
import com.skyler.skylersmod.items.SkylersHoe;
import com.skyler.skylersmod.items.SkylersIngot;
import com.skyler.skylersmod.items.SkylersLeggings;
import com.skyler.skylersmod.items.SkylersPick;
import com.skyler.skylersmod.items.SkylersSpade;
import com.skyler.skylersmod.items.SkylersSword;
import com.skyler.skylersmod.items.SwordHandle;
import com.skyler.skylersmod.items.WithersEndPick;
import com.skyler.skylersmod.items.ZagaraniteIngot;
import com.skyler.skylersmod.items.crazyspade;

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
	public static final String name = "Awesome Ruby Mod by dduckie";
	public static final String version = "0.0.1";

	public static final ToolMaterial RUBY =
			EnumHelper.addToolMaterial("RUBY", 3, 2000, 30.0F, 8.0F, 20);
	public static final ToolMaterial RUBY2 =
			EnumHelper.addToolMaterial("RUBY2", 3, 20000, 1000.0F, 8.0F, 20);
	public static final ArmorMaterial RUBY3 =
			EnumHelper.addArmorMaterial("RUBY3", 50, new int[]{4, 10, 8, 6}, 40);


	public static final Item rubyHelm =
			new SkylersArmor(RUBY3, 5, 0).setUnlocalizedName("Ruby Helm");
	public static final Item rubyChest =
		new SkylersArmor(RUBY3, 5, 1).setUnlocalizedName("Ruby Chest");
	public static final Item rubyLegs =
		new SkylersArmor(RUBY3, 5, 2).setUnlocalizedName("Ruby Legs");
	public static final Item rubyBoots =
			new SkylersArmor(RUBY3, 3, 3).setUnlocalizedName("Ruby Boots");



	public static final Block skylersOre = new SkylersOre(Material.ground);
	public static final Item skylersIngot = new SkylersIngot();
	public static final Item skylersPick = new SkylersPick(RUBY);
	public static final Item skylersSword = new SkylersSword(RUBY);
	public static final Item skylersAxe = new SkylersAxe(RUBY);
	public static final Item skylersSpade = new SkylersSpade(RUBY);
	public static final Item skylersHoe = new SkylersHoe(RUBY);
	public static final Block skylersBlock = new SkylersBlock(Material.ground);
	public static final Item swordHandle = new SwordHandle();
	public static final Item rubyBlade = new RubyBlade();
	public static final Item skylersHelmet = new SkylersHelmet(ArmorMaterial.DIAMOND, 3, 0);
	public static final Item skylersChestplate = new SkylersChestplate(ArmorMaterial.DIAMOND, 3, 1);
	public static final Item skylersLeggings = new SkylersLeggings(ArmorMaterial.DIAMOND, 3, 2);
	public static final Item skylersBoots = new SkylersBoots(ArmorMaterial.DIAMOND, 3, 3);
	public static final Item withersEndPick = new WithersEndPick(RUBY2);
	public static final Block zagaraniteOre = new ZagaraniteOre(Material.ground);
	public static final Item zagaraniteIngot = new ZagaraniteIngot();
	public static final Block superAwesomeThing = new SuperAwesomeThing(Material.ground);
	public static final Item crazySpade = new crazyspade(RUBY2);




	@Instance(value = "SkylersMod")
	public static SkylersMod instance;
	@SidedProxy(clientSide = "com.skyler.client.ClientProxy", serverSide = "com.skyler.skylersmod.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		RenderingRegistry.addNewArmourRendererPrefix("5");
		MyBlocks();
		MyRecipes();
		MyItems();
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new MyOreGenerator(), 1);

		proxy.registerRenderers();

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	public void MyRecipes() {
//		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond),
//				new Object[] {Blocks.brick_stairs, Blocks.vine});
		GameRegistry.addRecipe(new ItemStack(skylersAxe), new Object[]
				{"AA ", "BA ", "B  ", 'A', skylersIngot, 'B', Items.stick});
		GameRegistry.addRecipe(new ItemStack(skylersPick), new Object []
				{"AAA"," B "," B ", 'A', skylersIngot, 'B', Items.stick});
		GameRegistry.addRecipe(new ItemStack(skylersSpade), new Object []
				{" A "," B "," B ", 'A', skylersIngot, 'B', Items.stick});
		GameRegistry.addRecipe(new ItemStack(skylersHoe), new Object []
				{"AA "," B "," B ", 'A', skylersIngot, 'B', Items.stick});
		GameRegistry.addRecipe(new ItemStack(swordHandle), new Object []
				{"A  "," B ","A A", 'A', Items.stick, 'B', (new ItemStack(Items.skull, 1, 1))});
		GameRegistry.addRecipe(new ItemStack(rubyBlade), new Object []
				{" A ","CAC"," B ", 'A', skylersIngot, 'B', skylersBlock, 'C', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(skylersSword), new Object []
				{" A "," B ", 'A', rubyBlade, 'B', swordHandle});
		GameRegistry.addRecipe(new ItemStack(skylersBlock), new Object []
				{"AAA","AAA","AAA", 'A', skylersIngot});
		GameRegistry.addRecipe(new ItemStack(rubyHelm), new Object []
				{"AAA","A A", 'A', skylersIngot});
		GameRegistry.addRecipe(new ItemStack(rubyChest), new Object []
				{"A A","AAA","AAA", 'A', skylersIngot});
		GameRegistry.addRecipe(new ItemStack(rubyLegs), new Object []
				{"AAA","A A","A A",  'A', skylersIngot});
		GameRegistry.addRecipe(new ItemStack(rubyBoots), new Object []
				{"A A","A A", 'A', skylersIngot});




















		GameRegistry.addSmelting(Items.beef,new ItemStack(Items.spawn_egg,1,40), 1F);

		GameRegistry.addSmelting(skylersOre,new ItemStack(skylersIngot), 1000F);
		GameRegistry.addSmelting(zagaraniteOre,new ItemStack(zagaraniteIngot), 1000F);


		ItemStack Fishis = new ItemStack(Items.stick);

		Fishis.addEnchantment(Enchantment.knockback, 100);

		GameRegistry.addShapelessRecipe(Fishis, new Object[]{Items.stick});


	}

		public void MyBlocks()
		{
			Block blackIce = new BlackIce(Material.ground);
			GameRegistry.registerBlock(blackIce, "Black Ice");


			GameRegistry.registerBlock(skylersOre, "skylersore");

			GameRegistry.registerBlock(skylersBlock, "skylersBlock");

			GameRegistry.registerBlock(zagaraniteOre, "zagaraniteore");

			GameRegistry.registerBlock(superAwesomeThing, "Super Awesome Thing");


		}
		public void MyItems()
		{

			GameRegistry.registerItem(skylersIngot, "skylersingot");

			GameRegistry.registerItem(skylersPick, "skylerspick");

			GameRegistry.registerItem(skylersSword, "skylerssword");

			GameRegistry.registerItem(skylersAxe, "skylersaxe");

			GameRegistry.registerItem(skylersSpade, "skylersspade");

			GameRegistry.registerItem(skylersHoe, "skylershoe");

			GameRegistry.registerItem(swordHandle, "swordhandle");

			GameRegistry.registerItem(rubyBlade, "rubyblade");

			GameRegistry.registerItem(skylersHelmet, "skylershelmet");

			GameRegistry.registerItem(skylersChestplate, "skylerchestplate");

			GameRegistry.registerItem(skylersLeggings, "skylersleggings");

			GameRegistry.registerItem(skylersBoots, "skylersboots");

			GameRegistry.registerItem(withersEndPick, "withersendpick");

			GameRegistry.registerItem(rubyHelm, "Ruby Helmet");
			GameRegistry.registerItem(rubyChest, "Ruby Chest");
			GameRegistry.registerItem(rubyLegs, "Ruby Legs");
			GameRegistry.registerItem(rubyBoots, "Ruby Boots");

			GameRegistry.registerItem(zagaraniteIngot, "Zagaranite Ingot");
			
			GameRegistry.registerItem(crazySpade, "CrazySpade");
			
			






		}

	}



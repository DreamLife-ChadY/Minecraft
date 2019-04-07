package fr.test.mod;

import fr.test.mod.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMod {
	
	public static Item item_text;
	
	public static void init()
	{
		
		item_text = new Item().setUnlocalizedName("item_test").setCreativeTab(CreativeTabs.tabDecorations).setTextureName(Reference.MOD_ID + "item_test");
		
	}

	public static void register()
	{
		GameRegistry.registerItem(item_text, "itemTest");
	}
	
}

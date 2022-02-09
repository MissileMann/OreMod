package com.missile.oremod.core.init;

import com.missile.oremod.OreMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OreMod.MOD_ID);
	
	public static final RegistryObject<Item> EBONITE_GEM = ITEMS.register("ebonite_gem",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<BlockItem> EBONITE_ORE = ITEMS.register("ebonite_ore",
			() -> new BlockItem(BlockInit.EBONITE_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> EBONITE_BLOCK = ITEMS.register("ebonite_block", 
			() -> new BlockItem(BlockInit.EBONITE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
			
}

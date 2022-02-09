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
	
	public static final RegistryObject<Item> GEM = ITEMS.register("gem",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<BlockItem> ORE_BLOCK = ITEMS.register("ore_block",
			() -> new BlockItem(BlockInit.ORE_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
			
}

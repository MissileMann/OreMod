package com.missile.oremod.core.init;

import com.missile.oremod.OreMod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OreMod.MOD_ID);
	
	public static final RegistryObject<Block> ORE_BLOCK = BLOCKS
			.register("ore_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE)
					.strength(15f, 30f)
					.harvestLevel(3)
					.harvestTool(ToolType.PICKAXE)
					.sound(SoundType.ANCIENT_DEBRIS)));
}

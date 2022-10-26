package com.missile.oremod.core.init.common.blocks;

import javax.annotation.Nonnull;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class BlockCrystal extends Block {
	
	public BlockCrystal(Properties props) {
		super(props);
	}
	
	@Nonnull
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx) {
		return makeShape();
	}
	
	public VoxelShape makeShape(){
		VoxelShape shape = VoxelShapes.empty();
		shape = VoxelShapes.join(shape, VoxelShapes.box(0.375, 0, 0.375, 0.625, 1, 0.625), IBooleanFunction.OR);
		shape = VoxelShapes.join(shape, VoxelShapes.box(0.328125, 0.125, 0.328125, 0.671875, 0.875, 0.671875), IBooleanFunction.OR);

		return shape;
	}
}

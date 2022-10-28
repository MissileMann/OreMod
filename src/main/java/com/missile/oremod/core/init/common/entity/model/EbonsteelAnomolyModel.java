package com.missile.oremod.core.init.common.entity.model;

import com.missile.oremod.core.init.common.entity.EbonsteelAnomolyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class EbonsteelAnomolyModel <T extends EbonsteelAnomolyEntity> extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer legleft;
	private final ModelRenderer legright;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer armleft;
	private final ModelRenderer armright;

	public EbonsteelAnomolyModel() {
		texWidth = 64;
		texHeight = 32;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		legleft = new ModelRenderer(this);
		legleft.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(legleft);
		legleft.texOffs(0, 16).addBox(-3.0F, -12.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		legright = new ModelRenderer(this);
		legright.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(legright);
		legright.texOffs(0, 16).addBox(1.0F, -12.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -24.0F, 0.0F);
		body.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.3963F, 1.5708F, -0.6109F);
		cube_r1.texOffs(38, 2).addBox(1.0F, -10.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.3963F, -1.5708F, 0.6109F);
		cube_r2.texOffs(38, 2).addBox(-3.0F, -10.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, -2.1817F, 1.2217F, -1.8762F);
		cube_r3.texOffs(38, 2).addBox(2.0F, -9.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, -2.1817F, -1.2217F, 1.8762F);
		cube_r4.texOffs(38, 2).addBox(-4.0F, -9.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, -2.1817F, -1.2217F, 1.309F);
		cube_r5.texOffs(38, 2).addBox(-2.0F, -10.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, -2.1817F, 1.2217F, -1.309F);
		cube_r6.texOffs(38, 2).addBox(0.0F, -10.0F, -4.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.7418F, -0.5672F, 0.6109F);
		cube_r7.texOffs(38, 2).addBox(-2.0F, -14.0F, -4.0F, 2.0F, 7.0F, 2.0F, 0.0F, true);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.7418F, 0.5672F, -0.6109F);
		cube_r8.texOffs(38, 2).addBox(0.0F, -14.0F, -4.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		armleft = new ModelRenderer(this);
		armleft.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(armleft);
		armleft.texOffs(0, 16).addBox(-6.0F, -24.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		armright = new ModelRenderer(this);
		armright.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(armright);
		armright.texOffs(40, 16).addBox(4.0F, -24.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
	
	
}
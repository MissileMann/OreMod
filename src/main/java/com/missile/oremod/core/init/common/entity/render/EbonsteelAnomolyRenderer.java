package com.missile.oremod.core.init.common.entity.render;

import com.missile.oremod.OreMod;
import com.missile.oremod.core.init.common.entity.EbonsteelAnomolyEntity;
import com.missile.oremod.core.init.common.entity.model.EbonsteelAnomolyModel;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.ResourceLocation;

public class EbonsteelAnomolyRenderer<T extends Entity> extends EntityRenderer<T>{

	protected static final ResourceLocation TEXTURE = 
			new ResourceLocation(OreMod.MOD_ID, "textures/entity/witherskell.png");
	
	public EbonsteelAnomolyRenderer(EntityRendererManager renderIn) {
		super(renderIn);
	}
	
	@Override
	public ResourceLocation getTextureLocation(T entity) {
		return TEXTURE;
	}

}

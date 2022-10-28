package com.missile.oremod.core.init;

import com.missile.oremod.OreMod;
import com.missile.oremod.core.init.common.entity.EbonsteelAnomolyEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
	public static DeferredRegister<EntityType<?>> ENTITY_TYPES
		= DeferredRegister.create(ForgeRegistries.ENTITIES, OreMod.MOD_ID);
	
	public static final RegistryObject<EntityType<EbonsteelAnomolyEntity>> EBONSTEEL_ANOMOLY =
			ENTITY_TYPES.register("ebonsteel_anomoly", 
					() -> EntityType.Builder.of(EbonsteelAnomolyEntity::new, EntityClassification.MONSTER).sized(1f,3f).build(new ResourceLocation(OreMod.MOD_ID, "ebonsteel_anomoly").toString()));
	
	public static void register(IEventBus eventBus) {
		ENTITY_TYPES.register(eventBus);
	}
}

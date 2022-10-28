package com.missile.oremod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.missile.oremod.core.init.BlockInit;
import com.missile.oremod.core.init.EntityInit;
import com.missile.oremod.core.init.ItemInit;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OreMod.MOD_ID)
public class OreMod
{
    public static final String MOD_ID = "missileoremod";
    private static final Logger LOGGER = LogManager.getLogger();

    public OreMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS .register(bus);
        EntityInit.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        
    }
}

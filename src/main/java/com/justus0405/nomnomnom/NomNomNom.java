package com.justus0405.nomnomnom;

import com.justus0405.nomnomnom.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

///////////////////////////////////////////////////////////////////
// Thanks to Modding by Kaupenjoe by teaching me how to do this  //
///////////////////////////////////////////////////////////////////

@Mod(NomNomNom.MOD_ID)
public class NomNomNom
{
    public static final String MOD_ID = "nomnomnom";

    public NomNomNom() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);

        //eventBus.addListener(this::setup);
        //eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
        });
    }
}

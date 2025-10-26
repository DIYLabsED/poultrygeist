package com.onelabtorulethemall.poultrygeist;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Poultrygeist.MODID)
public class Poultrygeist {
    
    public static final String MODID = "poultrygeist";

    public Poultrygeist() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    }
}
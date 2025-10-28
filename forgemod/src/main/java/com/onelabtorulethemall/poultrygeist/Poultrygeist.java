/**
 * @author DIYLabsED
 */

package com.onelabtorulethemall.poultrygeist;

import com.onelabtorulethemall.poultrygeist.registry.Registration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

@Mod(Poultrygeist.MODID)
public class Poultrygeist {
    
    public static final String MODID = "poultrygeist";
    
    private static final Logger LOGGER = LogUtils.getLogger();

    public Poultrygeist() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Registration.register(modEventBus);
        
        LOGGER.info("[Poultrygeist]: Registered!");
    }
}

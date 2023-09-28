package net.mattias.beastofsea;

import com.mojang.logging.LogUtils;
import net.mattias.beastofsea.entity.ModEntityTypes;
import net.mattias.beastofsea.entity.client.CoralStarFishRenderer;
import net.mattias.beastofsea.entity.client.SeaBunnyRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;
import net.mattias.beastofsea.item.ModItems;


@Mod(BeastofSea.MOD_ID)
public class BeastofSea {
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "beastofsea";

    public BeastofSea() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Create an event bus for your mod
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register entity types using the mod's event bus
        ModEntityTypes.register(modEventBus);
        ModItems.register(eventBus);
        // Initialize GeckoLib
        GeckoLib.initialize();
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                EntityRenderers.register(ModEntityTypes.SEABUNNY.get(), SeaBunnyRenderer::new);
                EntityRenderers.register(ModEntityTypes.CORAL_STARFISH.get(), CoralStarFishRenderer::new);

            });
        }
    }

}
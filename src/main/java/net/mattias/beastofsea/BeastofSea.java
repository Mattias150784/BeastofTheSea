package net.mattias.beastofsea;

import com.mojang.logging.LogUtils;
import net.mattias.beastofsea.entity.ModEntityTypes;
import net.mattias.beastofsea.entity.client.SeaBunnyRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BeastofSea.MOD_ID)
public class BeastofSea
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "beastofsea";

    public BeastofSea()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Create an event bus for your mod
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register entity types using the mod's event bus
        ModEntityTypes.register(modEventBus);

        // Initialize GeckoLib
        GeckoLib.initialize();
        EntityRenderers.register(ModEntityTypes.SEABUNNY.get(), SeaBunnyRenderer::new);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}

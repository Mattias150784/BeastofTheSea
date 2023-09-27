package net.mattias.beastofsea.event;

import net.mattias.beastofsea.BeastofSea;
import net.mattias.beastofsea.entity.ModEntityTypes;
import net.mattias.beastofsea.entity.custom.SeaBunnyEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BeastofSea.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.SEABUNNY.get(), SeaBunnyEntity.createMobAttributes().build());

    }
}
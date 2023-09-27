package net.mattias.beastofsea.event;

import net.mattias.beastofsea.entity.ModEntityTypes;
import net.mattias.beastofsea.entity.custom.SeaBunnyEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.SEABUNNY.get(), SeaBunnyEntity.setAttributes());
    }
}

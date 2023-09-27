package net.mattias.beastofsea.entity;

import net.mattias.beastofsea.BeastofSea;
import net.mattias.beastofsea.entity.custom.SeaBunnyEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, BeastofSea.MOD_ID);

    public static final RegistryObject<EntityType<SeaBunnyEntity>> SEABUNNY =
            ENTITY_TYPES.register("sea_bunny",
                    () -> EntityType.Builder.of(SeaBunnyEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(BeastofSea.MOD_ID, "sea_bunny").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
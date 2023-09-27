package net.mattias.beastofsea.item.custom;

import net.mattias.beastofsea.entity.ModEntityTypes;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.mattias.beastofsea.item.custom.ModCreativeModeTab; 

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "your_mod_id");

    // Define your items using RegistryObjects
    public static final RegistryObject<Item> SEA_BUNNY_SPAWN_EGG = ITEMS.register("sea_bunny_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SEABUNNY, 0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.BEAST_OF_SEA_TAB)));

    public static void register(IEventBus eventBus) {
    }

    // Define more items here if needed
}

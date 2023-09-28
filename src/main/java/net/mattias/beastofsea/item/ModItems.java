package net.mattias.beastofsea.item;

import net.mattias.beastofsea.entity.ModEntityTypes;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "beastofsea");

    // Define your items using RegistryObjects
    public static final RegistryObject<Item> SEA_BUNNY_SPAWN_EGG = ITEMS.register("sea_bunny_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SEABUNNY, 0x8c8c8c, 0xa48484,
                    new Item.Properties().tab(ModCreativeModeTab.BEAST_OF_SEA_TAB)));
    public static final RegistryObject<Item> ALGAE_SHEETS = ITEMS.register("algae_sheet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BEAST_OF_SEA_TAB)));

    public static void register(IEventBus eventBus) {
    }

    // Define more items here if needed
}

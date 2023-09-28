package net.mattias.beastofsea.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BEAST_OF_SEA_TAB = new CreativeModeTab("beastofseatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SEA_BUNNY_SPAWN_EGG.get());
        }
    };
}


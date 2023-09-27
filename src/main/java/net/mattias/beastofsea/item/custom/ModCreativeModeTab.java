package net.mattias.beastofsea.item.custom;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.mattias.beastofsea.item.custom.ModItems;

public class ModCreativeModeTab {
    public static final CreativeModeTab BEAST_OF_SEA_TAB = new CreativeModeTab("beastofseatab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SEA_BUNNY_SPAWN_EGG.get());
        }
    };
}
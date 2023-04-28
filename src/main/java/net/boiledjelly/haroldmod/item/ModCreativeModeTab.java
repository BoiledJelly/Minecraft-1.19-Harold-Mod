package net.boiledjelly.haroldmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab HAROLD_TAB = new CreativeModeTab("haroldtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HAROLD.get());
        }
    };
}

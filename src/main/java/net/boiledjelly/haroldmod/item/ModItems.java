package net.boiledjelly.haroldmod.item;

import net.boiledjelly.haroldmod.HaroldMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HaroldMod.MOD_ID);

    public static final RegistryObject<Item> HAROLD = ITEMS.register("harold",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HAROLD_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}

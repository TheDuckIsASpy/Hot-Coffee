package net.theduckisaspy.hotcoffee.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theduckisaspy.hotcoffee.HotCoffeeMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HotCoffeeMod.MOD_ID);

    public static final DeferredItem<Item> DONUTS = ITEMS.registerSimpleItem("donuts");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

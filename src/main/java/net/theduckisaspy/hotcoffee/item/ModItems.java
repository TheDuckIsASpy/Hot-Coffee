package net.theduckisaspy.hotcoffee.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theduckisaspy.hotcoffee.HotCoffeeMod;
import net.theduckisaspy.hotcoffee.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HotCoffeeMod.MOD_ID);

    public static final DeferredItem<Item> DONUT = ITEMS.registerItem("donut", Item::new, new Item.Properties().food(ModFoodProperties.DONUT));

    public static final DeferredItem<Item> MOCCA_SPAWN_EGG = ITEMS.register("mocca_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.MOCCA, 0xdebd47, 0xccbfbe,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

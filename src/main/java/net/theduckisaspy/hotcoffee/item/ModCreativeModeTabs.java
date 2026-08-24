package net.theduckisaspy.hotcoffee.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theduckisaspy.hotcoffee.HotCoffeeMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HotCoffeeMod.MOD_ID);

    public static final Supplier<CreativeModeTab> HOT_COFFEE_TAB =
            CREATIVE_MODE_TABS.register("hot_coffee_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.hotcoffee.hot_coffee_tab"))
                    .icon(() -> new ItemStack(ModItems.DONUT.get()))
                    .displayItems((pParameters, p0utput) -> {
                        p0utput.accept(ModItems.DONUT);

                        p0utput.accept(ModItems.MOCCA_SPAWN_EGG);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

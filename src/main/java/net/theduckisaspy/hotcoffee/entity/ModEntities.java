package net.theduckisaspy.hotcoffee.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theduckisaspy.hotcoffee.HotCoffeeMod;
import net.theduckisaspy.hotcoffee.entity.custom.MoccaEntity;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, HotCoffeeMod.MOD_ID);

    public static final Supplier<EntityType<MoccaEntity>> MOCCA =
            ENTITY_TYPES.register("mocca", () -> EntityType.Builder.of(MoccaEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 2.0f).build("mocca"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
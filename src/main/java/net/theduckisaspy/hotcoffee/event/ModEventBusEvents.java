package net.theduckisaspy.hotcoffee.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.theduckisaspy.hotcoffee.HotCoffeeMod;
import net.theduckisaspy.hotcoffee.entity.ModEntities;
import net.theduckisaspy.hotcoffee.entity.client.MoccaModel;
import net.theduckisaspy.hotcoffee.entity.client.ModModelLayers;
import net.theduckisaspy.hotcoffee.entity.custom.MoccaEntity;

@EventBusSubscriber(modid = HotCoffeeMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.MOCCA, MoccaModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.MOCCA.get(), MoccaEntity.createAttributes().build());
    }
}

package net.theduckisaspy.hotcoffee.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.theduckisaspy.hotcoffee.HotCoffeeMod;
import net.theduckisaspy.hotcoffee.entity.custom.MoccaEntity;

public class MoccaRenderer extends MobRenderer<MoccaEntity, MoccaModel> {
    public MoccaRenderer(EntityRendererProvider.Context context) {
        super(context, new MoccaModel(context.bakeLayer(ModModelLayers.MOCCA)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(MoccaEntity moccaEntity) {
        return ResourceLocation.fromNamespaceAndPath(HotCoffeeMod.MOD_ID, "textures/entity/mocca/moccaun.png");
    }

    @Override
    public void render(MoccaEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
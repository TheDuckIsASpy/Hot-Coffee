package net.theduckisaspy.hotcoffee.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.theduckisaspy.hotcoffee.entity.custom.MoccaEntity;

public class MoccaModel extends HierarchicalModel<MoccaEntity>{
    private final ModelPart mocca;
    private final ModelPart head;

    public MoccaModel(ModelPart root) {
        this.mocca = root.getChild("mocca");
        this.head = this.mocca.getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition mocca = partdefinition.addOrReplaceChild("mocca", CubeListBuilder.create().texOffs(17, 16).addBox(-3.5F, -21.0F, -2.0F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition left_arm = mocca.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(4.6316F, -23.5079F, 0.0218F));

        PartDefinition cube_r1 = left_arm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(32, 0).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1316F, 4.5079F, -0.5218F, 0.0087F, 0.0017F, -0.0524F));

        PartDefinition right_arm = mocca.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-4.6316F, -23.5079F, 0.0218F));

        PartDefinition cube_r2 = right_arm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1316F, 4.5079F, -0.5218F, 0.0087F, -0.0017F, 0.0524F));

        PartDefinition bottom = mocca.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 40).addBox(1.0F, -4.0F, -4.0F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, -11.0F, 2.1F));

        PartDefinition belt = bottom.addOrReplaceChild("belt", CubeListBuilder.create().texOffs(46, 0).addBox(-4.0F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -4.0F, -4.1F));

        PartDefinition tail = bottom.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(4.5F, -3.1F, -0.8F));

        PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(51, 48).addBox(-0.5F, -3.5F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 3.0F, 1.0F, 0.3578F, 0.0F, 0.0F));

        PartDefinition flap = bottom.addOrReplaceChild("flap", CubeListBuilder.create(), PartPose.offset(4.5F, -4.4555F, -4.7593F));

        PartDefinition cube_r4 = flap.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 37).addBox(-3.5F, -0.5F, -0.5F, 7.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0055F, 0.2093F, -0.0524F, 0.0F, 0.0F));

        PartDefinition left_leg = bottom.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(45, 33).mirror().addBox(-1.5F, 4.5F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.25F, -2.5F, -2.0F));

        PartDefinition right_leg = bottom.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(45, 33).addBox(-1.5F, 4.5F, -1.5F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.75F, -2.5F, -2.0F));

        PartDefinition jgr = mocca.addOrReplaceChild("jgr", CubeListBuilder.create(), PartPose.offset(-1.5F, -19.7076F, -1.4019F));

        PartDefinition cube_r5 = jgr.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(2, 33).addBox(0.0F, -3.0F, -8.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -0.4924F, 5.0019F, 0.4887F, 0.0F, 0.0F));

        PartDefinition jgl = mocca.addOrReplaceChild("jgl", CubeListBuilder.create(), PartPose.offset(1.5F, -19.7076F, -1.4019F));

        PartDefinition cube_r6 = jgl.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 6).addBox(1.0F, -3.0F, -8.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -0.4924F, 5.0019F, 0.4887F, 0.0F, 0.0F));

        PartDefinition head = mocca.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.65F, -7.85F, -3.75F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.65F, -21.15F, -0.25F));

        PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(2.2935F, -6.3261F, 0.25F));

        PartDefinition cube_r7 = left_ear.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(4, 52).mirror().addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3379F, 2.9078F, 0.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r8 = left_ear.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(0.0F, 1.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3435F, -1.0239F, 0.5F, 0.0F, 0.0F, -0.2182F));

        PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(-3.5935F, -6.3261F, 0.25F));

        PartDefinition cube_r9 = right_ear.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(4, 52).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3379F, 2.9078F, 0.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition cube_r10 = right_ear.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(51, 10).addBox(-3.0F, 1.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3435F, -1.0239F, 0.5F, 0.0F, 0.0F, 0.2182F));

        PartDefinition spike = head.addOrReplaceChild("spike", CubeListBuilder.create(), PartPose.offset(-1.35F, -6.65F, -0.25F));

        PartDefinition cube_r11 = spike.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(54, 28).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.192F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(MoccaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        if (entity.isOrderedToSit()) {
            this.animate(entity.sittingAnimationState, MoccaAnimations.sitting, ageInTicks, 1f);
            this.root().y += 12.0F;
        } else {
            this.animateWalk(MoccaAnimations.walking, limbSwing, limbSwingAmount, 2f, 2.5f);
            this.animate(entity.idleAnimationState, MoccaAnimations.idle, ageInTicks, 1f);
        }
    }

    private void applyHeadRotation(float headYaw, float headPitch) {
        headYaw = Mth.clamp(headYaw, -30f, 30f);
        headPitch = Mth.clamp(headPitch, -3f, 45);

        this.head.yRot = headYaw * ((float)Math.PI / 180f);
        this.head.xRot = headPitch * ((float)Math.PI / 180f);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        mocca.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return mocca;
    }
}
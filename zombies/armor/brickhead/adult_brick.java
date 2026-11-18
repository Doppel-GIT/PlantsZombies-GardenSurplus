// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class adult_brick<T extends helmetmodel_adult> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "adult_brick"), "main");
	private final ModelPart hat_adult;

	public adult_brick(ModelPart root) {
		this.hat_adult = root.getChild("hat_adult");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat_adult = partdefinition.addOrReplaceChild("hat_adult", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition interior_r1 = hat_adult.addOrReplaceChild("interior_r1", CubeListBuilder.create().texOffs(43, 79).addBox(-7.0F, -8.0F, -1.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -24.0F, -3.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition exterior_r1 = hat_adult.addOrReplaceChild("exterior_r1", CubeListBuilder.create().texOffs(1, 75).addBox(-9.0F, -10.0F, -1.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -23.0F, -4.0F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void setupAnim(helmetmodel_adult entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hat_adult.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
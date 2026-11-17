// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class adult_bucket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "adult_bucket"), "main");
	private final ModelPart hat_adult;

	public adult_bucket(ModelPart root) {
		this.hat_adult = root.getChild("hat_adult");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat_adult = partdefinition.addOrReplaceChild("hat_adult", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition handle_r1 = hat_adult.addOrReplaceChild("handle_r1", CubeListBuilder.create().texOffs(8, 84).addBox(-1.0F, -6.0F, -1.0F, 9.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -26.0F, -2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bucket low_r1 = hat_adult.addOrReplaceChild("bucket low_r1", CubeListBuilder.create().texOffs(39, 70).addBox(0.0F, -2.0F, -10.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -29.0F, 5.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bucket_r1 = hat_adult.addOrReplaceChild("bucket_r1", CubeListBuilder.create().texOffs(1, 67).addBox(0.0F, -8.0F, -9.0F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -29.0F, 4.5F, 0.0F, 0.0F, -0.2618F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hat_adult.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
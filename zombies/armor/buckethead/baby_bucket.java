// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class baby_bucket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "baby_bucket"), "main");
	private final ModelPart hat_baby;

	public baby_bucket(ModelPart root) {
		this.hat_baby = root.getChild("hat_baby");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat_baby = partdefinition.addOrReplaceChild("hat_baby", CubeListBuilder.create(), PartPose.offset(0.0F, 41.0F, 0.0F));

		PartDefinition handle_r1 = hat_baby.addOrReplaceChild("handle_r1", CubeListBuilder.create().texOffs(2, 35).addBox(1.0F, -6.0F, -1.0F, 7.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -26.0F, -2.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bucket low_r1 = hat_baby.addOrReplaceChild("bucket low_r1", CubeListBuilder.create().texOffs(40, 48).addBox(1.0F, -2.0F, -9.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.15F, -28.0F, 4.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bucket_r1 = hat_baby.addOrReplaceChild("bucket_r1", CubeListBuilder.create().texOffs(2, 48).addBox(1.0F, -6.0F, -9.0F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.1F, -28.0F, 5.5F, 0.0F, 0.0F, -0.2618F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hat_baby.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
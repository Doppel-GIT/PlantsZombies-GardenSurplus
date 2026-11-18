// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class adult_oak_held<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "adult_oak_held"), "main");
	private final ModelPart item_adult;
	private final ModelPart siding;

	public adult_oak_held(ModelPart root) {
		this.item_adult = root.getChild("item_adult");
		this.siding = this.item_adult.getChild("siding");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition item_adult = partdefinition.addOrReplaceChild("item_adult", CubeListBuilder.create().texOffs(62, 0).addBox(-8.0F, -32.0F, -10.0F, 16.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 22.25F, 0.75F, 0.0873F, 0.0F, 0.0F));

		PartDefinition siding = item_adult.addOrReplaceChild("siding", CubeListBuilder.create().texOffs(64, 3).addBox(-5.0F, -30.75F, -10.25F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 3).addBox(1.0F, -30.75F, -10.25F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 3).addBox(-1.0F, -30.75F, -10.25F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 3).addBox(5.0F, -30.75F, -10.25F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 3).addBox(1.0F, -30.75F, -10.25F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(61, 3).addBox(-5.0F, -30.75F, -10.25F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 12).addBox(1.0F, -22.75F, -10.25F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 12).addBox(-5.0F, -22.75F, -10.25F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 7).addBox(1.0F, -27.75F, -10.25F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 7).addBox(-5.0F, -27.75F, -10.25F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(61, 8).addBox(-5.0F, -25.75F, -10.25F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 8).addBox(1.0F, -25.75F, -10.25F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.75F, 0.25F));

		return LayerDefinition.create(meshdefinition, 96, 36);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		item_adult.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class baby_oak_held<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "baby_oak_held"), "main");
	private final ModelPart item_baby;
	private final ModelPart siding;

	public baby_oak_held(ModelPart root) {
		this.item_baby = root.getChild("item_baby");
		this.siding = this.item_baby.getChild("siding");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition item_baby = partdefinition.addOrReplaceChild("item_baby", CubeListBuilder.create().texOffs(26, 16).addBox(-5.0F, -16.0F, -10.0F, 16.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 21.85F, 5.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition siding = item_baby.addOrReplaceChild("siding", CubeListBuilder.create().texOffs(28, 19).addBox(-5.0F, -15.15F, -5.15F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 19).addBox(2.0F, -15.15F, -5.15F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 19).addBox(-2.0F, -15.15F, -5.15F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 19).addBox(5.0F, -15.15F, -5.15F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 30).addBox(-5.0F, -5.15F, -5.15F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 23).addBox(-5.0F, -12.15F, -5.15F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 19).addBox(-5.0F, -15.15F, -5.15F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 26).addBox(-5.0F, -8.15F, -5.15F, 10.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 2.15F, -4.85F));

		return LayerDefinition.create(meshdefinition, 96, 36);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		item_baby.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
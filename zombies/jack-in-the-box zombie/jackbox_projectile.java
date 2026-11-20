// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class jackbox_projectile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "jackbox_projectile"), "main");
	private final ModelPart root;
	private final ModelPart Box;
	private final ModelPart Box Head;
	private final ModelPart Lid;
	private final ModelPart Crank;

	public jackbox_projectile(ModelPart root) {
		this.root = root.getChild("root");
		this.Box = this.root.getChild("Box");
		this.Box Head = this.Box.getChild("Box Head");
		this.Lid = this.Box.getChild("Lid");
		this.Crank = this.Box.getChild("Crank");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Box = root.addOrReplaceChild("Box", CubeListBuilder.create().texOffs(64, 2).addBox(-3.3F, -3.36F, -3.1F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 5).addBox(-4.3F, -1.96F, -1.6F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.175F, -2.615F, 0.35F));

		PartDefinition Box Head = Box.addOrReplaceChild("Box Head", CubeListBuilder.create(), PartPose.offset(-0.8F, 18.64F, 8.9F));

		PartDefinition head_r1 = Box Head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(64, 18).addBox(-3.5F, -3.5F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(-1.5F)), PartPose.offsetAndRotation(0.5F, -18.5F, -9.1F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Lid = Box.addOrReplaceChild("Lid", CubeListBuilder.create().texOffs(77, 3).addBox(-2.5F, 0.0F, -0.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.3F, -3.36F, -2.1F));

		PartDefinition Crank = Box.addOrReplaceChild("Crank", CubeListBuilder.create().texOffs(82, 3).addBox(-0.5F, -0.9325F, -3.0189F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 57).addBox(-2.5F, -0.9325F, -3.0189F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.8F, 0.54F, -1.6F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
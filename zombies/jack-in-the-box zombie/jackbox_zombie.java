// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class jackbox_zombie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "jackbox_zombie"), "main");
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart Arms;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart Box;
	private final ModelPart Box Head;
	private final ModelPart Lid;
	private final ModelPart Crank;
	private final ModelPart right_leg;
	private final ModelPart left_leg;

	public jackbox_zombie(ModelPart root) {
		this.root = root.getChild("root");
		this.head = this.root.getChild("head");
		this.body = this.root.getChild("body");
		this.Arms = this.root.getChild("Arms");
		this.right_arm = this.Arms.getChild("right_arm");
		this.left_arm = this.Arms.getChild("left_arm");
		this.Box = this.Arms.getChild("Box");
		this.Box Head = this.Box.getChild("Box Head");
		this.Lid = this.Box.getChild("Lid");
		this.Crank = this.Box.getChild("Crank");
		this.right_leg = this.root.getChild("right_leg");
		this.left_leg = this.root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, -23.5F, -2.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0F, -23.6F, -2.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Arms = root.addOrReplaceChild("Arms", CubeListBuilder.create(), PartPose.offset(0.0F, -22.0F, 3.0F));

		PartDefinition right_arm = Arms.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 32).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-4.0F, 0.0F, -3.0F, -1.1345F, 0.0F, 0.0F));

		PartDefinition left_arm = Arms.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(32, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(48, 48).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(4.0F, 0.0F, -4.9F, -1.2168F, 0.1639F, 0.0602F));

		PartDefinition Box = Arms.addOrReplaceChild("Box", CubeListBuilder.create().texOffs(64, 2).addBox(-3.125F, -2.975F, -4.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 5).addBox(-4.125F, -1.575F, -3.25F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.625F, 2.975F, -10.25F, 0.1745F, 0.0873F, 0.0F));

		PartDefinition Box Head = Box.addOrReplaceChild("Box Head", CubeListBuilder.create(), PartPose.offset(-0.625F, 19.025F, 7.25F));

		PartDefinition head_r1 = Box Head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(64, 18).addBox(-3.5F, -3.5F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -18.5F, -9.1F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Lid = Box.addOrReplaceChild("Lid", CubeListBuilder.create().texOffs(77, 3).addBox(-2.5F, 0.0F, -0.5F, 5.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.125F, -2.975F, -3.75F));

		PartDefinition Crank = Box.addOrReplaceChild("Crank", CubeListBuilder.create().texOffs(82, 3).addBox(-0.5F, -0.9325F, -3.0189F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 57).addBox(-2.5F, -0.9325F, -3.0189F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.625F, 0.925F, -3.25F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(2.0F, -12.0F, 0.0F));

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
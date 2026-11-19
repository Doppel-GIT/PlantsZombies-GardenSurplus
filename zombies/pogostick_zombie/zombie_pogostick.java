// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class zombie_pogostick<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "zombie_pogostick"), "main");
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart pogo;
	private final ModelPart Pole;
	private final ModelPart Foot;

	public zombie_pogostick(ModelPart root) {
		this.root = root.getChild("root");
		this.head = this.root.getChild("head");
		this.body = this.root.getChild("body");
		this.right_arm = this.root.getChild("right_arm");
		this.left_arm = this.root.getChild("left_arm");
		this.right_leg = this.root.getChild("right_leg");
		this.left_leg = this.root.getChild("left_leg");
		this.pogo = this.root.getChild("pogo");
		this.Pole = this.pogo.getChild("Pole");
		this.Foot = this.Pole.getChild("Foot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 22.5F, 0.0F));

		PartDefinition head = root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition Hat Layer_r1 = head.addOrReplaceChild("Hat Layer_r1", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -32.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(1.25F, 24.5F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.5F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 32).addBox(-4.0F, 0.5F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-4.0F, -1.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 32).addBox(-4.0F, -1.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-4.0F, -22.0F, 0.0F, -0.9581F, 0.0715F, 0.0501F));

		PartDefinition left_arm = root.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(32, 48).addBox(0.0F, -1.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(48, 48).addBox(0.0F, -1.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(4.0F, -22.0F, 0.0F, -0.9581F, -0.0715F, -0.0501F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(-2.0F, -12.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Knee_r1 = right_leg.addOrReplaceChild("Knee_r1", CubeListBuilder.create().texOffs(3, 24).addBox(-0.1F, -9.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 11.6F, 2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition Knee_r2 = left_leg.addOrReplaceChild("Knee_r2", CubeListBuilder.create().texOffs(19, 65).addBox(-0.1F, -9.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 11.61F, 2.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition pogo = root.addOrReplaceChild("pogo", CubeListBuilder.create().texOffs(64, 32).addBox(-7.0F, -20.5F, -9.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(-2.4F, -21.5F, -10.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 10).addBox(-1.4F, -17.5F, -10.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 7.4F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Pole = pogo.addOrReplaceChild("Pole", CubeListBuilder.create().texOffs(64, 18).addBox(-0.5F, -16.0F, -1.6F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 22).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, -7.4F));

		PartDefinition Foot = Pole.addOrReplaceChild("Foot", CubeListBuilder.create().texOffs(78, 10).addBox(-1.5F, -4.0F, -2.6F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 32).addBox(-1.0F, -2.0F, -1.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

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
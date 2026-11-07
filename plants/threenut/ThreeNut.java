// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class ThreeNut<T extends ThreeNut> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "threenut"), "main");
	private final ModelPart roll;
	private final ModelPart bottom;
	private final ModelPart spout;
	private final ModelPart top;
	private final ModelPart spout top;
	private final ModelPart right;
	private final ModelPart spout right;

	public ThreeNut(ModelPart root) {
		this.roll = root.getChild("roll");
		this.bottom = this.roll.getChild("bottom");
		this.spout = this.bottom.getChild("spout");
		this.top = root.getChild("top");
		this.spout top = this.top.getChild("spout top");
		this.right = root.getChild("right");
		this.spout right = this.right.getChild("spout right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition roll = partdefinition.addOrReplaceChild("roll", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition bottom = roll.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(4, 3).addBox(-4.9937F, -2.7574F, -3.9615F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(4, 85).addBox(-5.4937F, -3.2574F, -4.4615F, 11.0F, 8.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(4, 21).addBox(-4.4937F, -2.2574F, -3.4615F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(4, 52).addBox(-3.4937F, -3.2574F, -2.4615F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(4, 75).addBox(-3.9937F, 4.2426F, -2.9615F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(4, 38).addBox(-3.9937F, -4.7574F, -2.9615F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0063F, 3.7574F, -1.0385F));

		PartDefinition spout = bottom.addOrReplaceChild("spout", CubeListBuilder.create().texOffs(6, 61).addBox(-1.2833F, -1.1917F, 0.2777F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 66).addBox(-1.7833F, -1.6917F, -1.7223F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1536F, -0.0987F, -5.2392F));

		PartDefinition top = partdefinition.addOrReplaceChild("top", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0075F, 8.6533F, -0.9546F, 0.0F, 0.0F, -3.1416F));

		PartDefinition "hair"_r1 = top.addOrReplaceChild(""hair"_r1", CubeListBuilder.create().texOffs(48, 75).addBox(9.5009F, -8.7619F, 2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.2425F, -0.0967F, -2.0454F, 0.0F, 0.0F, -2.7053F));

		PartDefinition body_r1 = top.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(48, 38).addBox(8.0F, -1.0F, 0.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9925F, 1.6533F, -3.0454F, 0.0F, 0.0F, -3.1416F));

		PartDefinition inside top_r1 = top.addOrReplaceChild("inside top_r1", CubeListBuilder.create().texOffs(48, 52).addBox(-3.5F, -0.5F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0075F, 1.6533F, 0.9546F, 0.0F, 0.0F, -3.1416F));

		PartDefinition inside body_r1 = top.addOrReplaceChild("inside body_r1", CubeListBuilder.create().texOffs(48, 21).addBox(-4.5F, -3.0F, -4.5F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(48, 3).addBox(-5.0F, -3.5F, -5.0F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0075F, -1.8467F, 0.9546F, 0.0F, 0.0F, -3.1416F));

		PartDefinition headband_r1 = top.addOrReplaceChild("headband_r1", CubeListBuilder.create().texOffs(48, 85).addBox(-5.5F, -4.0F, -5.5F, 11.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0075F, -2.1533F, 0.9546F, 0.0F, 3.1416F, 0.0F));

		PartDefinition spout top = top.addOrReplaceChild("spout top", CubeListBuilder.create(), PartPose.offset(-0.0125F, -2.3518F, -5.2954F));

		PartDefinition cube_r1 = spout top.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 66).addBox(-1.5F, -1.5F, -1.5F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 61).addBox(-1.0F, -1.0F, 0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5051F, 0.5051F, -0.25F, 0.0F, 0.0F, -3.1416F));

		PartDefinition right = partdefinition.addOrReplaceChild("right", CubeListBuilder.create().texOffs(92, 8).addBox(-3.4138F, -2.0364F, -1.9167F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(12.4138F, 11.0364F, -2.0833F));

		PartDefinition "hair"_r2 = right.addOrReplaceChild(""hair"_r2", CubeListBuilder.create().texOffs(92, 75).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2707F, -1.3942F, 1.5833F, 0.0F, 0.0F, 0.4363F));

		PartDefinition spout right = right.addOrReplaceChild("spout right", CubeListBuilder.create().texOffs(95, 61).addBox(-0.8F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(93, 67).addBox(-1.3F, -1.5F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0805F, 0.529F, -2.9167F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(ThreeNut entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		roll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		top.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
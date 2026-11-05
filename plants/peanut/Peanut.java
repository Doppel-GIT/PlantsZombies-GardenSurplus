// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Peanut<T extends Peanut> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "peanut"), "main");
	private final ModelPart roll;
	private final ModelPart bottom;
	private final ModelPart spout;
	private final ModelPart top;
	private final ModelPart spout top;

	public Peanut(ModelPart root) {
		this.roll = root.getChild("roll");
		this.bottom = this.roll.getChild("bottom");
		this.spout = this.bottom.getChild("spout");
		this.top = root.getChild("top");
		this.spout top = this.top.getChild("spout top");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition roll = partdefinition.addOrReplaceChild("roll", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition bottom = roll.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(15, 15).addBox(-4.9937F, -2.7574F, -3.9615F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(58, 84).addBox(-4.4937F, -2.2574F, -3.4615F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(60, 51).addBox(-3.4937F, -3.2574F, -2.4615F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(15, 34).addBox(-3.9937F, 4.2426F, -2.9615F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(15, 63).addBox(-3.9937F, -4.7574F, -2.9615F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.0063F, 3.7574F, -1.0385F));

		PartDefinition spout = bottom.addOrReplaceChild("spout", CubeListBuilder.create().texOffs(62, 71).addBox(-1.2833F, -1.1917F, 0.2777F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 76).addBox(-1.7833F, -1.6917F, -1.7223F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1536F, -0.0987F, -5.2392F));

		PartDefinition top = partdefinition.addOrReplaceChild("top", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0075F, 8.6533F, -0.9546F, 0.0F, 0.0F, -3.1416F));

		PartDefinition "hair"_r1 = top.addOrReplaceChild(""hair"_r1", CubeListBuilder.create().texOffs(20, 56).addBox(9.5009F, -8.7619F, 2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.2425F, -0.0967F, -2.0454F, 0.0F, 0.0F, -2.7053F));

		PartDefinition body_r1 = top.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(15, 45).addBox(8.0F, -1.0F, 0.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9925F, 1.6533F, -3.0454F, 0.0F, 0.0F, -3.1416F));

		PartDefinition inside top_r1 = top.addOrReplaceChild("inside top_r1", CubeListBuilder.create().texOffs(60, 61).addBox(-3.5F, -0.5F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0075F, 1.6533F, 0.9546F, 0.0F, 0.0F, -3.1416F));

		PartDefinition inside body_r1 = top.addOrReplaceChild("inside body_r1", CubeListBuilder.create().texOffs(58, 34).addBox(-4.5F, -3.0F, -4.5F, 9.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0075F, -1.8467F, 0.9546F, 0.0F, 0.0F, -3.1416F));

		PartDefinition main body_r1 = top.addOrReplaceChild("main body_r1", CubeListBuilder.create().texOffs(57, 15).addBox(7.0F, -7.0F, -1.0F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9925F, -5.3467F, -3.0454F, 0.0F, 0.0F, -3.1416F));

		PartDefinition spout top = top.addOrReplaceChild("spout top", CubeListBuilder.create(), PartPose.offset(-0.0125F, -2.3518F, -5.2954F));

		PartDefinition cube_r1 = spout top.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(74, 76).addBox(-1.5F, -1.5F, -1.5F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(76, 71).addBox(-1.0F, -1.0F, 0.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5051F, 0.5051F, -0.25F, 0.0F, 0.0F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Peanut entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		roll.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		top.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
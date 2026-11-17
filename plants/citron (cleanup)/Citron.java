// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Citron<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "citron"), "main");
	private final ModelPart body;
	private final ModelPart Leaf 01;
	private final ModelPart Leaf 02;
	private final ModelPart Leaf 03;
	private final ModelPart Leaf 04;
	private final ModelPart Leaf 05;
	private final ModelPart Leaf 06;
	private final ModelPart large_citron;
	private final ModelPart piece1;
	private final ModelPart interior1;
	private final ModelPart piece2;
	private final ModelPart interior2;
	private final ModelPart piece3;
	private final ModelPart interior3;
	private final ModelPart piece4;
	private final ModelPart interior4;
	private final ModelPart small_citron;
	private final ModelPart bone;

	public Citron(ModelPart root) {
		this.body = root.getChild("body");
		this.Leaf 01 = this.body.getChild("Leaf 01");
		this.Leaf 02 = this.body.getChild("Leaf 02");
		this.Leaf 03 = this.body.getChild("Leaf 03");
		this.Leaf 04 = this.body.getChild("Leaf 04");
		this.Leaf 05 = this.body.getChild("Leaf 05");
		this.Leaf 06 = this.body.getChild("Leaf 06");
		this.large_citron = this.body.getChild("large_citron");
		this.piece1 = this.large_citron.getChild("piece1");
		this.interior1 = this.piece1.getChild("interior1");
		this.piece2 = this.large_citron.getChild("piece2");
		this.interior2 = this.piece2.getChild("interior2");
		this.piece3 = this.large_citron.getChild("piece3");
		this.interior3 = this.piece3.getChild("interior3");
		this.piece4 = this.large_citron.getChild("piece4");
		this.interior4 = this.piece4.getChild("interior4");
		this.small_citron = this.body.getChild("small_citron");
		this.bone = this.small_citron.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Leaf 01 = body.addOrReplaceChild("Leaf 01", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition tip_r1 = Leaf 01.addOrReplaceChild("tip_r1", CubeListBuilder.create().texOffs(7, 5).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -6.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition base_r1 = Leaf 01.addOrReplaceChild("base_r1", CubeListBuilder.create().texOffs(7, 0).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leaf 02 = body.addOrReplaceChild("Leaf 02", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition tip_r2 = Leaf 02.addOrReplaceChild("tip_r2", CubeListBuilder.create().texOffs(7, 5).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -6.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition base_r2 = Leaf 02.addOrReplaceChild("base_r2", CubeListBuilder.create().texOffs(7, 0).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leaf 03 = body.addOrReplaceChild("Leaf 03", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.0F, -1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition tip_r3 = Leaf 03.addOrReplaceChild("tip_r3", CubeListBuilder.create().texOffs(7, 5).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -6.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition base_r3 = Leaf 03.addOrReplaceChild("base_r3", CubeListBuilder.create().texOffs(7, 0).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leaf 04 = body.addOrReplaceChild("Leaf 04", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, 1.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition tip_r4 = Leaf 04.addOrReplaceChild("tip_r4", CubeListBuilder.create().texOffs(7, 5).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -6.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition base_r4 = Leaf 04.addOrReplaceChild("base_r4", CubeListBuilder.create().texOffs(7, 0).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leaf 05 = body.addOrReplaceChild("Leaf 05", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition tip_r5 = Leaf 05.addOrReplaceChild("tip_r5", CubeListBuilder.create().texOffs(7, 5).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -6.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition base_r5 = Leaf 05.addOrReplaceChild("base_r5", CubeListBuilder.create().texOffs(7, 0).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leaf 06 = body.addOrReplaceChild("Leaf 06", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition tip_r6 = Leaf 06.addOrReplaceChild("tip_r6", CubeListBuilder.create().texOffs(7, 5).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.45F, -6.85F, 0.0873F, 0.0F, 0.0F));

		PartDefinition base_r6 = Leaf 06.addOrReplaceChild("base_r6", CubeListBuilder.create().texOffs(7, 0).addBox(-3.0F, 0.0F, -5.0F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition large_citron = body.addOrReplaceChild("large_citron", CubeListBuilder.create(), PartPose.offset(0.0F, -0.53F, 0.0F));

		PartDefinition piece1 = large_citron.addOrReplaceChild("piece1", CubeListBuilder.create().texOffs(38, 76).addBox(0.0F, -5.97F, -12.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(62, 85).addBox(0.0F, -2.0F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 6.0F));

		PartDefinition cube_r1 = piece1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 7).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -5.47F, -12.33F, 0.0F, 0.1745F, 2.0944F));

		PartDefinition interior1 = piece1.addOrReplaceChild("interior1", CubeListBuilder.create().texOffs(38, 12).addBox(-3.27F, -3.9101F, -6.0499F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(3.27F, -2.0599F, -5.9501F));

		PartDefinition piece2 = large_citron.addOrReplaceChild("piece2", CubeListBuilder.create().texOffs(0, 96).addBox(0.0F, 0.03F, -12.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 118).addBox(0.0F, 5.98F, -10.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(24, 105).addBox(0.0F, 0.0F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 6.0F));

		PartDefinition interior2 = piece2.addOrReplaceChild("interior2", CubeListBuilder.create().texOffs(0, 32).addBox(-3.27F, -3.9101F, -6.0499F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(3.27F, 3.9401F, -5.9501F));

		PartDefinition piece3 = large_citron.addOrReplaceChild("piece3", CubeListBuilder.create().texOffs(38, 96).addBox(-5.0F, 0.03F, -12.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(38, 118).addBox(-3.0F, 5.98F, -10.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(62, 105).addBox(-1.0F, 0.0F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -6.0F, 6.0F));

		PartDefinition interior3 = piece3.addOrReplaceChild("interior3", CubeListBuilder.create().texOffs(38, 32).addBox(-3.27F, -3.9101F, -6.0499F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.73F, 3.9401F, -5.9501F));

		PartDefinition piece4 = large_citron.addOrReplaceChild("piece4", CubeListBuilder.create().texOffs(0, 76).addBox(-6.0F, -5.97F, -12.0F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(24, 85).addBox(-2.0F, -2.0F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 6.0F));

		PartDefinition eyebrow_r1 = piece4.addOrReplaceChild("eyebrow_r1", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, -1.0F, 0.0F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, -5.47F, -12.33F, 0.0F, 0.1745F, 1.0472F));

		PartDefinition interior4 = piece4.addOrReplaceChild("interior4", CubeListBuilder.create().texOffs(0, 12).addBox(-3.27F, -3.9101F, -6.0499F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.73F, -2.0599F, -5.9501F));

		PartDefinition small_citron = body.addOrReplaceChild("small_citron", CubeListBuilder.create().texOffs(104, 55).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyebrow_r2 = small_citron.addOrReplaceChild("eyebrow_r2", CubeListBuilder.create().texOffs(1, 10).addBox(-3.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9F, -3.12F, -3.66F, 0.0F, 0.1745F, 0.8727F));

		PartDefinition eyebrow_r3 = small_citron.addOrReplaceChild("eyebrow_r3", CubeListBuilder.create().texOffs(1, 7).addBox(-3.8631F, -0.2017F, -0.1452F, 3.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0631F, -2.5183F, -3.5148F, 0.0F, 0.1745F, 2.2689F));

		PartDefinition bone = small_citron.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(104, 67).addBox(-2.0F, -1.97F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -3.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Marigold extends EntityModel<Marigold> {
	private final ModelPart body;
	private final ModelPart stem;
	private final ModelPart stem_2;
	private final ModelPart stem_3;
	private final ModelPart head;
	private final ModelPart eyebrows;
	private final ModelPart leaves;
	private final ModelPart leaf_1;
	private final ModelPart leaf_tip_1;
	private final ModelPart leaf_2;
	private final ModelPart leaf_tip_2;
	private final ModelPart leaf_3;
	private final ModelPart leaf_tip_3;
	private final ModelPart leaf_4;
	private final ModelPart leaf_tip_4;
	public Marigold(ModelPart root) {
		this.body = root.getChild("body");
		this.stem = this.body.getChild("stem");
		this.stem_2 = this.stem.getChild("stem_2");
		this.stem_3 = this.stem_2.getChild("stem_3");
		this.head = this.stem_3.getChild("head");
		this.eyebrows = this.head.getChild("eyebrows");
		this.leaves = this.body.getChild("leaves");
		this.leaf_1 = this.leaves.getChild("leaf_1");
		this.leaf_tip_1 = this.leaf_1.getChild("leaf_tip_1");
		this.leaf_2 = this.leaves.getChild("leaf_2");
		this.leaf_tip_2 = this.leaf_2.getChild("leaf_tip_2");
		this.leaf_3 = this.leaves.getChild("leaf_3");
		this.leaf_tip_3 = this.leaf_3.getChild("leaf_tip_3");
		this.leaf_4 = this.leaves.getChild("leaf_4");
		this.leaf_tip_4 = this.leaf_4.getChild("leaf_tip_4");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData stem = body.addChild("stem", ModelPartBuilder.create().uv(4, 25).cuboid(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData stem_2 = stem.addChild("stem_2", ModelPartBuilder.create().uv(4, 18).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

		ModelPartData cube_r1 = stem_2.addChild("cube_r1", ModelPartBuilder.create().uv(25, 4).mirrored().cuboid(-5.0F, 0.0F, -2.5F, 5.0F, 0.0F, 5.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-1.0F, 0.0F, 0.0F, 0.7839F, -0.3766F, 0.2495F));

		ModelPartData cube_r2 = stem_2.addChild("cube_r2", ModelPartBuilder.create().uv(25, 4).cuboid(0.0F, 0.0F, -2.5F, 5.0F, 0.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.0F, 0.0F, 0.503F, 0.3376F, -0.2222F));

		ModelPartData stem_3 = stem_2.addChild("stem_3", ModelPartBuilder.create().uv(12, 18).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

		ModelPartData head = stem_3.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -3.0071F, -1.9867F, 10.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(3, 13).cuboid(-2.0F, -2.0071F, 0.0133F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.9929F, -1.0133F));

		ModelPartData cube_r3 = head.addChild("cube_r3", ModelPartBuilder.create().uv(40, 34).cuboid(-7.0F, -4.0F, 0.0F, 7.0F, 12.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0071F, 0.0133F, 0.0F, -0.2182F, 0.0F));

		ModelPartData cube_r4 = head.addChild("cube_r4", ModelPartBuilder.create().uv(40, 34).mirrored().cuboid(0.0F, -4.0F, 0.0F, 7.0F, 12.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(2.0F, -1.0071F, 0.0133F, 0.0F, 0.2182F, 0.0F));

		ModelPartData cube_r5 = head.addChild("cube_r5", ModelPartBuilder.create().uv(29, 0).cuboid(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.0071F, 1.0133F, 0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r6 = head.addChild("cube_r6", ModelPartBuilder.create().uv(29, 0).cuboid(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.0071F, 1.0133F, 2.8798F, 0.0F, 0.0F));

		ModelPartData cube_r7 = head.addChild("cube_r7", ModelPartBuilder.create().uv(29, 0).cuboid(-3.0F, -4.4142F, -2.4142F, 6.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -0.0071F, 3.4275F, 0.2618F, 0.0F, -1.5708F));

		ModelPartData cube_r8 = head.addChild("cube_r8", ModelPartBuilder.create().uv(29, 0).cuboid(-3.0F, -4.4142F, 2.4142F, 6.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -0.0071F, 3.4275F, 2.8798F, 0.0F, -1.5708F));

		ModelPartData cube_r9 = head.addChild("cube_r9", ModelPartBuilder.create().uv(3, 44).cuboid(-3.0F, 0.0F, -1.0F, 12.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, 1.9929F, 1.0133F, -0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r10 = head.addChild("cube_r10", ModelPartBuilder.create().uv(3, 33).cuboid(-3.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-3.0F, -1.0071F, 0.0133F, 0.3054F, 0.0F, 0.0F));

		ModelPartData eyebrows = head.addChild("eyebrows", ModelPartBuilder.create().uv(13, 13).cuboid(0.5F, -16.0F, -3.1F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 13.9929F, 1.0133F));

		ModelPartData cube_r11 = eyebrows.addChild("cube_r11", ModelPartBuilder.create().uv(13, 13).cuboid(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, -15.5F, -2.1F, 0.0F, 0.0F, -0.1745F));

		ModelPartData leaves = body.addChild("leaves", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leaf_1 = leaves.addChild("leaf_1", ModelPartBuilder.create().uv(31, 10).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.7071F, 0.0F, -0.6464F, 0.0F, -0.7854F, 0.0F));

		ModelPartData leaf_tip_1 = leaf_1.addChild("leaf_tip_1", ModelPartBuilder.create().uv(31, 16).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0F));

		ModelPartData leaf_2 = leaves.addChild("leaf_2", ModelPartBuilder.create().uv(31, 10).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.7071F, 0.0F, 0.7678F, 0.0F, -2.3562F, 0.0F));

		ModelPartData leaf_tip_2 = leaf_2.addChild("leaf_tip_2", ModelPartBuilder.create().uv(31, 16).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0F));

		ModelPartData leaf_3 = leaves.addChild("leaf_3", ModelPartBuilder.create().uv(31, 10).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-0.7071F, 0.0F, -0.6464F, 0.0F, 0.7854F, 0.0F));

		ModelPartData leaf_tip_3 = leaf_3.addChild("leaf_tip_3", ModelPartBuilder.create().uv(31, 16).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0F));

		ModelPartData leaf_4 = leaves.addChild("leaf_4", ModelPartBuilder.create().uv(31, 10).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-0.7071F, 0.0F, 0.7678F, 0.0F, 2.3562F, 0.0F));

		ModelPartData leaf_tip_4 = leaf_4.addChild("leaf_tip_4", ModelPartBuilder.create().uv(31, 16).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Marigold entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}
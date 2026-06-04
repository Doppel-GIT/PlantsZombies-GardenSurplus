// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Garlic extends EntityModel<Garlic> {
	private final ModelPart body;
	private final ModelPart bottom;
	private final ModelPart head;
	private final ModelPart interior;
	private final ModelPart tufts;
	private final ModelPart eyes;
	private final ModelPart eyebrows;
	public Garlic(ModelPart root) {
		this.body = root.getChild("body");
		this.bottom = this.body.getChild("bottom");
		this.head = this.body.getChild("head");
		this.interior = this.head.getChild("interior");
		this.tufts = this.head.getChild("tufts");
		this.eyes = this.body.getChild("eyes");
		this.eyebrows = this.body.getChild("eyebrows");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bottom = body.addChild("bottom", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -3.0F, 0.0F));

		ModelPartData cube_r1 = bottom.addChild("cube_r1", ModelPartBuilder.create().uv(40, 54).cuboid(-4.9F, -2.0F, -1.0F, 6.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(2.9F, 2.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r2 = bottom.addChild("cube_r2", ModelPartBuilder.create().uv(4, 33).cuboid(-3.9F, -1.0F, -4.0F, 8.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-0.1F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(4, 21).cuboid(-4.0F, -13.0F, -4.0F, 8.0F, 3.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r3 = head.addChild("cube_r3", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -9.0F, -1.0F, 12.0F, 9.0F, 12.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -1.0F, -5.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData interior = head.addChild("interior", ModelPartBuilder.create().uv(40, 54).cuboid(-3.0F, -12.5F, -3.0F, 6.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r4 = interior.addChild("cube_r4", ModelPartBuilder.create().uv(0, 47).cuboid(-8.9F, -7.0F, -1.0F, 10.0F, 7.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(5.4F, -2.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData tufts = head.addChild("tufts", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -15.0F, 0.0F));

		ModelPartData cube_r5 = tufts.addChild("cube_r5", ModelPartBuilder.create().uv(40, 45).cuboid(-6.0F, 0.0F, 0.0F, 12.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r6 = tufts.addChild("cube_r6", ModelPartBuilder.create().uv(40, 45).cuboid(-6.0F, -2.0F, 0.0F, 12.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		ModelPartData eyes = body.addChild("eyes", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData right_r1 = eyes.addChild("right_r1", ModelPartBuilder.create().uv(36, 21).cuboid(-2.0F, -4.0F, -1.0F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, -4.5F, -5.5F, -0.0873F, -0.5236F, 0.0F));

		ModelPartData left_r1 = eyes.addChild("left_r1", ModelPartBuilder.create().uv(48, 21).cuboid(-2.0F, -3.0F, -1.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, -4.5F, -6.0F, -0.0873F, 0.5236F, 0.0F));

		ModelPartData eyebrows = body.addChild("eyebrows", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

		ModelPartData right_r2 = eyebrows.addChild("right_r2", ModelPartBuilder.create().uv(36, 29).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.4F, -8.5F, -7.2F, -2.9112F, 0.4819F, -2.8464F));

		ModelPartData left_r2 = eyebrows.addChild("left_r2", ModelPartBuilder.create().uv(36, 29).cuboid(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.1F, -6.6F, -5.6F, -0.1872F, 0.5148F, -0.2009F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Garlic entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}
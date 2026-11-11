// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Phatbeet extends EntityModel<Entity> {
	private final ModelPart Body;
	private final ModelPart bottom;
	private final ModelPart head;
	private final ModelPart headphones;
	private final ModelPart muffs;
	private final ModelPart left;
	private final ModelPart right;
	private final ModelPart bands;
	public Phatbeet(ModelPart root) {
		this.Body = root.getChild("Body");
		this.bottom = this.Body.getChild("bottom");
		this.head = this.Body.getChild("head");
		this.headphones = this.head.getChild("headphones");
		this.muffs = this.headphones.getChild("muffs");
		this.left = this.muffs.getChild("left");
		this.right = this.muffs.getChild("right");
		this.bands = this.headphones.getChild("bands");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Body = modelPartData.addChild("Body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData bottom = Body.addChild("bottom", ModelPartBuilder.create().uv(4, 47).cuboid(-4.0F, -1.5F, -4.0F, 8.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.5F, 0.0F));

		ModelPartData head = Body.addChild("head", ModelPartBuilder.create().uv(4, 5).cuboid(-5.5F, -4.0F, -5.5F, 11.0F, 8.0F, 11.0F, new Dilation(0.0F))
		.uv(4, 31).cuboid(-4.0F, -5.0F, -4.0F, 8.0F, 1.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

		ModelPartData tufts_r1 = head.addChild("tufts_r1", ModelPartBuilder.create().uv(40, 42).cuboid(0.0F, -1.5F, -3.0F, 0.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-0.4F, -5.5F, 0.4F, 0.0F, -0.7854F, 0.0F));

		ModelPartData tufts_r2 = head.addChild("tufts_r2", ModelPartBuilder.create().uv(40, 33).cuboid(0.0F, -1.5F, -2.0F, 0.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-0.4F, -5.5F, -0.3F, 0.0F, 0.7854F, 0.0F));

		ModelPartData tufts_r3 = head.addChild("tufts_r3", ModelPartBuilder.create().uv(42, 35).cuboid(0.0F, -1.5F, -1.0F, 0.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -5.5F, 1.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData tufts_r4 = head.addChild("tufts_r4", ModelPartBuilder.create().uv(42, 35).cuboid(0.0F, -1.5F, -1.0F, 0.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -5.5F, -1.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData headphones = head.addChild("headphones", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -6.0F, 0.0F));

		ModelPartData muffs = headphones.addChild("muffs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.5F, 0.0F));

		ModelPartData left = muffs.addChild("left", ModelPartBuilder.create().uv(52, 13).cuboid(-0.6F, -2.5F, -3.0F, 1.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.9F, 0.0F, 0.0F));

		ModelPartData muff left t_r1 = left.addChild("muff left t_r1", ModelPartBuilder.create().uv(64, 35).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.8F, 0.0F, 0.0F, 0.0F, 0.2618F));

		ModelPartData muff left b_r1 = left.addChild("muff left b_r1", ModelPartBuilder.create().uv(52, 35).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.8F, 0.0F, 0.0F, 0.0F, -0.2618F));

		ModelPartData right = muffs.addChild("right", ModelPartBuilder.create(), ModelTransform.pivot(5.9333F, 0.0F, 0.0F));

		ModelPartData muff right b_r1 = right.addChild("muff right b_r1", ModelPartBuilder.create().uv(52, 35).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.0333F, 2.8F, 0.0F, 3.1416F, 0.0F, -2.8798F));

		ModelPartData muff right_r1 = right.addChild("muff right_r1", ModelPartBuilder.create().uv(52, 13).cuboid(-0.5F, -2.5F, -3.0F, 1.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0667F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData muff right t_r1 = right.addChild("muff right t_r1", ModelPartBuilder.create().uv(64, 35).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.0333F, -2.8F, 0.0F, -3.1416F, 0.0F, 2.8798F));

		ModelPartData bands = headphones.addChild("bands", ModelPartBuilder.create().uv(40, 35).cuboid(-4.7F, -1.4F, -0.5F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 31).cuboid(-6.0F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right 1_r1 = bands.addChild("right 1_r1", ModelPartBuilder.create().uv(46, 31).cuboid(-2.7249F, 0.3107F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData right 2_r1 = bands.addChild("right 2_r1", ModelPartBuilder.create().uv(40, 35).cuboid(-1.7F, -1.7F, -0.5F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 31).cuboid(-3.0F, -0.3F, -0.5F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 0.3F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		ModelPartData right 3_r1 = bands.addChild("right 3_r1", ModelPartBuilder.create().uv(40, 28).cuboid(-2.3385F, -0.0757F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 0.3F, 0.0F, 3.1416F, 0.0F, 2.3562F));

		ModelPartData left 3_r1 = bands.addChild("left 3_r1", ModelPartBuilder.create().uv(40, 28).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.6F, -0.7F, -0.5F, 0.0F, 0.0F, 0.7854F));

		ModelPartData left 1_r1 = bands.addChild("left 1_r1", ModelPartBuilder.create().uv(46, 31).cuboid(-0.9596F, -1.846F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2268F, 0.5768F, -0.5F, 3.1416F, 0.0F, 2.3562F));

		ModelPartData centerpiece_r1 = bands.addChild("centerpiece_r1", ModelPartBuilder.create().uv(46, 31).cuboid(-0.5F, -1.5F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0464F, 1.5F, -0.5F, -3.1416F, 0.0F, 3.1416F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}
// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Stallia extends EntityModel<Entity> {
	private final ModelPart Body;
	private final ModelPart head;
	private final ModelPart stem;
	private final ModelPart stem leaves;
	private final ModelPart petals;
	private final ModelPart left;
	private final ModelPart right;
	private final ModelPart top;
	private final ModelPart bottom;
	private final ModelPart leaves;
	private final ModelPart leaf_1;
	private final ModelPart leaf_tip_1;
	private final ModelPart leaf_2;
	private final ModelPart leaf_tip_2;
	private final ModelPart leaf_3;
	private final ModelPart leaf_tip_3;
	private final ModelPart leaf_4;
	private final ModelPart leaf_tip_4;
	public Stallia(ModelPart root) {
		this.Body = root.getChild("Body");
		this.head = this.Body.getChild("head");
		this.stem = this.Body.getChild("stem");
		this.stem leaves = this.Body.getChild("stem leaves");
		this.petals = this.Body.getChild("petals");
		this.left = this.petals.getChild("left");
		this.right = this.petals.getChild("right");
		this.top = this.petals.getChild("top");
		this.bottom = this.petals.getChild("bottom");
		this.leaves = root.getChild("leaves");
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
		ModelPartData Body = modelPartData.addChild("Body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 18.5F, 0.0F));

		ModelPartData head = Body.addChild("head", ModelPartBuilder.create().uv(24, 12).cuboid(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.5F, 0.0F));

		ModelPartData stem = Body.addChild("stem", ModelPartBuilder.create().uv(20, 32).cuboid(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 5.5F, 0.0F));

		ModelPartData stem leaves = Body.addChild("stem leaves", ModelPartBuilder.create(), ModelTransform.of(0.0F, 3.5F, 0.0F, -1.5708F, 0.0F, 0.0F));

		ModelPartData leaf_r1 = stem leaves.addChild("leaf_r1", ModelPartBuilder.create().uv(52, 25).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.5F, 0.0F, -1.5708F, 0.5236F, -1.5708F));

		ModelPartData leaf_r2 = stem leaves.addChild("leaf_r2", ModelPartBuilder.create().uv(52, 25).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 0.0F, 0.0F, -1.5708F, 0.5236F, -3.1416F));

		ModelPartData leaf_r3 = stem leaves.addChild("leaf_r3", ModelPartBuilder.create().uv(52, 25).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.5F, 0.0F, -1.5708F, 0.5236F, 1.5708F));

		ModelPartData leaf_r4 = stem leaves.addChild("leaf_r4", ModelPartBuilder.create().uv(52, 25).cuboid(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 0.0F, 0.0F, -1.5708F, 0.5236F, 0.0F));

		ModelPartData petals = Body.addChild("petals", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.519F, 0.4358F));

		ModelPartData left = petals.addChild("left", ModelPartBuilder.create(), ModelTransform.of(-4.9F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		ModelPartData BL_r1 = left.addChild("BL_r1", ModelPartBuilder.create().uv(36, 40).cuboid(-2.5F, -5.0F, 0.0F, 6.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1337F, 0.0F, 0.65F, 0.0F, -0.5236F, 0.0F));

		ModelPartData BM_r1 = left.addChild("BM_r1", ModelPartBuilder.create().uv(38, 28).cuboid(-2.5F, -6.0F, 0.0F, 5.0F, 11.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1337F, 0.5F, 2.65F, 0.0F, -0.6545F, 0.0F));

		ModelPartData B_r1 = left.addChild("B_r1", ModelPartBuilder.create().uv(30, 30).cuboid(-0.5F, -3.0F, 0.0F, 3.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5663F, -1.0F, 2.75F, 0.0F, -0.7854F, 0.0F));

		ModelPartData FL_r1 = left.addChild("FL_r1", ModelPartBuilder.create().uv(36, 40).cuboid(-2.5F, -5.0F, 0.0F, 6.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1337F, 0.0F, -0.55F, 0.0F, 0.5236F, 0.0F));

		ModelPartData FM_r1 = left.addChild("FM_r1", ModelPartBuilder.create().uv(38, 28).cuboid(-2.5F, -6.0F, 0.0F, 5.0F, 11.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1337F, 0.5F, -2.65F, 0.0F, 0.6545F, 0.0F));

		ModelPartData F_r1 = left.addChild("F_r1", ModelPartBuilder.create().uv(30, 30).cuboid(-0.5F, -3.0F, 0.0F, 3.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5663F, -1.0F, -2.75F, 0.0F, 0.7854F, 0.0F));

		ModelPartData right = petals.addChild("right", ModelPartBuilder.create(), ModelTransform.pivot(4.9F, 0.0F, 0.0F));

		ModelPartData BL_r2 = right.addChild("BL_r2", ModelPartBuilder.create().uv(36, 40).cuboid(-2.5F, -5.0F, 0.0F, 6.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1336F, 0.0F, 0.55F, 0.0F, -0.5236F, 0.0F));

		ModelPartData BM_r2 = right.addChild("BM_r2", ModelPartBuilder.create().uv(38, 28).cuboid(-2.5F, -6.0F, 0.0F, 5.0F, 11.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1336F, 0.5F, 2.65F, 0.0F, -0.6545F, 0.0F));

		ModelPartData B_r2 = right.addChild("B_r2", ModelPartBuilder.create().uv(30, 30).cuboid(-0.5F, -3.0F, 0.0F, 3.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5664F, -1.0F, 2.75F, 0.0F, -0.7854F, 0.0F));

		ModelPartData FL_r2 = right.addChild("FL_r2", ModelPartBuilder.create().uv(36, 40).cuboid(-2.5F, -5.0F, 0.0F, 6.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1336F, 0.0F, -0.55F, 0.0F, 0.5236F, 0.0F));

		ModelPartData FM_r2 = right.addChild("FM_r2", ModelPartBuilder.create().uv(38, 28).cuboid(-2.5F, -6.0F, 0.0F, 5.0F, 11.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1336F, 0.5F, -2.65F, 0.0F, 0.6545F, 0.0F));

		ModelPartData F_r2 = right.addChild("F_r2", ModelPartBuilder.create().uv(30, 30).cuboid(-0.5F, -3.0F, 0.0F, 3.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5664F, -1.0F, -2.75F, 0.0F, 0.7854F, 0.0F));

		ModelPartData top = petals.addChild("top", ModelPartBuilder.create(), ModelTransform.of(0.0F, -4.9F, 0.0F, 0.0F, 0.0F, -1.5708F));

		ModelPartData BL_r3 = top.addChild("BL_r3", ModelPartBuilder.create().uv(36, 40).cuboid(-2.5F, -5.0F, 0.0F, 6.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1336F, 0.0F, 0.55F, 0.0F, -0.5236F, 0.0F));

		ModelPartData BM_r3 = top.addChild("BM_r3", ModelPartBuilder.create().uv(38, 28).cuboid(-2.5F, -6.0F, 0.0F, 5.0F, 11.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1336F, 0.5F, 2.65F, 0.0F, -0.6545F, 0.0F));

		ModelPartData B_r3 = top.addChild("B_r3", ModelPartBuilder.create().uv(30, 30).cuboid(-0.5F, -3.0F, 0.0F, 3.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5663F, -1.0F, 2.75F, 0.0F, -0.7854F, 0.0F));

		ModelPartData FL_r3 = top.addChild("FL_r3", ModelPartBuilder.create().uv(36, 40).cuboid(-2.5F, -5.0F, 0.0F, 6.0F, 10.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1336F, 0.0F, -0.55F, 0.0F, 0.5236F, 0.0F));

		ModelPartData FM_r3 = top.addChild("FM_r3", ModelPartBuilder.create().uv(38, 28).cuboid(-2.5F, -6.0F, 0.0F, 5.0F, 11.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.1336F, 0.5F, -2.65F, 0.0F, 0.6545F, 0.0F));

		ModelPartData F_r3 = top.addChild("F_r3", ModelPartBuilder.create().uv(30, 30).cuboid(-0.5F, -3.0F, 0.0F, 3.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.5663F, -1.0F, -2.75F, 0.0F, 0.7854F, 0.0F));

		ModelPartData bottom = petals.addChild("bottom", ModelPartBuilder.create(), ModelTransform.of(0.0F, -0.319F, 0.0642F, 0.0F, 0.0F, 1.5708F));

		ModelPartData B_r4 = bottom.addChild("B_r4", ModelPartBuilder.create().uv(30, 30).cuboid(-0.5F, -3.0F, 0.0F, 3.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.6964F, -1.3628F, 2.75F, 0.0F, -0.7854F, 0.0F));

		ModelPartData F_r4 = bottom.addChild("F_r4", ModelPartBuilder.create().uv(30, 30).cuboid(-0.5F, -3.0F, 0.0F, 3.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.6964F, -0.8628F, -2.75F, 0.0F, 0.7854F, 0.0F));

		ModelPartData leaves = modelPartData.addChild("leaves", ModelPartBuilder.create(), ModelTransform.pivot(-1.5F, 24.0F, 1.5F));

		ModelPartData leaf_1 = leaves.addChild("leaf_1", ModelPartBuilder.create().uv(46, 12).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(2.4495F, 0.0F, -1.8793F, 0.0F, -0.7854F, 0.0F));

		ModelPartData leaf_tip_1 = leaf_1.addChild("leaf_tip_1", ModelPartBuilder.create().uv(46, 18).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0F));

		ModelPartData leaf_2 = leaves.addChild("leaf_2", ModelPartBuilder.create().uv(46, 12).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(2.4495F, 0.0F, -0.4651F, 0.0F, -2.3562F, 0.0F));

		ModelPartData leaf_tip_2 = leaf_2.addChild("leaf_tip_2", ModelPartBuilder.create().uv(46, 18).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0F));

		ModelPartData leaf_3 = leaves.addChild("leaf_3", ModelPartBuilder.create().uv(46, 12).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.0352F, 0.0F, -1.8793F, 0.0F, 0.7854F, 0.0F));

		ModelPartData leaf_tip_3 = leaf_3.addChild("leaf_tip_3", ModelPartBuilder.create().uv(46, 18).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0F));

		ModelPartData leaf_4 = leaves.addChild("leaf_4", ModelPartBuilder.create().uv(46, 12).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(1.0352F, 0.0F, -0.4651F, 0.0F, 2.3562F, 0.0F));

		ModelPartData leaf_tip_4 = leaf_4.addChild("leaf_tip_4", ModelPartBuilder.create().uv(46, 18).cuboid(-3.0F, 0.0F, -6.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -6.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leaves.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}
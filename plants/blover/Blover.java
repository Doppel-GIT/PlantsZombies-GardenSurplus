// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class Blover extends EntityModel<Entity> {
	private final ModelPart body;
	private final ModelPart leaves;
	private final ModelPart leaf 1;
	private final ModelPart leaf 2;
	private final ModelPart leaf 3;
	private final ModelPart neck;
	private final ModelPart bottom;
	private final ModelPart middle;
	private final ModelPart top;
	private final ModelPart head;
	private final ModelPart propeller;
	private final ModelPart Left Propeller;
	private final ModelPart Right Propeller;
	private final ModelPart Top Propeller;
	public Blover(ModelPart root) {
		this.body = root.getChild("body");
		this.leaves = this.body.getChild("leaves");
		this.leaf 1 = this.leaves.getChild("leaf 1");
		this.leaf 2 = this.leaves.getChild("leaf 2");
		this.leaf 3 = this.leaves.getChild("leaf 3");
		this.neck = this.body.getChild("neck");
		this.bottom = this.neck.getChild("bottom");
		this.middle = this.neck.getChild("middle");
		this.top = this.neck.getChild("top");
		this.head = this.body.getChild("head");
		this.propeller = this.body.getChild("propeller");
		this.Left Propeller = this.propeller.getChild("Left Propeller");
		this.Right Propeller = this.propeller.getChild("Right Propeller");
		this.Top Propeller = this.propeller.getChild("Top Propeller");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData leaves = body.addChild("leaves", ModelPartBuilder.create(), ModelTransform.pivot(3.0F, 0.0F, 0.0F));

		ModelPartData leaf 1 = leaves.addChild("leaf 1", ModelPartBuilder.create(), ModelTransform.of(-5.5F, 1.3F, -4.0F, 0.0F, 0.5236F, 0.0F));

		ModelPartData cube_r1 = leaf 1.addChild("cube_r1", ModelPartBuilder.create().uv(27, 7).cuboid(-5.5F, 0.1F, -1.0F, 9.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.4F, -1.9F, 2.7925F, 0.0F, 3.1416F));

		ModelPartData cube_r2 = leaf 1.addChild("cube_r2", ModelPartBuilder.create().uv(24, 10).cuboid(-5.5F, 0.0F, -2.5F, 9.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -0.3F, 2.2F, -2.7925F, 0.0F, -3.1416F));

		ModelPartData leaf 2 = leaves.addChild("leaf 2", ModelPartBuilder.create(), ModelTransform.of(-5.5F, 1.3F, 4.0F, 0.0F, 2.618F, 0.0F));

		ModelPartData cube_r3 = leaf 2.addChild("cube_r3", ModelPartBuilder.create().uv(27, 7).cuboid(-5.5F, 0.5F, -1.1F, 9.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.0F, -1.9F, 2.7925F, 0.0F, 3.1416F));

		ModelPartData cube_r4 = leaf 2.addChild("cube_r4", ModelPartBuilder.create().uv(24, 10).cuboid(-5.5F, 0.0F, -2.5F, 9.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -0.3F, 2.2F, -2.7925F, 0.0F, -3.1416F));

		ModelPartData leaf 3 = leaves.addChild("leaf 3", ModelPartBuilder.create(), ModelTransform.of(1.5F, 1.3F, 0.3F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r5 = leaf 3.addChild("cube_r5", ModelPartBuilder.create().uv(27, 7).cuboid(-5.5F, 0.1F, -1.0F, 9.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 0.4F, -1.9F, 2.7925F, 0.0F, 3.1416F));

		ModelPartData cube_r6 = leaf 3.addChild("cube_r6", ModelPartBuilder.create().uv(24, 10).cuboid(-5.5F, 0.0F, -2.5F, 9.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -0.3F, 2.2F, -2.7925F, 0.0F, -3.1416F));

		ModelPartData neck = body.addChild("neck", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bottom = neck.addChild("bottom", ModelPartBuilder.create().uv(48, 9).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, 0.0F));

		ModelPartData middle = neck.addChild("middle", ModelPartBuilder.create().uv(56, 9).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 7.0F, 0.0F));

		ModelPartData top = neck.addChild("top", ModelPartBuilder.create().uv(48, 2).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -2.5F, -4.5F, 4.0F, 9.0F, 9.0F, new Dilation(0.0F))
		.uv(0, 18).cuboid(-1.5F, -3.0F, -4.9F, 3.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 17.0F, 0.0F));

		ModelPartData propeller = body.addChild("propeller", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 18.0F, 0.0F));

		ModelPartData Left Propeller = propeller.addChild("Left Propeller", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -3.5366F, 7.4366F));

		ModelPartData cube_r7 = Left Propeller.addChild("cube_r7", ModelPartBuilder.create().uv(32, 18).cuboid(-0.5F, -3.1F, -4.9F, 1.0F, 6.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.1366F, -0.0366F, -0.5236F, 0.0F, 0.0F));

		ModelPartData Right Propeller = propeller.addChild("Right Propeller", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -3.45F, -7.3134F));

		ModelPartData cube_r8 = Right Propeller.addChild("cube_r8", ModelPartBuilder.create().uv(32, 18).cuboid(-0.5F, -3.0F, -5.0F, 1.0F, 6.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -2.618F, 0.0F, 0.0F));

		ModelPartData Top Propeller = propeller.addChild("Top Propeller", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 9.0F, 0.0F));

		ModelPartData cube_r9 = Top Propeller.addChild("cube_r9", ModelPartBuilder.create().uv(32, 18).cuboid(-0.5F, -3.0F, -5.0F, 1.0F, 6.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}
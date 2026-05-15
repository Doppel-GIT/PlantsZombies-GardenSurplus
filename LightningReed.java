// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class LightningReed extends EntityModel<Entity> {
	private final ModelPart body_reed;
	private final ModelPart head_reed;
	private final ModelPart eyebrows_reed;
	private final ModelPart head_segments_reed;
	private final ModelPart neck_reed;
	private final ModelPart head_spike_reed;
	private final ModelPart leaves_reed;
	private final ModelPart leaf_left_reed;
	private final ModelPart leaf_right_reed;
	private final ModelPart leaf_front_reed;
	private final ModelPart leaf_back_reed;
	private final ModelPart stump_reed;
	public LightningReed(ModelPart root) {
		this.body_reed = root.getChild("body_reed");
		this.head_reed = this.body_reed.getChild("head_reed");
		this.eyebrows_reed = this.head_reed.getChild("eyebrows_reed");
		this.head_segments_reed = this.head_reed.getChild("head_segments_reed");
		this.neck_reed = this.head_reed.getChild("neck_reed");
		this.head_spike_reed = this.head_reed.getChild("head_spike_reed");
		this.leaves_reed = this.body_reed.getChild("leaves_reed");
		this.leaf_left_reed = this.leaves_reed.getChild("leaf_left_reed");
		this.leaf_right_reed = this.leaves_reed.getChild("leaf_right_reed");
		this.leaf_front_reed = this.leaves_reed.getChild("leaf_front_reed");
		this.leaf_back_reed = this.leaves_reed.getChild("leaf_back_reed");
		this.stump_reed = this.body_reed.getChild("stump_reed");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body_reed = modelPartData.addChild("body_reed", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData head_reed = body_reed.addChild("head_reed", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData eyebrows_reed = head_reed.addChild("eyebrows_reed", ModelPartBuilder.create().uv(34, 27).cuboid(0.25F, -17.0F, 5.6F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData eyebrow_left_r1 = eyebrows_reed.addChild("eyebrow_left_r1", ModelPartBuilder.create().uv(34, 27).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.25F, -18.0F, 6.6F, 0.0F, 0.0F, -3.1416F));

		ModelPartData head_segments_reed = head_reed.addChild("head_segments_reed", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head_main_r1 = head_segments_reed.addChild("head_main_r1", ModelPartBuilder.create().uv(26, 12).cuboid(-1.0F, -8.0F, -1.0F, 3.0F, 8.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -10.5F, 4.5F, 0.0F, 1.5708F, 0.0F));

		ModelPartData neck_reed = head_reed.addChild("neck_reed", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData neck_r1 = neck_reed.addChild("neck_r1", ModelPartBuilder.create().uv(6, 5).cuboid(-1.0F, -10.0F, -6.0F, 0.0F, 10.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, -2.0F, -0.5F, 3.1416F, 0.0F, 3.1416F));

		ModelPartData head_spike_reed = head_reed.addChild("head_spike_reed", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head_spike_r1 = head_spike_reed.addChild("head_spike_r1", ModelPartBuilder.create().uv(26, 23).cuboid(1.8F, -19.4F, 4.2F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.2F, 0.0F, 1.2F, 0.0F, -1.5708F, 0.0F));

		ModelPartData leaves_reed = body_reed.addChild("leaves_reed", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leaf_left_reed = leaves_reed.addChild("leaf_left_reed", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 1.0F));

		ModelPartData leaf_left_r1 = leaf_left_reed.addChild("leaf_left_r1", ModelPartBuilder.create().uv(37, 0).cuboid(0.0F, -6.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData leaf_right_reed = leaves_reed.addChild("leaf_right_reed", ModelPartBuilder.create().uv(37, 0).cuboid(2.0F, -6.0F, -2.0F, 1.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leaf_front_reed = leaves_reed.addChild("leaf_front_reed", ModelPartBuilder.create().uv(26, 6).cuboid(-2.0F, -4.0F, 2.0F, 4.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leaf_back_reed = leaves_reed.addChild("leaf_back_reed", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leaf_back_r1 = leaf_back_reed.addChild("leaf_back_r1", ModelPartBuilder.create().uv(26, 6).cuboid(-2.0F, -4.0F, 1.0F, 4.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, -1.0F, 3.1416F, 0.0F, 3.1416F));

		ModelPartData stump_reed = body_reed.addChild("stump_reed", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData stump_r1 = stump_reed.addChild("stump_r1", ModelPartBuilder.create().uv(6, 4).cuboid(-3.0F, -2.0F, 1.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body_reed.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}
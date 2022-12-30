public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer perna1;
	private final ModelRenderer perna2;
	private final ModelRenderer braco1;
	private final ModelRenderer braco2;
	private final ModelRenderer bb_main;

	public Modelcustom_model() {
		textureWidth = 16;
		textureHeight = 16;

		perna1 = new ModelRenderer(this);
		perna1.setRotationPoint(0.0F, 24.0F, 0.0F);
		perna1.setTextureOffset(12, 0).addBox(-2.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		perna2 = new ModelRenderer(this);
		perna2.setRotationPoint(0.0F, 24.0F, 0.0F);
		perna2.setTextureOffset(12, 0).addBox(1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		braco1 = new ModelRenderer(this);
		braco1.setRotationPoint(0.0F, 24.0F, 0.0F);
		braco1.setTextureOffset(12, 0).addBox(2.0F, -11.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		braco2 = new ModelRenderer(this);
		braco2.setRotationPoint(0.0F, 24.0F, 0.0F);
		braco2.setTextureOffset(12, 0).addBox(-3.0F, -11.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-2.0F, -14.0F, 0.0F, 4.0F, 9.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 13).addBox(-2.0F, -15.0F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		perna1.render(matrixStack, buffer, packedLight, packedOverlay);
		perna2.render(matrixStack, buffer, packedLight, packedOverlay);
		braco1.render(matrixStack, buffer, packedLight, packedOverlay);
		braco2.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
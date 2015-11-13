package makeo.gadomancy.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAuraPylonBottom extends ModelBase {

    ModelRenderer outerpylon;
    ModelRenderer lowerconduit;
    ModelRenderer inlower1;
    ModelRenderer inlower2;
    ModelRenderer upperconduit;
    ModelRenderer inupper2;
    ModelRenderer inupper1;
    ModelRenderer outuppersmooth1;
    ModelRenderer outuppersmooth2;
    ModelRenderer inuppersmooth1;
    ModelRenderer inuppersmooth2;
    ModelRenderer outlowersmooth2;
    ModelRenderer outlowersmooth1;
    ModelRenderer inlowersmooth1;
    ModelRenderer inlowersmooth2;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;

    public ModelAuraPylonBottom() {
        textureWidth = 32;
        textureHeight = 32;

        outerpylon = new ModelRenderer(this, 0, 0);
        outerpylon.addBox(0F, 0F, 0F, 2, 16, 2);
        outerpylon.setRotationPoint(5F, 8F, 5F);
        outerpylon.setTextureSize(64, 32);
        outerpylon.mirror = true;
        setRotation(outerpylon, 0F, 0F, 0F);
        lowerconduit = new ModelRenderer(this, 8, 0);
        lowerconduit.addBox(0F, 0F, 0.2F, 6, 1, 1);
        lowerconduit.setRotationPoint(6F, 20F, 7F);
        lowerconduit.setTextureSize(64, 32);
        lowerconduit.mirror = true;
        setRotation(lowerconduit, 0F, 2.356194F, 0F);
        inlower1 = new ModelRenderer(this, 8, 2);
        inlower1.addBox(0F, 0F, 0F, 1, 1, 3);
        inlower1.setRotationPoint(3F, 20F, 3F);
        inlower1.setTextureSize(64, 32);
        inlower1.mirror = true;
        setRotation(inlower1, 0F, 3.141593F, 0F);
        inlower2 = new ModelRenderer(this, 8, 2);
        inlower2.addBox(0F, 0F, 0F, 3, 1, 1);
        inlower2.setRotationPoint(3F, 20F, 3F);
        inlower2.setTextureSize(64, 32);
        inlower2.mirror = true;
        setRotation(inlower2, 0F, 3.141593F, 0F);
        upperconduit = new ModelRenderer(this, 8, 0);
        upperconduit.addBox(0F, 0F, 0.2F, 6, 1, 1);
        upperconduit.setRotationPoint(6F, 11F, 7F);
        upperconduit.setTextureSize(64, 32);
        upperconduit.mirror = true;
        setRotation(upperconduit, 0F, 2.356194F, 0F);
        inupper2 = new ModelRenderer(this, 8, 2);
        inupper2.addBox(0F, 0F, 0F, 3, 1, 1);
        inupper2.setRotationPoint(3F, 11F, 3F);
        inupper2.setTextureSize(64, 32);
        inupper2.mirror = true;
        setRotation(inupper2, 0F, 3.141593F, 0F);
        inupper1 = new ModelRenderer(this, 8, 2);
        inupper1.addBox(0F, 0F, 0F, 1, 1, 3);
        inupper1.setRotationPoint(3F, 11F, 3F);
        inupper1.setTextureSize(64, 32);
        inupper1.mirror = true;
        setRotation(inupper1, 0F, 3.141593F, 0F);
        outuppersmooth1 = new ModelRenderer(this, 8, 6);
        outuppersmooth1.addBox(-0.5F, 0F, 0.2F, 2, 1, 1);
        outuppersmooth1.setRotationPoint(6F, 11F, 6F);
        outuppersmooth1.setTextureSize(64, 32);
        outuppersmooth1.mirror = true;
        setRotation(outuppersmooth1, 0F, 2.792527F, 0F);
        outuppersmooth2 = new ModelRenderer(this, 8, 6);
        outuppersmooth2.addBox(0F, 0F, 0.1F, 2, 1, 1);
        outuppersmooth2.setRotationPoint(5F, 11F, 7F);
        outuppersmooth2.setTextureSize(64, 32);
        outuppersmooth2.mirror = true;
        setRotation(outuppersmooth2, 0F, 1.919862F, 0F);
        inuppersmooth1 = new ModelRenderer(this, 8, 6);
        inuppersmooth1.addBox(0.25F, 0F, -0.5F, 1, 1, 2);
        inuppersmooth1.setRotationPoint(2F, 11F, 2F);
        inuppersmooth1.setTextureSize(64, 32);
        inuppersmooth1.mirror = true;
        setRotation(inuppersmooth1, 0F, 0.3490659F, 0F);
        inuppersmooth2 = new ModelRenderer(this, 8, 6);
        inuppersmooth2.addBox(0.15F, 0F, 0.3F, 1, 1, 2);
        inuppersmooth2.setRotationPoint(1F, 11F, 3F);
        inuppersmooth2.setTextureSize(64, 32);
        inuppersmooth2.mirror = true;
        setRotation(inuppersmooth2, 0F, 1.22173F, 0F);
        outlowersmooth2 = new ModelRenderer(this, 8, 6);
        outlowersmooth2.addBox(0F, 0F, 0.1F, 2, 1, 1);
        outlowersmooth2.setRotationPoint(5F, 20F, 7F);
        outlowersmooth2.setTextureSize(64, 32);
        outlowersmooth2.mirror = true;
        setRotation(outlowersmooth2, 0F, 1.919862F, 0F);
        outlowersmooth1 = new ModelRenderer(this, 8, 6);
        outlowersmooth1.addBox(-0.5F, 0F, 0.2F, 2, 1, 1);
        outlowersmooth1.setRotationPoint(6F, 20F, 6F);
        outlowersmooth1.setTextureSize(64, 32);
        outlowersmooth1.mirror = true;
        setRotation(outlowersmooth1, 0F, 2.792527F, 0F);
        inlowersmooth1 = new ModelRenderer(this, 8, 6);
        inlowersmooth1.addBox(0.25F, 0F, -0.5F, 1, 1, 2);
        inlowersmooth1.setRotationPoint(2F, 20F, 2F);
        inlowersmooth1.setTextureSize(64, 32);
        inlowersmooth1.mirror = true;
        setRotation(inlowersmooth1, 0F, 0.3490659F, 0F);
        inlowersmooth2 = new ModelRenderer(this, 8, 6);
        inlowersmooth2.addBox(0.15F, 0F, 0.3F, 1, 1, 2);
        inlowersmooth2.setRotationPoint(1F, 20F, 3F);
        inlowersmooth2.setTextureSize(64, 32);
        inlowersmooth2.mirror = true;
        setRotation(inlowersmooth2, 0F, 1.22173F, 0F);
        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(0F, 0F, 0F, 8, 1, 8);
        Shape1.setRotationPoint(0F, 23F, 0F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 0, 0);
        Shape2.addBox(0F, 0.3F, 0F, 2, 1, 3);
        Shape2.setRotationPoint(5F, 23F, 4F);
        Shape2.setTextureSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 1.308997F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 0, 0);
        Shape3.addBox(0F, -0.5F, 0.08F, 2, 3, 1);
        Shape3.setRotationPoint(6F, 21F, 7F);
        Shape3.setTextureSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0.2617994F, 1.570796F, 0F);
        Shape4 = new ModelRenderer(this, 0, 0);
        Shape4.addBox(0F, -0.3F, 0.08F, 2, 3, 1);
        Shape4.setRotationPoint(5F, 21F, 6F);
        Shape4.setTextureSize(64, 32);
        Shape4.mirror = true;
        setRotation(Shape4, 0.2617994F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 0, 0);
        Shape5.addBox(0F, -0.8F, 0.86F, 2, 3, 1);
        Shape5.setRotationPoint(4F, 21F, 7F);
        Shape5.setTextureSize(64, 32);
        Shape5.mirror = true;
        setRotation(Shape5, -0.2617994F, 1.570796F, 0F);
        Shape6 = new ModelRenderer(this, 0, 0);
        Shape6.addBox(0F, 0F, 0.2F, 2, 1, 6);
        Shape6.setRotationPoint(-1F, 22F, 0F);
        Shape6.setTextureSize(64, 32);
        Shape6.mirror = true;
        setRotation(Shape6, -0.1630138F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        outerpylon.render(f5);
        lowerconduit.render(f5);
        inlower1.render(f5);
        inlower2.render(f5);
        upperconduit.render(f5);
        inupper2.render(f5);
        inupper1.render(f5);
        outuppersmooth1.render(f5);
        outuppersmooth2.render(f5);
        inuppersmooth1.render(f5);
        inuppersmooth2.render(f5);
        outlowersmooth2.render(f5);
        outlowersmooth1.render(f5);
        inlowersmooth1.render(f5);
        inlowersmooth2.render(f5);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
        Shape6.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }


}

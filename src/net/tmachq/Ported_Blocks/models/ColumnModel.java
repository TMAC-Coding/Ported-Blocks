package net.tmachq.Ported_Blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ColumnModel extends ModelBase
{
  //fields
    ModelRenderer side1;
    ModelRenderer side2;
    ModelRenderer side3;
    ModelRenderer side4;
    ModelRenderer bottom;
    ModelRenderer top;
    ModelRenderer corner1;
    ModelRenderer corner2;
    ModelRenderer corner3;
    ModelRenderer corner4;
  
  public ColumnModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      side1 = new ModelRenderer(this, 0, 55);
      side1.addBox(0F, 0F, 0F, 16, 1, 8);
      side1.setRotationPoint(-6F, 24F, -4F);
      side1.setTextureSize(64, 64);
      side1.mirror = true;
      setRotation(side1, 0F, 0F, -1.570796F);
      side2 = new ModelRenderer(this, 0, 55);
      side2.addBox(0F, 0F, 0F, 16, 1, 8);
      side2.setRotationPoint(5F, 24F, -4F);
      side2.setTextureSize(64, 64);
      side2.mirror = true;
      setRotation(side2, 0F, 0F, -1.570796F);
      side3 = new ModelRenderer(this, 0, 55);
      side3.addBox(0F, 0F, 0F, 16, 1, 8);
      side3.setRotationPoint(4F, 24F, 5F);
      side3.setTextureSize(64, 64);
      side3.mirror = true;
      setRotation(side3, 1.570796F, 0F, -1.570796F);
      side4 = new ModelRenderer(this, 0, 55);
      side4.addBox(0F, 0F, 0F, 16, 1, 8);
      side4.setRotationPoint(4F, 24F, -6F);
      side4.setTextureSize(64, 64);
      side4.mirror = true;
      setRotation(side4, 1.570796F, 0F, -1.570796F);
      bottom = new ModelRenderer(this, 0, 0);
      bottom.addBox(0F, 0F, 0F, 10, 1, 10);
      bottom.setRotationPoint(-5F, 23F, -5F);
      bottom.setTextureSize(64, 64);
      bottom.mirror = true;
      setRotation(bottom, 0F, 0F, 0F);
      top = new ModelRenderer(this, 0, 0);
      top.addBox(0F, 0F, 0F, 10, 1, 10);
      top.setRotationPoint(-5F, 8F, -5F);
      top.setTextureSize(64, 64);
      top.mirror = true;
      setRotation(top, 0F, 0F, 0F);
      corner1 = new ModelRenderer(this, 0, 27);
      corner1.addBox(0F, 0F, 0F, 1, 16, 1);
      corner1.setRotationPoint(-5F, 8F, -5F);
      corner1.setTextureSize(64, 64);
      corner1.mirror = true;
      setRotation(corner1, 0F, 0F, 0F);
      corner2 = new ModelRenderer(this, 0, 27);
      corner2.addBox(0F, 0F, 0F, 1, 16, 1);
      corner2.setRotationPoint(-5F, 8F, 4F);
      corner2.setTextureSize(64, 64);
      corner2.mirror = true;
      setRotation(corner2, 0F, 0F, 0F);
      corner3 = new ModelRenderer(this, 0, 27);
      corner3.addBox(0F, 0F, 0F, 1, 16, 1);
      corner3.setRotationPoint(4F, 8F, 4F);
      corner3.setTextureSize(64, 64);
      corner3.mirror = true;
      setRotation(corner3, 0F, 0F, 0F);
      corner4 = new ModelRenderer(this, 0, 27);
      corner4.addBox(0F, 0F, 0F, 1, 16, 1);
      corner4.setRotationPoint(4F, 8F, -5F);
      corner4.setTextureSize(64, 64);
      corner4.mirror = true;
      setRotation(corner4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    side1.render(f5);
    side2.render(f5);
    side3.render(f5);
    side4.render(f5);
    bottom.render(f5);
    top.render(f5);
    corner1.render(f5);
    corner2.render(f5);
    corner3.render(f5);
    corner4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}

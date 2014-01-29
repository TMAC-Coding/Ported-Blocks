package net.tmachq.Ported_Blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BarStoolModel extends ModelBase
{
  //fields
    ModelRenderer Leg_1;
    ModelRenderer Leg_2;
    ModelRenderer Leg_4;
    ModelRenderer Leg_3;
    ModelRenderer Seat;
    ModelRenderer Support_1;
    ModelRenderer Support_2;
    ModelRenderer Support_3;
  
  public BarStoolModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Leg_1 = new ModelRenderer(this, 0, 31);
      Leg_1.addBox(0F, 0F, 0F, 1, 1, 16);
      Leg_1.setRotationPoint(-4F, 9F, -4F);
      Leg_1.setTextureSize(64, 64);
      Leg_1.mirror = true;
      setRotation(Leg_1, -1.762782F, 0.1919862F, 0.1919862F);
      Leg_2 = new ModelRenderer(this, 0, 31);
      Leg_2.addBox(0F, 0F, 0F, 1, 1, 16);
      Leg_2.setRotationPoint(3F, 9F, -4F);
      Leg_2.setTextureSize(64, 64);
      Leg_2.mirror = true;
      setRotation(Leg_2, -1.762782F, -0.1919862F, -0.1919862F);
      Leg_4 = new ModelRenderer(this, 0, 31);
      Leg_4.addBox(0F, 0F, 0F, 1, 1, 16);
      Leg_4.setRotationPoint(4F, 9F, 4F);
      Leg_4.setTextureSize(64, 64);
      Leg_4.mirror = true;
      setRotation(Leg_4, -1.37881F, -0.1919862F, -0.1919862F);
      Leg_3 = new ModelRenderer(this, 0, 31);
      Leg_3.addBox(0F, 0F, 0F, 1, 1, 16);
      Leg_3.setRotationPoint(-4F, 9F, 5F);
      Leg_3.setTextureSize(64, 64);
      Leg_3.mirror = true;
      setRotation(Leg_3, -1.37881F, -0.1919862F, 0.1919862F);
      Seat = new ModelRenderer(this, 0, 0);
      Seat.addBox(0F, 0F, 0F, 12, 2, 12);
      Seat.setRotationPoint(-6F, 8F, -6F);
      Seat.setTextureSize(64, 64);
      Seat.mirror = true;
      setRotation(Seat, 0F, 0F, 0F);
      Support_1 = new ModelRenderer(this, 0, 15);
      Support_1.addBox(0F, 0F, 0F, 1, 1, 12);
      Support_1.setRotationPoint(5F, 17F, -6F);
      Support_1.setTextureSize(64, 64);
      Support_1.mirror = true;
      setRotation(Support_1, 0F, 0.0174533F, -0.1919862F);
      Support_2 = new ModelRenderer(this, 0, 15);
      Support_2.addBox(0F, 0F, 0F, 1, 1, 12);
      Support_2.setRotationPoint(-5.9F, 17F, -6F);
      Support_2.setTextureSize(64, 64);
      Support_2.mirror = true;
      setRotation(Support_2, 0F, 0.0174533F, 0.1919862F);
      Support_3 = new ModelRenderer(this, 27, 15);
      Support_3.addBox(0F, 0F, 0F, 1, 1, 11);
      Support_3.setRotationPoint(-5.3F, 17F, 0F);
      Support_3.setTextureSize(64, 64);
      Support_3.mirror = true;
      setRotation(Support_3, 0F, 1.570796F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Leg_1.render(f5);
    Leg_2.render(f5);
    Leg_4.render(f5);
    Leg_3.render(f5);
    Seat.render(f5);
    Support_1.render(f5);
    Support_2.render(f5);
    Support_3.render(f5);
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

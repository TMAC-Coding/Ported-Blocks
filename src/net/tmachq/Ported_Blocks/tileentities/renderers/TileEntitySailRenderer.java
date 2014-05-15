package net.tmachq.Ported_Blocks.tileentities.renderers;

import java.io.DataInputStream;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

import org.lwjgl.opengl.GL11;

import net.tmachq.Ported_Blocks.models.SailModel;

public class TileEntitySailRenderer extends TileEntitySpecialRenderer {
    
    private final SailModel model;
    
    
    public TileEntitySailRenderer() {
        this.model = new SailModel();
}
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        int rotation = 180;
        switch (te.getBlockMetadata() % 4) {
            case 0:
                rotation = 0;
                break;
            case 3:
                rotation = 90;
                break;
            case 2:
                rotation = 180;
                break;
            case 1:
                rotation = 270;
                break;
        }
        
            GL11.glPushMatrix();
            int i = te.getBlockMetadata();
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            GL11.glRotatef(rotation, 0.0F, 1.0F, 0.0F);
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("Ported_Blocks:textures/texturemaps/Sail_HD.png"));                 
            GL11.glScalef(1.0F, -1F, -1F);
            model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            GL11.glPopMatrix();

    }
    
    private void adjustLightFixture(World world, int i, int j, int k, Block block) {
        Tessellator tess = Tessellator.instance;
        float brightness = block.getBlockBrightness(world, i, j, k);
        int skyLight = world.getLightBrightnessForSkyBlocks(i, j, k, 0);
        int modulousModifier = skyLight % 65536;
        int divModifier = skyLight / 65536;
        tess.setColorOpaque_F(brightness, brightness, brightness);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  (float) modulousModifier,  divModifier);
    }
    

}
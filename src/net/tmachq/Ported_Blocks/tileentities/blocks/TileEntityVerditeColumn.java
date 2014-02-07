package net.tmachq.Ported_Blocks.tileentities.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.tmachq.Ported_Blocks.Ported_Blocks;
import net.tmachq.Ported_Blocks.tileentities.entities.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityVerditeColumn extends BlockContainer {
    
    public TileEntityVerditeColumn(int id) {
        super(id, Material.rock);
        this.setHardness(3.0F);
        this.setCreativeTab(Ported_Blocks.Ported_Blocks_Tab);
        this.setLightOpacity(0);
        this.setBlockBounds(.14F, 0F, .14F, .86F, 1F, .86F);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world) {
            return new TileEntityVerditeColumnEntity();
    }
    
    @Override
    public int getRenderType() {
            return -1;
    }
    
    @Override
    public boolean isOpaqueCube() {
            return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    public void registerIcons(IconRegister icon) {
        this.blockIcon = icon.registerIcon("ported_blocks:Verdite_Column");
    }
    
    
}
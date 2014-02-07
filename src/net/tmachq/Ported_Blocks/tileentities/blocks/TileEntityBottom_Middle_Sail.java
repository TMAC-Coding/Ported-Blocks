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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.tmachq.Ported_Blocks.Ported_Blocks;
import net.tmachq.Ported_Blocks.tileentities.entities.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityBottom_Middle_Sail extends BlockContainer {
    
    public TileEntityBottom_Middle_Sail(int id) {
        super(id, Material.wood);
        this.setHardness(3.0F);
        this.setCreativeTab(Ported_Blocks.Ported_Blocks_Tab);
        this.setLightOpacity(0);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world) {
            return new TileEntityBottom_Middle_SailEntity();
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
        this.blockIcon = icon.registerIcon("Ported_Blocks:Bottom-Middle_Sail");
    }
    
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityliving, ItemStack itemStack) {
        int blockSet = world.getBlockMetadata(x, y, z) / 4;
        int direction = MathHelper.floor_double((double)(entityliving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        int newMeta = (blockSet * 4) + direction;
        world.setBlockMetadataWithNotify(x, y, z, newMeta, 0);
    }
    
    public void setBlockBoundsBasedOnState(IBlockAccess block, int x, int y, int z) {
        int meta = block.getBlockMetadata(x, y, z);
        if (meta == 0) {
            this.setBlockBounds(0F, 0F, .47F, 1F, 1F, .53F);
        } else if (meta == 1) {
            this.setBlockBounds(.47F, 0F, 0F, .53F, 1F, 1F);
        } else if (meta == 2) {
            this.setBlockBounds(0F, 0F, .47F, 1F, 1F, .53F);
        } else
            this.setBlockBounds(.47F, 0F, 0F, .53F, 1F, 1F);
    }
    
    
    
}
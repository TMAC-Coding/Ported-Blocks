package net.tmachq.Ported_Blocks.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.tmachq.Ported_Blocks.Ported_Blocks;

public class SandStone_Smooth_Doku extends Block {

    public SandStone_Smooth_Doku(int id) {
    super(514, Material.rock);
        this.setHardness(3.0F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setCreativeTab(Ported_Blocks.Ported_Blocks_Tab);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconReg) {
        this.blockIcon = iconReg.registerIcon("Ported_Blocks:SandStone_Smooth_(Doku)");
    }

}
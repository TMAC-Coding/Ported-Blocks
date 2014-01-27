package net.tmachq.Ported_Blocks.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.tmachq.Ported_Blocks.Ported_Blocks;

public class Verdite_Brick extends Block {

    public Verdite_Brick(int id) {
    super(527, Material.rock);
        this.setHardness(3.0F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setCreativeTab(Ported_Blocks.Ported_Blocks_Tab);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconReg) {
        this.blockIcon = iconReg.registerIcon("Ported_Blocks:Verdite_Brick");
    }

}

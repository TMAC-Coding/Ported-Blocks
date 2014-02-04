package net.tmachq.Ported_Blocks.stairs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.tmachq.Ported_Blocks.Ported_Blocks;

public class Verdite_Stairs extends BlockStairs {

    public Verdite_Stairs(int id, Block block, int meta) {
        super(id, block, meta);
        this.setHardness(3.0F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setCreativeTab(Ported_Blocks.Ported_Blocks_Tab);
    }

}

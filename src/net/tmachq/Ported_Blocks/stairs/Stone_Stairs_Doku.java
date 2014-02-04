package net.tmachq.Ported_Blocks.stairs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.tmachq.Ported_Blocks.Ported_Blocks;

public class Stone_Stairs_Doku extends BlockStairs {

    public Stone_Stairs_Doku(int id, Block block, int meta) {
        super(id, block, meta);
        this.setHardness(3.0F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setCreativeTab(Ported_Blocks.Ported_Blocks_Tab);
    }

}

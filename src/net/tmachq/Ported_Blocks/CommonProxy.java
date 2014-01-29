package net.tmachq.Ported_Blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.tmachq.*;
import net.tmachq.Ported_Blocks.properties.addnames;
import net.tmachq.Ported_Blocks.properties.addstringlocalization;
import net.tmachq.Ported_Blocks.properties.harvestlevel;
import net.tmachq.Ported_Blocks.properties.registerblocks;
import net.tmachq.Ported_Blocks.properties.registerrenderthings;
import net.tmachq.Ported_Blocks.properties.registertileentity;
import net.tmachq.Ported_Blocks.tileentities.entities.*;
import net.tmachq.Ported_Blocks.tileentities.renderers.*;
import net.tmachq.Ported_Blocks.tileentities.blocks.*;

public class CommonProxy {
    
public void registerRenderThings() {
    registerrenderthings.registerRenderThings();
}
    
    public void registerBlocks() {
        registerblocks.registerBlocks();    
    }
    
    public void addNames() {
        addnames.addNames();        
    }
    
    public void setBlockHarvestLevel() {
        harvestlevel.setBlockHarvestLevel();
    }
    
    public void registerTileEntity() {
        registertileentity.registerTileEntity();
    }
    
    public void addStringLocalization(){
        addstringlocalization.addStringLocalization();
    }

    public void registerRenderers() {
        
    }

}

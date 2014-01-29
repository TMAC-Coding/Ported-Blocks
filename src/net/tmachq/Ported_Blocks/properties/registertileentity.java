package net.tmachq.Ported_Blocks.properties;

import net.tmachq.Ported_Blocks.tileentities.entities.TileEntityAlabasterColumnEntity;
import net.tmachq.Ported_Blocks.tileentities.entities.TileEntityBarStoolEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public class registertileentity {
    
    public static void registerTileEntity() {
        
        GameRegistry.registerTileEntity(TileEntityBarStoolEntity.class, "TileEntityBarStool");
        GameRegistry.registerTileEntity(TileEntityAlabasterColumnEntity.class, "TileEntityAlabasterColumn");
    
    }

}

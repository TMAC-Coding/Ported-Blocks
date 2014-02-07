package net.tmachq.Ported_Blocks.properties;

import net.tmachq.Ported_Blocks.tileentities.entities.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class registertileentity {
    
    public static void registerTileEntity() {
        
        GameRegistry.registerTileEntity(TileEntityBarStoolEntity.class, "TileEntityBarStool");
        
        GameRegistry.registerTileEntity(TileEntityBottom_Middle_SailEntity.class, "TileEntityBottom_Middle_Sail");
        GameRegistry.registerTileEntity(TileEntityBottom_Corner_SailEntity.class, "TileEntityBottom_Corner_Sail");
        GameRegistry.registerTileEntity(TileEntitySailEntity.class, "TileEntitySail");
       
        GameRegistry.registerTileEntity(TileEntityAlabasterColumnEntity.class, "TileEntityAlabasterColumn");
        GameRegistry.registerTileEntity(TileEntityAzuriteColumnEntity.class, "TileEntityAzuriteColumn");
        GameRegistry.registerTileEntity(TileEntitySandStoneColumnDokuEntity.class, "TileEntitySandStoneColumnDoku");
        GameRegistry.registerTileEntity(TileEntitySanguiniteColumnEntity.class, "TileEntitySanguiniteColumn");
        GameRegistry.registerTileEntity(TileEntityStoneColumnDokuEntity.class, "TileEntityStoneColumnDoku");
        GameRegistry.registerTileEntity(TileEntityVerditeColumnEntity.class, "TileEntityVerditeColumn");
        GameRegistry.registerTileEntity(TileEntityVoidstoneColumnEntity.class, "TileEntityVoidstoneColumn");
    
    }

}

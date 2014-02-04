package net.tmachq.Ported_Blocks.properties;

import net.tmachq.Ported_Blocks.tileentities.entities.*;
import net.tmachq.Ported_Blocks.tileentities.renderers.*;
import cpw.mods.fml.client.registry.ClientRegistry;

public class registerrenderthings {
    
    public static void registerRenderThings() {
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBarStoolEntity.class, new TileEntityBarStoolRenderer());
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBottom_Middle_SailEntity.class, new TileEntityBottom_Middle_SailRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBottom_Corner_SailEntity.class, new TileEntityBottom_Corner_SailRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySailEntity.class, new TileEntitySailRenderer());
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAlabasterColumnEntity.class, new TileEntityAlabasterColumnRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySandStoneColumnDokuEntity.class, new TileEntitySandStoneColumnDokuRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySanguiniteColumnEntity.class, new TileEntitySanguiniteColumnRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStoneColumnDokuEntity.class, new TileEntityStoneColumnDokuRenderer());
   
    }

}

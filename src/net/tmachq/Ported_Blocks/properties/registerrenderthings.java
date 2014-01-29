package net.tmachq.Ported_Blocks.properties;

import net.tmachq.Ported_Blocks.tileentities.entities.TileEntityAlabasterColumnEntity;
import net.tmachq.Ported_Blocks.tileentities.entities.TileEntityBarStoolEntity;
import net.tmachq.Ported_Blocks.tileentities.renderers.TileEntityAlabasterColumnRenderer;
import net.tmachq.Ported_Blocks.tileentities.renderers.TileEntityBarStoolRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;

public class registerrenderthings {
    
    public static void registerRenderThings() {
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBarStoolEntity.class, new TileEntityBarStoolRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAlabasterColumnEntity.class, new TileEntityAlabasterColumnRenderer());
   
    }

}

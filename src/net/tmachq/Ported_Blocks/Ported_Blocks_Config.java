package net.tmachq.Ported_Blocks;

import net.minecraft.block.Block;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Ported_Blocks_Config {
    
    public static int AlabasterID;
    public static int Alabaster_BrickID;
    public static int Alabaster_OrnateID;
    public static int Alabaster_SmoothID;
    public static int Alabaster_TileID;
    
    public static int AzuriteID;
    public static int Azurite_BrickID;
    public static int Azurite_OrnateID;
    public static int Azurite_SmoothID;
    public static int Azurite_TileID;
    
    public static int SandStone_DokuID;
    public static int SandStone_Brick_DokuID;
    public static int SandStone_Ornate_DokuID;
    public static int SandStone_Smooth_DokuID;
    public static int SandStone_Tile_DokuID;
    
    public static int SanguiniteID;
    public static int Sanguinite_BrickID;
    public static int Sanguinite_OrnateID;
    public static int Sanguinite_SmoothID;
    public static int Sanguinite_TileID;
    
    public static int Stone_DokuID;
    public static int Stone_Brick_DokuID;
    public static int Stone_Ornate_DokuID;
    public static int Stone_Smooth_DokuID;
    public static int Stone_Tile_DokuID;
    
    public static int VerditeID;
    public static int Verdite_BrickID;
    public static int Verdite_OrnateID;
    public static int Verdite_SmoothID;
    public static int Verdite_TileID;
    
    public static int VoidstoneID;
    public static int Voidstone_BrickID;
    public static int Voidstone_OrnateID;
    public static int Voidstone_SmoothID;
    public static int Voidstone_TileID;
    
    public static int TileEntityBarStoolID;
    
    public static int TileEntityBottom_Middle_SailID;
    public static int TileEntityBottom_Corner_SailID;
    public static int TileEntitySailID;
    
    public static int TileEntityAlabasterColumnID;
    public static int TileEntitySandStoneColumnDokuID;
    public static int TileEntitySanguiniteColumnID;
    public static int TileEntityStoneColumnDokuID;
    
    public static int Alabaster_StairsID;
    public static int Alabaster_Brick_StairsID;
    public static int Azurite_StairsID;
    public static int Azurite_Brick_StairsID;
    public static int SandStone_Stairs_DokuID;
    public static int SandStone_Brick_Stairs_DokuID;
    public static int Sanguinite_StairsID;
    public static int Sanguinite_Brick_StairsID;
    public static int Stone_Stairs_DokuID;
    public static int Stone_Brick_Stairs_DokuID;
    public static int Verdite_StairsID;
    public static int Verdite_Brick_StairsID;
    public static int Voidstone_StairsID;
    public static int Voidstone_Brick_StairsID;
    
    public static void loadConfig(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        
        config.load();
        
        AlabasterID = config.getBlock("Alabaster", 500).getInt();
        Alabaster_BrickID = config.getBlock("Alabaster_Brick", 501).getInt();
        Alabaster_OrnateID = config.getBlock("Alabaster_Ornate", 502).getInt();
        Alabaster_SmoothID = config.getBlock("Alabaster_Smooth", 503).getInt();
        Alabaster_TileID = config.getBlock("Alabaster_Tile", 504).getInt();
        
        AzuriteID = config.getBlock("Azurite", 505).getInt();
        Azurite_BrickID = config.getBlock("Azurite_Brick", 506).getInt();
        Azurite_OrnateID = config.getBlock("Azurite_Ornate", 507).getInt();
        Azurite_SmoothID = config.getBlock("Azurite_Smooth", 508).getInt();
        Azurite_TileID = config.getBlock("Azurite_Tile", 509).getInt();
        
        SandStone_DokuID = config.getBlock("SandStone_Doku", 510).getInt();
        SandStone_Brick_DokuID = config.getBlock("SandStone_Brick_Doku", 511).getInt();
        SandStone_Ornate_DokuID = config.getBlock("SandStone_Ornate_Doku", 512).getInt();
        SandStone_Smooth_DokuID = config.getBlock("SandStone_Smooth_Doku", 513).getInt();
        SandStone_Tile_DokuID = config.getBlock("SandStone_Tile_Doku", 514).getInt();
        
        SanguiniteID = config.getBlock("Sanguinite", 515).getInt();
        Sanguinite_BrickID = config.getBlock("Sanguinite_Brick", 516).getInt();
        Sanguinite_OrnateID = config.getBlock("Sanguinite_Ornate", 517).getInt();
        Sanguinite_SmoothID = config.getBlock("Sanguinite_Smooth", 518).getInt();
        Sanguinite_TileID = config.getBlock("Sanguinite_Tile", 519).getInt();
        
        Stone_DokuID = config.getBlock("Stone_Doku", 520).getInt();
        Stone_Brick_DokuID = config.getBlock("Stone_Brick_Doku", 521).getInt();
        Stone_Ornate_DokuID = config.getBlock("Stone_Ornate_Doku", 522).getInt();
        Stone_Smooth_DokuID = config.getBlock("Stone_Smooth_Doku", 523).getInt();
        Stone_Tile_DokuID = config.getBlock("Stone_Tile_Doku", 524).getInt();
        
        VerditeID = config.getBlock("Verdite", 525).getInt();
        Verdite_BrickID = config.getBlock("Verdite_Brick", 526).getInt();
        Verdite_OrnateID = config.getBlock("Verdite_Ornate", 527).getInt();
        Verdite_SmoothID = config.getBlock("Verdite_Smooth", 528).getInt();
        Verdite_TileID = config.getBlock("Verdite_Tile", 529).getInt();
        
        VoidstoneID = config.getBlock("Voidstone", 530).getInt();
        Voidstone_BrickID = config.getBlock("Voidstone_Brick", 531).getInt();
        Voidstone_OrnateID = config.getBlock("Voidstone_Ornate", 532).getInt();
        Voidstone_SmoothID = config.getBlock("Voidstone_Smooth", 533).getInt();
        Voidstone_TileID = config.getBlock("Voidstone_Tile", 534).getInt();
        
        TileEntityBarStoolID = config.getBlock("TileEntityBarStool", 540).getInt();
        
        TileEntityBottom_Middle_SailID = config.getBlock("TileEntityBottom_Middle_Sail", 541).getInt();
        TileEntityBottom_Corner_SailID = config.getBlock("TileEntityBottom_Corner_Sail", 542).getInt();
        TileEntitySailID = config.getBlock("TileEntitySail", 543).getInt();
        
        TileEntityAlabasterColumnID = config.getBlock("TileEntityAlabasterColumn", 544).getInt();
        TileEntitySandStoneColumnDokuID = config.getBlock("TileEntitySandStoneColumnDoku", 545).getInt();
        TileEntitySanguiniteColumnID = config.getBlock("TileEntitySanguiniteColumn", 546).getInt();
        TileEntityStoneColumnDokuID = config.getBlock("TileEntityStoneColumnDoku", 547).getInt();
        
        Alabaster_StairsID = config.getBlock("Alabaster_Stairs", 550).getInt();
        Alabaster_Brick_StairsID = config.getBlock("Alabaster_Brick_Stairs", 551).getInt();
        Azurite_StairsID = config.getBlock("Azurite_Stairs", 552).getInt();
        Azurite_Brick_StairsID = config.getBlock("Azurite_Brick_Stairs", 553).getInt();
        SandStone_Stairs_DokuID = config.getBlock("SandStone_Stairs_Doku", 554).getInt();
        SandStone_Brick_Stairs_DokuID = config.getBlock("SandStone_Brick_Stairs_Doku", 555).getInt();
        Sanguinite_StairsID = config.getBlock("Sanguinite_Stairs", 556).getInt();
        Sanguinite_Brick_StairsID = config.getBlock("Sanguinite_Brick_Stairs", 557).getInt();
        Stone_Stairs_DokuID = config.getBlock("Stone_Stairs_Doku", 558).getInt();
        Stone_Brick_Stairs_DokuID = config.getBlock("Stone_Brick_Stairs_Doku", 559).getInt();
        Verdite_StairsID = config.getBlock("Verdite_Stairs", 560).getInt();
        Verdite_Brick_StairsID = config.getBlock("Verdite_Brick_Stairs", 561).getInt();
        Voidstone_StairsID = config.getBlock("Voidstone_Stairs", 562).getInt();
        Voidstone_Brick_StairsID = config.getBlock("Voidstone_Brick_Stairs", 562).getInt();
        
        config.save();
    }

}

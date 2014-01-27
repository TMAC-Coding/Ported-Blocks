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
    
    public static void loadConfig(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        
        config.load();
        
        AlabasterID = config.getBlock("Alabaster", 500).getInt();
        Alabaster_BrickID = config.getBlock("Alabaster_Brick", 501).getInt();
        Alabaster_OrnateID = config.getBlock("Alabaster_Ornate", 502).getInt();
        Alabaster_SmoothID = config.getBlock("Alabaster_Brick", 503).getInt();
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
        
        config.save();
    }

}

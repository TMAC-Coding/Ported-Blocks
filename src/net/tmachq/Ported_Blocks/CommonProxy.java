package net.tmachq.Ported_Blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.tmachq.*;

public class CommonProxy {
    
public void registerRenderThings() {}
    
    public void registerBlocks() {
        GameRegistry.registerBlock(Ported_Blocks.Alabaster, "Alabaster");
        GameRegistry.registerBlock(Ported_Blocks.Alabaster_Brick, "Alabaster_Brick");
        GameRegistry.registerBlock(Ported_Blocks.Alabaster_Ornate, "Alabaster_Ornate");
        GameRegistry.registerBlock(Ported_Blocks.Alabaster_Smooth, "Alabaster_Smooth");
        GameRegistry.registerBlock(Ported_Blocks.Alabaster_Tile, "Alabaster_Tile");
        
        GameRegistry.registerBlock(Ported_Blocks.Azurite, "Azurite");
        GameRegistry.registerBlock(Ported_Blocks.Azurite_Brick, "Azurite_Brick");
        GameRegistry.registerBlock(Ported_Blocks.Azurite_Ornate, "Azurite_Ornate");
        GameRegistry.registerBlock(Ported_Blocks.Azurite_Smooth, "Azurite_Smooth");
        GameRegistry.registerBlock(Ported_Blocks.Azurite_Tile, "Azurite_Tile");
        
        GameRegistry.registerBlock(Ported_Blocks.SandStone_Doku, "SandStone_Doku");
        GameRegistry.registerBlock(Ported_Blocks.SandStone_Brick_Doku, "SandStone_Brick_Doku");
        GameRegistry.registerBlock(Ported_Blocks.SandStone_Ornate_Doku, "SandStone_Ornate_Doku");
        GameRegistry.registerBlock(Ported_Blocks.SandStone_Smooth_Doku, "SandStone_Smooth_Doku");
        GameRegistry.registerBlock(Ported_Blocks.SandStone_Tile_Doku, "SandStone_Tile_Doku");
        
        GameRegistry.registerBlock(Ported_Blocks.Sanguinite, "Sanguinite");
        GameRegistry.registerBlock(Ported_Blocks.Sanguinite_Brick, "Sanguinite_Brick");
        GameRegistry.registerBlock(Ported_Blocks.Sanguinite_Ornate, "Sanguinite_Ornate");
        GameRegistry.registerBlock(Ported_Blocks.Sanguinite_Smooth, "Sanguinite_Smooth");
        GameRegistry.registerBlock(Ported_Blocks.Sanguinite_Tile, "Sanguinite_Tile");
        
        GameRegistry.registerBlock(Ported_Blocks.Stone_Doku, "Stone_Doku");
        GameRegistry.registerBlock(Ported_Blocks.Stone_Brick_Doku, "Stone_Brick_Doku");
        GameRegistry.registerBlock(Ported_Blocks.Stone_Ornate_Doku, "Stone_Ornate_Doku");
        GameRegistry.registerBlock(Ported_Blocks.Stone_Smooth_Doku, "Stone_Smooth_Doku");
        GameRegistry.registerBlock(Ported_Blocks.Stone_Tile_Doku, "Stone_Tile_Doku");
        
        GameRegistry.registerBlock(Ported_Blocks.Verdite, "Verdite");
        GameRegistry.registerBlock(Ported_Blocks.Verdite_Brick, "Verdite_Brick");
        GameRegistry.registerBlock(Ported_Blocks.Verdite_Ornate, "Verdite_Ornate");
        GameRegistry.registerBlock(Ported_Blocks.Verdite_Smooth, "Verdite_Smooth");
        GameRegistry.registerBlock(Ported_Blocks.Verdite_Tile, "Verdite_Tile");
        
        GameRegistry.registerBlock(Ported_Blocks.Voidstone, "Voidstone");
        GameRegistry.registerBlock(Ported_Blocks.Voidstone_Brick, "Voidstone_Brick");
        GameRegistry.registerBlock(Ported_Blocks.Voidstone_Ornate, "Voidstone_Ornate");
        GameRegistry.registerBlock(Ported_Blocks.Voidstone_Smooth, "Voidstone_Smooth");
        GameRegistry.registerBlock(Ported_Blocks.Voidstone_Tile, "Voidstone_Tile");
        
    }
    
    public void addNames() {
        LanguageRegistry.addName(Ported_Blocks.Alabaster, "Alabaster");
        LanguageRegistry.addName(Ported_Blocks.Alabaster_Brick, "Alabaster_Brick");
        LanguageRegistry.addName(Ported_Blocks.Alabaster_Ornate, "Alabaster_Ornate");
        LanguageRegistry.addName(Ported_Blocks.Alabaster_Smooth, "Alabaster_Smooth");
        LanguageRegistry.addName(Ported_Blocks.Alabaster_Tile, "Alabaster_Tile");
        
        LanguageRegistry.addName(Ported_Blocks.Azurite, "Azurite");
        LanguageRegistry.addName(Ported_Blocks.Azurite_Brick, "Azurite_Brick");
        LanguageRegistry.addName(Ported_Blocks.Azurite_Ornate, "Azurite_Ornate");
        LanguageRegistry.addName(Ported_Blocks.Azurite_Smooth, "Azurite_Smooth");
        LanguageRegistry.addName(Ported_Blocks.Azurite_Tile, "Azurite_Tile");
        
        LanguageRegistry.addName(Ported_Blocks.SandStone_Doku, "SandStone_Doku");
        LanguageRegistry.addName(Ported_Blocks.SandStone_Brick_Doku, "SandStone_Brick_Doku");
        LanguageRegistry.addName(Ported_Blocks.SandStone_Ornate_Doku, "SandStone_Ornate_Doku");
        LanguageRegistry.addName(Ported_Blocks.SandStone_Smooth_Doku, "SandStone_Smooth_Doku");
        LanguageRegistry.addName(Ported_Blocks.SandStone_Tile_Doku, "SandStone_Tile_Doku");
        
        LanguageRegistry.addName(Ported_Blocks.Sanguinite, "Sanguinite");
        LanguageRegistry.addName(Ported_Blocks.Sanguinite_Brick, "Sanguinite_Brick");
        LanguageRegistry.addName(Ported_Blocks.Sanguinite_Ornate, "Sanguinite_Ornate");
        LanguageRegistry.addName(Ported_Blocks.Sanguinite_Smooth, "Sanguinite_Smooth");
        LanguageRegistry.addName(Ported_Blocks.Sanguinite_Tile, "Sanguinite_Tile");
        
        LanguageRegistry.addName(Ported_Blocks.Stone_Doku, "Stone_Doku");
        LanguageRegistry.addName(Ported_Blocks.Stone_Brick_Doku, "Stone_Brick_Doku");
        LanguageRegistry.addName(Ported_Blocks.Stone_Ornate_Doku, "Stone_Ornate_Doku");
        LanguageRegistry.addName(Ported_Blocks.Stone_Smooth_Doku, "Stone_Smooth_Doku");
        LanguageRegistry.addName(Ported_Blocks.Stone_Tile_Doku, "Stone_Tile_Doku");
        
        LanguageRegistry.addName(Ported_Blocks.Verdite, "Verdite");
        LanguageRegistry.addName(Ported_Blocks.Verdite_Brick, "Verdite_Brick");
        LanguageRegistry.addName(Ported_Blocks.Verdite_Ornate, "Verdite_Ornate");
        LanguageRegistry.addName(Ported_Blocks.Verdite_Smooth, "Verdite_Smooth");
        LanguageRegistry.addName(Ported_Blocks.Verdite_Tile, "Verdite_Tile");
        
        LanguageRegistry.addName(Ported_Blocks.Voidstone, "Voidstone");
        LanguageRegistry.addName(Ported_Blocks.Voidstone_Brick, "Voidstone_Brick");
        LanguageRegistry.addName(Ported_Blocks.Voidstone_Ornate, "Voidstone_Ornate");
        LanguageRegistry.addName(Ported_Blocks.Voidstone_Smooth, "Voidstone_Smooth");
        LanguageRegistry.addName(Ported_Blocks.Voidstone_Tile, "Voidstone_Tile");
        
    }
    
    public void setBlockHarvestLevel() {
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Alabaster, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Alabaster_Brick, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Alabaster_Ornate, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Alabaster_Smooth, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Alabaster_Tile, "pickaxe", 0);
        
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Azurite, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Azurite_Brick, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Azurite_Ornate, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Azurite_Smooth, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Azurite_Tile, "pickaxe", 0);
        
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.SandStone_Doku, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.SandStone_Brick_Doku, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.SandStone_Ornate_Doku, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.SandStone_Smooth_Doku, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.SandStone_Tile_Doku, "pickaxe", 0);
        
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Sanguinite, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Sanguinite_Brick, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Sanguinite_Ornate, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Sanguinite_Smooth, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Sanguinite_Tile, "pickaxe", 0);
        
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Stone_Doku, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Stone_Brick_Doku, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Stone_Ornate_Doku, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Stone_Smooth_Doku, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Stone_Tile_Doku, "pickaxe", 0);
        
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Verdite, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Verdite_Brick, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Verdite_Ornate, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Verdite_Smooth, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Verdite_Tile, "pickaxe", 0);
        
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Voidstone, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Voidstone_Brick, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Voidstone_Ornate, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Voidstone_Smooth, "pickaxe", 0);
        MinecraftForge.setBlockHarvestLevel(Ported_Blocks.Voidstone_Tile, "pickaxe", 0);
        
    }

    public void registerRenderers() {
        
    }

}

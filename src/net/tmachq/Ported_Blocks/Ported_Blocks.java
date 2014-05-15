package net.tmachq.Ported_Blocks;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.tmachq.Ported_Blocks.blocks.*;
import net.tmachq.Ported_Blocks.stairs.*;
import net.tmachq.Ported_Blocks.tileentities.blocks.*;
import net.tmachq.Ported_Blocks.tileentities.entities.*;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="Ported_Blocks", name="Ported Blocks", version="0.5.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Ported_Blocks {
    
    @Instance("Ported_Blocks")
    public static Ported_Blocks instance;
    
    @SidedProxy(clientSide="net.tmachq.Ported_Blocks.ClientProxy",
            serverSide="net.tmachq.Ported_Blocks.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs Ported_Blocks_Tab = new CreativeTabs("Ported_Blocks_Tab") {
        public ItemStack getIconItemStack() {
            return new ItemStack(Alabaster, 1, 0);
        }
    };
    
    public static Block Alabaster;
    public static Block Alabaster_Brick;
    public static Block Alabaster_Ornate;
    public static Block Alabaster_Smooth;
    public static Block Alabaster_Tile;
    
    public static Block Azurite;
    public static Block Azurite_Brick;
    public static Block Azurite_Ornate;
    public static Block Azurite_Smooth;
    public static Block Azurite_Tile;
    
    public static Block SandStone_Doku;
    public static Block SandStone_Brick_Doku;
    public static Block SandStone_Ornate_Doku;
    public static Block SandStone_Smooth_Doku;
    public static Block SandStone_Tile_Doku;
    
    public static Block Sanguinite;
    public static Block Sanguinite_Brick;
    public static Block Sanguinite_Ornate;
    public static Block Sanguinite_Smooth;
    public static Block Sanguinite_Tile;
    
    public static Block Stone_Doku;
    public static Block Stone_Brick_Doku;
    public static Block Stone_Ornate_Doku;
    public static Block Stone_Smooth_Doku;
    public static Block Stone_Tile_Doku;
    
    public static Block Verdite;
    public static Block Verdite_Brick;
    public static Block Verdite_Ornate;
    public static Block Verdite_Smooth;
    public static Block Verdite_Tile;
    
    public static Block Voidstone;
    public static Block Voidstone_Brick;
    public static Block Voidstone_Ornate;
    public static Block Voidstone_Smooth;
    public static Block Voidstone_Tile;
    
    public static Block TileEntityBarStool;
    
    public static Block TileEntityBottom_Middle_Sail;
    public static Block TileEntityBottom_Corner_Sail;
    public static Block TileEntitySail;
    
    public static Block TileEntityAlabasterColumn;
    public static Block TileEntityAzuriteColumn;
    public static Block TileEntitySandStoneColumnDoku;
    public static Block TileEntitySanguiniteColumn;
    public static Block TileEntityStoneColumnDoku;
    public static Block TileEntityVerditeColumn;
    public static Block TileEntityVoidstoneColumn;
    
    public static Block Alabaster_Stairs;
    public static Block Alabaster_Brick_Stairs;
    public static Block Azurite_Stairs;
    public static Block Azurite_Brick_Stairs;
    public static Block SandStone_Stairs_Doku;
    public static Block SandStone_Brick_Stairs_Doku;
    public static Block Sanguinite_Stairs;
    public static Block Sanguinite_Brick_Stairs;
    public static Block Stone_Stairs_Doku;
    public static Block Stone_Brick_Stairs_Doku;
    public static Block Verdite_Stairs;
    public static Block Verdite_Brick_Stairs;
    public static Block Voidstone_Stairs;
    public static Block Voidstone_Brick_Stairs;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        File cfgfile = new File(event.getModConfigurationDirectory(), "Ported_Blocks");
        
        Ported_Blocks_Config config = new Ported_Blocks_Config();
        
        Ported_Blocks_Config.loadConfig(event);
        
        Alabaster = new Alabaster(config.AlabasterID).setUnlocalizedName("Alabaster");
        Alabaster_Brick = new Alabaster_Brick(config.Alabaster_BrickID).setUnlocalizedName("Alabaster_Brick");
        Alabaster_Ornate = new Alabaster_Ornate(config.Alabaster_OrnateID).setUnlocalizedName("Alabaster_Ornate");
        Alabaster_Smooth = new Alabaster_Smooth(config.Alabaster_SmoothID).setUnlocalizedName("Alabaster_Smooth");
        Alabaster_Tile = new Alabaster_Tile(config.Alabaster_TileID).setUnlocalizedName("Alabaster_Tile");
        
        Azurite = new Azurite(config.AzuriteID).setUnlocalizedName("Azurite");
        Azurite_Brick = new Azurite_Brick(config.Azurite_BrickID).setUnlocalizedName("Azurite_Brick");
        Azurite_Ornate = new Azurite_Ornate(config.Azurite_OrnateID).setUnlocalizedName("Azurite_Ornate");
        Azurite_Smooth = new Azurite_Smooth(config.Azurite_SmoothID).setUnlocalizedName("Azurite_Smooth");
        Azurite_Tile = new Azurite_Tile(config.Azurite_TileID).setUnlocalizedName("Azurite_Tile");
        
        SandStone_Doku = new SandStone_Doku(config.SandStone_DokuID).setUnlocalizedName("SandStone_Doku");
        SandStone_Brick_Doku = new SandStone_Brick_Doku(config.SandStone_Brick_DokuID).setUnlocalizedName("SandStone_Brick_Doku");
        SandStone_Ornate_Doku = new SandStone_Ornate_Doku(config.SandStone_Ornate_DokuID).setUnlocalizedName("SandStone_Ornate_Doku");
        SandStone_Smooth_Doku = new SandStone_Smooth_Doku(config.SandStone_Smooth_DokuID).setUnlocalizedName("SandStone_Smooth_Doku");
        SandStone_Tile_Doku = new SandStone_Tile_Doku(config.SandStone_Tile_DokuID).setUnlocalizedName("SandStone_Tile_Doku");
        
        Sanguinite = new Sanguinite(config.SanguiniteID).setUnlocalizedName("Sanguinite");
        Sanguinite_Brick = new Sanguinite_Brick(config.Sanguinite_BrickID).setUnlocalizedName("Sanguinite_Brick");
        Sanguinite_Ornate = new Sanguinite_Ornate(config.Sanguinite_OrnateID).setUnlocalizedName("Sanguinite_Ornate");
        Sanguinite_Smooth = new Sanguinite_Smooth(config.Sanguinite_SmoothID).setUnlocalizedName("Sanguinite_Smooth");
        Sanguinite_Tile = new Sanguinite_Tile(config.Sanguinite_TileID).setUnlocalizedName("Sanguinite_Tile");
        
        Stone_Doku = new Stone_Doku(config.Stone_DokuID).setUnlocalizedName("Stone_Doku");
        Stone_Brick_Doku = new Stone_Brick_Doku(config.Stone_Brick_DokuID).setUnlocalizedName("Stone_Brick_Doku");
        Stone_Ornate_Doku = new Stone_Ornate_Doku(config.Stone_Ornate_DokuID).setUnlocalizedName("Stone_Ornate_Doku");
        Stone_Smooth_Doku = new Stone_Smooth_Doku(config.Stone_Smooth_DokuID).setUnlocalizedName("Stone_Smooth_Doku");
        Stone_Tile_Doku = new Stone_Tile_Doku(config.Stone_Tile_DokuID).setUnlocalizedName("Stone_Tile_Doku");
        
        Verdite = new Verdite(config.VerditeID).setUnlocalizedName("Verdite");
        Verdite_Brick = new Verdite_Brick(config.Verdite_BrickID).setUnlocalizedName("Verdite_Brick");
        Verdite_Ornate = new Verdite_Ornate(config.Verdite_OrnateID).setUnlocalizedName("Verdite_Ornate");
        Verdite_Smooth = new Verdite_Smooth(config.Verdite_SmoothID).setUnlocalizedName("Verdite_Smooth");
        Verdite_Tile = new Verdite_Tile(config.Verdite_TileID).setUnlocalizedName("Verdite_Tile");
        
        Voidstone = new Voidstone(config.VoidstoneID).setUnlocalizedName("Voidstone");
        Voidstone_Brick = new Voidstone_Brick(config.Voidstone_BrickID).setUnlocalizedName("Voidstone_Brick");
        Voidstone_Ornate = new Voidstone_Ornate(config.Voidstone_OrnateID).setUnlocalizedName("Voidstone_Ornate");
        Voidstone_Smooth = new Voidstone_Smooth(config.Voidstone_SmoothID).setUnlocalizedName("Voidstone_Smooth");
        Voidstone_Tile = new Voidstone_Tile(config.Voidstone_TileID).setUnlocalizedName("Voidstone_Tile");
        
        TileEntityBarStool = new TileEntityBarStool(config.TileEntityBarStoolID).setUnlocalizedName("TileEntityBarStool");
        
        TileEntityBottom_Middle_Sail = new TileEntityBottom_Middle_Sail(config.TileEntityBottom_Middle_SailID).setUnlocalizedName("TileEntityBottom_Middle_Sail");
        TileEntityBottom_Corner_Sail = new TileEntityBottom_Corner_Sail(config.TileEntityBottom_Corner_SailID).setUnlocalizedName("TileEntityBottom_Corner_Sail");
        TileEntitySail = new TileEntitySail(config.TileEntitySailID).setUnlocalizedName("TileEntitySail");
        
        TileEntityAlabasterColumn = new TileEntityAlabasterColumn(config.TileEntityAlabasterColumnID).setUnlocalizedName("TileEntityAlabasterColumn");
        TileEntityAzuriteColumn = new TileEntityAzuriteColumn(config.TileEntityAzuriteColumnID).setUnlocalizedName("TileEntityAzuriteColumn");
        TileEntitySandStoneColumnDoku = new TileEntitySandStoneColumnDoku(config.TileEntitySandStoneColumnDokuID).setUnlocalizedName("TileEntitySandStoneColumnDoku");
        TileEntitySanguiniteColumn = new TileEntitySanguiniteColumn(config.TileEntitySanguiniteColumnID).setUnlocalizedName("TileEntitySanguiniteColumn");
        TileEntityStoneColumnDoku = new TileEntityStoneColumnDoku(config.TileEntityStoneColumnDokuID).setUnlocalizedName("TileEntityStoneColumnDoku");
        TileEntityVerditeColumn = new TileEntityVerditeColumn(config.TileEntityVerditeColumnID).setUnlocalizedName("TileEntityVerditeColumn");
        TileEntityVoidstoneColumn = new TileEntityVoidstoneColumn(config.TileEntityVoidstoneColumnID).setUnlocalizedName("TileEntityVoidstoneColumn");
        
        Alabaster_Stairs= new Alabaster_Stairs(config.Alabaster_StairsID, Alabaster, 0).setUnlocalizedName("Alabaster_Stairs");
        Alabaster_Brick_Stairs= new Alabaster_Brick_Stairs(config.Alabaster_Brick_StairsID, Alabaster_Brick, 0).setUnlocalizedName("Alabaster_Brick_Stairs");
        Azurite_Stairs= new Azurite_Stairs(config.Azurite_StairsID, Azurite, 0).setUnlocalizedName("Azurite_Stairs");
        Azurite_Brick_Stairs= new Azurite_Brick_Stairs(config.Azurite_Brick_StairsID, Azurite_Brick, 0).setUnlocalizedName("Azurite_Brick_Stairs");
        SandStone_Stairs_Doku= new SandStone_Stairs_Doku(config.SandStone_Stairs_DokuID, SandStone_Doku, 0).setUnlocalizedName("SandStone_Stairs_Doku");
        SandStone_Brick_Stairs_Doku= new SandStone_Brick_Stairs_Doku(config.SandStone_Brick_Stairs_DokuID, SandStone_Brick_Doku, 0).setUnlocalizedName("SandStone_Brick_Stairs_Doku");
        Sanguinite_Stairs= new Sanguinite_Stairs(config.Sanguinite_StairsID, Sanguinite, 0).setUnlocalizedName("Sanguinite_Stairs");
        Sanguinite_Brick_Stairs= new Sanguinite_Brick_Stairs(config.Sanguinite_Brick_StairsID, Sanguinite_Brick, 0).setUnlocalizedName("Sanguinite_Brick_Stairs");
        Stone_Stairs_Doku= new Stone_Stairs_Doku(config.Stone_Stairs_DokuID, Stone_Doku, 0).setUnlocalizedName("Stone_Stairs_Doku");
        Stone_Brick_Stairs_Doku= new Stone_Brick_Stairs_Doku(config.Stone_Brick_Stairs_DokuID, Stone_Brick_Doku, 0).setUnlocalizedName("Stone_Brick_Stairs_Doku");
        Verdite_Stairs= new Verdite_Stairs(config.Verdite_StairsID, Verdite, 0).setUnlocalizedName("Verdite_Stairs");
        Verdite_Brick_Stairs= new Verdite_Brick_Stairs(config.Verdite_Brick_StairsID, Verdite_Brick, 0).setUnlocalizedName("Verdite_Brick_Stairs");
        Voidstone_Stairs= new Voidstone_Stairs(config.Voidstone_StairsID, Voidstone, 0).setUnlocalizedName("Voidstone_Stairs");
        Voidstone_Brick_Stairs= new Voidstone_Brick_Stairs(config.Voidstone_Brick_StairsID, Voidstone_Brick, 0).setUnlocalizedName("Voidstone__Brick_Stairs");
    }
    
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderThings();
        proxy.registerRenderers();
        proxy.registerBlocks();
        proxy.addNames();
        proxy.setBlockHarvestLevel();
        proxy.registerTileEntity();
        proxy.addStringLocalization();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}


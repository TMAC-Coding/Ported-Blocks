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

@Mod(modid="Ported_Blocks", name="Ported Blocks", version="0.3")
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
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
            File cfgfile = new File(event.getModConfigurationDirectory(), "Ported_Blocks");
    
    Ported_Blocks_Config config = new Ported_Blocks_Config();
    
    Ported_Blocks_Config.loadConfig(event);
    
    Alabaster = new net.tmachq.Ported_Blocks.block.Alabaster(config.AlabasterID).setUnlocalizedName("Alabaster");
    Alabaster_Brick = new net.tmachq.Ported_Blocks.block.Alabaster_Brick(config.Alabaster_BrickID).setUnlocalizedName("Alabaster_Brick");
    Alabaster_Ornate = new net.tmachq.Ported_Blocks.block.Alabaster_Ornate(config.Alabaster_OrnateID).setUnlocalizedName("Alabaster_Ornate");
    Alabaster_Smooth = new net.tmachq.Ported_Blocks.block.Alabaster_Smooth(config.Alabaster_SmoothID).setUnlocalizedName("Alabaster_Smooth");
    Alabaster_Tile = new net.tmachq.Ported_Blocks.block.Alabaster_Tile(config.Alabaster_TileID).setUnlocalizedName("Alabaster_Tile");
    
    Azurite = new net.tmachq.Ported_Blocks.block.Azurite(config.AzuriteID).setUnlocalizedName("Azurite");
    Azurite_Brick = new net.tmachq.Ported_Blocks.block.Azurite_Brick(config.Azurite_BrickID).setUnlocalizedName("Azurite_Brick");
    Azurite_Ornate = new net.tmachq.Ported_Blocks.block.Azurite_Ornate(config.Azurite_OrnateID).setUnlocalizedName("Azurite_Ornate");
    Azurite_Smooth = new net.tmachq.Ported_Blocks.block.Azurite_Smooth(config.Azurite_SmoothID).setUnlocalizedName("Azurite_Smooth");
    Azurite_Tile = new net.tmachq.Ported_Blocks.block.Azurite_Tile(config.Azurite_TileID).setUnlocalizedName("Azurite_Tile");
    
    SandStone_Doku = new net.tmachq.Ported_Blocks.block.SandStone_Doku(config.SandStone_DokuID).setUnlocalizedName("SandStone_Doku");
    SandStone_Brick_Doku = new net.tmachq.Ported_Blocks.block.SandStone_Brick_Doku(config.SandStone_Brick_DokuID).setUnlocalizedName("SandStone_Brick_Doku");
    SandStone_Ornate_Doku = new net.tmachq.Ported_Blocks.block.SandStone_Ornate_Doku(config.SandStone_Ornate_DokuID).setUnlocalizedName("SandStone_Ornate_Doku");
    SandStone_Smooth_Doku = new net.tmachq.Ported_Blocks.block.SandStone_Smooth_Doku(config.SandStone_Smooth_DokuID).setUnlocalizedName("SandStone_Smooth_Doku");
    SandStone_Tile_Doku = new net.tmachq.Ported_Blocks.block.SandStone_Tile_Doku(config.SandStone_Tile_DokuID).setUnlocalizedName("SandStone_Tile_Doku");
    
    Sanguinite = new net.tmachq.Ported_Blocks.block.Sanguinite(config.SanguiniteID).setUnlocalizedName("Sanguinite");
    Sanguinite_Brick = new net.tmachq.Ported_Blocks.block.Sanguinite_Brick(config.Sanguinite_BrickID).setUnlocalizedName("Sanguinite_Brick");
    Sanguinite_Ornate = new net.tmachq.Ported_Blocks.block.Sanguinite_Ornate(config.Sanguinite_OrnateID).setUnlocalizedName("Sanguinite_Ornate");
    Sanguinite_Smooth = new net.tmachq.Ported_Blocks.block.Sanguinite_Smooth(config.Sanguinite_SmoothID).setUnlocalizedName("Sanguinite_Smooth");
    Sanguinite_Tile = new net.tmachq.Ported_Blocks.block.Sanguinite_Tile(config.Sanguinite_TileID).setUnlocalizedName("Sanguinite_Tile");
    
    Stone_Doku = new net.tmachq.Ported_Blocks.block.Stone_Doku(config.Stone_DokuID).setUnlocalizedName("Stone_Doku");
    Stone_Brick_Doku = new net.tmachq.Ported_Blocks.block.Stone_Brick_Doku(config.Stone_Brick_DokuID).setUnlocalizedName("Stone_Brick_Doku");
    Stone_Ornate_Doku = new net.tmachq.Ported_Blocks.block.Stone_Ornate_Doku(config.Stone_Ornate_DokuID).setUnlocalizedName("Stone_Ornate_Doku");
    Stone_Smooth_Doku = new net.tmachq.Ported_Blocks.block.Stone_Smooth_Doku(config.Stone_Smooth_DokuID).setUnlocalizedName("Stone_Smooth_Doku");
    Stone_Tile_Doku = new net.tmachq.Ported_Blocks.block.Stone_Tile_Doku(config.Stone_Tile_DokuID).setUnlocalizedName("Stone_Tile_Doku");
    
    Verdite = new net.tmachq.Ported_Blocks.block.Verdite(config.VerditeID).setUnlocalizedName("Verdite");
    Verdite_Brick = new net.tmachq.Ported_Blocks.block.Verdite_Brick(config.Verdite_BrickID).setUnlocalizedName("Verdite_Brick");
    Verdite_Ornate = new net.tmachq.Ported_Blocks.block.Verdite_Ornate(config.Verdite_OrnateID).setUnlocalizedName("Verdite_Ornate");
    Verdite_Smooth = new net.tmachq.Ported_Blocks.block.Verdite_Smooth(config.Verdite_SmoothID).setUnlocalizedName("Verdite_Smooth");
    Verdite_Tile = new net.tmachq.Ported_Blocks.block.Verdite_Tile(config.Verdite_TileID).setUnlocalizedName("Verdite_Tile");
    
    Voidstone = new net.tmachq.Ported_Blocks.block.Voidstone(config.VoidstoneID).setUnlocalizedName("Voidstone");
    Voidstone_Brick = new net.tmachq.Ported_Blocks.block.Voidstone_Brick(config.Voidstone_BrickID).setUnlocalizedName("Voidstone_Brick");
    Voidstone_Ornate = new net.tmachq.Ported_Blocks.block.Voidstone_Ornate(config.Voidstone_OrnateID).setUnlocalizedName("Voidstone_Ornate");
    Voidstone_Smooth = new net.tmachq.Ported_Blocks.block.Voidstone_Smooth(config.Voidstone_SmoothID).setUnlocalizedName("Voidstone_Smooth");
    Voidstone_Tile = new net.tmachq.Ported_Blocks.block.Voidstone_Tile(config.Voidstone_TileID).setUnlocalizedName("Voidstone_Tile");
    }
    
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderThings();
        proxy.registerRenderers();
        proxy.registerBlocks();
        proxy.addNames();
        proxy.setBlockHarvestLevel();
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.Ported_Blocks_Tab", "en_US", "Ported Blocks");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}


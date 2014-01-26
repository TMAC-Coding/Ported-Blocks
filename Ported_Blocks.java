package net.tmachq.Ported_Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="Ported_Blocks", name="Ported Blocks", version="0.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Ported_Blocks {
    
    @Instance("Ported_Blocks")
    public static Ported_Blocks instance;
    
    @SidedProxy(clientSide="net.tmachq.Ported_Blocks.ClientProxy",
            serverSide="net.tmachq.Ported_Blocks.ServerProxy")
    public static ServerProxy proxy;
    
    public static CreativeTabs Ported_Blocks_Tab = new CreativeTabs("Ported_Blocks_Tab") {
        public ItemStack getIconItemStack() {
            return new ItemStack(Alabaster, 1, 0);
        }
    };
    
    public static final Block Alabaster = new net.tmachq.Ported_Blocks.block.Alabaster(501, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Alabaster").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Alabaster_Brick = new net.tmachq.Ported_Blocks.block.Alabaster_Brick(502, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Alabaster_Brick").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Alabaster_Ornate = new net.tmachq.Ported_Blocks.block.Alabaster_Ornate(503, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Alabaster_Ornate").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Alabaster_Smooth = new net.tmachq.Ported_Blocks.block.Alabaster_Smooth(504, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Alabaster_Smooth").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Alabaster_Tile = new net.tmachq.Ported_Blocks.block.Alabaster_Tile(505, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Alabaster_Tile").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Azurite = new net.tmachq.Ported_Blocks.block.Azurite(506, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Azurite").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Azurite_Brick = new net.tmachq.Ported_Blocks.block.Azurite_Brick(507, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Azurite_Brick").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Azurite_Ornate = new net.tmachq.Ported_Blocks.block.Azurite_Ornate(508, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Azurite_Ornate").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Azurite_Smooth = new net.tmachq.Ported_Blocks.block.Azurite_Smooth(509, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Azurite_Smooth").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Azurite_Tile = new net.tmachq.Ported_Blocks.block.Azurite_Tile(510, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Azurite_Tile").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block SandStone_Doku = new net.tmachq.Ported_Blocks.block.SandStone_Doku(511, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("SandStone_Doku").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block SandStone_Brick_Doku = new net.tmachq.Ported_Blocks.block.SandStone_Brick_Doku(512, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("SandStone_Brick_Doku").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block SandStone_Ornate_Doku = new net.tmachq.Ported_Blocks.block.SandStone_Ornate_Doku(513, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("SandStone_Ornate_Doku").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block SandStone_Smooth_Doku = new net.tmachq.Ported_Blocks.block.SandStone_Smooth_Doku(514, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("SandStone_Smooth_Doku").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block SandStone_Tile_Doku = new net.tmachq.Ported_Blocks.block.SandStone_Tile_Doku(515, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("SandStone_Tile_Doku").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Sanguinite = new net.tmachq.Ported_Blocks.block.Sanguinite(516, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Sanguinite").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Sanguinite_Brick = new net.tmachq.Ported_Blocks.block.Sanguinite_Brick(517, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Sanguinite_Brick").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Sanguinite_Ornate = new net.tmachq.Ported_Blocks.block.Sanguinite_Ornate(518, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Sanguinite_Ornate").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Sanguinite_Smooth = new net.tmachq.Ported_Blocks.block.Sanguinite_Smooth(519, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Sanguinite_Smooth").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Sanguinite_Tile = new net.tmachq.Ported_Blocks.block.Sanguinite_Tile(520, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Sanguinite_Tile").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Stone_Doku = new net.tmachq.Ported_Blocks.block.Stone_Doku(521, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Stone_Doku").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Stone_Brick_Doku = new net.tmachq.Ported_Blocks.block.Stone_Brick_Doku(522, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Stone_Brick_Doku").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Stone_Ornate_Doku = new net.tmachq.Ported_Blocks.block.Stone_Ornate_Doku(523, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Stone_Ornate_Doku").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Stone_Smooth_Doku = new net.tmachq.Ported_Blocks.block.Stone_Smooth_Doku(524, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Stone_Smooth_Doku").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Stone_Tile_Doku = new net.tmachq.Ported_Blocks.block.Stone_Tile_Doku(525, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Stone_Tile_Doku").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Verdite = new net.tmachq.Ported_Blocks.block.Verdite(526, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Verdite").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Verdite_Brick = new net.tmachq.Ported_Blocks.block.Verdite_Brick(527, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Verdite_Brick").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Verdite_Ornate = new net.tmachq.Ported_Blocks.block.Verdite_Ornate(528, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Verdite_Ornate").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Verdite_Smooth = new net.tmachq.Ported_Blocks.block.Verdite_Smooth(529, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Verdite_Smooth").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Verdite_Tile = new net.tmachq.Ported_Blocks.block.Verdite_Tile(530, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Verdite_Tile").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Voidstone = new net.tmachq.Ported_Blocks.block.Voidstone(531, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Voidstone").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Voidstone_Brick = new net.tmachq.Ported_Blocks.block.Voidstone_Brick(532, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Voidstone_Brick").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Voidstone_Ornate = new net.tmachq.Ported_Blocks.block.Voidstone_Ornate(533, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Voidstone_Ornate").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Voidstone_Smooth = new net.tmachq.Ported_Blocks.block.Voidstone_Smooth(534, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Voidstone_Smooth").setCreativeTab(Ported_Blocks_Tab);
    
    public final Block Voidstone_Tile = new net.tmachq.Ported_Blocks.block.Voidstone_Tile(535, Material.rock)
    .setHardness(3.0f).setStepSound(Block.soundStoneFootstep)
    .setUnlocalizedName("Voidstone_Tile").setCreativeTab(Ported_Blocks_Tab);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {}
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
        GameRegistry.registerBlock(Alabaster, "Alabaster");
        LanguageRegistry.addName(Alabaster, "Alabaster");
        MinecraftForge.setBlockHarvestLevel(Alabaster, "pickaxe", 0);
        GameRegistry.registerBlock(Alabaster_Brick, "Alabaster_Brick");
        LanguageRegistry.addName(Alabaster_Brick, "Alabaster Brick");
        MinecraftForge.setBlockHarvestLevel(Alabaster_Brick, "pickaxe", 0);
        GameRegistry.registerBlock(Alabaster_Ornate, "Alabaster_Ornate");
        LanguageRegistry.addName(Alabaster_Ornate, "Ornate Alabaster");
        MinecraftForge.setBlockHarvestLevel(Alabaster_Ornate, "pickaxe", 0);
        GameRegistry.registerBlock(Alabaster_Smooth, "Alabaster_Smooth");
        LanguageRegistry.addName(Alabaster_Smooth, "Smooth Alabaster");
        MinecraftForge.setBlockHarvestLevel(Alabaster_Smooth, "pickaxe", 0);
        GameRegistry.registerBlock(Alabaster_Tile, "Alabaster_Tile");
        LanguageRegistry.addName(Alabaster_Tile, "Alabaster Tile");
        MinecraftForge.setBlockHarvestLevel(Alabaster_Tile, "pickaxe", 0);
        GameRegistry.registerBlock(Azurite, "Azurite");
        LanguageRegistry.addName(Azurite, "Azurite");
        MinecraftForge.setBlockHarvestLevel(Azurite, "pickaxe", 0);
        GameRegistry.registerBlock(Azurite_Brick, "Azurite_Brick");
        LanguageRegistry.addName(Azurite_Brick, "Azurite Brick");
        MinecraftForge.setBlockHarvestLevel(Azurite_Brick, "pickaxe", 0);
        GameRegistry.registerBlock(Azurite_Ornate, "Azurite_Ornate");
        LanguageRegistry.addName(Azurite_Ornate, "Ornate Azurite");
        MinecraftForge.setBlockHarvestLevel(Azurite_Ornate, "pickaxe", 0);
        GameRegistry.registerBlock(Azurite_Smooth, "Azurite_Smooth");
        LanguageRegistry.addName(Azurite_Smooth, "Smooth Azurite");
        MinecraftForge.setBlockHarvestLevel(Azurite_Smooth, "pickaxe", 0);
        GameRegistry.registerBlock(Azurite_Tile, "Azurite_Tile");
        LanguageRegistry.addName(Azurite_Tile, "Azurite Tile");
        MinecraftForge.setBlockHarvestLevel(Azurite_Tile, "pickaxe", 0);
        GameRegistry.registerBlock(SandStone_Doku, "SandStone_Doku");
        LanguageRegistry.addName(SandStone_Doku, "SandStone (Doku)");
        MinecraftForge.setBlockHarvestLevel(SandStone_Doku, "pickaxe", 0);
        GameRegistry.registerBlock(SandStone_Brick_Doku, "SandStone_Brick_Doku");
        LanguageRegistry.addName(SandStone_Brick_Doku, "SandStone Brick (Doku)");
        MinecraftForge.setBlockHarvestLevel(SandStone_Brick_Doku, "pickaxe", 0);
        GameRegistry.registerBlock(SandStone_Ornate_Doku, "SandStone_Ornate_Doku");
        LanguageRegistry.addName(SandStone_Ornate_Doku, "Ornate SandStone (Doku)");
        MinecraftForge.setBlockHarvestLevel(SandStone_Ornate_Doku, "pickaxe", 0);
        GameRegistry.registerBlock(SandStone_Smooth_Doku, "SandStone_Smooth_Doku");
        LanguageRegistry.addName(SandStone_Smooth_Doku, "Smooth SandStone (Doku)");
        MinecraftForge.setBlockHarvestLevel(SandStone_Smooth_Doku, "pickaxe", 0);
        GameRegistry.registerBlock(SandStone_Tile_Doku, "SandStone_Tile_Doku");
        LanguageRegistry.addName(SandStone_Tile_Doku, "SandStone Tile (Doku)");
        MinecraftForge.setBlockHarvestLevel(SandStone_Tile_Doku, "pickaxe", 0);
        GameRegistry.registerBlock(Sanguinite, "Sanguinite");
        LanguageRegistry.addName(Sanguinite, "Sanguinite");
        MinecraftForge.setBlockHarvestLevel(Sanguinite, "pickaxe", 0);
        GameRegistry.registerBlock(Sanguinite_Brick, "Sanguinite_Brick");
        LanguageRegistry.addName(Sanguinite_Brick, "Sanguinite Brick");
        MinecraftForge.setBlockHarvestLevel(Sanguinite_Brick, "pickaxe", 0);
        GameRegistry.registerBlock(Sanguinite_Ornate, "Sanguinite_Ornate");
        LanguageRegistry.addName(Sanguinite_Ornate, "Ornate Sanguinite");
        MinecraftForge.setBlockHarvestLevel(Sanguinite_Ornate, "pickaxe", 0);
        GameRegistry.registerBlock(Sanguinite_Smooth, "Sanguinite_Smooth");
        LanguageRegistry.addName(Sanguinite_Smooth, "Smooth Sanguinite");
        MinecraftForge.setBlockHarvestLevel(Sanguinite_Smooth, "pickaxe", 0);
        GameRegistry.registerBlock(Sanguinite_Tile, "Sanguinite_Tile");
        LanguageRegistry.addName(Sanguinite_Tile, "Sanguinite Tile");
        MinecraftForge.setBlockHarvestLevel(Sanguinite_Tile, "pickaxe", 0);
        GameRegistry.registerBlock(Stone_Doku, "Stone_Doku");
        LanguageRegistry.addName(Stone_Doku, "Stone (Doku)");
        MinecraftForge.setBlockHarvestLevel(Stone_Doku, "pickaxe", 0);
        GameRegistry.registerBlock(Stone_Brick_Doku, "Stone_Brick_Doku");
        LanguageRegistry.addName(Stone_Brick_Doku, "Stone Brick (Doku)");
        MinecraftForge.setBlockHarvestLevel(Stone_Brick_Doku, "pickaxe", 0);
        GameRegistry.registerBlock(Stone_Ornate_Doku, "Stone_Ornate_Doku");
        LanguageRegistry.addName(Stone_Ornate_Doku, "Ornate Stone (Doku)");
        MinecraftForge.setBlockHarvestLevel(Stone_Ornate_Doku, "pickaxe", 0);
        GameRegistry.registerBlock(Stone_Smooth_Doku, "Stone_Smooth_Doku");
        LanguageRegistry.addName(Stone_Smooth_Doku, "Smooth Stone (Doku)");
        MinecraftForge.setBlockHarvestLevel(Stone_Smooth_Doku, "pickaxe", 0);
        GameRegistry.registerBlock(Stone_Tile_Doku, "Stone_Tile_Doku");
        LanguageRegistry.addName(Stone_Tile_Doku, "Stone Tile (Doku)");
        MinecraftForge.setBlockHarvestLevel(Stone_Tile_Doku, "pickaxe", 0);
        GameRegistry.registerBlock(Verdite, "Verdite");
        LanguageRegistry.addName(Verdite, "Verdite");
        MinecraftForge.setBlockHarvestLevel(Verdite, "pickaxe", 0);
        GameRegistry.registerBlock(Verdite_Brick, "Verdite_Brick");
        LanguageRegistry.addName(Verdite_Brick, "Verdite Brick");
        MinecraftForge.setBlockHarvestLevel(Verdite_Brick, "pickaxe", 0);
        GameRegistry.registerBlock(Verdite_Ornate, "Verdite_Ornate");
        LanguageRegistry.addName(Verdite_Ornate, "Ornate Verdite");
        MinecraftForge.setBlockHarvestLevel(Verdite_Ornate, "pickaxe", 0);
        GameRegistry.registerBlock(Verdite_Smooth, "Verdite_Smooth");
        LanguageRegistry.addName(Verdite_Smooth, "Smooth Verdite");
        MinecraftForge.setBlockHarvestLevel(Verdite_Smooth, "pickaxe", 0);
        GameRegistry.registerBlock(Verdite_Tile, "Verdite_Tile");
        LanguageRegistry.addName(Verdite_Tile, "Verdite Tile");
        MinecraftForge.setBlockHarvestLevel(Verdite_Tile, "pickaxe", 0);
        GameRegistry.registerBlock(Voidstone, "Voidstone");
        LanguageRegistry.addName(Voidstone, "Voidstone");
        MinecraftForge.setBlockHarvestLevel(Voidstone, "pickaxe", 0);
        GameRegistry.registerBlock(Voidstone_Brick, "Voidstone_Brick");
        LanguageRegistry.addName(Voidstone_Brick, "Voidstone Brick");
        MinecraftForge.setBlockHarvestLevel(Voidstone_Brick, "pickaxe", 0);
        GameRegistry.registerBlock(Voidstone_Ornate, "Voidstone_Ornate");
        LanguageRegistry.addName(Voidstone_Ornate, "Ornate Voidstone");
        MinecraftForge.setBlockHarvestLevel(Voidstone_Ornate, "pickaxe", 0);
        GameRegistry.registerBlock(Voidstone_Smooth, "Voidstone_Smooth");
        LanguageRegistry.addName(Voidstone_Smooth, "Smooth Voidstone");
        MinecraftForge.setBlockHarvestLevel(Voidstone_Smooth, "pickaxe", 0);
        GameRegistry.registerBlock(Voidstone_Tile, "Voidstone_Tile");
        LanguageRegistry.addName(Voidstone_Tile, "Voidstone Tile");
        MinecraftForge.setBlockHarvestLevel(Voidstone_Tile, "pickaxe", 0);
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.Ported_Blocks_Tab", "en_US", "Ported Blocks");
    }

}

package me.manossef.newwalls;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;
import java.util.function.Supplier;

public class NewWallsBlocks {
    public static final Block POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks", SoundType.STONE, 1.5F, 6.0F, MapColor.DIRT);
    public static final Block POLISHED_GRANITE_BRICK_SLAB = registerSlab("polished_granite_brick_slab", SoundType.STONE, 1.5F, 6.0F, MapColor.DIRT);
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = registerStairs("polished_granite_brick_stairs", () -> POLISHED_GRANITE_BRICKS, SoundType.STONE, 1.5F, 6.0F, MapColor.DIRT);
    public static final Block POLISHED_GRANITE_BRICK_WALL = registerWall("polished_granite_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.DIRT);
    public static final Block POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks", SoundType.STONE, 1.5F, 6.0F,MapColor.QUARTZ);
    public static final Block POLISHED_DIORITE_BRICK_SLAB = registerSlab("polished_diorite_brick_slab", SoundType.STONE, 1.5F, 6.0F, MapColor.QUARTZ);
    public static final Block POLISHED_DIORITE_BRICK_STAIRS = registerStairs("polished_diorite_brick_stairs", () -> POLISHED_DIORITE_BRICKS, SoundType.STONE, 1.5F, 6.0F, MapColor.QUARTZ);
    public static final Block POLISHED_DIORITE_BRICK_WALL = registerWall("polished_diorite_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.QUARTZ);
    public static final Block POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final Block POLISHED_ANDESITE_BRICK_SLAB = registerSlab("polished_andesite_brick_slab", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final Block POLISHED_ANDESITE_BRICK_STAIRS = registerStairs("polished_andesite_brick_stairs", () -> POLISHED_ANDESITE_BRICKS, SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final Block POLISHED_ANDESITE_BRICK_WALL = registerWall("polished_andesite_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final Block QUARTZ_WALL = registerWall("quartz_wall", SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final Block PURPUR_WALL = registerWall("purpur_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.COLOR_MAGENTA);
    public static final Block PRISMARINE_BRICK_WALL = registerWall("prismarine_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.DIAMOND);
    public static final Block DARK_PRISMARINE_WALL = registerWall("dark_prismarine_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.DIAMOND);
    public static final Block SMOOTH_SANDSTONE_WALL = registerWall("smooth_sandstone_wall", SoundType.STONE, 2.0F, 6.0F, MapColor.SAND);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerWall("smooth_red_sandstone_wall", SoundType.STONE, 2.0F, 6.0F, MapColor.COLOR_ORANGE);
    public static final Block SMOOTH_QUARTZ_WALL = registerWall("smooth_quartz_wall", SoundType.STONE, 2.0F, 6.0F, MapColor.QUARTZ);
    public static final Block STONE_WALL = registerWall("stone_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final Block POLISHED_GRANITE_WALL = registerWall("polished_granite_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.DIRT);
    public static final Block POLISHED_DIORITE_WALL = registerWall("polished_diorite_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.QUARTZ);
    public static final Block POLISHED_ANDESITE_WALL = registerWall("polished_andesite_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final Block SMOOTH_STONE_STAIRS = registerStairs("smooth_stone_stairs", () -> Blocks.SMOOTH_STONE, SoundType.STONE, 2.0F, 6.0F, MapColor.STONE);
    public static final Block SMOOTH_STONE_WALL = registerWall("smooth_stone_wall", SoundType.STONE, 2.0F, 6.0F, MapColor.STONE);
    public static final Block CUT_SANDSTONE_STAIRS = registerStairs("cut_sandstone_stairs", () -> Blocks.CUT_SANDSTONE, SoundType.STONE, 0.8F, 0.8F, MapColor.SAND);
    public static final Block CUT_SANDSTONE_WALL = registerWall("cut_sandstone_wall", SoundType.STONE, 0.8F, 0.8F, MapColor.SAND);
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerStairs("cut_red_sandstone_stairs", () -> Blocks.CUT_RED_SANDSTONE, SoundType.STONE, 0.8F, 0.8F, MapColor.COLOR_ORANGE);
    public static final Block CUT_RED_SANDSTONE_WALL = registerWall("cut_red_sandstone_wall", SoundType.STONE, 0.8F, 0.8F, MapColor.COLOR_ORANGE);
    public static final Block CRACKED_STONE_BRICK_SLAB = registerSlab("cracked_stone_brick_slab", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final Block CRACKED_STONE_BRICK_STAIRS = registerStairs("cracked_stone_brick_stairs", () -> Blocks.CRACKED_STONE_BRICKS, SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final Block CRACKED_STONE_BRICK_WALL = registerWall("cracked_stone_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.STONE);
    public static final Block CRACKED_NETHER_BRICK_SLAB = registerSlab("cracked_nether_brick_slab", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final Block CRACKED_NETHER_BRICK_STAIRS = registerStairs("cracked_nether_brick_stairs", () -> Blocks.CRACKED_NETHER_BRICKS, SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final Block CRACKED_NETHER_BRICK_WALL = registerWall("cracked_nether_brick_wall", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final Block CRACKED_NETHER_BRICK_FENCE = registerFence("cracked_nether_brick_fence", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = registerFenceGate("cracked_nether_brick_fence_gate", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final Block RED_NETHER_BRICK_FENCE = registerFence("red_nether_brick_fence", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerFenceGate("red_nether_brick_fence_gate", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final Block NETHER_BRICK_FENCE_GATE = registerFenceGate("nether_brick_fence_gate", SoundType.NETHER_BRICKS, 2.0F, 6.0F, MapColor.NETHER);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerSlab("cracked_polished_blackstone_brick_slab", SoundType.STONE, 1.5F, 6.0F, MapColor.COLOR_BLACK);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerStairs("cracked_polished_blackstone_brick_stairs", () -> Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, SoundType.STONE, 1.5F, 6.0F, MapColor.COLOR_BLACK);
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerWall("cracked_polished_blackstone_brick_wall", SoundType.STONE, 1.5F, 6.0F, MapColor.COLOR_BLACK);
    public static final Block QUARTZ_BRICK_SLAB = registerSlab("quartz_brick_slab", SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final Block QUARTZ_BRICK_STAIRS = registerStairs("quartz_brick_stairs", () -> Blocks.QUARTZ_BRICKS, SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final Block QUARTZ_BRICK_WALL = registerWall("quartz_brick_wall", SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final Block QUARTZ_BRICK_FENCE = registerFence("quartz_brick_fence", SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final Block QUARTZ_BRICK_FENCE_GATE = registerFenceGate("quartz_brick_fence_gate", SoundType.STONE, 0.8F, 0.8F, MapColor.QUARTZ);
    public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = registerSlab("cracked_deepslate_brick_slab", SoundType.DEEPSLATE_BRICKS, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = registerStairs("cracked_deepslate_brick_stairs", () -> Blocks.CRACKED_DEEPSLATE_BRICKS, SoundType.DEEPSLATE_BRICKS, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final Block CRACKED_DEEPSLATE_BRICK_WALL = registerWall("cracked_deepslate_brick_wall", SoundType.DEEPSLATE_BRICKS, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final Block CRACKED_DEEPSLATE_TILE_SLAB = registerSlab("cracked_deepslate_tile_slab", SoundType.DEEPSLATE_TILES, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = registerStairs("cracked_deepslate_tile_stairs", () -> Blocks.CRACKED_DEEPSLATE_TILES, SoundType.DEEPSLATE_TILES, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final Block CRACKED_DEEPSLATE_TILE_WALL = registerWall("cracked_deepslate_tile_wall", SoundType.DEEPSLATE_TILES, 3.0F, 6.0F, MapColor.DEEPSLATE);
    public static final Block CALCITE_SLAB = registerSlab("calcite_slab", SoundType.CALCITE, 0.75F, 0.75F, MapColor.TERRACOTTA_WHITE);
    public static final Block CALCITE_STAIRS = registerStairs("calcite_stairs", () -> Blocks.CALCITE, SoundType.CALCITE, 0.75F, 0.75F, MapColor.TERRACOTTA_WHITE);
    public static final Block CALCITE_WALL = registerWall("calcite_wall", SoundType.CALCITE, 0.75F, 0.75F, MapColor.TERRACOTTA_WHITE);
    public static final Block SMOOTH_BASALT_SLAB = registerSlab("smooth_basalt_slab", SoundType.BASALT, 1.25F, 4.2F, MapColor.COLOR_BLACK);
    public static final Block SMOOTH_BASALT_STAIRS = registerStairs("smooth_basalt_stairs", () -> Blocks.SMOOTH_BASALT, SoundType.BASALT, 1.25F, 4.2F, MapColor.COLOR_BLACK);
    public static final Block SMOOTH_BASALT_WALL = registerWall("smooth_basalt_wall", SoundType.BASALT, 1.25F, 4.2F, MapColor.COLOR_BLACK);
    public static final Block END_STONE_SLAB = registerSlab("end_stone_slab", SoundType.STONE, 3.0F, 9.0F, MapColor.SAND);
    public static final Block END_STONE_STAIRS = registerStairs("end_stone_stairs", () -> Blocks.END_STONE, SoundType.STONE, 3.0F, 9.0F, MapColor.SAND);
    public static final Block END_STONE_WALL = registerWall("end_stone_wall", SoundType.STONE, 3.0F, 9.0F, MapColor.SAND);
    public static final Block DRIPSTONE_SLAB = registerSlab("dripstone_slab", SoundType.DRIPSTONE_BLOCK, 1.5F, 1.0F, MapColor.TERRACOTTA_BROWN);
    public static final Block DRIPSTONE_STAIRS = registerStairs("dripstone_stairs", () -> Blocks.DRIPSTONE_BLOCK, SoundType.DRIPSTONE_BLOCK, 1.5F, 1.0F, MapColor.TERRACOTTA_BROWN);
    public static final Block DRIPSTONE_WALL = registerWall("dripstone_wall", SoundType.DRIPSTONE_BLOCK, 1.5F, 1.0F, MapColor.TERRACOTTA_BROWN);

    public static void initialize() {
    }

    private static Block registerBlock(String id, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return register(id, Block::new, soundType, hardness, resistance, mapColor);
    }

    private static Block registerSlab(String id, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return register(id, SlabBlock::new, soundType, hardness, resistance, mapColor);
    }

    private static Block registerStairs(String id, Supplier<Block> base, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return register(id, p -> new StairBlock(base.get().defaultBlockState(), p), soundType, hardness, resistance, mapColor);
    }

    private static Block registerWall(String id, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return register(id, WallBlock::new, soundType, hardness, resistance, mapColor);
    }

    private static Block registerFence(String id, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return register(id, FenceBlock::new, soundType, hardness, resistance, mapColor);
    }

    private static Block registerFenceGate(String id, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return register(id, p -> new FenceGateBlock(WoodType.OAK, p), soundType, hardness, resistance, mapColor);
    }

    private static Block register(String id, Function<BlockBehaviour.Properties, Block> blockFactory, SoundType soundType, float hardness, float resistance, MapColor mapColor) {
        return register(id, blockFactory, BlockBehaviour.Properties.of()
            .sound(soundType)
            .strength(hardness, resistance)
            .mapColor(mapColor)
            .requiresCorrectToolForDrops());
    }

    private static Block register(String id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        Block block = register(blockKey(id), blockFactory, properties);
        ResourceKey<Item> itemId = itemKey(id);
        BlockItem blockItem = new BlockItem(block, new Item.Properties());
        Registry.register(BuiltInRegistries.ITEM, itemId, blockItem);
        return block;
    }

    private static Block register(ResourceKey<Block> id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        Block block = blockFactory.apply(properties);
        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    private static ResourceKey<Block> blockKey(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(NewWalls.MOD_ID, name));
    }

    private static ResourceKey<Item> itemKey(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(NewWalls.MOD_ID, name));
    }
}
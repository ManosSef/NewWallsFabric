package me.manossef.newwalls;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class NewWallsCreativeTabs {
    public static final ResourceKey<CreativeModeTab> CREATIVE_TAB_KEY = ResourceKey.create(
        BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(NewWalls.MOD_ID, "creative_tab")
    );
    public static final CreativeModeTab CREATIVE_TAB = FabricItemGroup.builder()
        .icon(() -> new ItemStack(Items.COBBLESTONE_WALL))
        .title(Component.translatable("itemGroup.newwalls"))
        .displayItems((i, output) -> {
            output.accept(NewWallsBlocks.STONE_WALL);
            output.accept(NewWallsBlocks.SMOOTH_STONE_STAIRS);
            output.accept(NewWallsBlocks.SMOOTH_STONE_WALL);
            output.accept(NewWallsBlocks.CRACKED_STONE_BRICK_STAIRS);
            output.accept(NewWallsBlocks.CRACKED_STONE_BRICK_SLAB);
            output.accept(NewWallsBlocks.CRACKED_STONE_BRICK_WALL);
            output.accept(NewWallsBlocks.POLISHED_GRANITE_WALL);
            output.accept(NewWallsBlocks.POLISHED_GRANITE_BRICKS);
            output.accept(NewWallsBlocks.POLISHED_GRANITE_BRICK_STAIRS);
            output.accept(NewWallsBlocks.POLISHED_GRANITE_BRICK_SLAB);
            output.accept(NewWallsBlocks.POLISHED_GRANITE_BRICK_WALL);
            output.accept(NewWallsBlocks.POLISHED_DIORITE_WALL);
            output.accept(NewWallsBlocks.POLISHED_DIORITE_BRICKS);
            output.accept(NewWallsBlocks.POLISHED_DIORITE_BRICK_STAIRS);
            output.accept(NewWallsBlocks.POLISHED_DIORITE_BRICK_SLAB);
            output.accept(NewWallsBlocks.POLISHED_DIORITE_BRICK_WALL);
            output.accept(NewWallsBlocks.POLISHED_ANDESITE_WALL);
            output.accept(NewWallsBlocks.POLISHED_ANDESITE_BRICKS);
            output.accept(NewWallsBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
            output.accept(NewWallsBlocks.POLISHED_ANDESITE_BRICK_SLAB);
            output.accept(NewWallsBlocks.POLISHED_ANDESITE_BRICK_WALL);
            output.accept(NewWallsBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
            output.accept(NewWallsBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
            output.accept(NewWallsBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
            output.accept(NewWallsBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
            output.accept(NewWallsBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
            output.accept(NewWallsBlocks.CRACKED_DEEPSLATE_TILE_WALL);
            output.accept(NewWallsBlocks.SMOOTH_SANDSTONE_WALL);
            output.accept(NewWallsBlocks.SMOOTH_RED_SANDSTONE_WALL);
            output.accept(NewWallsBlocks.CUT_SANDSTONE_STAIRS);
            output.accept(NewWallsBlocks.CUT_SANDSTONE_WALL);
            output.accept(NewWallsBlocks.CUT_RED_SANDSTONE_STAIRS);
            output.accept(NewWallsBlocks.CUT_RED_SANDSTONE_WALL);
            output.accept(NewWallsBlocks.PRISMARINE_BRICK_WALL);
            output.accept(NewWallsBlocks.DARK_PRISMARINE_WALL);
            output.accept(NewWallsBlocks.NETHER_BRICK_FENCE_GATE);
            output.accept(NewWallsBlocks.CRACKED_NETHER_BRICK_STAIRS);
            output.accept(NewWallsBlocks.CRACKED_NETHER_BRICK_SLAB);
            output.accept(NewWallsBlocks.CRACKED_NETHER_BRICK_WALL);
            output.accept(NewWallsBlocks.CRACKED_NETHER_BRICK_FENCE);
            output.accept(NewWallsBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);
            output.accept(NewWallsBlocks.RED_NETHER_BRICK_FENCE);
            output.accept(NewWallsBlocks.RED_NETHER_BRICK_FENCE_GATE);
            output.accept(NewWallsBlocks.SMOOTH_BASALT_STAIRS);
            output.accept(NewWallsBlocks.SMOOTH_BASALT_SLAB);
            output.accept(NewWallsBlocks.SMOOTH_BASALT_WALL);
            output.accept(NewWallsBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
            output.accept(NewWallsBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
            output.accept(NewWallsBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
            output.accept(NewWallsBlocks.END_STONE_STAIRS);
            output.accept(NewWallsBlocks.END_STONE_SLAB);
            output.accept(NewWallsBlocks.END_STONE_WALL);
            output.accept(NewWallsBlocks.PURPUR_WALL);
            output.accept(NewWallsBlocks.QUARTZ_WALL);
            output.accept(NewWallsBlocks.QUARTZ_BRICK_STAIRS);
            output.accept(NewWallsBlocks.QUARTZ_BRICK_SLAB);
            output.accept(NewWallsBlocks.QUARTZ_BRICK_WALL);
            output.accept(NewWallsBlocks.QUARTZ_BRICK_FENCE);
            output.accept(NewWallsBlocks.QUARTZ_BRICK_FENCE_GATE);
            output.accept(NewWallsBlocks.SMOOTH_QUARTZ_WALL);
            output.accept(NewWallsBlocks.CALCITE_STAIRS);
            output.accept(NewWallsBlocks.CALCITE_SLAB);
            output.accept(NewWallsBlocks.CALCITE_WALL);
            output.accept(NewWallsBlocks.DRIPSTONE_STAIRS);
            output.accept(NewWallsBlocks.DRIPSTONE_SLAB);
            output.accept(NewWallsBlocks.DRIPSTONE_WALL);
        }).build();

    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CREATIVE_TAB_KEY, CREATIVE_TAB);
    }
}
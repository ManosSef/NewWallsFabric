package me.manossef.newwalls;

import net.fabricmc.api.ModInitializer;

public class NewWalls implements ModInitializer {
    public static final String MOD_ID = "newwalls";

    @Override
    public void onInitialize() {
        NewWallsBlocks.initialize();
        NewWallsCreativeTabs.initialize();
    }
}
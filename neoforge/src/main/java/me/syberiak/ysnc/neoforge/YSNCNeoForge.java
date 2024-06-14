package me.syberiak.ysnc.neoforge;

import net.neoforged.fml.common.Mod;

import me.syberiak.ysnc.YSNC;

@Mod(YSNC.MOD_ID)
public final class YSNCNeoForge {
    public YSNCNeoForge() {
        // Run our common setup.
        YSNC.init();
    }
}

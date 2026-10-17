package com.headshrink;

import org.bukkit.plugin.java.JavaPlugin;

public class HeadShrink extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new ShrinkMenu(this), this);
        getLogger().info("HeadShrink enabled.");
    }
}

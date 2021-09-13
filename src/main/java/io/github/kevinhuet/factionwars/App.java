package io.github.kevinhuet.factionwars;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {

    public App instance = this;

    @Override
    public void onEnable() {

        getLogger().info("enable");
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

    public App getInstance() {
        if (instance == null)
            this.instance = this;
        return instance;
    }
}

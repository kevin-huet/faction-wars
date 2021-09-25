package io.github.kevinhuet.factionwars;

import io.github.kevinhuet.factionwars.listeners.BlockBreakListener;
import io.github.kevinhuet.factionwars.listeners.InteractChestListener;
import io.github.kevinhuet.factionwars.listeners.PlayerJoinListener;
import org.bukkit.plugin.PluginManager;

/**
 * The type Listeners.
 */
public class Listeners {

    /**
     * Instantiates a new Listeners.
     *
     * @param app           the app
     * @param pluginManager the plugin manager
     */
    public Listeners(App app, PluginManager pluginManager) {
        pluginManager.registerEvents(new InteractChestListener(), app);
        pluginManager.registerEvents(new BlockBreakListener(), app);
        pluginManager.registerEvents(new PlayerJoinListener(), app);
    }
}
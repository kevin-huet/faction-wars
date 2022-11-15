package fr.kevinhuet.factionwars;

import fr.kevinhuet.factionwars.listeners.*;
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
        pluginManager.registerEvents(new PlayerDamageListener(), app);
        pluginManager.registerEvents(new PlayerCombatListener(), app);
        pluginManager.registerEvents(new PlayerCommandListener(), app);
        pluginManager.registerEvents(new BlockBreakListener(), app);
        pluginManager.registerEvents(new BlockBreakListener(), app);
        pluginManager.registerEvents(new PlayerJoinListener(), app);
    }
}
package io.github.kevinhuet.factionwars.config.faction;

import io.github.kevinhuet.factionwars.App;
import io.github.kevinhuet.factionwars.config.Config;
import org.bukkit.Location;

import java.io.File;

/**
 * The type Location config.
 */
public class LocationConfig extends Config {

    private static LocationConfig instance;

    /**
     * Instantiates a new Location config.
     */
    public LocationConfig() {
        super(new File(App.getPlugin().getDataFolder().getAbsolutePath()+"/loc_data.json"));
    }

    /**
     * Add location.
     *
     * @param location the location
     */
    public void addLocation(Location location) {

    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static LocationConfig getInstance() {
        if (instance == null) {
            instance = new LocationConfig();
        }
        return instance;
    }
}

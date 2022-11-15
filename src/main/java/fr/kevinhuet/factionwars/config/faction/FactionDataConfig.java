package fr.kevinhuet.factionwars.config.faction;

import fr.kevinhuet.factionwars.App;
import fr.kevinhuet.factionwars.config.Config;
import fr.kevinhuet.factionwars.entity.WFaction;
import fr.kevinhuet.factionwars.services.FactionManager;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * The type Faction data config.
 */
public class FactionDataConfig extends Config {

    private static FactionDataConfig instance;

    /**
     * Instantiates a new Faction data config.
     */
    public FactionDataConfig() {
        super(new File(App.getPlugin().getDataFolder().getAbsolutePath()+"/factions_data.json"));
    }

    /**
     * Add faction.
     *
     * @param faction the faction
     */
    public void addFaction(WFaction faction) {
        this.addObjectInJson("factions", faction);
    }

    public void saveAllFactions() {
        try {
            List<WFaction> jsonList = FactionManager.getInstance().getFactionList();

            if (!jsonList.isEmpty())
                saveJsonList("factions", Arrays.asList(jsonList.toArray()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<WFaction> getAllFactions() {
        try {
            return this.getObjectInJson("factions");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Gets factions.
     */
    public void getFactions() {
        this.getObjectInJson("factions");
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static FactionDataConfig getInstance() {
        if (instance == null)
            instance = new FactionDataConfig();
        return instance;
    }
}

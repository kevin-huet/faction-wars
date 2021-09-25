package io.github.kevinhuet.factionwars.config.faction;

import com.google.gson.reflect.TypeToken;
import io.github.kevinhuet.factionwars.App;
import io.github.kevinhuet.factionwars.config.Config;
import io.github.kevinhuet.factionwars.entity.WFaction;
import io.github.kevinhuet.factionwars.services.FactionManager;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/**
 * The type Faction config.
 */
public class FactionConfig extends Config {

    private static FactionConfig instance;

    /**
     * Instantiates a new Faction config.
     */
    public FactionConfig() {
        super(new File(App.getPlugin().getDataFolder().getAbsolutePath()+"/faction.json"));
    }


    /**
     * Gets max power.
     *
     * @return the max power
     */
    public float getMaxPower() {
        return 0;
    }

    /**
     * Gets min power.
     *
     * @return the min power
     */
    public float getMinPower() {
        return 0;
    }

    /**
     * Gets max player per faction.
     *
     * @return the max player per faction
     */
    public float getMaxPlayerPerFaction() {
        return 0;
    }

    /**
     * Gets vault slot per lvl.
     *
     * @return the vault slot per lvl
     */
    public int getVaultSlotPerLvl() {
        return 0;
    }

    /**
     * Gets great vault slot.
     *
     * @return the great vault slot
     */
    public int getGreatVaultSlot() {
        return 0;
    }

    /**
     * Gets great vault requirement per slot.
     *
     * @return the great vault requirement per slot
     */
    public int getGreatVaultRequirementPerSlot() {
        return 0;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static FactionConfig getInstance() {
        if (instance == null)
            instance = new FactionConfig();
        return instance;
    }
}

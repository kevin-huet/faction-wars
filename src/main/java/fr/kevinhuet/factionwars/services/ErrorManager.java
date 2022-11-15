package fr.kevinhuet.factionwars.services;

import fr.kevinhuet.factionwars.entity.Status;
import org.bukkit.entity.Player;

/**
 * The type Error manager.
 */
public class ErrorManager {

    private static ErrorManager instance = null;

    /**
     * Instantiates a new Error manager.
     */
    public ErrorManager() {
    }

    /**
     * Print error to player.
     *
     * @param player the player
     * @param status the status
     */
    public void printErrorToPlayer(Player player, Status status) {
        if (status == Status.DONT_HAVE_FACTION_PERMISSION) {
            player.sendMessage("");
        }
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static ErrorManager getInstance() {
        if (instance == null)
            instance = new ErrorManager();
        return instance;
    }
}

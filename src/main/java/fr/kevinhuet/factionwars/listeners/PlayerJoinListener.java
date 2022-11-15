package fr.kevinhuet.factionwars.listeners;

import fr.kevinhuet.factionwars.services.WPlayerManager;
import fr.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

/**
 * The type Player join listener.
 */
public class PlayerJoinListener implements Listener {

    /**
     * On player join event boolean.
     *
     * @param event the event
     * @return the boolean
     */
    @EventHandler(priority = EventPriority.HIGH)
    public boolean onPlayerJoinEvent(PlayerLoginEvent event) {
        WPlayerManager.getInstance().addPlayer(new WPlayer(event.getPlayer()));
        return true;
    }

}

package fr.kevinhuet.factionwars.listeners;

import fr.kevinhuet.factionwars.entity.Relation;
import fr.kevinhuet.factionwars.entity.WFaction;
import fr.kevinhuet.factionwars.entity.WPlayer;
import fr.kevinhuet.factionwars.services.FactionManager;
import fr.kevinhuet.factionwars.services.WPlayerManager;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PlayerCommandListener implements Listener {

    public boolean playerCommandEvent(PlayerCommandPreprocessEvent e) {
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(e.getPlayer());
        FactionManager.getInstance().getFactionByChunk(wPlayer.getPlayer().getLocation().getChunk());
        // Todo enemy faction condition
        if (false) {
            e.setCancelled(true);
            return false;
        }
        return true;
    }
}

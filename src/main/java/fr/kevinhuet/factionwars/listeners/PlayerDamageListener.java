package fr.kevinhuet.factionwars.listeners;

import fr.kevinhuet.factionwars.entity.WFaction;
import fr.kevinhuet.factionwars.entity.WPlayer;
import fr.kevinhuet.factionwars.services.FactionManager;
import fr.kevinhuet.factionwars.services.WPlayerManager;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class PlayerDamageListener implements Listener {

    public boolean blockBreakFactionEvent(BlockBreakEvent e) {
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(e.getPlayer());
        WFaction wFaction = FactionManager.getInstance().getFactionByChunk(e.getBlock().getChunk());

        if (wFaction != wPlayer.getFaction() && wFaction != null) {

        }
        return true;
    }
}

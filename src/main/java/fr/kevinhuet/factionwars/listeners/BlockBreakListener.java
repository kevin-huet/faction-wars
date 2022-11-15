package fr.kevinhuet.factionwars.listeners;

import fr.kevinhuet.factionwars.services.WPlayerManager;
import fr.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {

    public boolean blockBreakFactionEvent(BlockBreakEvent e) {
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(e.getPlayer());

        return true;
    }
}

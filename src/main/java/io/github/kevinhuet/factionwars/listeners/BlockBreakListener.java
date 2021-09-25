package io.github.kevinhuet.factionwars.listeners;

import io.github.kevinhuet.factionwars.entity.WPlayer;
import io.github.kevinhuet.factionwars.services.WPlayerManager;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakListener implements Listener {

    public boolean blockBreakFactionEvent(BlockBreakEvent e) {
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(e.getPlayer());

        return true;
    }
}

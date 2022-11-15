package fr.kevinhuet.factionwars.listeners;

import fr.kevinhuet.factionwars.entity.WPlayer;
import fr.kevinhuet.factionwars.services.WPlayerManager;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class PlayerCombatListener implements Listener {

    public boolean blockBreakFactionEvent(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
            WPlayer damager = WPlayerManager.getInstance().getWPlayerByPlayer((Player) e.getDamager());
            WPlayer target = WPlayerManager.getInstance().getWPlayerByPlayer((Player) e.getEntity());

        }
        return true;
    }
}

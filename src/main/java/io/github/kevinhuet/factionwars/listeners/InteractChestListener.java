package io.github.kevinhuet.factionwars.listeners;

import io.github.kevinhuet.factionwars.entity.GreatVault;
import io.github.kevinhuet.factionwars.entity.Status;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import io.github.kevinhuet.factionwars.services.GreatVaultManager;
import io.github.kevinhuet.factionwars.services.WPlayerManager;
import org.bukkit.Color;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.material.Wool;

public class InteractChestListener implements Listener {

    @EventHandler
    public boolean openGreatVault(PlayerInteractEvent event) {
        WPlayer player = WPlayerManager.getInstance().getWPlayerByPlayer(event.getPlayer());
        player.getPlayer().openInventory(GreatVaultManager.getInstance().getValidationUI());
        return true;
    }

    public boolean validationGreatVault(InventoryClickEvent event) {
        WPlayer player = WPlayerManager.getInstance().getWPlayerByPlayer((Player) event.getWhoClicked());
        DyeColor color = null;

        event.setCancelled(true);
        if (!(event.getCurrentItem().getData() instanceof Wool))
            return false;
        color = ((Wool) event.getCurrentItem().getData()).getColor();
        if (color.equals(DyeColor.GREEN) && GreatVaultManager.getInstance().verifyVault(player) == Status.OK) {
            GreatVaultManager.getInstance().getGreatVaultRewards(player.getFaction());
        } else {
            player.getPlayer().sendRawMessage("");
        }
        return true;
    }
}

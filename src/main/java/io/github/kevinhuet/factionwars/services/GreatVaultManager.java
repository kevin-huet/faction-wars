package io.github.kevinhuet.factionwars.services;

import io.github.kevinhuet.factionwars.entity.Role;
import io.github.kevinhuet.factionwars.entity.Status;
import io.github.kevinhuet.factionwars.entity.WFaction;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.inventory.ItemStack;

public class GreatVaultManager {

    private GreatVaultManager instance;

    public GreatVaultManager() {
    }

    public Status openGreatVault(WPlayer player) {
        WFaction faction = player.getFaction();
        if (player.getRole().isAtLeast(Role.OFFICER)) {
            return Status.DONT_HAVE_FACTION_PERMISSION;
        }
        for(ItemStack i : player.getFaction().getGreatVault().getRewards()){
            if (faction.getVault().getInventory().firstEmpty() < faction.getGreatVault().getRewards().size())
                return Status.VAULT_FULL;
        }
        return Status.OK;
    }

    public Status getGreatVaultRewards(WFaction faction) {
        for(ItemStack i : player.getFaction().getGreatVault().getRewards()) {
            if (faction.getVault().getInventory().firstEmpty() < faction.getGreatVault().getRewards().size())
                player.getFaction().getVault().getInventory().addItem(i);
        }

    }
}

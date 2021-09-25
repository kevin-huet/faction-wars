package io.github.kevinhuet.factionwars.services;

import io.github.kevinhuet.factionwars.entity.Role;
import io.github.kevinhuet.factionwars.entity.Status;
import io.github.kevinhuet.factionwars.entity.WFaction;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * The type Great vault manager.
 */
public class GreatVaultManager {

    private static GreatVaultManager instance = null;

    private Inventory validationUI;

    /**
     * Instantiates a new Great vault manager.
     */
    public GreatVaultManager() {
        validationUI = Bukkit.createInventory(null, 36, "GreatVault");
    }

    /**
     * Verify vault status.
     *
     * @param player the player
     * @return the status
     */
    public Status verifyVault(WPlayer player) {
        WFaction faction = player.getFaction();
        int empty = 0;

        if (player.getRole().isAtLeast(Role.OFFICER)) {
            return Status.DONT_HAVE_FACTION_PERMISSION;
        }
        //for (ItemStack i : faction.getVault().getInventory().getContents()) {
        //    if (i == null)
        //        empty++;
        //}
        if (empty < faction.getGreatVault().getRewards().size())
            return Status.VAULT_FULL;
        return Status.OK;
    }

    /**
     * Gets great vault rewards.
     *
     * @param faction the faction
     * @return the great vault rewards
     */
    public Status getGreatVaultRewards(WFaction faction) {
        for (ItemStack i : faction.getGreatVault().getRewards()) {
            //faction.getVault().getInventory().addItem(i);
        }
        faction.sendMessageAllMembers("");
        return Status.OK;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static GreatVaultManager getInstance() {
        if (instance == null)
            instance = new GreatVaultManager();
        return instance;
    }

    /**
     * Gets validation ui.
     *
     * @return the validation ui
     */
    public Inventory getValidationUI() {
        return validationUI;
    }

    /**
     * Sets validation ui.
     *
     * @param validationUI the validation ui
     */
    public void setValidationUI(Inventory validationUI) {
        this.validationUI = validationUI;
    }
}

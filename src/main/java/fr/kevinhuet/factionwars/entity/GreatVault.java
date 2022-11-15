package fr.kevinhuet.factionwars.entity;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * The type Great vault.
 */
public class GreatVault {

    private Inventory inventory;

    private List<ItemStack> rewards;

    private WFaction faction;

    /**
     * Instantiates a new Great vault.
     */
    public GreatVault() {
    }

    /**
     * Gets inventory.
     *
     * @return the inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Sets inventory.
     *
     * @param inventory the inventory
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * Gets rewards.
     *
     * @return the rewards
     */
    public List<ItemStack> getRewards() {
        return rewards;
    }

    /**
     * Sets rewards.
     *
     * @param rewards the rewards
     */
    public void setRewards(List<ItemStack> rewards) {
        this.rewards = rewards;
    }
}

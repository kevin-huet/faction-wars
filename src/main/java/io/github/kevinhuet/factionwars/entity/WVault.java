package io.github.kevinhuet.factionwars.entity;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * The type W vault.
 */
public class WVault {

    private Inventory inventory;

    private int slotLimit;

    /**
     * Instantiates a new W vault.
     *
     * @param faction   the faction
     * @param slotLimit the slot limit
     */
    public WVault(WFaction faction, int slotLimit) {
        this.slotLimit = slotLimit;
        this.inventory = Bukkit.createInventory(null, slotLimit, "VAULT: "+faction.getName());
        this.inventory.addItem(new ItemStack(Material.ANVIL));
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
     * Gets slot limit.
     *
     * @return the slot limit
     */
    public int getSlotLimit() {
        return slotLimit;
    }

    /**
     * Sets slot limit.
     *
     * @param slotLimit the slot limit
     */
    public void setSlotLimit(int slotLimit) {
        this.slotLimit = slotLimit;
    }
}

package io.github.kevinhuet.factionwars.entity;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class WVault {

    private Inventory inventory;

    private WFaction faction;

    private int slotLimit;

    public WVault(WFaction faction, int slotLimit) {
        this.slotLimit = slotLimit;
        this.faction = faction;
        this.inventory = Bukkit.createInventory(null, slotLimit, "VAULT: "+faction.getName());
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public WFaction getFaction() {
        return faction;
    }

    public void setFaction(WFaction faction) {
        this.faction = faction;
    }

    public int getSlotLimit() {
        return slotLimit;
    }

    public void setSlotLimit(int slotLimit) {
        this.slotLimit = slotLimit;
    }
}

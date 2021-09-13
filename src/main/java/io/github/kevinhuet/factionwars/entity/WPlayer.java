package io.github.kevinhuet.factionwars.entity;

import org.bukkit.entity.Player;

import java.util.UUID;

public class WPlayer {

    private UUID playerUUID;

    private Player player;

    private double powers;

    private WFaction faction;

    private Role role;

    public WPlayer() {

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getPowers() {
        return powers;
    }

    public void setPowers(double powers) {
        this.powers = powers;
    }

    public WFaction getFaction() {
        return faction;
    }

    public void setFaction(WFaction faction) {
        this.faction = faction;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }

    public void setPlayerUUID(UUID playerUUID) {
        this.playerUUID = playerUUID;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

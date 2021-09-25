package io.github.kevinhuet.factionwars.entity;

import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * The type W player.
 */
public class WPlayer {

    private Player player;

    private double powers;

    private WFaction faction;

    private Role role;

    /**
     * Instantiates a new W player.
     *
     * @param player the player
     */
    public WPlayer(Player player) {
        this.player = player;
    }

    public WPlayer(Player player, float powers, Role role) {
        this.player = player;
        this.powers = powers;
        this.role = role;
    }

    /**
     * Gets player.
     *
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets player.
     *
     * @param player the player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Gets powers.
     *
     * @return the powers
     */
    public double getPowers() {
        return powers;
    }

    /**
     * Sets powers.
     *
     * @param powers the powers
     */
    public void setPowers(double powers) {
        this.powers = powers;
    }

    /**
     * Gets faction.
     *
     * @return the faction
     */
    public WFaction getFaction() {
        return faction;
    }

    /**
     * Sets faction.
     *
     * @param faction the faction
     */
    public void setFaction(WFaction faction) {
        this.faction = faction;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(Role role) {
        this.role = role;
    }
}

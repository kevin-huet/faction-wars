package io.github.kevinhuet.factionwars.services;

import io.github.kevinhuet.factionwars.entity.WFaction;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The type Faction manager.
 */
public class FactionManager {

    private static FactionManager instance = null;

    private List<WFaction> factionList = new ArrayList<>();

    /**
     * Instantiates a new Faction manager.
     */
    public FactionManager() {

    }

    /**
     * Gets faction by uuid.
     *
     * @param uuid the uuid
     * @return the faction by uuid
     */
    public WFaction getFactionByUUID(UUID uuid) {
        return this.factionList.stream().filter(
                f -> f.getFactionUUID().equals(uuid)
        ).findFirst().orElse(null);
    }

    /**
     * Gets faction by name.
     *
     * @param name the name
     * @return the faction by name
     */
    public WFaction getFactionByName(String name) {
        return this.factionList.stream().filter(
                f -> f.getName().equals(name)
        ).findFirst().orElse(null);
    }

    /**
     * Gets faction by player.
     *
     * @param player the player
     * @return the faction by player
     */
    public WFaction getFactionByPlayer(Player player) {
        return this.factionList.stream().filter(
                f -> f.getPlayers().stream().anyMatch(p -> p.getPlayer().equals(player))
        ).findAny().orElse(null);
    }

    /**
     * Gets faction by chunk.
     *
     * @param chunk the chunk
     * @return the faction by chunk
     */
    public WFaction getFactionByChunk(Chunk chunk) {
        return this.factionList.stream().filter(
                f -> f.getClaims().stream().anyMatch(c -> c.getChunk().equals(chunk))
        ).findAny().orElse(null);
    }

    /**
     * Kick faction player.
     *
     * @param target the target
     */
    public void kickFactionPlayer(WPlayer target) {
        target.getFaction().getPlayers().remove(target);
    }

    /**
     * Gets faction list.
     *
     * @return the faction list
     */
    public List<WFaction> getFactionList() {
        return factionList;
    }

    /**
     * Sets faction list.
     *
     * @param factionList the faction list
     */
    public void setFactionList(List<WFaction> factionList) {
        this.factionList = factionList;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static FactionManager getInstance() {
        if (instance == null) {
            instance = new FactionManager();
        }
        return instance;
    }

    public WFaction addFaction(WFaction faction) {
        factionList.add(faction);
        return faction;
    }
}

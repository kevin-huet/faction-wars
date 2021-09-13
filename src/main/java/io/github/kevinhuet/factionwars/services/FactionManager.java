package io.github.kevinhuet.factionwars.services;

import io.github.kevinhuet.factionwars.entity.WFaction;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FactionManager {

    private FactionManager instance = null;

    private List<WFaction> factionList = new ArrayList<>();

    /**
     * CONSTRUCTOR
     */
    public FactionManager() {
        this.instance = this;
    }

    public WFaction getFactionByUUID(UUID uuid) {
        return this.factionList.stream().filter(
                f -> f.getFactionUUID().equals(uuid)
        ).findFirst().orElse(null);
    }

    public WFaction getFactionByName(String name) {
        return this.factionList.stream().filter(
                f -> f.getName().equals(name)
        ).findFirst().orElse(null);
    }

    public WFaction getFactionByPlayer(Player player) {
        return this.factionList.stream().filter(
                f -> f.getPlayers().stream().anyMatch(p -> p.getPlayer().equals(player))
        ).findAny().orElse(null);
    }

    public WFaction getFactionByChunk(Chunk chunk) {
        return this.factionList.stream().filter(
                f -> f.getClaims().stream().anyMatch(c -> c.getChunk().equals(chunk))
        ).findAny().orElse(null);
    }

    /**
     GETTER AND SETTER
     */
    public List<WFaction> getFactionList() {
        return factionList;
    }

    public void setFactionList(List<WFaction> factionList) {
        this.factionList = factionList;
    }

    /**
     * SINGLETON FactionManager
     */
    public FactionManager getInstance() {
        if (this.instance == null) {
            this.instance = new FactionManager();
        }
        return this.instance;
    }
}

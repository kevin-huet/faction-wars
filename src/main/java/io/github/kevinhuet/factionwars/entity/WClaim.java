package io.github.kevinhuet.factionwars.entity;

import org.bukkit.Chunk;

public class WClaim {

    private Chunk chunk;

    private WFaction faction;

    public WClaim() {

    }

    public Chunk getChunk() {
        return chunk;
    }

    public void setChunk(Chunk chunk) {
        this.chunk = chunk;
    }

    public WFaction getFaction() {
        return faction;
    }

    public void setFaction(WFaction faction) {
        this.faction = faction;
    }
}

package io.github.kevinhuet.factionwars.entity;

import org.bukkit.Chunk;

/**
 * The type W claim.
 */
public class WClaim {

    private Chunk chunk;

    private WFaction faction;

    /**
     * Instantiates a new W claim.
     */
    public WClaim(Chunk chunk, WFaction faction) {
        //this.faction = faction;
        this.chunk = chunk;
    }

    /**
     * Gets chunk.
     *
     * @return the chunk
     */
    public Chunk getChunk() {
        return chunk;
    }

    /**
     * Sets chunk.
     *
     * @param chunk the chunk
     */
    public void setChunk(Chunk chunk) {
        this.chunk = chunk;
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
}

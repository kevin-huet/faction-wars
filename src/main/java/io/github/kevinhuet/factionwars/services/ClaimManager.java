package io.github.kevinhuet.factionwars.services;

import io.github.kevinhuet.factionwars.entity.WClaim;
import org.bukkit.World;
import org.bukkit.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Claim manager.
 */
public class ClaimManager {

    private ClaimManager instance = null;

    private List<WClaim> claimList = new ArrayList<>();

    /**
     * Instantiates a new Claim manager.
     */
    public ClaimManager() {
        this.instance = this;
    }

    /**
     * Gets claim by location.
     *
     * @param x     the x
     * @param z     the z
     * @param world the world
     * @return the claim by location
     */
    public WClaim getClaimByLocation(int x, int z, World world) {
        return this.claimList.stream().filter(
                c -> c.getChunk().getX() == x && c.getChunk().getZ() == z && c.getChunk().getWorld().equals(world)
        ).findFirst().orElse(null);
    }

    /**
     * Gets claim by block.
     *
     * @param block the block
     * @return the claim by block
     */
    public WClaim getClaimByBlock(Block block) {
        return this.claimList.stream().filter(
                c -> block.getChunk().equals(c.getChunk())
        ).findFirst().orElse(null);
    }

    /**
     * Gets claims by world.
     *
     * @param world the world
     * @return the claims by world
     */
    public List<WClaim> getClaimsByWorld(World world) {
        return this.claimList.stream().filter(
                c -> c.getChunk().getWorld().equals(world)
        ).collect(Collectors.toList());
    }

    /**
     * Sets instance.
     *
     * @param instance the instance
     */
    public void setInstance(ClaimManager instance) {
        this.instance = instance;
    }

    /**
     * Gets claim list.
     *
     * @return the claim list
     */
    public List<WClaim> getClaimList() {
        return claimList;
    }

    /**
     * Sets claim list.
     *
     * @param claimList the claim list
     */
    public void setClaimList(List<WClaim> claimList) {
        this.claimList = claimList;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public ClaimManager getInstance() {
        if (this.instance == null)
            this.instance = new ClaimManager();
        return this.instance;
    }
}

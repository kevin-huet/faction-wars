package io.github.kevinhuet.factionwars.services;

import io.github.kevinhuet.factionwars.entity.WClaim;
import org.bukkit.World;
import org.bukkit.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClaimManager {

    private ClaimManager instance = null;

    private List<WClaim> claimList = new ArrayList<>();

    /**
     * CONSTRUCTOR
     */
    public ClaimManager() {

    }

    /**
     * CLAIM MANAGEMENT FUNCTIONS
     */
    public WClaim getClaimByLocation(int x, int z, World world) {
        return this.claimList.stream().filter(
                c -> c.getChunk().getX() == x && c.getChunk().getZ() == z && c.getChunk().getWorld().equals(world)
        ).findFirst().orElse(null);
    }

    public WClaim getClaimByBlock(Block block) {
        return this.claimList.stream().filter(
                c -> block.getChunk().equals(c.getChunk())
        ).findFirst().orElse(null);
    }

    public List<WClaim> getClaimsByWorld(World world) {
        return this.claimList.stream().filter(
                c -> c.getChunk().getWorld().equals(world)
        ).collect(Collectors.toList());
    }

    /**
        GETTER AND SETTER
     */
    public void setInstance(ClaimManager instance) {
        this.instance = instance;
    }

    public List<WClaim> getClaimList() {
        return claimList;
    }

    public void setClaimList(List<WClaim> claimList) {
        this.claimList = claimList;
    }

    /**
     *  SINGLETON ClaimManager
     */
    public ClaimManager getInstance() {
        if (this.instance == null)
            this.instance = new ClaimManager();
        return this.instance;
    }
}

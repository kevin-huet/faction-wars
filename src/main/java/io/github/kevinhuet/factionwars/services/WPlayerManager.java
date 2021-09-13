package io.github.kevinhuet.factionwars.services;

import io.github.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class WPlayerManager {

    private WPlayerManager instance = null;

    private List<WPlayer> playerList = new ArrayList<>();

    /**
     * CONSTRUCTOR
     */
    public WPlayerManager() {
        this.instance = new WPlayerManager();
    }

    public WPlayer getWPlayerByPlayer(Player player) {
        return this.playerList.stream().filter(p -> p.getPlayer().equals(player)).findFirst().orElse(null);
    }

    public WPlayerManager getInstance() {
        if (this.instance == null)
            this.instance = new WPlayerManager();
        return this;
    }
}

package io.github.kevinhuet.factionwars.services;

import io.github.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * The type W player manager.
 */
public class WPlayerManager {

    private static WPlayerManager instance = null;

    private List<WPlayer> playerList = new ArrayList<>();


    /**
     * Instantiates a new W player manager.
     */
    public WPlayerManager() {
    }

    public WPlayer getWPlayerByPlayer(Player player) {
        return this.playerList.stream().filter(p -> p.getPlayer().equals(player)).findFirst().orElse(null);
    }

    /**
     * Gets player list.
     *
     * @return the player list
     */
    public List<WPlayer> getPlayerList() {
        return playerList;
    }

    /**
     * Add player list.
     *
     * @param player the player
     * @return the list
     */
    public List<WPlayer> addPlayer(WPlayer player) {
        this.playerList.add(player);
        return this.playerList;
    }

    /**
     * Sets player list.
     *
     * @param playerList the player list
     */
    public void setPlayerList(List<WPlayer> playerList) {
        this.playerList = playerList;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static WPlayerManager getInstance() {
        if (instance == null)
            instance = new WPlayerManager();
        return instance;
    }
}

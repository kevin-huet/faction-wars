package io.github.kevinhuet.factionwars.entity;

import com.google.gson.annotations.SerializedName;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The type W faction.
 */
public class WFaction {

    private List<WPlayer> players = new ArrayList<>();

    private List<WClaim> claims= new ArrayList<>();

    private List<WVault> vaults =  new ArrayList<>();

    private String name;

    private UUID factionUUID;

    private GreatVault greatVault;

    private Location fhome;

    private int maxPlayers;

    private int level;

    private int attackXp;

    private int attackCoin;

    private boolean getsAttacked;

    private boolean inAttack;

    /**
     * Instantiates a new W faction.
     *
     * @param name the name
     */
    public WFaction(String name) {
        this.name = name;
        this.factionUUID = UUID.randomUUID();
        this.fhome = new Location(Bukkit.getWorld("world"), 5, 5, 5);
        //this.greatVault = new GreatVault();
        this.vaults.add(new WVault(this, 45));
    }

    /**
     * Instantiates a new W faction.
     *
     * @param name    the name
     * @param creator the creator
     */
    public WFaction(String name, WPlayer creator) {
        this.name = name;
        this.factionUUID = UUID.randomUUID();
        this.greatVault = new GreatVault();
        this.vaults.add(new WVault(this, 45));
        this.players.add(creator);
        creator.setRole(Role.ADMIN);
    }

    /**
     * Send message all members.
     *
     * @param message the message
     */
    public void sendMessageAllMembers(String message) {
        for (WPlayer player : this.players) {
            player.getPlayer().sendMessage(message);
        }
    }

    /**
     * Gets players.
     *
     * @return the players
     */
    public List<WPlayer> getPlayers() {
        return players;
    }

    /**
     * Sets players.
     *
     * @param players the players
     */
    public void setPlayers(List<WPlayer> players) {
        this.players = players;
    }

    /**
     * Gets claims.
     *
     * @return the claims
     */
    public List<WClaim> getClaims() {
        return claims;
    }

    /**
     * Sets claims.
     *
     * @param claims the claims
     */
    public void setClaims(List<WClaim> claims) {
        this.claims = claims;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets faction uuid.
     *
     * @return the faction uuid
     */
    public UUID getFactionUUID() {
        return factionUUID;
    }

    /**
     * Sets faction uuid.
     *
     * @param factionUUID the faction uuid
     */
    public void setFactionUUID(UUID factionUUID) {
        this.factionUUID = factionUUID;
    }

    /**
     * Gets vaults.
     *
     * @return the vaults
     */
    public List<WVault> getVaults() {
        return vaults;
    }

    /**
     * Sets vaults.
     *
     * @param vaults the vaults
     */
    public void setVaults(List<WVault> vaults) {
        this.vaults = vaults;
    }

    /**
     * Gets fhome.
     *
     * @return the fhome
     */
    public Location getFhome() {
        return fhome;
    }

    /**
     * Sets fhome.
     *
     * @param fhome the fhome
     */
    public void setFhome(Location fhome) {
        this.fhome = fhome;
    }

    /**
     * Gets great vault.
     *
     * @return the great vault
     */
    public GreatVault getGreatVault() {
        return greatVault;
    }

    /**
     * Sets great vault.
     *
     * @param greatVault the great vault
     */
    public void setGreatVault(GreatVault greatVault) {
        this.greatVault = greatVault;
    }

    /**
     * Gets max players.
     *
     * @return the max players
     */
    public int getMaxPlayers() {
        return maxPlayers;
    }

    /**
     * Sets max players.
     *
     * @param maxPlayers the max players
     */
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets attack xp.
     *
     * @return the attack xp
     */
    public int getAttackXp() {
        return attackXp;
    }

    /**
     * Sets attack xp.
     *
     * @param attackXp the attack xp
     */
    public void setAttackXp(int attackXp) {
        this.attackXp = attackXp;
    }

    /**
     * Gets attack coin.
     *
     * @return the attack coin
     */
    public int getAttackCoin() {
        return attackCoin;
    }

    /**
     * Sets attack coin.
     *
     * @param attackCoin the attack coin
     */
    public void setAttackCoin(int attackCoin) {
        this.attackCoin = attackCoin;
    }

    /**
     * Is gets attacked boolean.
     *
     * @return the boolean
     */
    public boolean isGetsAttacked() {
        return getsAttacked;
    }

    /**
     * Sets gets attacked.
     *
     * @param getsAttacked the gets attacked
     */
    public void setGetsAttacked(boolean getsAttacked) {
        this.getsAttacked = getsAttacked;
    }

    /**
     * Is in attack boolean.
     *
     * @return the boolean
     */
    public boolean isInAttack() {
        return inAttack;
    }

    /**
     * Sets in attack.
     *
     * @param inAttack the in attack
     */
    public void setInAttack(boolean inAttack) {
        this.inAttack = inAttack;
    }

    public void addClaim(WClaim wClaim) {
        this.claims.add(wClaim);
    }
}

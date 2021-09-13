package io.github.kevinhuet.factionwars.entity;

import java.util.List;
import java.util.UUID;

public class WFaction {

    private List<WPlayer> players;

    private List<WClaim> claims;

    private String name;

    private UUID factionUUID;

    private WVault vault;

    private GreatVault greatVault;

    private int maxPlayers;

    private int level;

    private int attackXp;

    private int attackCoin;

    private boolean getsAttacked;

    private boolean inAttack;

    public WFaction() {

    }

    public List<WPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(List<WPlayer> players) {
        this.players = players;
    }

    public List<WClaim> getClaims() {
        return claims;
    }

    public void setClaims(List<WClaim> claims) {
        this.claims = claims;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getFactionUUID() {
        return factionUUID;
    }

    public void setFactionUUID(UUID factionUUID) {
        this.factionUUID = factionUUID;
    }

    public WVault getVault() {
        return vault;
    }

    public void setVault(WVault vault) {
        this.vault = vault;
    }

    public GreatVault getGreatVault() {
        return greatVault;
    }

    public void setGreatVault(GreatVault greatVault) {
        this.greatVault = greatVault;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttackXp() {
        return attackXp;
    }

    public void setAttackXp(int attackXp) {
        this.attackXp = attackXp;
    }

    public int getAttackCoin() {
        return attackCoin;
    }

    public void setAttackCoin(int attackCoin) {
        this.attackCoin = attackCoin;
    }

    public boolean isGetsAttacked() {
        return getsAttacked;
    }

    public void setGetsAttacked(boolean getsAttacked) {
        this.getsAttacked = getsAttacked;
    }

    public boolean isInAttack() {
        return inAttack;
    }

    public void setInAttack(boolean inAttack) {
        this.inAttack = inAttack;
    }
}

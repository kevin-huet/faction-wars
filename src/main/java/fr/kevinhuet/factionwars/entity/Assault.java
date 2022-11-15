package fr.kevinhuet.factionwars.entity;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Assault {

    private WFaction attack;

    private WFaction target;

    private List<ItemStack> winnableResources;

    private int winnablePoint;

    private int costPoint;

    private double percent;

    public Assault() {
    }

    public Assault(WFaction attack, WFaction target) {
        this.attack = attack;
        this.target = target;
    }

    public WFaction getAttack() {
        return attack;
    }

    public void setAttack(WFaction attack) {
        this.attack = attack;
    }

    public WFaction getTarget() {
        return target;
    }

    public void setTarget(WFaction target) {
        this.target = target;
    }

    public List<ItemStack> getWinnableResources() {
        return winnableResources;
    }

    public void setWinnableResources(List<ItemStack> winnableResources) {
        this.winnableResources = winnableResources;
    }

    public int getWinnablePoint() {
        return winnablePoint;
    }

    public void setWinnablePoint(int winnablePoint) {
        this.winnablePoint = winnablePoint;
    }

    public int getCostPoint() {
        return costPoint;
    }

    public void setCostPoint(int costPoint) {
        this.costPoint = costPoint;
    }
}

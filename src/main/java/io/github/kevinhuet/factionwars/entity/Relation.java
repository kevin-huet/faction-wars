package io.github.kevinhuet.factionwars.entity;

public enum Relation {
    MEMBER(1, ""),
    ALLY(2, ""),
    NEUTRAL(3, ""),
    ENEMY(4, "");

    private int value;
    private String name;

    Relation(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public boolean is(Relation relation) {
        return relation == this;
    }

    public boolean canAttack(Relation relation) {
        return relation != ALLY && relation != MEMBER;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

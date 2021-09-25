package io.github.kevinhuet.factionwars.entity;

/**
 * The enum Relation.
 */
public enum Relation {
    /**
     * Member relation.
     */
    MEMBER(1, ""),
    /**
     * Ally relation.
     */
    ALLY(2, ""),
    /**
     * Neutral relation.
     */
    NEUTRAL(3, ""),
    /**
     * Enemy relation.
     */
    ENEMY(4, "");

    private int value;
    private String name;

    Relation(int value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * Is boolean.
     *
     * @param relation the relation
     * @return the boolean
     */
    public boolean is(Relation relation) {
        return relation == this;
    }

    /**
     * Can attack boolean.
     *
     * @param relation the relation
     * @return the boolean
     */
    public boolean canAttack(Relation relation) {
        return relation != ALLY && relation != MEMBER;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(int value) {
        this.value = value;
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
}

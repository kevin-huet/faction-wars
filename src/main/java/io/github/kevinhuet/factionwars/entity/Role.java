package io.github.kevinhuet.factionwars.entity;

/**
 * The enum Role.
 */
public enum Role {
    /**
     * Admin role.
     */
    ADMIN(3, "Admin"),
    /**
     * Officer role.
     */
    OFFICER(2, "Officer"),
    /**
     * Member role.
     */
    MEMBER(1, "Member"),
    /**
     * Recruit role.
     */
    RECRUIT(0, "Recruit");

    private int value;
    private String name;

    Role(int value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * Is at most boolean.
     *
     * @param role the role
     * @return the boolean
     */
    public boolean isAtMost(Role role) {
        return this.value <= role.value;
    }

    /**
     * Is at least boolean.
     *
     * @param role the role
     * @return the boolean
     */
    public boolean isAtLeast(Role role) {
        return this.value >= role.value;
    }

    /**
     * Is boolean.
     *
     * @param role the role
     * @return the boolean
     */
    public boolean is(Role role) {
        return role == this;
    }

    /**
     * Is less than boolean.
     *
     * @param role the role
     * @return the boolean
     */
    public boolean isLessThan(Role role) {
        return this.value < role.value;
    }

    /**
     * Is more than boolean.
     *
     * @param role the role
     * @return the boolean
     */
    public boolean isMoreThan(Role role) {
        return this.value > role.value;
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

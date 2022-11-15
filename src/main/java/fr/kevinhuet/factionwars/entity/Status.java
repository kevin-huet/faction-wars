package fr.kevinhuet.factionwars.entity;

/**
 * The enum Status.
 */
public enum Status {
    /**
     * Ok status.
     */
    OK(1, ""),
    /**
     * The Dont have faction permission.
     */
    DONT_HAVE_FACTION_PERMISSION(2, "You dont have permission to do this"),
    /**
     * The Vault full.
     */
    VAULT_FULL(3, "Faction vault is full");

    private int value;
    private String name;

    Status(int value, String name) {
        this.value = value;
        this.name = name;
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

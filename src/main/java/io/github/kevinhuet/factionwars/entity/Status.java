package io.github.kevinhuet.factionwars.entity;

public enum Status {
    OK(1, ""),
    DONT_HAVE_FACTION_PERMISSION(2, "You dont have permission to do this"),
    VAULT_FULL(3, "Faction vault is full");

    private int value;
    private String name;

    Status(int value, String name) {
        this.value = value;
        this.name = name;
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

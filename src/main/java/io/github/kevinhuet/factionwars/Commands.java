package io.github.kevinhuet.factionwars;

import io.github.kevinhuet.factionwars.commands.BaseCommand;
import io.github.kevinhuet.factionwars.commands.faction.*;

/**
 * The type Commands.
 */
public class Commands {

    /**
     * Instantiates a new Commands.
     */
    public Commands() {
        BaseCommand cmdFaction = new BaseCommand();

        App.getPlugin().getCommand("f").setExecutor(cmdFaction);
        cmdFaction.registerCommand("create", new CreateFactionCommand());
        cmdFaction.registerCommand("disband", new DisbandFactionCommand());
        cmdFaction.registerCommand("claim", new ClaimCommand());
    }
}

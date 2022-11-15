package fr.kevinhuet.factionwars;

import fr.kevinhuet.factionwars.commands.BaseCommand;
import fr.kevinhuet.factionwars.commands.faction.ClaimCommand;
import fr.kevinhuet.factionwars.commands.faction.CreateFactionCommand;
import fr.kevinhuet.factionwars.commands.faction.DisbandFactionCommand;
import fr.kevinhuet.factionwars.config.gson.*;

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

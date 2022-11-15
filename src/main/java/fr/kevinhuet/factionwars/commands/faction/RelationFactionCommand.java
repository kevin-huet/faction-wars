package fr.kevinhuet.factionwars.commands.faction;

import fr.kevinhuet.factionwars.services.WPlayerManager;
import fr.kevinhuet.factionwars.commands.SubCommand;
import fr.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class RelationFactionCommand implements SubCommand {
    @Override
    public void onCommand(Player player, Command command, String[] args) {
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(player);

    }

    @Override
    public String getPermission() {
        return null;
    }
}

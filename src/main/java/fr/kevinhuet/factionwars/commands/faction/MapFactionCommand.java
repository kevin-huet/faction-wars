package fr.kevinhuet.factionwars.commands.faction;

import fr.kevinhuet.factionwars.commands.SubCommand;
import fr.kevinhuet.factionwars.services.WPlayerManager;
import fr.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.Chunk;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class MapFactionCommand implements SubCommand {
    @Override
    public void onCommand(Player player, Command command, String[] args) {
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(player);

        Chunk actual = player.getLocation().getChunk();


    }

    @Override
    public String getPermission() {
        return null;
    }
}

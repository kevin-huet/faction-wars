package io.github.kevinhuet.factionwars.commands.faction;

import io.github.kevinhuet.factionwars.commands.SubCommand;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import io.github.kevinhuet.factionwars.services.WPlayerManager;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class PromotePlayerCommand implements SubCommand {
    @Override
    public void onCommand(Player player, Command command, String[] args) {
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(player);

    }

    @Override
    public String getPermission() {
        return null;
    }
}

package io.github.kevinhuet.factionwars.commands.faction;

import io.github.kevinhuet.factionwars.commands.SubCommand;
import io.github.kevinhuet.factionwars.entity.WFaction;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import io.github.kevinhuet.factionwars.services.FactionManager;
import io.github.kevinhuet.factionwars.services.WPlayerManager;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class CreateFactionCommand implements SubCommand {

    @Override
    public void onCommand(Player player, Command command, String[] args) {
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(player);
        WFaction wFaction;
        if (wPlayer.getFaction() != null)
            return;
        if (FactionManager.getInstance().getFactionByName(args[1]) != null)
            return;
        wFaction = FactionManager.getInstance().addFaction(new WFaction(args[1], wPlayer));
        wPlayer.setFaction(wFaction);
        player.sendMessage("faction "+args[1]+" created");
    }

    @Override
    public String getPermission() {
        return null;
    }
}

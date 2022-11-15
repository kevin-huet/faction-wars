package fr.kevinhuet.factionwars.commands.faction;

import fr.kevinhuet.factionwars.commands.SubCommand;
import fr.kevinhuet.factionwars.services.FactionManager;
import fr.kevinhuet.factionwars.services.WPlayerManager;
import fr.kevinhuet.factionwars.entity.WFaction;
import fr.kevinhuet.factionwars.entity.WPlayer;
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

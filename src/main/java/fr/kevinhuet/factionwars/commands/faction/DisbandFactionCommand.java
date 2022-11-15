package fr.kevinhuet.factionwars.commands.faction;

import fr.kevinhuet.factionwars.commands.SubCommand;
import fr.kevinhuet.factionwars.entity.Role;
import fr.kevinhuet.factionwars.entity.WPlayer;
import fr.kevinhuet.factionwars.services.FactionManager;
import fr.kevinhuet.factionwars.services.WPlayerManager;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class DisbandFactionCommand implements SubCommand {
    @Override
    public void onCommand(Player player, Command command, String[] args) {
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(player);

        if (wPlayer.getFaction() == null)
            return;
        if (!wPlayer.getRole().is(Role.ADMIN))
            return;
        FactionManager.getInstance().getFactionList().remove(wPlayer.getFaction());
        wPlayer.setFaction(null);
        wPlayer.getFaction().sendMessageAllMembers(wPlayer.getFaction().getName()+" disbanded");
    }

    @Override
    public String getPermission() {
        return null;
    }
}

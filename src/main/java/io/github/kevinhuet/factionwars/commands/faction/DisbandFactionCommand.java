package io.github.kevinhuet.factionwars.commands.faction;

import io.github.kevinhuet.factionwars.commands.SubCommand;
import io.github.kevinhuet.factionwars.entity.Role;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import io.github.kevinhuet.factionwars.services.FactionManager;
import io.github.kevinhuet.factionwars.services.WPlayerManager;
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

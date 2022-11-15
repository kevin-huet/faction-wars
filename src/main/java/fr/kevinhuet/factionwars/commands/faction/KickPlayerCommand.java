package fr.kevinhuet.factionwars.commands.faction;

import fr.kevinhuet.factionwars.commands.SubCommand;
import fr.kevinhuet.factionwars.services.WPlayerManager;
import fr.kevinhuet.factionwars.entity.Role;
import fr.kevinhuet.factionwars.entity.WPlayer;
import fr.kevinhuet.factionwars.services.FactionManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class KickPlayerCommand implements SubCommand {
    @Override
    public void onCommand(Player player, Command command, String[] args) {
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(player);
        WPlayer target = (Bukkit.getPlayer(args[1]) != null) ?
                WPlayerManager.getInstance().getWPlayerByPlayer(Bukkit.getPlayer(args[1])) : null;

        if (target == null)
            return;
        if (wPlayer.getRole().isAtMost(Role.OFFICER))
            return;
        FactionManager.getInstance().kickFactionPlayer(target);
    }

    @Override
    public String getPermission() {
        return null;
    }
}

package io.github.kevinhuet.factionwars.commands.faction;

import io.github.kevinhuet.factionwars.commands.SubCommand;
import io.github.kevinhuet.factionwars.entity.WClaim;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import io.github.kevinhuet.factionwars.services.FactionManager;
import io.github.kevinhuet.factionwars.services.WPlayerManager;
import org.bukkit.Chunk;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class ClaimCommand implements SubCommand {
    @Override
    public void onCommand(Player player, Command command, String[] args) {
        Chunk chunk = player.getLocation().getChunk();
        WPlayer wPlayer = WPlayerManager.getInstance().getWPlayerByPlayer(player);

        if (wPlayer.getFaction() == null)
            return;
        if (FactionManager.getInstance().getFactionByChunk(chunk) != null)
            return;
        wPlayer.getFaction().addClaim(new WClaim(chunk, wPlayer.getFaction()));
        wPlayer.getFaction().sendMessageAllMembers("claim a chunk");
    }

    @Override
    public String getPermission() {
        return null;
    }
}

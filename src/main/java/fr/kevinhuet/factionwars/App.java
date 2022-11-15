package fr.kevinhuet.factionwars;

import fr.kevinhuet.factionwars.config.faction.FactionDataConfig;
import fr.kevinhuet.factionwars.entity.WFaction;
import fr.kevinhuet.factionwars.entity.WPlayer;
import fr.kevinhuet.factionwars.services.FactionManager;
import fr.kevinhuet.factionwars.services.WPlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class App extends JavaPlugin {

    private static App plugin;

    @Override
    public void onEnable() {
        plugin = this;
        new Listeners(this,  getServer().getPluginManager());
        new Commands();
        initFaction();
        initWPlayer();
        getLogger().info("enable");
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
        System.out.println(FactionManager.getInstance().getFactionList().size());
        FactionDataConfig.getInstance().saveAllFactions();
    }

    private void initWPlayer() {
        for (Player p : getServer().getOnlinePlayers()) {
            if (!WPlayerManager.getInstance().getPlayerList().contains(p)) {
                WPlayerManager.getInstance().addPlayer(new WPlayer(p));
            }
        }
    }

    private void initFaction() {
        List<WFaction> list = FactionDataConfig.getInstance().getAllFactions();

        if (list == null) {
            return;
        }
        for (WFaction f : list) {
            System.out.println(f.getPlayers().size());

            if (FactionManager.getInstance().getFactionByName(f.getName()) == null) {
                FactionManager.getInstance().addFaction(f);
                System.out.println("init faction");

                for (WPlayer p : f.getPlayers()) {
                    p.setFaction(f);
                    if (!WPlayerManager.getInstance().getPlayerList().contains(p))
                        WPlayerManager.getInstance().getPlayerList().add(p);
                }
            }
        }
       // FactionManager.getInstance().setFactionList(FactionDataConfig.getInstance().getAllFactions());
    }

    /**
     * Gets plugin.
     *
     * @return the plugin
     */
    public static App getPlugin() {
        return plugin;
    }
}

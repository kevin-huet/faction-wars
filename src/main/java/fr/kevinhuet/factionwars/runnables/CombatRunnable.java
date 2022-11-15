package fr.kevinhuet.factionwars.runnables;

import fr.kevinhuet.factionwars.App;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class CombatRunnable extends BukkitRunnable {

    private final JavaPlugin plugin;

    private int counter;

    public CombatRunnable(int counter) {
        this.plugin = JavaPlugin.getPlugin(App.class);
        if (counter <= 0) {
            throw new IllegalArgumentException("counter must be greater than 0");
        } else {
            this.counter = counter;
        }
    }

    @Override
    public void run() {
        // What you want to schedule goes here
        if (counter > 0) {
            plugin.getServer().broadcastMessage("Commence greeting in " + counter--);
        } else {
            plugin.getServer().broadcastMessage("Welcome to Bukkit! Remember to read the documentation!");
            this.cancel();
        }
    }

}

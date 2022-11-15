package fr.kevinhuet.factionwars.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CombatEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS = new HandlerList();

    public CombatEvent() {

    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void setCancelled(boolean b) {

    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }
}

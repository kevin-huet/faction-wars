package fr.kevinhuet.factionwars.util;

import org.bukkit.ChatColor;

public class AsciiMap {
    private static final char[] FACTION_KEY_CHARS = "\\/#?ç¬£$%=&^ABCDEFGHJKLMNOPQRSTUVWXYZÄÖÜÆØÅ1234567890abcdeghjmnopqrsuvwxyÿzäöüæøåâêîûô".toCharArray();
    private static final int KEY_SIZE = FACTION_KEY_CHARS.length;

    private static final int WIDTH = 49;
    private static final int WIDTH_HALF = WIDTH / 2;
    private static final int HEIGHT = 8;
    private static final int HEIGHT_HALF = HEIGHT / 2;
    private static final int HEIGHT_EXTRA = 17;
    private static final int HEIGHT_EXTRA_HALF = HEIGHT_EXTRA / 2;

    private static final String TITLE_FORMAT = "(%d,%d) %s";
    private static final String KEY_MIDDLE = "+"+ ChatColor.AQUA;
    private static final String KEY_WILDERNESS ="-"+ChatColor.GRAY;
    private static final String KEY_OVERFLOW = "-"+(ChatColor.MAGIC)+""+(ChatColor.RESET);
    private static final String OVERFLOW_MESSAGE = "%s: Too Many Factions (>%d) on this Map.";
    private static final String LEGEND_SEPARATOR = ": ";
}

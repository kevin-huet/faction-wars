package io.github.kevinhuet.factionwars.config;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import io.github.kevinhuet.factionwars.config.gson.*;
import io.github.kevinhuet.factionwars.entity.WClaim;
import io.github.kevinhuet.factionwars.entity.WFaction;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The type Config.
 */
public class Config {

    protected File file;
    protected Gson gson = new GsonBuilder().setPrettyPrinting()
            .registerTypeAdapter(WClaim.class, new ChunkAdapter())
            .registerTypeAdapter(Location.class, new LocationAdapter())
            .registerTypeAdapter(Inventory.class, new InventoryAdapter())
            .registerTypeAdapter(Player.class, new PlayerAdapter())
            .registerTypeAdapter(WPlayer.class, new WPlayerAdapter())
            .create();

    /**
     * Instantiates a new Config.
     *
     * @param file the file
     */
    public Config(File file) {
        this.file = file;
        reload();
    }

    /**
     * Reload.
     */
    protected void reload() {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                init();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Init.
     *
     * @throws IOException the io exception
     */
    protected void init() throws IOException {
        FileWriter fw = new FileWriter(file, true);

        fw.flush();
        fw.close();
    }

    /**
     * Gets object in json.
     *
     * @param index       the index
     * @return the object in json
     */
    public List<WFaction> getObjectInJson(String index) {
        try {
            Type dtoListType = new TypeToken<HashMap<String, List<WFaction>>>() {
            }.getType();
            FileReader fr = new FileReader(file);
            HashMap<String, List<WFaction>> map = gson.fromJson(fr, dtoListType);
            fr.close();
            if (map == null || map.isEmpty())
                return null;
            return map.get(index);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * Add object in json.
     *
     * @param index the index
     * @param obj   the obj
     */
    public void addObjectInJson(String index, Object obj) {
        try {
            Type dtoListType = new TypeToken<HashMap<String, List<Object>>>(){}.getType();
            FileReader fr = new FileReader(file);
            FileWriter fw;
            HashMap<String, List<Object>> map = gson.fromJson(fr, dtoListType);

            fr.close();
            if (null == map) {
                map = new HashMap<String, List<Object>>();
            }
            map.computeIfAbsent(index, k -> new ArrayList<>());
            map.get(index).add(obj);
            fw  = new FileWriter(file);
            gson.toJson(map, fw);
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Gets string from file.
     *
     * @param filePath the file path
     * @return the string from file
     * @throws Exception the exception
     */
    public String getStringFromFile (String filePath) throws Exception {
        File fl = new File(filePath);
        FileInputStream fin = new FileInputStream(fl);
        String ret = convertStreamToString(fin);
        //Make sure you close all streams.
        fin.close();
        return ret;
    }

    /**
     * Convert stream to string string.
     *
     * @param is the is
     * @return the string
     * @throws Exception the exception
     */
    public String convertStreamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    protected void saveJsonList(String index, List<Object> list) {
        try {
            HashMap<String, List<Object>> map = new HashMap<String, List<Object>>();
            FileWriter fw = new FileWriter(file);

            map.put(index, list);
            gson.toJson(map, fw);
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

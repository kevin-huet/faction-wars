package fr.kevinhuet.factionwars.config.gson;

import com.google.gson.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.lang.reflect.Type;
import java.util.UUID;

public class PlayerAdapter implements JsonSerializer<Player>, JsonDeserializer<Player>  {
    @Override
    public Player deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject obj = jsonElement.getAsJsonObject();

        return Bukkit.getPlayer(UUID.fromString(obj.get("uuid").getAsString()));
    }

    @Override
    public JsonElement serialize(Player player, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();

        jsonObject.add("name", new JsonPrimitive(player.getName()));
        jsonObject.add("uuid", new JsonPrimitive(player.getUniqueId().toString()));

        return jsonObject;
    }
}

package io.github.kevinhuet.factionwars.config.gson;

import com.google.gson.*;
import io.github.kevinhuet.factionwars.entity.Role;
import io.github.kevinhuet.factionwars.entity.WPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.lang.reflect.Type;
import java.util.UUID;

public class WPlayerAdapter implements JsonSerializer<WPlayer>, JsonDeserializer<WPlayer> {
    @Override
    public WPlayer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject obj = jsonElement.getAsJsonObject();
        Player player = Bukkit.getPlayer(UUID.fromString(obj.get("uuid").getAsString()));
        float powers = obj.get("powers").getAsFloat();
        Role role = Role.valueOf(obj.get("role").getAsString().toUpperCase());
        return new WPlayer(player, powers, role);
    }

    @Override
    public JsonElement serialize(WPlayer player, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();

        jsonObject.add("name", new JsonPrimitive(player.getPlayer().getName()));
        jsonObject.add("uuid", new JsonPrimitive(player.getPlayer().getUniqueId().toString()));
        jsonObject.add("powers", new JsonPrimitive(player.getPowers()));
        jsonObject.add("role", new JsonPrimitive(player.getRole().getName()));

        return jsonObject;
    }
}

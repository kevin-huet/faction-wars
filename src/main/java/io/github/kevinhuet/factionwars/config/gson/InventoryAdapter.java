package io.github.kevinhuet.factionwars.config.gson;

import com.google.gson.*;
import io.github.kevinhuet.factionwars.config.inventory.InventoryConversion;
import org.bukkit.inventory.Inventory;
import java.io.IOException;
import java.lang.reflect.Type;

public class InventoryAdapter implements JsonSerializer<Inventory>, JsonDeserializer<Inventory> {
    @Override
    public Inventory deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        try {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            return InventoryConversion.fromBase64(jsonObject.get("base64_inventory").getAsString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public JsonElement serialize(Inventory itemStacks, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject obj = new JsonObject();

        obj.add("base64_inventory", new JsonPrimitive(InventoryConversion.toBase64(itemStacks)));

        return obj;
    }
}

package io.github.kevinhuet.factionwars.config.gson;

import com.google.gson.*;
import io.github.kevinhuet.factionwars.entity.WClaim;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * The type Chunk adapter.
 */
public class ChunkAdapter implements JsonSerializer<WClaim>, JsonDeserializer<WClaim> {
    @Override
    public WClaim deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        return null;
    }

    @Override
    public JsonElement serialize(WClaim chunk, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject obj = new JsonObject();

        obj.add("x", new JsonPrimitive(chunk.ge tChunk().getX()));
        obj.add("z", new JsonPrimitive(chunk.getChunk().getX()));
        obj.add("world_name", new JsonPrimitive(chunk.getChunk().getWorld().getName()));
        obj.add("world_type", new JsonPrimitive(chunk.getChunk().getX()));
        //obj.add("blocks", getAllBlocksOfChunk(chunk.getChunk()));
        return obj;
    }

    private JsonArray getAllBlocksOfChunk(Chunk chunk) {
        JsonArray array = new JsonArray();
        Block b = null;

        for (int y = 0; y <= 155; y++) {
            for (int x = 0; x <= 15  ; x++) {
                for (int z = 0; z <= 15; z++) {
                    JsonObject object = new JsonObject();
                    b = chunk.getBlock(x, y, z);
                    if (!b.getType().equals(Material.AIR)) {
                        object.add("material", new JsonPrimitive(b.getType().toString()));
                        object.add("z", new JsonPrimitive(z));
                        object.add("x", new JsonPrimitive(x));
                        object.add("y", new JsonPrimitive(y));
                        array.add(object);
                    }
                }
            }
        }
        return array;
    }
}

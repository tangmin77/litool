package io.leaderli.litool.runner.adapter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import io.leaderli.litool.json.JsonTypeAdapter;
import io.leaderli.litool.runner.xml.EntryList;
import io.leaderli.litool.runner.xml.ResponseElement;

import java.lang.reflect.Type;

/**
 * @author leaderli
 * @since 2022/7/24
 */
public class ResponseElementTypeAdapter implements JsonTypeAdapter<ResponseElement> {
    @Override
    public ResponseElement deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        ResponseElement requestElement = new ResponseElement();
        requestElement.entryList = context.deserialize(json, EntryList.class);
        return requestElement;
    }

    @Override
    public JsonElement serialize(ResponseElement src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src.entryList);
    }

}

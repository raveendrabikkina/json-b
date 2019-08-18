package com.ravi.jsonb.mappers;

import com.ravi.jsonb.deserializer.CustomDeserializer;
import com.ravi.jsonb.serializer.CustomSerializer;

import javax.json.bind.JsonbConfig;
import javax.json.bind.config.BinaryDataStrategy;
import javax.json.bind.config.PropertyOrderStrategy;
import java.util.Locale;


public class ObjectMapper {

    public static JsonbConfig getObjectMapper() {
        JsonbConfig jsonbConfig = new JsonbConfig();
        //jsonbConfig.withFormatting(true);

        jsonbConfig.withNullValues(true);
        //jsonbConfig.withPropertyNamingStrategy(PropertyNamingStrategy.IDENTITY);//Default - IDENTITY
        // jsonbConfig.withPropertyNamingStrategy(new CustomNamingStrategy());
        jsonbConfig.withPropertyOrderStrategy(PropertyOrderStrategy.ANY);
        jsonbConfig.withDateFormat("dd/MM/yyyy", Locale.US);
        //jsonbConfig.withPropertyVisibilityStrategy(new CustomVisibilityStrategy());
        jsonbConfig.withBinaryDataStrategy(BinaryDataStrategy.BASE_64);
        //jsonbConfig.withEncoding(UTF_8);
        jsonbConfig.withStrictIJSON(true);
        //jsonbConfig.withAdapters(new CustomAdapter());
        //jsonbConfig.withSerializers(new CustomSerializer());
        //jsonbConfig.withDeserializers(new CustomDeserializer());

        return jsonbConfig;
    }
}

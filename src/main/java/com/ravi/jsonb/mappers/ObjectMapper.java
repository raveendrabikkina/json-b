package com.ravi.jsonb.mappers;

import com.ravi.jsonb.custom.CustomNamingStrategy;
import com.ravi.jsonb.custom.CustomVisibilityStrategy;

import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyOrderStrategy;
import java.util.Locale;


public class ObjectMapper {

    public static JsonbConfig getObjectMapper() {
        JsonbConfig jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);
        jsonbConfig.withNullValues(true);
        //jsonbConfig.withPropertyNamingStrategy(PropertyNamingStrategy.IDENTITY);//Default - IDENTITY
        jsonbConfig.withPropertyNamingStrategy(new CustomNamingStrategy());
        jsonbConfig.withPropertyOrderStrategy(PropertyOrderStrategy.ANY);
        jsonbConfig.withDateFormat("dd/MM/yyyy", Locale.US);
        jsonbConfig.withPropertyVisibilityStrategy(new CustomVisibilityStrategy());

        return jsonbConfig;
    }
}

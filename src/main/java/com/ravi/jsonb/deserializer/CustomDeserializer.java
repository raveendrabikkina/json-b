package com.ravi.jsonb.deserializer;

import com.ravi.jsonb.beans.User;

import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.stream.JsonParser;
import java.lang.reflect.Type;

public class CustomDeserializer implements JsonbDeserializer<User> {
    @Override
    public User deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Type type) {
        User user = null;
        jsonParser.next();
        String className = jsonParser.getString();
        jsonParser.next();
        try {
            user = deserializationContext.deserialize(Class.forName(className).asSubclass(User.class), jsonParser);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return user;
    }
}

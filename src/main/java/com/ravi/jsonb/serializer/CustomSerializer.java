package com.ravi.jsonb.serializer;

import com.ravi.jsonb.beans.User;

import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

public class CustomSerializer implements JsonbSerializer<User> {

    @Override
    public void serialize(User user, JsonGenerator jsonGenerator, SerializationContext serializationContext) {
        jsonGenerator.writeStartObject();
        serializationContext.serialize(user.getClass().getName(), user, jsonGenerator);
        jsonGenerator.writeEnd();
    }
}

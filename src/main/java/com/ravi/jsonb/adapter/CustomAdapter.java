package com.ravi.jsonb.adapter;

import com.ravi.jsonb.beans.User;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.adapter.JsonbAdapter;

public class CustomAdapter implements JsonbAdapter<User, JsonObject> {
    @Override
    public JsonObject adaptToJson(User user) throws Exception {

        JsonObject jsonObject = Json.createObjectBuilder().add("firstName", user.getFirstName()).add("lastName", user.getLastName()).build();

        return jsonObject;
    }

    @Override
    public User adaptFromJson(JsonObject jsonObject) throws Exception {

        User user = new User();

        if (jsonObject.getString("firstName").equals("Raveendra")) {
            user.setFirstName("First Name is Captured");
        }
        if (jsonObject.getString("lastName").equals("Bikkina")) {
            user.setFirstName("Last Name is Captured");
        }
        return user;
    }
}

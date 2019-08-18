package com.ravi.jsonb.test;

import com.ravi.jsonb.beans.Developer;
import com.ravi.jsonb.beans.Tester;
import com.ravi.jsonb.beans.User;
import com.ravi.jsonb.mappers.ObjectMapper;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Instant instant = Instant.now().minusSeconds(4000000);
        LocalDate now = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //System.out.println(now.format(dateTimeFormatter));
        List<User> roles = new LinkedList<>();
        Tester tester = new Tester();
        tester.setTestingRole("Testing..");
        roles.add(tester);
        Developer developer = new Developer();
        developer.setDeveloperRole("Coding..");
        roles.add(developer);

        User user2 = new User(1, "Raveendra", "Bikkina", now, new BigDecimal(150000), roles);
        User user = new User(1, null, null, null, null, null);

        Jsonb jsonb = JsonbBuilder.create(ObjectMapper.getObjectMapper());
        String userJson = jsonb.toJson(user2, User.class);
        System.out.println("Serialized:\n" + userJson);

        List<User> users = new ArrayList<>();
        users.add(developer);
        users.add(tester);

        String jsonUser = jsonb.toJson(users, User.class);
        List<User> users1 = jsonb.fromJson(jsonUser, List.class);
        // System.out.println(users1);

        // Type type = new ArrayList<User>() {}.getClass().getGenericSuperclass();
        //User user1 = jsonb.fromJson(userJson, new ArrayList<User>() {
        //}.getClass().getGenericSuperclass());
        Type type1 = List.class.getGenericSuperclass();
        User user1 = jsonb.fromJson(userJson, type1);
        System.out.println("Deserialized:\n" + user1);

        byte[] bytes = "This is being encoded in base64 encoding.".getBytes();
        String input = new String(bytes);
        System.out.println(input);
        Jsonb jsonbBytes = JsonbBuilder.create(ObjectMapper.getObjectMapper());
        JsonObject message = Json.createObjectBuilder().add("message", input).build();
        String base64Encoded = jsonbBytes.toJson(message);
        System.out.println("base64Encoded:" + base64Encoded);
    }
}

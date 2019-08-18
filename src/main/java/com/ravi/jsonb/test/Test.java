package com.ravi.jsonb.test;

import com.ravi.jsonb.beans.User;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {

        Instant instant = Instant.now().minusSeconds(4000000);
        LocalDateTime now = LocalDateTime.ofInstant(instant, ZoneId.of("GMT+10"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(now.format(dateTimeFormatter));
        User user2 = new User(1, "Raveendra", "Bikkina", now, new BigDecimal(150000));
        User user = new User(1, null, null, null, null);

        Jsonb jsonb = JsonbBuilder.create();
        String userJson = jsonb.toJson(user2, User.class);
        System.out.println(userJson);
    }
}

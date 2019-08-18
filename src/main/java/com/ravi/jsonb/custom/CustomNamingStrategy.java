package com.ravi.jsonb.custom;

import javax.json.bind.config.PropertyNamingStrategy;

public class CustomNamingStrategy implements PropertyNamingStrategy {
    @Override
    public String translateName(String s) {

        return s + "_Custom";
    }
}

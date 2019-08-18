package com.ravi.jsonb.custom;

import javax.json.bind.config.PropertyVisibilityStrategy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomVisibilityStrategy implements PropertyVisibilityStrategy {
    @Override
    public boolean isVisible(Field field) {
        //This will consider private fields also for deserialization
        return true;
    }

    @Override
    public boolean isVisible(Method method) {
        //This will consider getter setter methods for deserialization
        return true;
    }
}

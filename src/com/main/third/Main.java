package com.main.third;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().getBaseClassStateInfo());
    }

    public Map<String, Object> getBaseClassStateInfo() {
        var result = new LinkedHashMap<String, Object>();
        Field[] declaredFields = BaseClass.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            result.putIfAbsent(declaredField.getName(), declaredField);
        }
        return result;
    }
}

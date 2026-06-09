package com.example.javabasic.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("小明", 90);
        scores.put("小红", 95);
        scores.put("小刚", 88);

        System.out.println("小明分数: " + scores.get("小明"));
        System.out.println("是否包含小红: " + scores.containsKey("小红"));

        scores.put("小明", 92);
        scores.remove("小刚");

        for (String name : scores.keySet()) {
            System.out.println(name + " -> " + scores.get(name));
        }

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("entrySet 遍历: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}

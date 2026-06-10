package com.example.javabasic.p08_collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 学习 Map：用 key 找 value，例如用姓名找分数。
 */
public class D03MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<String, Integer>();
        // put 放入键值对。key 是姓名，value 是分数。
        scores.put("小明", 90);
        scores.put("小红", 95);
        scores.put("小刚", 88);

        // get 根据 key 取 value。
        System.out.println("小明分数: " + scores.get("小明"));
        System.out.println("是否包含小红: " + scores.containsKey("小红"));

        // key 重复时，新的 value 会覆盖旧的 value。
        scores.put("小明", 92);
        scores.remove("小刚");

        // keySet 只能拿到所有 key，再通过 key 去取 value。
        for (String name : scores.keySet()) {
            System.out.println(name + " -> " + scores.get(name));
        }

        // entrySet 可以一次拿到 key 和 value，遍历 Map 时更常用。
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("entrySet 遍历: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}

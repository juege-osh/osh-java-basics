package com.example.javabasic.p08_collection;

import java.util.ArrayList;
import java.util.List;

public class D01ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("小明");
        names.add("小红");
        names.add("小刚");

        System.out.println("列表: " + names);
        System.out.println("第一个元素: " + names.get(0));
        System.out.println("是否包含小红: " + names.contains("小红"));

        names.set(1, "小丽");
        names.remove("小刚");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ": " + names.get(i));
        }

        for (String name : names) {
            System.out.println("增强 for: " + name);
        }
    }
}

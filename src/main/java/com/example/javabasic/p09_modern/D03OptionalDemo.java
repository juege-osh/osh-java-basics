package com.example.javabasic.p09_modern;

import java.util.Optional;

public class D03OptionalDemo {
    public static void main(String[] args) {
        Optional<String> name = findNameById(1);
        System.out.println("找到的名字: " + name.orElse("未知用户"));

        Optional<String> missing = findNameById(2);
        System.out.println("找不到时给默认值: " + missing.orElse("未知用户"));

        missing.ifPresent(value -> System.out.println("只有有值时才会执行: " + value));

        String upperName = name.map(String::toUpperCase).orElse("EMPTY");
        System.out.println("map 转换: " + upperName);
    }

    public static Optional<String> findNameById(int id) {
        if (id == 1) {
            return Optional.of("Java");
        }
        return Optional.empty();
    }
}

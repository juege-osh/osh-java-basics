package com.example.javabasic.p09_modern;

import java.util.Optional;

/**
 * 学习 Optional：用来表达“可能有值，也可能没有值”。
 */
public class D03OptionalDemo {
    public static void main(String[] args) {
        Optional<String> name = findNameById(1);
        // orElse 表示有值就取值，没值就用默认值。
        System.out.println("找到的名字: " + name.orElse("未知用户"));

        Optional<String> missing = findNameById(2);
        System.out.println("找不到时给默认值: " + missing.orElse("未知用户"));

        // ifPresent 只有 Optional 里真的有值时才执行。
        missing.ifPresent(value -> System.out.println("只有有值时才会执行: " + value));

        // map 可以在有值时做转换；没有值时不会执行转换。
        String upperName = name.map(String::toUpperCase).orElse("EMPTY");
        System.out.println("map 转换: " + upperName);
    }

    public static Optional<String> findNameById(int id) {
        if (id == 1) {
            // Optional.of 表示明确有值。
            return Optional.of("Java");
        }
        // Optional.empty 表示没有值，避免直接返回 null。
        return Optional.empty();
    }
}

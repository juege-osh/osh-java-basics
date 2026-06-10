package com.example.javabasic.p09_modern;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 学习 Java 8 日期时间 API：LocalDate、LocalTime、LocalDateTime。
 */
public class D04DateTimeDemo {
    public static void main(String[] args) {
        // LocalDate 只表示日期，LocalTime 只表示时间，LocalDateTime 表示日期和时间。
        LocalDate today = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();

        System.out.println("今天日期: " + today);
        System.out.println("当前时间: " + nowTime);
        System.out.println("当前日期时间: " + now);

        LocalDate birthday = LocalDate.of(2010, 5, 20);
        System.out.println("指定日期: " + birthday);
        // 日期对象是不可变的，plusDays 会返回一个新日期。
        System.out.println("10 天后: " + today.plusDays(10));
        System.out.println("1 个月前: " + today.minusMonths(1));

        // DateTimeFormatter 用来把日期时间和字符串互相转换。
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println("格式化: " + formatted);

        // parse 会按 formatter 指定的格式解析字符串。
        LocalDateTime parsed = LocalDateTime.parse("2026-06-09 12:30:00", formatter);
        System.out.println("解析字符串: " + parsed);
    }
}

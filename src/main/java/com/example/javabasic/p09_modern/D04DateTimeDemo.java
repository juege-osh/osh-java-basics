package com.example.javabasic.p09_modern;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class D04DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();

        System.out.println("今天日期: " + today);
        System.out.println("当前时间: " + nowTime);
        System.out.println("当前日期时间: " + now);

        LocalDate birthday = LocalDate.of(2010, 5, 20);
        System.out.println("指定日期: " + birthday);
        System.out.println("10 天后: " + today.plusDays(10));
        System.out.println("1 个月前: " + today.minusMonths(1));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println("格式化: " + formatted);

        LocalDateTime parsed = LocalDateTime.parse("2026-06-09 12:30:00", formatter);
        System.out.println("解析字符串: " + parsed);
    }
}

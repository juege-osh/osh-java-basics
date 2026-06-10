package com.example.javabasic.p09_modern;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 学习 BigDecimal：金额、精确小数计算不要用 double。
 */
public class D05BigDecimalDemo {
    public static void main(String[] args) {
        // double 是二进制浮点数，很多十进制小数不能精确表示。
        System.out.println("double 精度问题: " + (0.1 + 0.2));

        // BigDecimal 推荐用字符串创建，避免先变成不精确的 double。
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        BigDecimal sum = a.add(b);
        System.out.println("BigDecimal 精确计算: " + sum);

        BigDecimal price = new BigDecimal("10.00");
        BigDecimal quantity = new BigDecimal("3");
        System.out.println("乘法: " + price.multiply(quantity));

        BigDecimal total = new BigDecimal("10");
        BigDecimal count = new BigDecimal("3");
        // 除不尽时必须指定保留几位和舍入方式，否则会抛异常。
        System.out.println("除法保留 2 位: " + total.divide(count, 2, RoundingMode.HALF_UP));
    }
}

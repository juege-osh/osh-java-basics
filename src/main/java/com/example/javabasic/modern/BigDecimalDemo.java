package com.example.javabasic.modern;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println("double 精度问题: " + (0.1 + 0.2));

        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        BigDecimal sum = a.add(b);
        System.out.println("BigDecimal 精确计算: " + sum);

        BigDecimal price = new BigDecimal("10.00");
        BigDecimal quantity = new BigDecimal("3");
        System.out.println("乘法: " + price.multiply(quantity));

        BigDecimal total = new BigDecimal("10");
        BigDecimal count = new BigDecimal("3");
        System.out.println("除法保留 2 位: " + total.divide(count, 2, RoundingMode.HALF_UP));
    }
}

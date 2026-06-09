package com.example.javabasic.p02_syntax;

import java.util.Random;

public class D09MathRandomDemo {
    public static void main(String[] args) {
        System.out.println("绝对值: " + Math.abs(-10));
        System.out.println("向上取整: " + Math.ceil(3.2));
        System.out.println("向下取整: " + Math.floor(3.8));
        System.out.println("四舍五入: " + Math.round(3.5));
        System.out.println("最大值: " + Math.max(10, 20));
        System.out.println("最小值: " + Math.min(10, 20));
        System.out.println("2 的 3 次方: " + Math.pow(2, 3));
        System.out.println("平方根: " + Math.sqrt(16));

        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("0 到 99 的随机整数: " + number);

        int dice = random.nextInt(6) + 1;
        System.out.println("模拟骰子 1 到 6: " + dice);
    }
}

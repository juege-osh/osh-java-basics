package com.example.javabasic.p02_syntax;

import java.util.Random;

/**
 * 学习 Math 数学工具类和 Random 随机数。
 */
public class D09MathRandomDemo {
    public static void main(String[] args) {
        // Math 里的方法都是静态方法，可以直接 Math.xxx 调用。
        System.out.println("绝对值: " + Math.abs(-10));
        System.out.println("向上取整: " + Math.ceil(3.2));
        System.out.println("向下取整: " + Math.floor(3.8));
        System.out.println("四舍五入: " + Math.round(3.5));
        System.out.println("最大值: " + Math.max(10, 20));
        System.out.println("最小值: " + Math.min(10, 20));
        System.out.println("2 的 3 次方: " + Math.pow(2, 3));
        System.out.println("平方根: " + Math.sqrt(16));

        // Random 用来生成随机数。每次运行，结果可能不一样。
        Random random = new Random();
        // nextInt(100) 生成 0 到 99 的整数，不包含 100。
        int number = random.nextInt(100);
        System.out.println("0 到 99 的随机整数: " + number);

        // 骰子是 1 到 6，所以先生成 0 到 5，再加 1。
        int dice = random.nextInt(6) + 1;
        System.out.println("模拟骰子 1 到 6: " + dice);
    }
}

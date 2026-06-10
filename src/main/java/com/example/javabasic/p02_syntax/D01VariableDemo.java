package com.example.javabasic.p02_syntax;

/**
 * 学习变量、常量和变量交换。
 */
public class D01VariableDemo {
    public static void main(String[] args) {
        // 变量 = 可以变化的值。左边是类型和变量名，右边是具体的值。
        int age = 15;
        double score = 88.5;
        String name = "小明";

        // 字符串和变量可以用 + 拼接在一起输出。
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("分数: " + score);

        // 变量可以重新赋值，新值会覆盖旧值。
        age = 16;
        System.out.println("变量可以重新赋值，新的年龄: " + age);

        // final 表示常量，赋值后不能再改，适合保存固定不变的内容。
        final String school = "Java 入门学校";
        System.out.println("final 修饰的是常量，定义后不能再改: " + school);

        int a = 10, b = 20;
        // 交换两个变量通常需要第三个临时变量，防止其中一个值被覆盖丢失。
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后 a=" + a + ", b=" + b);
    }
}

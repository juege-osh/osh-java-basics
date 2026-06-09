package com.example.javabasic.syntax;

public class VariableDemo {
    public static void main(String[] args) {
        int age = 15;
        double score = 88.5;
        String name = "小明";

        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("分数: " + score);

        age = 16;
        System.out.println("变量可以重新赋值，新的年龄: " + age);

        final String school = "Java 入门学校";
        System.out.println("final 修饰的是常量，定义后不能再改: " + school);

        int a = 10, b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后 a=" + a + ", b=" + b);
    }
}

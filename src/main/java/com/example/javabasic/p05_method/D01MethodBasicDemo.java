package com.example.javabasic.p05_method;

public class D01MethodBasicDemo {
    public static void main(String[] args) {
        sayHello("小明");

        int result = add(10, 20);
        System.out.println("10 + 20 = " + result);

        System.out.println("是否成年: " + isAdult(18));
    }

    public static void sayHello(String name) {
        System.out.println("你好，" + name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isAdult(int age) {
        return age >= 18;
    }
}

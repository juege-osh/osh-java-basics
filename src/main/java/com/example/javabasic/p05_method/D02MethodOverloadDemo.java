package com.example.javabasic.p05_method;

/**
 * 学习方法重载：方法名相同，但参数列表不同。
 */
public class D02MethodOverloadDemo {
    public static void main(String[] args) {
        // Java 会根据参数个数和参数类型，自动选择调用哪个 add 方法。
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1.5, 2.3));
    }

    // 两个 int 参数。
    public static int add(int a, int b) {
        return a + b;
    }

    // 三个 int 参数，和上面的方法参数个数不同。
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 两个 double 参数，和第一个方法参数类型不同。
    public static double add(double a, double b) {
        return a + b;
    }
}

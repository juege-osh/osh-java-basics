package com.example.javabasic.p05_method;

/**
 * 学习方法：把一段可重复使用的代码封装起来。
 */
public class D01MethodBasicDemo {
    public static void main(String[] args) {
        // 调用方法时，把实际值传给方法参数。
        sayHello("小明");

        int result = add(10, 20);
        System.out.println("10 + 20 = " + result);

        System.out.println("是否成年: " + isAdult(18));
    }

    // void 表示这个方法只做事，不返回结果。
    public static void sayHello(String name) {
        System.out.println("你好，" + name);
    }

    // int 表示这个方法会返回一个整数，return 后面的值就是返回值。
    public static int add(int a, int b) {
        return a + b;
    }

    // boolean 方法适合返回“是/否”这种判断结果。
    public static boolean isAdult(int age) {
        return age >= 18;
    }
}

package com.example.javabasic.p05_method;

/**
 * 学习递归：方法自己调用自己。递归一定要有结束条件。
 */
public class D03RecursionDemo {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("第 8 个斐波那契数 = " + fibonacci(8));
    }

    public static int factorial(int n) {
        // 结束条件：1! 和 0! 都是 1。没有结束条件会无限递归。
        if (n <= 1) {
            return 1;
        }
        // 5! = 5 * 4!，4! 又等于 4 * 3!，这就是递归拆解。
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        // 斐波那契数列前两项固定：f(0)=0，f(1)=1。
        if (n <= 1) {
            return n;
        }
        // 后一项等于前两项之和。
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

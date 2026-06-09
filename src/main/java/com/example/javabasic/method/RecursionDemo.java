package com.example.javabasic.method;

public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("第 8 个斐波那契数 = " + fibonacci(8));
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

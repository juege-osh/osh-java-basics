package com.example.javabasic.p07_exception;

public class D01ExceptionBasicDemo {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("捕获到算术异常: " + e.getMessage());
        } finally {
            System.out.println("finally 不管是否异常都会执行，常用于释放资源。");
        }

        System.out.println("程序没有崩溃，可以继续执行。");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

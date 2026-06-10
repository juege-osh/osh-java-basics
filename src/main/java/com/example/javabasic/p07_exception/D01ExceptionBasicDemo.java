package com.example.javabasic.p07_exception;

/**
 * 学习异常捕获：程序出错时不要直接崩溃，而是给出可控处理。
 */
public class D01ExceptionBasicDemo {
    public static void main(String[] args) {
        try {
            // 这里故意除以 0，会触发 ArithmeticException。
            int result = divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            // catch 捕获指定类型异常，e.getMessage() 可以看到错误原因。
            System.out.println("捕获到算术异常: " + e.getMessage());
        } finally {
            System.out.println("finally 不管是否异常都会执行，常用于释放资源。");
        }

        System.out.println("程序没有崩溃，可以继续执行。");
    }

    public static int divide(int a, int b) {
        // 如果 b 是 0，Java 会抛出算术异常。
        return a / b;
    }
}

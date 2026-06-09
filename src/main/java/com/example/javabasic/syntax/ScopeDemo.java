package com.example.javabasic.syntax;

public class ScopeDemo {
    private static String classLevelValue = "类级变量，也叫静态变量";

    public static void main(String[] args) {
        String methodLevelValue = "方法级变量";
        System.out.println(methodLevelValue);
        System.out.println(classLevelValue);

        if (true) {
            String blockLevelValue = "代码块变量";
            System.out.println(blockLevelValue);
        }

        // blockLevelValue 只能在 if 的大括号里使用，离开代码块就失效。
        printMessage("参数也是一种局部变量");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}

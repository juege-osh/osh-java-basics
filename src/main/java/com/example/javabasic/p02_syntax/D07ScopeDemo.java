package com.example.javabasic.p02_syntax;

/**
 * 学习变量作用域：变量只能在它所属的大括号范围内使用。
 */
public class D07ScopeDemo {
    // static 字段属于类，类里的静态方法可以直接访问。
    private static String classLevelValue = "类级变量，也叫静态变量";

    public static void main(String[] args) {
        // 方法里定义的变量，只能在当前方法内使用。
        String methodLevelValue = "方法级变量";
        System.out.println(methodLevelValue);
        System.out.println(classLevelValue);

        if (true) {
            // blockLevelValue 定义在 if 的大括号里，只能在这个代码块内使用。
            String blockLevelValue = "代码块变量";
            System.out.println(blockLevelValue);
        }

        // blockLevelValue 只能在 if 的大括号里使用，离开代码块就失效。
        printMessage("参数也是一种局部变量");
    }

    public static void printMessage(String message) {
        // message 是方法参数，只在 printMessage 方法里有效。
        System.out.println(message);
    }
}

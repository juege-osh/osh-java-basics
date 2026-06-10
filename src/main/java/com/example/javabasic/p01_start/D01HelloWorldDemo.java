package com.example.javabasic.p01_start;

/**
 * 第一个 Java 程序。
 * 先学会运行 main 方法，再看控制台输出。
 */
public class D01HelloWorldDemo {
    public static void main(String[] args) {
        // System.out.println 会把括号里的内容打印到控制台，并自动换行。
        System.out.println("Hello, Java!");

        // main 方法是程序入口，点击 IDEA 左侧绿色按钮时，就是从这里开始执行。
        System.out.println("每个 Java 程序都从 main 方法开始运行。");

        // 下面两行是 IDEA 常用快捷输入，写代码时可以少敲很多字。
        System.out.println("快捷输入: 在 IDEA 里输入 psvm 或 main 可生成 main 方法。");
        System.out.println("快捷输入: 输入 sout 可生成 System.out.println。");

        // 空的 println 只负责换一行，方便看输出。
        System.out.println();
    }
}

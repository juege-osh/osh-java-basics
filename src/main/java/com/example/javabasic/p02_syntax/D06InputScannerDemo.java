package com.example.javabasic.p02_syntax;

import java.util.Scanner;

/**
 * 学习用 Scanner 从控制台读取用户输入。
 */
public class D06InputScannerDemo {
    public static void main(String[] args) {
        // 创建 Scanner 后，程序会等待你在控制台输入内容。
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入你的名字: ");
        // nextLine 读取一整行文字。
        String name = scanner.nextLine();

        System.out.print("请输入你的年龄: ");
        // nextInt 读取整数。如果输入 abc，会抛出输入格式异常。
        int age = scanner.nextInt();

        System.out.println("你好，" + name + "，你今年 " + age + " 岁。");
        // 关闭 Scanner，释放它占用的输入资源。
        scanner.close();
    }
}

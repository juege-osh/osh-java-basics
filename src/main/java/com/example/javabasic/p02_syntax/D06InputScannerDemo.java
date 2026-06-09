package com.example.javabasic.p02_syntax;

import java.util.Scanner;

public class D06InputScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入你的名字: ");
        String name = scanner.nextLine();

        System.out.print("请输入你的年龄: ");
        int age = scanner.nextInt();

        System.out.println("你好，" + name + "，你今年 " + age + " 岁。");
        scanner.close();
    }
}

package com.example.javabasic.p01_start;

import java.util.Scanner;

/**
 * 一个小练习：从控制台输入成绩，再计算总分、平均分和等级。
 */
public class D03MiniPracticeDemo {
    public static void main(String[] args) {
        // Scanner 用来读取键盘输入，System.in 表示从控制台输入。
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学生姓名: ");
        // nextLine 读取一整行文本，适合读名字、地址这类字符串。
        String name = scanner.nextLine();

        System.out.print("请输入语文成绩: ");
        // nextInt 读取一个整数，输入时不要带中文或小数点。
        int chinese = scanner.nextInt();

        System.out.print("请输入数学成绩: ");
        int math = scanner.nextInt();

        System.out.print("请输入英语成绩: ");
        int english = scanner.nextInt();

        int total = chinese + math + english;
        // 除以 3.0 而不是 3，是为了得到带小数的平均值。
        double average = total / 3.0;
        // 三元运算符可以理解成简短版 if/else：条件 ? 条件成立的值 : 条件不成立的值。
        String level = average >= 90 ? "优秀" : average >= 60 ? "及格" : "需要加油";

        System.out.println("学生: " + name);
        System.out.println("总分: " + total);
        System.out.println("平均分: " + average);
        System.out.println("等级: " + level);

        // 用完 Scanner 后关闭，养成释放资源的习惯。
        scanner.close();
    }
}

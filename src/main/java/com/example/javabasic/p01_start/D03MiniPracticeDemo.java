package com.example.javabasic.p01_start;

import java.util.Scanner;

public class D03MiniPracticeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学生姓名: ");
        String name = scanner.nextLine();

        System.out.print("请输入语文成绩: ");
        int chinese = scanner.nextInt();

        System.out.print("请输入数学成绩: ");
        int math = scanner.nextInt();

        System.out.print("请输入英语成绩: ");
        int english = scanner.nextInt();

        int total = chinese + math + english;
        double average = total / 3.0;
        String level = average >= 90 ? "优秀" : average >= 60 ? "及格" : "需要加油";

        System.out.println("学生: " + name);
        System.out.println("总分: " + total);
        System.out.println("平均分: " + average);
        System.out.println("等级: " + level);

        scanner.close();
    }
}

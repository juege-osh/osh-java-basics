package com.example.javabasic.syntax;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("加: " + (a + b));
        System.out.println("减: " + (a - b));
        System.out.println("乘: " + (a * b));
        System.out.println("除: " + (a / b));
        System.out.println("取余: " + (a % b));

        int count = 5;
        count++;
        System.out.println("自增后 count=" + count);
        count--;
        System.out.println("自减后 count=" + count);

        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        boolean hasTicket = true;
        boolean hasIdCard = false;
        System.out.println("有票并且有身份证: " + (hasTicket && hasIdCard));
        System.out.println("有票或者有身份证: " + (hasTicket || hasIdCard));
        System.out.println("没有身份证: " + (!hasIdCard));

        int max = a > b ? a : b;
        System.out.println("三元运算符取较大值: " + max);
    }
}

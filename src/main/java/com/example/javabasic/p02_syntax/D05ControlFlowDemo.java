package com.example.javabasic.p02_syntax;

public class D05ControlFlowDemo {
    public static void main(String[] args) {
        int score = 86;

        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("需要继续努力");
        }

        int weekday = 3;
        switch (weekday) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("其他日期");
                break;
        }

        System.out.println("for 循环:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i=" + i);
        }

        System.out.println("while 循环:");
        int count = 3;
        while (count > 0) {
            System.out.println("count=" + count);
            count--;
        }

        System.out.println("break 和 continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println("当前数字: " + i);
        }
    }
}

package com.example.javabasic.p02_syntax;

/**
 * 学习流程控制：if、switch、for、while、break、continue。
 */
public class D05ControlFlowDemo {
    public static void main(String[] args) {
        int score = 86;

        // if/else if/else 会从上到下判断，遇到第一个成立的分支就执行。
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("需要继续努力");
        }

        int weekday = 3;
        // switch 适合判断固定值，例如星期、状态、菜单选项。
        switch (weekday) {
            case 1:
                System.out.println("星期一");
                // break 表示跳出 switch，不写可能继续执行下一个 case。
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
        // for 循环通常用于“明确知道要循环几次”的场景。
        for (int i = 1; i <= 5; i++) {
            System.out.println("i=" + i);
        }

        System.out.println("while 循环:");
        int count = 3;
        // while 会先判断条件，条件为 true 才进入循环。
        while (count > 0) {
            System.out.println("count=" + count);
            // 每次循环都让 count 减 1，否则可能变成死循环。
            count--;
        }

        System.out.println("break 和 continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                // continue 跳过本次循环后面的代码，直接进入下一次循环。
                continue;
            }
            if (i == 4) {
                // break 直接结束整个循环。
                break;
            }
            System.out.println("当前数字: " + i);
        }
    }
}

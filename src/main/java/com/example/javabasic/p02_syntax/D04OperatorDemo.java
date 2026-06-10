package com.example.javabasic.p02_syntax;

/**
 * 学习常见运算符：算术、比较、逻辑和三元运算符。
 */
public class D04OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // 算术运算符：加减乘除和取余。
        System.out.println("加: " + (a + b));
        System.out.println("减: " + (a - b));
        System.out.println("乘: " + (a * b));
        System.out.println("除: " + (a / b));
        System.out.println("取余: " + (a % b));

        int count = 5;
        // count++ 等价于 count = count + 1。
        count++;
        System.out.println("自增后 count=" + count);
        // count-- 等价于 count = count - 1。
        count--;
        System.out.println("自减后 count=" + count);

        // 比较运算符的结果是 boolean，也就是 true 或 false。
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        boolean hasTicket = true;
        boolean hasIdCard = false;
        // && 表示并且，两边都为 true 才是 true。
        System.out.println("有票并且有身份证: " + (hasTicket && hasIdCard));
        // || 表示或者，只要有一边为 true 就是 true。
        System.out.println("有票或者有身份证: " + (hasTicket || hasIdCard));
        // ! 表示取反，true 变 false，false 变 true。
        System.out.println("没有身份证: " + (!hasIdCard));

        // 三元运算符格式：条件 ? 条件成立的值 : 条件不成立的值。
        int max = a > b ? a : b;
        System.out.println("三元运算符取较大值: " + max);
    }
}

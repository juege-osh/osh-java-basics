package com.example.javabasic.p03_string;

/**
 * 学习字符串比较。重点：比较内容用 equals，不要用 ==。
 */
public class D03StringCompareDemo {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        // new String 会创建一个新的字符串对象，内容相同但对象地址不同。
        String c = new String("Java");

        // == 比较的是两个变量是否指向同一个对象。
        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));
        // equals 比较的是字符串内容是否相同。
        System.out.println("a.equals(c): " + a.equals(c));

        String input = "java";
        System.out.println("区分大小写 equals: " + a.equals(input));
        System.out.println("忽略大小写 equalsIgnoreCase: " + a.equalsIgnoreCase(input));

        String maybeNull = null;
        // 把常量写在前面，可以避免 maybeNull.equals(...) 造成空指针异常。
        System.out.println("常量放前面可避免空指针: " + "Java".equals(maybeNull));
    }
}

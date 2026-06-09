package com.example.javabasic.string;

public class StringCompareDemo {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a.equals(c): " + a.equals(c));

        String input = "java";
        System.out.println("区分大小写 equals: " + a.equals(input));
        System.out.println("忽略大小写 equalsIgnoreCase: " + a.equalsIgnoreCase(input));

        String maybeNull = null;
        System.out.println("常量放前面可避免空指针: " + "Java".equals(maybeNull));
    }
}

package com.example.javabasic.p02_syntax;

/**
 * 演示 Java 的 8 大基本数据类型
 * 一共 8 个：4 个整数 + 2 个小数 + 1 个字符 + 1 个布尔
 */
public class D02DataTypeDemo {
    public static void main(String[] args) {

        // 1. byte 字节类型
        // 占 1 字节（8位）
        // 范围：-128 ~ 127
        byte byteNumber = 127;

        // 2. short 短整型
        // 占 2 字节
        // 范围：-32768 ~ 32767
        short shortNumber = 32000;

        // 3. int 整型（最常用）
        // 占 4 字节
        // 范围：-2147483648 ~ 2147483647
        int intNumber = 100000;

        // 4. long 长整型
        // 占 8 字节
        // 必须加 L 表示是 long 类型
        long longNumber = 10000000000L;

        // ------------------------------
        // 小数类型

        // 5. float 单精度浮点数
        // 占 4 字节
        // 必须加 F 表示是 float
        float floatNumber = 3.14F;

        // 6. double 双精度浮点数（最常用）
        // 占 8 字节
        // Java 默认小数类型就是 double
        double doubleNumber = 3.1415926;

        // ------------------------------
        // 字符 + 布尔

        // 7. char 字符类型
        // 占 2 字节（可以存中文、字母、符号）
        char letter = 'A';

        // 8. boolean 布尔类型
        // 占 1 字节（实际存储由JVM优化，但逻辑上占1字节）
        // 值只有 true / false
        boolean passed = true;

        // ------------------------------
        // 输出结果
        System.out.println("byte: " + byteNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + intNumber);
        System.out.println("long: " + longNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + passed);

        // int 类型的取值范围
        System.out.println("int 范围: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);

        // long 类型的取值范围
        System.out.println("long 范围: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

        // int 最大值 + 1 → 会发生【数据溢出】，变成负数
        int overflow = Integer.MAX_VALUE + 1;
        System.out.println("整数溢出演示: Integer.MAX_VALUE + 1 = " + overflow);
    }
}
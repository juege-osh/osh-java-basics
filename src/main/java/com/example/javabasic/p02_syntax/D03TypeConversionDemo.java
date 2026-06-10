package com.example.javabasic.p02_syntax;

/**
 * 学习类型转换：小范围转大范围通常自动完成，大范围转小范围需要强制转换。
 */
public class D03TypeConversionDemo {
    public static void main(String[] args) {
        int intValue = 100;
        // int 的范围比 long 小，所以可以自动转成 long。
        long longValue = intValue;
        // long 也可以自动转成 double。
        double doubleValue = longValue;

        System.out.println("自动类型转换 int -> long -> double: " + doubleValue);

        double price = 19.99;
        // 强制转换要写目标类型，例如 (int)。这里小数部分会直接丢掉，不会四舍五入。
        int integerPrice = (int) price;
        System.out.println("强制类型转换 double -> int 会丢掉小数: " + integerPrice);

        int a = 10;
        int b = 3;
        // 两个 int 相除，结果还是 int，小数部分会被丢弃。
        System.out.println("整数除法 10 / 3 = " + (a / b));
        System.out.println("想得到小数，需要至少一个操作数是小数: 10.0 / 3 = " + (10.0 / b));

        char c = 'A';
        // char 本质上也有一个数字编码，A 对应 Unicode 编码 65。
        int code = c;
        System.out.println("char 可以转为 Unicode 编码: 'A' -> " + code);
        System.out.println("编码也能强转成 char: 66 -> " + (char) 66);
    }
}

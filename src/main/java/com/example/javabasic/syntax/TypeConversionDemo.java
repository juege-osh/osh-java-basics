package com.example.javabasic.syntax;

public class TypeConversionDemo {
    public static void main(String[] args) {
        int intValue = 100;
        long longValue = intValue;
        double doubleValue = longValue;

        System.out.println("自动类型转换 int -> long -> double: " + doubleValue);

        double price = 19.99;
        int integerPrice = (int) price;
        System.out.println("强制类型转换 double -> int 会丢掉小数: " + integerPrice);

        int a = 10;
        int b = 3;
        System.out.println("整数除法 10 / 3 = " + (a / b));
        System.out.println("想得到小数，需要至少一个操作数是小数: 10.0 / 3 = " + (10.0 / b));

        char c = 'A';
        int code = c;
        System.out.println("char 可以转为 Unicode 编码: 'A' -> " + code);
        System.out.println("编码也能强转成 char: 66 -> " + (char) 66);
    }
}

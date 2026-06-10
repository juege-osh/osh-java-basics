package com.example.javabasic.p02_syntax;

/**
 * 学习包装类：Integer、Double 等对象类型可以包装基本类型。
 */
public class D08WrapperClassDemo {
    public static void main(String[] args) {
        int primitive = 100;
        // 自动装箱：int 自动变成 Integer。
        Integer wrapper = primitive;
        // 自动拆箱：Integer 自动变回 int。
        int backToPrimitive = wrapper;

        System.out.println("基本类型 int: " + primitive);
        System.out.println("包装类 Integer: " + wrapper);
        System.out.println("自动拆箱回 int: " + backToPrimitive);

        String numberText = "123";
        // parseInt 常用于把表单、控制台输入里的数字字符串转成 int。
        int parsed = Integer.parseInt(numberText);
        System.out.println("字符串转 int: " + parsed);

        String doubleText = "3.14";
        // parseDouble 把字符串转成 double。字符串内容必须像数字。
        double parsedDouble = Double.parseDouble(doubleText);
        System.out.println("字符串转 double: " + parsedDouble);

        // 包装类里有很多常量和工具方法，例如最大值、最小值、是否为 NaN。
        System.out.println("Integer 最大值: " + Integer.MAX_VALUE);
        System.out.println("Double 是否 NaN: " + Double.isNaN(0.0 / 0.0));
    }
}

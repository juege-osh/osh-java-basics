package com.example.javabasic.syntax;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int primitive = 100;
        Integer wrapper = primitive;
        int backToPrimitive = wrapper;

        System.out.println("基本类型 int: " + primitive);
        System.out.println("包装类 Integer: " + wrapper);
        System.out.println("自动拆箱回 int: " + backToPrimitive);

        String numberText = "123";
        int parsed = Integer.parseInt(numberText);
        System.out.println("字符串转 int: " + parsed);

        String doubleText = "3.14";
        double parsedDouble = Double.parseDouble(doubleText);
        System.out.println("字符串转 double: " + parsedDouble);

        System.out.println("Integer 最大值: " + Integer.MAX_VALUE);
        System.out.println("Double 是否 NaN: " + Double.isNaN(0.0 / 0.0));
    }
}

package com.example.javabasic.p02_syntax;

public class D02DataTypeDemo {
    public static void main(String[] args) {
        byte byteNumber = 127;
        short shortNumber = 32000;
        int intNumber = 100000;
        long longNumber = 10000000000L;

        float floatNumber = 3.14F;
        double doubleNumber = 3.1415926;

        char letter = 'A';
        boolean passed = true;

        System.out.println("byte: " + byteNumber);
        System.out.println("short: " + shortNumber);
        System.out.println("int: " + intNumber);
        System.out.println("long: " + longNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + passed);

        System.out.println("int 范围: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 范围: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

        int overflow = Integer.MAX_VALUE + 1;
        System.out.println("整数溢出演示: Integer.MAX_VALUE + 1 = " + overflow);
    }
}

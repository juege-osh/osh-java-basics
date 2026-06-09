package com.example.javabasic.p07_exception;

public class D02ThrowExceptionDemo {
    public static void main(String[] args) {
        try {
            register("小明", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("注册失败: " + e.getMessage());
        }
    }

    public static void register(String name, int age) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("姓名不能为空");
        }
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("年龄不合法");
        }

        System.out.println("注册成功: " + name + ", " + age);
    }
}

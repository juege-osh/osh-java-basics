package com.example.javabasic.p07_exception;

/**
 * 学习主动抛异常：发现非法参数时，用异常明确告诉调用方。
 */
public class D02ThrowExceptionDemo {
    public static void main(String[] args) {
        try {
            register("小明", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("注册失败: " + e.getMessage());
        }
    }

    public static void register(String name, int age) {
        // trim 去掉首尾空格，避免用户输入几个空格也算合法姓名。
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("姓名不能为空");
        }
        if (age < 0 || age > 150) {
            // throw 表示主动抛出异常，后面的代码不会继续执行。
            throw new IllegalArgumentException("年龄不合法");
        }

        System.out.println("注册成功: " + name + ", " + age);
    }
}

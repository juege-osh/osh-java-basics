package com.example.javabasic.string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("姓名: ").append("小明");
        builder.append(", 年龄: ").append(16);
        builder.append(", 是否及格: ").append(true);

        System.out.println(builder.toString());

        builder.insert(0, "[学生信息] ");
        System.out.println("insert 后: " + builder);

        builder.replace(0, 6, "[修改后]");
        System.out.println("replace 后: " + builder);

        builder.delete(0, 5);
        System.out.println("delete 后: " + builder);

        System.out.println("反转 reverse: " + new StringBuilder("abc").reverse());
    }
}

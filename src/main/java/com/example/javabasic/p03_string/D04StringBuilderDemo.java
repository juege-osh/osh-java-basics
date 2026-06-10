package com.example.javabasic.p03_string;

/**
 * 学习 StringBuilder：适合多次拼接、插入、删除字符串。
 */
public class D04StringBuilderDemo {
    public static void main(String[] args) {
        // StringBuilder 像一个可修改的字符串容器。
        StringBuilder builder = new StringBuilder();
        // append 可以连续调用，返回的还是同一个 builder。
        builder.append("姓名: ").append("小明");
        builder.append(", 年龄: ").append(16);
        builder.append(", 是否及格: ").append(true);

        System.out.println(builder.toString());

        // insert 在指定位置插入内容，0 表示最前面。
        builder.insert(0, "[学生信息] ");
        System.out.println("insert 后: " + builder);

        // replace 替换指定范围，左闭右开：包含 0，不包含 6。
        builder.replace(0, 6, "[修改后]");
        System.out.println("replace 后: " + builder);

        // delete 删除指定范围的字符。
        builder.delete(0, 5);
        System.out.println("delete 后: " + builder);

        System.out.println("反转 reverse: " + new StringBuilder("abc").reverse());
    }
}

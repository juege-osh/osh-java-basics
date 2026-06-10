package com.example.javabasic.p03_string;

/**
 * 学习字符串格式化和简单正则表达式。
 */
public class D05StringFormatAndRegexDemo {
    public static void main(String[] args) {
        String name = "小明";
        int age = 16;
        double score = 98.456;

        // String.format 用占位符拼字符串，%.2f 表示小数保留 2 位。
        String info = String.format("姓名=%s, 年龄=%d, 分数=%.2f", name, age, score);
        System.out.println(info);

        String phone = "13812345678";
        // matches 会判断整个字符串是否符合正则规则。
        // 1[3-9]\\d{9} 表示 1 开头，第二位 3-9，后面 9 个数字。
        System.out.println("手机号格式是否正确: " + phone.matches("1[3-9]\\d{9}"));

        String sentence = "Java   is   easy";
        // \\s+ 表示一个或多个空白字符，所以多个空格也能切开。
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }

        // replaceAll 支持正则替换。$1、$2 表示保留下来的第 1 组和第 2 组。
        String hiddenPhone = phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        System.out.println("隐藏手机号: " + hiddenPhone);
    }
}

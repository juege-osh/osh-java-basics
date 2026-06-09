package com.example.javabasic.string;

public class StringFormatAndRegexDemo {
    public static void main(String[] args) {
        String name = "小明";
        int age = 16;
        double score = 98.456;

        String info = String.format("姓名=%s, 年龄=%d, 分数=%.2f", name, age, score);
        System.out.println(info);

        String phone = "13812345678";
        System.out.println("手机号格式是否正确: " + phone.matches("1[3-9]\\d{9}"));

        String sentence = "Java   is   easy";
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }

        String hiddenPhone = phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        System.out.println("隐藏手机号: " + hiddenPhone);
    }
}

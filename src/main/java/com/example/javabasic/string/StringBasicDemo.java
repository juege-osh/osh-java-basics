package com.example.javabasic.string;

public class StringBasicDemo {
    public static void main(String[] args) {
        String name = "Java";
        String slogan = "Write once, run anywhere";

        System.out.println("字符串内容: " + name);
        System.out.println("长度 length(): " + name.length());
        System.out.println("拼接: " + name + " - " + slogan);
        System.out.println("第 1 个字符 charAt(0): " + name.charAt(0));
        System.out.println("是否为空 isEmpty(): " + name.isEmpty());

        String empty = "";
        String blank = "   ";
        System.out.println("空字符串 length=0: " + empty.isEmpty());
        System.out.println("全是空格不是 empty: " + blank.isEmpty());
        System.out.println("trim 后是否为空: " + blank.trim().isEmpty());
    }
}

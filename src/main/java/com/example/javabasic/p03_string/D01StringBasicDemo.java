package com.example.javabasic.p03_string;

/**
 * 学习 String 的基础用法：创建、拼接、长度、取字符。
 */
public class D01StringBasicDemo {
    public static void main(String[] args) {
        // String 表示字符串，也就是一段文本。
        String name = "Java";
        String slogan = "Write once, run anywhere";

        System.out.println("字符串内容: " + name);
        // length() 返回字符串里有多少个字符。
        System.out.println("长度 length(): " + name.length());
        System.out.println("拼接: " + name + " - " + slogan);
        // charAt(0) 取第 1 个字符。Java 下标从 0 开始。
        System.out.println("第 1 个字符 charAt(0): " + name.charAt(0));
        System.out.println("是否为空 isEmpty(): " + name.isEmpty());

        String empty = "";
        String blank = "   ";
        // empty 是长度为 0，blank 是有空格的字符串，二者不一样。
        System.out.println("空字符串 length=0: " + empty.isEmpty());
        System.out.println("全是空格不是 empty: " + blank.isEmpty());
        // trim 会去掉首尾空格，常用于处理用户输入。
        System.out.println("trim 后是否为空: " + blank.trim().isEmpty());
    }
}

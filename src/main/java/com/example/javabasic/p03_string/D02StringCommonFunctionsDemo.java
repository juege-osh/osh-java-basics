package com.example.javabasic.p03_string;

/**
 * 学习 String 常用方法。运行后对照输出看每个方法的作用。
 */
public class D02StringCommonFunctionsDemo {
    public static void main(String[] args) {
        String text = "  Java Basic Demo, java is useful.  ";

        // 用 [] 包起来，是为了看清楚字符串首尾有没有空格。
        System.out.println("原始字符串: [" + text + "]");
        System.out.println("trim 去掉首尾空白: [" + text.trim() + "]");
        System.out.println("toUpperCase 大写: " + text.toUpperCase());
        System.out.println("toLowerCase 小写: " + text.toLowerCase());

        System.out.println("contains 是否包含 Basic: " + text.contains("Basic"));
        System.out.println("startsWith 是否以空格开头: " + text.startsWith(" "));
        System.out.println("endsWith 是否以句点和空格结尾: " + text.endsWith(".  "));
        System.out.println("indexOf 查找 java 第一次位置: " + text.indexOf("java"));
        System.out.println("lastIndexOf 查找 java 最后一次位置: " + text.lastIndexOf("java"));

        // substring(0, 4) 表示从下标 0 开始截取，到下标 4 之前结束。
        System.out.println("substring 截取: " + text.trim().substring(0, 4));
        System.out.println("replace 替换: " + text.replace("java", "Java"));

        // split 会把字符串切成数组，这里按空格切分。
        String[] words = text.trim().split(" ");
        System.out.println("split 按空格切分后数量: " + words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }
}

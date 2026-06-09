package com.example.javabasic.string;

public class StringCommonFunctionsDemo {
    public static void main(String[] args) {
        String text = "  Java Basic Demo, java is useful.  ";

        System.out.println("原始字符串: [" + text + "]");
        System.out.println("trim 去掉首尾空白: [" + text.trim() + "]");
        System.out.println("toUpperCase 大写: " + text.toUpperCase());
        System.out.println("toLowerCase 小写: " + text.toLowerCase());

        System.out.println("contains 是否包含 Basic: " + text.contains("Basic"));
        System.out.println("startsWith 是否以空格开头: " + text.startsWith(" "));
        System.out.println("endsWith 是否以句点和空格结尾: " + text.endsWith(".  "));
        System.out.println("indexOf 查找 java 第一次位置: " + text.indexOf("java"));
        System.out.println("lastIndexOf 查找 java 最后一次位置: " + text.lastIndexOf("java"));

        System.out.println("substring 截取: " + text.trim().substring(0, 4));
        System.out.println("replace 替换: " + text.replace("java", "Java"));

        String[] words = text.trim().split(" ");
        System.out.println("split 按空格切分后数量: " + words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }
}

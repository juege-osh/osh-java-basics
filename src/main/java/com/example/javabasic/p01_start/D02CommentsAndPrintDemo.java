package com.example.javabasic.p01_start;

public class D02CommentsAndPrintDemo {
    public static void main(String[] args) {
        // 单行注释: 用于解释一小段代码
        System.out.println("println 会输出内容并换行");

        /*
         * 多行注释:
         * 适合解释一段逻辑。
         */
        System.out.print("print 不会自动换行");
        System.out.print("，所以这句会接在后面");
        System.out.println();

        System.out.printf("printf 可以格式化: 姓名=%s, 年龄=%d, 分数=%.1f%n", "小明", 16, 98.5);
    }
}

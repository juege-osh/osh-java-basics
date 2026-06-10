package com.example.javabasic.p01_start;

/**
 * 学习注释和三种常见输出方式：println、print、printf。
 */
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

        // printf 适合把变量按指定格式放进字符串里。
        // %s 表示字符串，%d 表示整数，%.1f 表示保留 1 位小数。
        System.out.printf("printf 可以格式化: 姓名=%s, 年龄=%d, 分数=%.1f%n", "小明", 16, 98.5);
    }
}

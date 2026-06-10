package com.example.javabasic.p04_array;

/**
 * 学习一维数组：定义、访问、修改和遍历。
 */
public class D01ArrayBasicDemo {
    public static void main(String[] args) {
        // int[] 表示整数数组，大括号里是数组初始值。
        int[] scores = {90, 85, 100, 66};

        System.out.println("数组长度: " + scores.length);
        // 数组下标从 0 开始，所以 scores[0] 是第一个元素。
        System.out.println("第一个元素: " + scores[0]);

        // 修改数组元素：通过下标找到位置，再赋新值。
        scores[1] = 88;
        System.out.println("修改第二个元素后: " + scores[1]);

        System.out.println("普通 for 遍历:");
        // 普通 for 能拿到下标，适合需要知道当前位置的场景。
        for (int i = 0; i < scores.length; i++) {
            System.out.println("下标 " + i + " 的值是 " + scores[i]);
        }

        System.out.println("增强 for 遍历:");
        // 增强 for 只能拿到每个值，写法更简洁。
        for (int score : scores) {
            System.out.println(score);
        }
    }
}

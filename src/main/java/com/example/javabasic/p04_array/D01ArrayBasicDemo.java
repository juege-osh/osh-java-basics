package com.example.javabasic.p04_array;

public class D01ArrayBasicDemo {
    public static void main(String[] args) {
        int[] scores = {90, 85, 100, 66};

        System.out.println("数组长度: " + scores.length);
        System.out.println("第一个元素: " + scores[0]);

        scores[1] = 88;
        System.out.println("修改第二个元素后: " + scores[1]);

        System.out.println("普通 for 遍历:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("下标 " + i + " 的值是 " + scores[i]);
        }

        System.out.println("增强 for 遍历:");
        for (int score : scores) {
            System.out.println(score);
        }
    }
}

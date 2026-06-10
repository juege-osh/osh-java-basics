package com.example.javabasic.p04_array;

/**
 * 学习二维数组：可以理解成表格，有行也有列。
 */
public class D03TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        // matrix 有 3 行，每行 3 个数字。
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("二维数组行数: " + matrix.length);
        System.out.println("第一行列数: " + matrix[0].length);
        // matrix[1][2] 表示第 2 行第 3 列，因为下标从 0 开始。
        System.out.println("第 2 行第 3 列: " + matrix[1][2]);

        // 外层循环控制行，内层循环控制列。
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            // 每打印完一行，换行。
            System.out.println();
        }
    }
}

package com.example.javabasic.p04_array;

public class D03TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("二维数组行数: " + matrix.length);
        System.out.println("第一行列数: " + matrix[0].length);
        System.out.println("第 2 行第 3 列: " + matrix[1][2]);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

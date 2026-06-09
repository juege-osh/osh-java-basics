package com.example.javabasic.array;

import java.util.Arrays;

public class ArrayAlgorithmDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("数组: " + Arrays.toString(numbers));
        System.out.println("总和: " + sum);
        System.out.println("平均值: " + (sum * 1.0 / numbers.length));
        System.out.println("最大值: " + max);
        System.out.println("最小值: " + min);

        Arrays.sort(numbers);
        System.out.println("排序后: " + Arrays.toString(numbers));
        System.out.println("二分查找 7 的下标: " + Arrays.binarySearch(numbers, 7));
    }
}

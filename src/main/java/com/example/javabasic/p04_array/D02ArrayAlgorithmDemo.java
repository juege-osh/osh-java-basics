package com.example.javabasic.p04_array;

import java.util.Arrays;

/**
 * 学习数组常见算法：求和、平均值、最大值、最小值、排序、查找。
 */
public class D02ArrayAlgorithmDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        // sum 从 0 开始累加；max/min 先假设第一个元素就是最大/最小。
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            // 每遍历一个数字，就把它加到 sum 里。
            sum += number;
            if (number > max) {
                // 发现更大的数字，就更新 max。
                max = number;
            }
            if (number < min) {
                // 发现更小的数字，就更新 min。
                min = number;
            }
        }

        System.out.println("数组: " + Arrays.toString(numbers));
        System.out.println("总和: " + sum);
        System.out.println("平均值: " + (sum * 1.0 / numbers.length));
        System.out.println("最大值: " + max);
        System.out.println("最小值: " + min);

        // Arrays.sort 会直接修改原数组，让数组变成升序。
        Arrays.sort(numbers);
        System.out.println("排序后: " + Arrays.toString(numbers));
        // binarySearch 二分查找要求数组已经排好序。
        System.out.println("二分查找 7 的下标: " + Arrays.binarySearch(numbers, 7));
    }
}

package com.example.javabasic.p11_debug;

/**
 * 专门用来练习断点调试。
 * 建议在 countPassed 方法里的 int score = scores[i]; 这一行打断点。
 */
public class D01DebugDemo {
    public static void main(String[] args) {
        int[] scores = {90, 55, 78, 100};
        // 调试时先 Step Into 进入 countPassed，看数组怎么被遍历。
        int passedCount = countPassed(scores);
        System.out.println("及格人数: " + passedCount);
    }

    public static int countPassed(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            // 断点建议打在这里，观察 i、score、passed、count 的变化。
            int score = scores[i];
            boolean passed = score >= 60;
            if (passed) {
                // 只有 passed 为 true 时，及格人数才加 1。
                count++;
            }
        }
        // 循环结束后返回最终统计结果。
        return count;
    }
}

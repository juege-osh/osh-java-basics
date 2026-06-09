package com.example.javabasic.p11_debug;

public class D01DebugDemo {
    public static void main(String[] args) {
        int[] scores = {90, 55, 78, 100};
        int passedCount = countPassed(scores);
        System.out.println("及格人数: " + passedCount);
    }

    public static int countPassed(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            boolean passed = score >= 60;
            if (passed) {
                count++;
            }
        }
        return count;
    }
}

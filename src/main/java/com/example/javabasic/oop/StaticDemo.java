package com.example.javabasic.oop;

public class StaticDemo {
    public static void main(String[] args) {
        Counter first = new Counter();
        Counter second = new Counter();

        first.increment();
        second.increment();
        second.increment();

        System.out.println("first 自己的 count: " + first.getCount());
        System.out.println("second 自己的 count: " + second.getCount());
        System.out.println("所有对象共享的 totalCount: " + Counter.getTotalCount());
        System.out.println("工具方法 square(5): " + MathUtil.square(5));
    }

    static class Counter {
        private int count;
        private static int totalCount;

        public void increment() {
            count++;
            totalCount++;
        }

        public int getCount() {
            return count;
        }

        public static int getTotalCount() {
            return totalCount;
        }
    }

    static class MathUtil {
        public static int square(int number) {
            return number * number;
        }
    }
}

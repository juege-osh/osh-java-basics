package com.example.javabasic.p06_oop;

/**
 * 学习 static：对象自己的数据和类共享的数据是不一样的。
 */
public class D03StaticDemo {
    public static void main(String[] args) {
        // first 和 second 是两个不同对象，各自有自己的 count。
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
        // 普通字段属于对象，每个对象一份。
        private int count;
        // static 字段属于类，所有对象共享一份。
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
        // 工具方法没有必要依赖某个对象，可以写成 static。
        public static int square(int number) {
            return number * number;
        }
    }
}

package com.example.javabasic.p08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 学习 Collections 工具类：排序、反转、最大值、最小值。
 */
public class D05CollectionsUtilityDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        // Collections.addAll 可以一次性添加多个元素。
        Collections.addAll(numbers, 5, 1, 9, 3);

        System.out.println("原始列表: " + numbers);
        // sort 默认升序排序。
        Collections.sort(numbers);
        System.out.println("升序: " + numbers);
        // reverse 反转当前列表顺序。
        Collections.reverse(numbers);
        System.out.println("反转: " + numbers);
        System.out.println("最大值: " + Collections.max(numbers));
        System.out.println("最小值: " + Collections.min(numbers));

        List<StudentScore> students = new ArrayList<StudentScore>();
        students.add(new StudentScore("小明", 90));
        students.add(new StudentScore("小红", 98));
        students.add(new StudentScore("小刚", 85));

        // 对对象排序时，需要告诉 Java 按哪个字段排序。
        Collections.sort(students, new Comparator<StudentScore>() {
            @Override
            public int compare(StudentScore left, StudentScore right) {
                // 返回负数表示 left 排前面；这里用 right - left 实现分数降序。
                return right.getScore() - left.getScore();
            }
        });

        System.out.println("按分数降序: " + students);
    }

    static class StudentScore {
        // final 字段只能在构造方法里赋值一次，适合不可变数据。
        private final String name;
        private final int score;

        public StudentScore(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return name + "=" + score;
        }
    }
}

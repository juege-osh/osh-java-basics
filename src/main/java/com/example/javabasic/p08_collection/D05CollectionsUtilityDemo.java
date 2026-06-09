package com.example.javabasic.p08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D05CollectionsUtilityDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 5, 1, 9, 3);

        System.out.println("原始列表: " + numbers);
        Collections.sort(numbers);
        System.out.println("升序: " + numbers);
        Collections.reverse(numbers);
        System.out.println("反转: " + numbers);
        System.out.println("最大值: " + Collections.max(numbers));
        System.out.println("最小值: " + Collections.min(numbers));

        List<StudentScore> students = new ArrayList<StudentScore>();
        students.add(new StudentScore("小明", 90));
        students.add(new StudentScore("小红", 98));
        students.add(new StudentScore("小刚", 85));

        Collections.sort(students, new Comparator<StudentScore>() {
            @Override
            public int compare(StudentScore left, StudentScore right) {
                return right.getScore() - left.getScore();
            }
        });

        System.out.println("按分数降序: " + students);
    }

    static class StudentScore {
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

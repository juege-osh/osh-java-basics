package com.example.javabasic.p09_modern;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 学习 Stream：像流水线一样处理集合数据。
 */
public class D02StreamDemo {
    public static void main(String[] args) {
        List<StudentScore> students = Arrays.asList(
                new StudentScore("小明", 90, "一班"),
                new StudentScore("小红", 98, "一班"),
                new StudentScore("小刚", 59, "二班"),
                new StudentScore("小丽", 88, "二班")
        );

        // stream() 开始流水线；filter 过滤；map 转换；collect 收集结果。
        List<String> passedNames = students.stream()
                .filter(student -> student.getScore() >= 60)
                .map(StudentScore::getName)
                .collect(Collectors.toList());
        System.out.println("及格学生: " + passedNames);

        // mapToInt 把对象转换成 int 流，再用 sum 求和。
        int totalScore = students.stream()
                .mapToInt(StudentScore::getScore)
                .sum();
        System.out.println("总分: " + totalScore);

        // groupingBy 按指定字段分组，这里按班级分组。
        Map<String, List<StudentScore>> byClassName = students.stream()
                .collect(Collectors.groupingBy(StudentScore::getClassName));
        System.out.println("按班级分组: " + byClassName);
    }

    static class StudentScore {
        // 用一个小类保存一条学生成绩记录。
        private final String name;
        private final int score;
        private final String className;

        public StudentScore(String name, int score, String className) {
            this.name = name;
            this.score = score;
            this.className = className;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public String getClassName() {
            return className;
        }

        @Override
        public String toString() {
            // 分组打印时会用到 toString，让输出更容易看。
            return name + "(" + score + ")";
        }
    }
}

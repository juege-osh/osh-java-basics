package com.example.javabasic.p09_modern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 学习 Lambda：用更短的写法表示“传一段逻辑进去”。
 */
public class D01LambdaDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        Collections.addAll(names, "Tom", "Jerry", "Alice", "Bob");

        // 老写法：匿名内部类。代码比较长，但逻辑是“按字符串长度排序”。
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String left, String right) {
                return left.length() - right.length();
            }
        });
        System.out.println("匿名内部类按长度排序: " + names);

        // Lambda 写法：(参数) -> 返回值。这里按字母顺序排序。
        Collections.sort(names, (left, right) -> left.compareTo(right));
        System.out.println("Lambda 按字母排序: " + names);

        // forEach 需要一个“对每个元素做什么”的逻辑，Lambda 很适合。
        names.forEach(name -> System.out.println("遍历: " + name));

        // Calculator 只有一个抽象方法，所以可以用 Lambda 创建实现。
        Calculator calculator = (a, b) -> a + b;
        System.out.println("函数式接口计算: " + calculator.calculate(10, 20));
    }

    interface Calculator {
        // 只有一个抽象方法的接口叫函数式接口。
        int calculate(int a, int b);
    }
}

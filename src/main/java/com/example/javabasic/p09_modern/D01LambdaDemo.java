package com.example.javabasic.p09_modern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D01LambdaDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        Collections.addAll(names, "Tom", "Jerry", "Alice", "Bob");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String left, String right) {
                return left.length() - right.length();
            }
        });
        System.out.println("匿名内部类按长度排序: " + names);

        Collections.sort(names, (left, right) -> left.compareTo(right));
        System.out.println("Lambda 按字母排序: " + names);

        names.forEach(name -> System.out.println("遍历: " + name));

        Calculator calculator = (a, b) -> a + b;
        System.out.println("函数式接口计算: " + calculator.calculate(10, 20));
    }

    interface Calculator {
        int calculate(int a, int b);
    }
}

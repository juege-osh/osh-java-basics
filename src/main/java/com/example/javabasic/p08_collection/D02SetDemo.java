package com.example.javabasic.p08_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 学习 Set：不允许重复元素，不同实现类有不同顺序特性。
 */
public class D02SetDemo {
    public static void main(String[] args) {
        // HashSet 会去重，但输出顺序不固定。
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Java");
        System.out.println("HashSet 去重，但不保证顺序: " + hashSet);

        // LinkedHashSet 既去重，又保留插入顺序。
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("Go");
        System.out.println("LinkedHashSet 保留插入顺序: " + linkedHashSet);

        // TreeSet 会自动排序，适合需要有序结果的场景。
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("TreeSet 自动排序: " + treeSet);
    }
}

package com.example.javabasic.p08_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class D02SetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Java");
        System.out.println("HashSet 去重，但不保证顺序: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("Go");
        System.out.println("LinkedHashSet 保留插入顺序: " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("TreeSet 自动排序: " + treeSet);
    }
}

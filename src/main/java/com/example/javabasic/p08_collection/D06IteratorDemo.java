package com.example.javabasic.p08_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D06IteratorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("删除偶数后: " + numbers);
    }
}

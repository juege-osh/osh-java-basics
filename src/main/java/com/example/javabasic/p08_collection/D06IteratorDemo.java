package com.example.javabasic.p08_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 学习 Iterator：遍历集合时安全删除元素。
 */
public class D06IteratorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> iterator = numbers.iterator();
        // hasNext 判断后面是否还有元素。
        while (iterator.hasNext()) {
            // next 取出下一个元素，同时移动迭代器位置。
            Integer number = iterator.next();
            if (number % 2 == 0) {
                // 遍历时删除当前元素，要用 iterator.remove()，不要直接 numbers.remove()。
                iterator.remove();
            }
        }

        System.out.println("删除偶数后: " + numbers);
    }
}

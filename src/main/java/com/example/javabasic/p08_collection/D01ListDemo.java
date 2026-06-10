package com.example.javabasic.p08_collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 学习 List：有顺序、可重复，常用实现类是 ArrayList。
 */
public class D01ListDemo {
    public static void main(String[] args) {
        // 左边写接口 List，右边创建具体实现 ArrayList，这是常见写法。
        List<String> names = new ArrayList<String>();
        names.add("小明");
        names.add("小红");
        names.add("小刚");

        System.out.println("列表: " + names);
        System.out.println("第一个元素: " + names.get(0));
        System.out.println("是否包含小红: " + names.contains("小红"));

        // set 按下标修改元素，remove 删除元素。
        names.set(1, "小丽");
        names.remove("小刚");

        // 普通 for 可以拿到下标。
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ": " + names.get(i));
        }

        // 增强 for 适合只关心元素值的遍历。
        for (String name : names) {
            System.out.println("增强 for: " + name);
        }
    }
}

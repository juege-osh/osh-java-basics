package com.example.javabasic.p06_oop;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 学习 equals 和 hashCode：对象放进 HashSet、HashMap 时非常重要。
 */
public class D09EqualsHashCodeDemo {
    public static void main(String[] args) {
        User first = new User(1, "小明");
        User second = new User(1, "小明");

        // == 比较对象地址，两个 new 出来的对象地址不同。
        System.out.println("first == second: " + (first == second));
        // equals 被重写后，可以按 id 和 name 判断内容是否相同。
        System.out.println("first.equals(second): " + first.equals(second));

        Set<User> users = new HashSet<User>();
        users.add(first);
        users.add(second);
        // HashSet 判断重复时会同时用到 hashCode 和 equals。
        System.out.println("HashSet 去重后数量: " + users.size());
    }

    static class User {
        private final int id;
        private final String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object other) {
            // 如果两个引用指向同一个对象，一定相等。
            if (this == other) {
                return true;
            }
            // 如果 other 不是 User 类型，就不可能相等。
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            // 真正决定两个用户是否相同的是 id 和 name。
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            // equals 用到哪些字段，hashCode 通常也用相同字段。
            return Objects.hash(id, name);
        }
    }
}

package com.example.javabasic.p06_oop;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class D09EqualsHashCodeDemo {
    public static void main(String[] args) {
        User first = new User(1, "小明");
        User second = new User(1, "小明");

        System.out.println("first == second: " + (first == second));
        System.out.println("first.equals(second): " + first.equals(second));

        Set<User> users = new HashSet<User>();
        users.add(first);
        users.add(second);
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
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}

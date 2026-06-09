package com.example.javabasic.p08_collection;

public class D04GenericsDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>("Java");
        Box<Integer> integerBox = new Box<Integer>(100);

        System.out.println(stringBox.getValue());
        System.out.println(integerBox.getValue());

        printValue("hello");
        printValue(123);
    }

    public static <T> void printValue(T value) {
        System.out.println("泛型方法收到: " + value);
    }

    static class Box<T> {
        private final T value;

        public Box(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }
}

package com.example.javabasic.p08_collection;

/**
 * 学习泛型：把类型作为参数传进去，减少强制转换和类型错误。
 */
public class D04GenericsDemo {
    public static void main(String[] args) {
        // Box<String> 表示这个盒子只能放 String。
        Box<String> stringBox = new Box<String>("Java");
        // Box<Integer> 表示这个盒子只能放 Integer。
        Box<Integer> integerBox = new Box<Integer>(100);

        System.out.println(stringBox.getValue());
        System.out.println(integerBox.getValue());

        printValue("hello");
        printValue(123);
    }

    // <T> 表示定义一个泛型类型 T，调用时由传入的值决定 T 是什么。
    public static <T> void printValue(T value) {
        System.out.println("泛型方法收到: " + value);
    }

    // T 是类型占位符，创建 Box<String> 时 T 就是 String。
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

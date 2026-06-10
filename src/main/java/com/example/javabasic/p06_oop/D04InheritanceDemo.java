package com.example.javabasic.p06_oop;

/**
 * 学习继承：子类可以复用父类已有的字段和方法。
 */
public class D04InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
        // eat 是父类 Animal 的方法，Dog 继承后也能调用。
        dog.eat();
        // bark 是 Dog 自己新增的方法。
        dog.bark();
    }

    static class Animal {
        // protected 表示子类可以访问。
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println(name + " 正在吃东西");
        }
    }

    // extends 表示 Dog 继承 Animal，Dog 是 Animal 的一种。
    static class Dog extends Animal {
        public Dog(String name) {
            // super 调用父类构造方法，把 name 交给 Animal 初始化。
            super(name);
        }

        public void bark() {
            System.out.println(name + " 汪汪叫");
        }
    }
}

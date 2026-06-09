package com.example.javabasic.oop;

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
        dog.eat();
        dog.bark();
    }

    static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println(name + " 正在吃东西");
        }
    }

    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        public void bark() {
            System.out.println(name + " 汪汪叫");
        }
    }
}

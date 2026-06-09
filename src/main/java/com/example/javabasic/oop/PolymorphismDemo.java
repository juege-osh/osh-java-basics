package com.example.javabasic.oop;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        makeSound(cat);
        makeSound(dog);
    }

    public static void makeSound(Animal animal) {
        animal.sound();
    }

    static class Animal {
        public void sound() {
            System.out.println("动物发出声音");
        }
    }

    static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("猫: 喵喵");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("狗: 汪汪");
        }
    }
}

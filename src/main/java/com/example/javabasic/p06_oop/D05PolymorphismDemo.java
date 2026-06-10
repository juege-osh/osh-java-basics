package com.example.javabasic.p06_oop;

/**
 * 学习多态：父类变量可以指向不同子类对象，运行时执行各自的重写方法。
 */
public class D05PolymorphismDemo {
    public static void main(String[] args) {
        // 左边是 Animal，右边是真正创建的 Cat/Dog 对象。
        Animal cat = new Cat();
        Animal dog = new Dog();

        makeSound(cat);
        makeSound(dog);
    }

    public static void makeSound(Animal animal) {
        // 这里虽然只知道 animal 是 Animal，但实际会调用 Cat 或 Dog 的 sound。
        animal.sound();
    }

    static class Animal {
        public void sound() {
            System.out.println("动物发出声音");
        }
    }

    static class Cat extends Animal {
        @Override
        // Override 表示重写父类方法。
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

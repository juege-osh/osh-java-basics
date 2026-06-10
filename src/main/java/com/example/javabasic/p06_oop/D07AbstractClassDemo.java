package com.example.javabasic.p06_oop;

/**
 * 学习抽象类：父类规定必须有的方法，子类负责具体实现。
 */
public class D07AbstractClassDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);

        System.out.println("圆面积: " + circle.area());
        System.out.println("矩形面积: " + rectangle.area());
    }

    abstract static class Shape {
        // abstract 方法没有方法体，子类必须重写。
        public abstract double area();
    }

    static class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            // 圆面积公式：π * 半径 * 半径。
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private final double width;
        private final double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            // 矩形面积公式：宽 * 高。
            return width * height;
        }
    }
}

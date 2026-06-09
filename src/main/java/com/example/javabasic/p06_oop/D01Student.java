package com.example.javabasic.p06_oop;

public class D01Student {
    private String name;
    private int age;

    public static void main(String[] args) {
        D01Student student = new D01Student("小明", 16);
        System.out.println(student);
        student.study();
    }

    public D01Student() {
    }

    public D01Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println(name + " 正在学习 Java");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("年龄不合法，保持原值");
            return;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "D01Student{name='" + name + "', age=" + age + "}";
    }
}

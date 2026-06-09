package com.example.javabasic.oop;

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("小明");
        student.setAge(16);

        System.out.println(student);
        student.study();

        Student another = new Student("小红", 15);
        System.out.println(another.getName() + " 的年龄是 " + another.getAge());
    }
}

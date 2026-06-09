package com.example.javabasic.p06_oop;

public class D02ClassAndObjectDemo {
    public static void main(String[] args) {
        D01Student student = new D01Student();
        student.setName("小明");
        student.setAge(16);

        System.out.println(student);
        student.study();

        D01Student another = new D01Student("小红", 15);
        System.out.println(another.getName() + " 的年龄是 " + another.getAge());
    }
}

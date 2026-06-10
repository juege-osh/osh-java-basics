package com.example.javabasic.p06_oop;

/**
 * 学习类和对象：类是模板，对象是根据模板创建出来的具体数据。
 */
public class D02ClassAndObjectDemo {
    public static void main(String[] args) {
        // 先用无参构造创建对象，再用 setter 设置属性。
        D01Student student = new D01Student();
        student.setName("小明");
        student.setAge(16);

        System.out.println(student);
        student.study();

        // 也可以直接用有参构造方法创建一个已经有数据的对象。
        D01Student another = new D01Student("小红", 15);
        System.out.println(another.getName() + " 的年龄是 " + another.getAge());
    }
}

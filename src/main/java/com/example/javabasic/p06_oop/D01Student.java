package com.example.javabasic.p06_oop;

/**
 * 学习封装：把学生的数据和行为放到同一个类里。
 */
public class D01Student {
    // private 表示只能在当前类内部直接访问，外部要通过 getter/setter 访问。
    private String name;
    private int age;

    public static void main(String[] args) {
        // new 表示创建一个对象。括号里的值会传给构造方法。
        D01Student student = new D01Student("小明", 16);
        System.out.println(student);
        student.study();
    }

    // 无参构造方法：创建对象时可以先不传任何数据。
    public D01Student() {
    }

    // 有参构造方法：创建对象时直接把 name 和 age 设置好。
    public D01Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 对象的方法，表示学生可以做什么。
    public void study() {
        System.out.println(name + " 正在学习 Java");
    }

    // getter 用来读取 private 字段。
    public String getName() {
        return name;
    }

    // setter 用来修改 private 字段。
    public void setName(String name) {
        // this.name 表示当前对象的字段，右边 name 表示方法参数。
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 在 setter 里做校验，可以防止外部传入明显不合理的数据。
        if (age < 0 || age > 150) {
            System.out.println("年龄不合法，保持原值");
            return;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        // toString 决定直接打印对象时显示什么内容。
        return "D01Student{name='" + name + "', age=" + age + "}";
    }
}

package com.itheima.Test_701;
/*
定义标准学生类，属性包括姓名和年龄，要求分别使用空参和有参构造方法创建对象，
空参创建的对象通过setXxx赋值，有参创建的对象直接赋值，并通过show方法展示数据。
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
        this.age = age;
    }
    public void show(){
        System.out.println("姓名：" + name + " 年龄：" + age);
    }
}
class TestStudent{
    public static void main(String[] args) {
        //空参
        Student stu1 =new Student();
        stu1.setName("张三");
        stu1.setAge(23);
        stu1.show();
        //有参
        Student stu2 = new Student("李四",24);
        stu2.show();
    }
        }
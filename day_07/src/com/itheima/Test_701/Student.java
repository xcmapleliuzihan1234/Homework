package com.itheima.Test_701;
/*
�����׼ѧ���࣬���԰������������䣬Ҫ��ֱ�ʹ�ÿղκ��вι��췽����������
�ղδ����Ķ���ͨ��setXxx��ֵ���вδ����Ķ���ֱ�Ӹ�ֵ����ͨ��show����չʾ���ݡ�
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
        System.out.println("������" + name + " ���䣺" + age);
    }
}
class TestStudent{
    public static void main(String[] args) {
        //�ղ�
        Student stu1 =new Student();
        stu1.setName("����");
        stu1.setAge(23);
        stu1.show();
        //�в�
        Student stu2 = new Student("����",24);
        stu2.show();
    }
        }
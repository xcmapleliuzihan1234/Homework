package com.itheima.Test_702;
/*
 请定义教师类（Teacher），属性包括姓名和工号。要求分别使用空参和有参构造方法创建对象，
 空参创建的对象通过setXxx赋值，有参创建的对象直接赋值。定义教课（teach）方法，
 输出“工号为xxx的xxx老师正在讲课”。
 */
public class Teacher {
    private String name;
    private int num;

    public Teacher() {
    }

    public Teacher(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void teach(){
        System.out.println("工号为" + num + "的" + name + "老师正在讲课");
    }
}
class Test{
    public static void main(String[] args) {
        //空参
        Teacher t1 = new Teacher();
        t1.setName("张三");
        t1.setNum(666);
        t1.teach();
        //有参
        Teacher t2 =new Teacher("李四",888);
        t2.teach();
    }
}

package com.itheima.Test_801;

import java.util.Scanner;

/*
现已知工人（Worker）类，属性包含姓名（name）、工龄（year），请编写该类，提供构造方法和get、set方法。
在测试类中，请查看键盘录入Scanner类的API，创建工人类对象，属性值由键盘录入，打印对象的属性值。运行效果如下：
请录入工人姓名：
张三
请录入工人工龄：
5
该工人对象的属性信息如下：
姓名：张三
工龄：5

 */
public class Worker {
    private String name;
    private int year;

    public Worker() {
    }

    public Worker(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
class Test{
    public static void main(String[] args) {
        Worker w =new Worker();
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入工人姓名：");
        String s = sc.next();
        w.setName(s);
        System.out.println("请录入工人工龄：");
        int i =sc.nextInt();
        w.setYear(i);
        System.out.println("该工人对象的属性信息如下：");
        System.out.println("姓名：" + w.getName());
        System.out.println("年龄：" + w.getYear());
    }
}
package com.itheima.Test_801;

import java.util.Scanner;

/*
����֪���ˣ�Worker���࣬���԰���������name�������䣨year�������д���࣬�ṩ���췽����get��set������
�ڲ������У���鿴����¼��Scanner���API�������������������ֵ�ɼ���¼�룬��ӡ���������ֵ������Ч�����£�
��¼�빤��������
����
��¼�빤�˹��䣺
5
�ù��˶����������Ϣ���£�
����������
���䣺5

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
        System.out.println("��¼�빤��������");
        String s = sc.next();
        w.setName(s);
        System.out.println("��¼�빤�˹��䣺");
        int i =sc.nextInt();
        w.setYear(i);
        System.out.println("�ù��˶����������Ϣ���£�");
        System.out.println("������" + w.getName());
        System.out.println("���䣺" + w.getYear());
    }
}
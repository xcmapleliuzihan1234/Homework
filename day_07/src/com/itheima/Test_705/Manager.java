package com.itheima.Test_705;
/*
������Ŀ������Manager�����ԣ�����name������id������salary������bonus����Ϊ������work()�������Ա��Coder��
���ԣ�����name������id������salary����Ϊ������work() Ҫ��
1.��������Ҫ����Manager���Coder��,����Ҫ˽��,���ɿղΡ��вι��죬set��get����?
2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(set�������вι��췽��)?
3.���ó�Ա����,��ӡ��ʽ����:
����Ϊ123��������Ϊ15000����Ϊ6000����Ŀ��������Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....
����Ϊ135��������Ϊ10000�ĳ���Ա����Ŭ����д�Ŵ���......
 */
public class Manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;

    public Manager() {
    }

    public Manager(String name, int id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("����Ϊ" + id + "��������Ϊ" + salary + "����Ϊ" + bonus + "��" + name +"����Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....");
    }
}
 class Coder{
     private String name;
     private int id;
     private int salary;

     public Coder() {
     }

     public Coder(String name, int id, int salary) {
         this.name = name;
         this.id = id;
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public int getSalary() {
         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }
     public void work(){
         System.out.println("����Ϊ" + id + "��������Ϊ" + salary + "��" + name + "����Ŭ����д�Ŵ���......");
     }
 }
 class Test{
     public static void main(String[] args) {
         Manager m = new Manager("��Ŀ����",123,15000,6000);
         m.work();
         Coder c = new Coder("����Ա",135,10000);
         c.work();
     }
 }
package com.itheima.Test_706;
/*
����è��Cat������:ë����ɫcolor��Ʒ��breed����Ϊ:�Է�eat()��ץ����catchMouse()���幷��Dog��
����:ë����ɫcolor��Ʒ��breed����Ϊ:�Է�()������lookHome()
Ҫ��:?1.��������Ҫ����Cat���Dog��,����Ҫ˽��,���ɿղΡ��вι��죬set��get����?
2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(set�������вι��췽��)?
3.���ó�Ա����,��ӡ��ʽ����:
��ɫ�Ĳ�˹è���ڳ���.....
��ɫ�Ĳ�˹è���ڴ�����....
��ɫ�Ĳ������ڿй�ͷ.....
��ɫ�Ĳ������ڿ���.....
 */
public class Cat {
    private String color;
    private String breed;

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.println(color + "��" + breed + "���ڳ���.....");
    }
    public void catchMouse(){
        System.out.println(color + "��" + breed + "���ڴ�����....");
    }
}
class Dog{
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.println(color + "��" + breed + "���ڿй�ͷ.....");
    }
    public void lookHome(){
        System.out.println(color + "��" + breed + "���ڿ���.....");
    }
}
class Test{
    public static void main(String[] args) {
        Cat c = new Cat("��ɫ","��˹è");
        c.eat();
        c.catchMouse();

        Dog d = new Dog("��ɫ","����");
        d.eat();
        d.lookHome();
    }
}

package com.itheima.Test_703;
/*
�����ֻ��࣬�ֻ���Ʒ��(brand),�۸�(price)����ɫ(color)�������ԣ��д�绰call()��sendMessage()�������ܡ�
 �붨����ֻ��࣬����Ҫ�пղΡ��вι��췽����set/get������
 ��������࣬����������ʹ�ÿղι��촴������ʹ��set������ֵ�� ���ö�����������ܣ���ӡЧ�����£�
����ʹ�ü۸�Ϊ3998Ԫ��ɫ��С���ֻ���绰....
����ʹ�ü۸�Ϊ3998Ԫ��ɫ��С���ֻ�������....
 */
public class Phone {
    private String brand;
    private int price;
    private String color;

    public Phone() {

    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void call(){
        System.out.println("����ʹ�ü۸�Ϊ" + price + "Ԫ" + color + "��" + brand +"�ֻ���绰....");
    }
    public void sendMessage(){
        System.out.println("����ʹ�ü۸�Ϊ" + price + "Ԫ" + color + "��" + brand +"�ֻ�����Ϣ....");
    }
}
class Test{
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("С��");
        p.setPrice(3998);
        p.setColor("��ɫ");
        p.call();
        p.sendMessage();
    }
}
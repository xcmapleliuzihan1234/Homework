package com.itheima;
/*
 请定义一个描述矩形（MyRectangle）的类，包含宽和高两个属性，
 提供获取矩形周长（perimeter）和面积（area）的方法。并编写测试类进行测试。
 */
public class MyRectangle {
    private int high;
    private int wide;

    public MyRectangle() {
    }

    public MyRectangle(int high, int wide) {
        this.high = high;
        this.wide = wide;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }
    public int perimeter(){
        return (high + wide)*2;
    }
    public int area(){
        return high * wide;
    }
}
class Test{
    public static void main(String[] args) {
        MyRectangle m = new MyRectangle(5,6);
        System.out.println(m.perimeter());
        System.out.println(m.area());
    }
}
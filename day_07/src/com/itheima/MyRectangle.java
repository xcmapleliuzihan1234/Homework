package com.itheima;
/*
 �붨��һ���������Σ�MyRectangle�����࣬������͸��������ԣ�
 �ṩ��ȡ�����ܳ���perimeter���������area���ķ���������д��������в��ԡ�
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
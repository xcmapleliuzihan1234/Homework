package com.itheima.homework;
/*
数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
 */
public class Test_511 {
    public static void main(String[] args) {
        System.out.println("绝对值为：" + abs(-1.2));
    }
    public static double abs(double num){
        if(num<0){
            num*=-1;
            return num;
        }
        return num;
    }
}

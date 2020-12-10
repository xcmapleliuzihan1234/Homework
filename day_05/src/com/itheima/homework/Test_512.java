package com.itheima.homework;

import java.util.Scanner;

/*
在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。
执行效果如下：
请输入第一个整数：10
请输入第二个整数：30
请输入第三个整数：20
从大到小的顺序是： 30 20 10
 */
public class Test_512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.print("请输入第三个整数：");
        int num3 = sc.nextInt();

           sort(num1,num2,num3);
    }

    public static void sort(int a, int b, int c) {
        int temp, max, min,mid;
        temp = a > b ? a : b;
        max = temp > c ? temp : c;
        temp = a < b ? a : b;
        min = temp < c ? temp : c;
        mid = a + b + c - max - min;
        System.out.println("从大到小的顺序是：" + max + " " + mid + " " + min);
    }
}

package com.itheima.homework;

import java.util.Scanner;

/*
����������ͨ������¼����������������һ�������������������������������ڷ����дӴ�С���δ�ӡ����������
ִ��Ч�����£�
�������һ��������10
������ڶ���������30
�����������������20
�Ӵ�С��˳���ǣ� 30 20 10
 */
public class Test_512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�������һ��������");
        int num1 = sc.nextInt();
        System.out.print("������ڶ���������");
        int num2 = sc.nextInt();
        System.out.print("�����������������");
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
        System.out.println("�Ӵ�С��˳���ǣ�" + max + " " + mid + " " + min);
    }
}

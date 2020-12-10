package com.itheima.homework1;

import java.util.Scanner;

/*
��һ������������ѧ�߼�����������������⡣��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ��������ʵ�n���µ����Ӷ���Ϊ���٣�
�붨�巽��ʵ�ָù��ܣ���n�����ɷ����ĵ����ߴ��룬���ظ��µ����Ӷ��������÷����鿴�����
 */
public class Test_610_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("�������·ݣ�");
        int month = sc.nextInt();
        System.out.println("���Ӷ�Ϊ��" + mul(month));
    }
    public static int mul(int month) {
        if (month <= 0) {
            return 0;
        } else if (month < 3) {
            return 1;
        } else {
            int[] arr = new int[month];
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < month; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[month - 1];
        }
    }
}

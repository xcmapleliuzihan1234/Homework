package com.itheima.homework1;

import java.util.Scanner;

/*
��һ������������ѧ�߼�����������������⡣��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ��������ʵ�n���µ����Ӷ���Ϊ���٣�
�붨�巽��ʵ�ָù��ܣ���n�����ɷ����ĵ����ߴ��룬���ظ��µ����Ӷ��������÷����鿴�����
 */
public class Test_610 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("�������·ݣ�");
        int month = sc.nextInt();
        System.out.println("���Ӷ�Ϊ" + mul(month));
    }
    public static int mul(int month){
        int sum = 1;
        if (month<0){
            return 0;
        }else if(month<3){
           return 1;
       }else {
           int i = 1;
           int m = 0;
           while (month>=3){
             int temp =sum;
              sum =i+sum;
                 m = sum;
                i = temp;
                month--;
            }
           return m;
       }
    }
}

package com.itheima.homework;
/*
�������о���ֵ�ģ������ľ���ֵ��������ȡ�����Ǹ����ľ���ֵ��������
�붨��һ�������������ܹ��õ�С���������ֵľ���ֵ�����ء��붨�巽�������ԡ�
 */
public class Test_511 {
    public static void main(String[] args) {
        System.out.println("����ֵΪ��" + abs(-1.2));
    }
    public static double abs(double num){
        if(num<0){
            num*=-1;
            return num;
        }
        return num;
    }
}

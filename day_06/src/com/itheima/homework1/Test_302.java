package com.itheima.homework1;

import java.util.Scanner;

/*
����һ����12���£������ڴ����ﶬ4�����ڣ�����¼��һ���·ݣ�
���ó���ʵ���жϸ��·������ĸ����ڣ��������     ����3��4��5
    �ģ�6��7��8
    �9��10��11
    ����1��2��12
 */
public class Test_302{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("�������·�:");
        int month = sc.nextInt();

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("����");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("����");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("����");
                break;
            default:
                System.out.println("��������·�����!");
                break;
        }


    }

}

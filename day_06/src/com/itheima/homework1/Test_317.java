package com.itheima.homework1;

import java.util.Random;
import java.util.Scanner;

public class Test_317 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum = r.nextInt(100) + 1;
        while (true) {
            System.out.println("���������µ�����:");
            int num = sc.nextInt();
            if (num > randomNum) {
                System.out.println("�´���");
            } else if (num < randomNum) {
                System.out.println("��С��");
            } else {
                System.out.println("��ϲ,������");
                break;
            }
        }
        System.out.println("��л����ʹ��");
    }
}

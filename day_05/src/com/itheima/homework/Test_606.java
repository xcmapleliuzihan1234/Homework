package com.itheima.homework;

/*
 ���һ�����������ڱȽ�������ͬ������������������Ƿ���ͬ��
 */
public class Test_606 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 7};
        compare(arr1, arr2);
    }

    public static void compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("��������ݲ�ͬ");
        } else {
            int temp = 1;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    temp = 0;
                }
            }
            if (temp == 0) {
                System.out.println("��������ݲ�ͬ");
            } else {
                System.out.println("�����������ͬ");
            }
        }
    }
}

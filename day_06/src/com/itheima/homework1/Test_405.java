package com.itheima.homework1;

/*
����һ���������飬�����е�Ԫ��Ϊ[12, 23, 34, 45, 56, 67]������������飬�����������Ϊ������Ԫ��ֵ��
 */
public class Test_405 {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }
}

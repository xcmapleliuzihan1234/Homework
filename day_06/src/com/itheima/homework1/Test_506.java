package com.itheima.homework1;
/*
�붨��һ��������ʵ����һ�����������е����ֵ�����÷������鿴�����
 */
public class Test_506 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 6, 2, 8, 1, 7};
        System.out.println("��Сֵ��" + math(arr));
    }

    public static int math(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

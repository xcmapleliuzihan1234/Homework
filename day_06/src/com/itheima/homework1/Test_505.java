package com.itheima.homework1;
/*
�붨��һ��������ʵ�ֽ�ָ��int�����е�����Ϊż����Ԫ��ֵ����1��
��������Ϊ{1, 2, 3, 4, 5, 6, 7}����ô���÷����������е�Ԫ�ر�Ϊ{2, 2, 4, 4, 6, 6, 8}��
���÷��������Խ����
 */
public class Test_505 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
               add(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static int[] add(int[] arr){
        for (int i = 0; i < arr.length; i+=2) {
            arr[i] = arr[i]+1;
        }
        return arr;
    }
}

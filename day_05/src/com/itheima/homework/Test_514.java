package com.itheima.homework;
/*
һ����Vֱ���齱����Ʒ���ֽ������ֱ���{2,588,888,1000,10000}�������
��ʹ�ô���ģ��齱����ӡ��ÿ���������ĳ���˳��Ҫ����Ҳ��ظ�����ӡЧ�����£�
�����˳�򣬲�һ���������˳��
888Ԫ�Ľ��𱻳��
588Ԫ�Ľ��𱻳��
10000Ԫ�Ľ��𱻳��
1000Ԫ�Ľ��𱻳��
2Ԫ�Ľ��𱻳��

 */

import java.util.Random;

public class Test_514 {
    public static void main(String[] args) {
        int[] arr = {2,588,888,1000,10000};
        lottery(arr);
    }

    public static void lottery(int[] arr) {
        Random r = new Random();
        int count = 0;
        while (count < arr.length) {
            int index = r.nextInt(arr.length);
            if (arr[index] != 0) {
                System.out.println(arr[index] + "Ԫ�Ľ��𱻳��");
                arr[index] = 0;
                count++;
            }
        }
    }
}

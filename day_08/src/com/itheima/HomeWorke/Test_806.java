package com.itheima.HomeWorke;

/*
����һ���������� int �����е����ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ������أ����ø÷��������ڿ���̨��������
 Ҫ��? 1��������ݵĲ���Ϊ�գ�����null?
 2��������ݵ�����Ԫ�ظ���Ϊ0������[]?
 3���������Ϊint[] arr = {1,2,3}; ��ִ�з������������Ϊ��[1, 2, 3]
 */
public class Test_806 {
        public static void main(String[] args) {
            int[] arr = {1,2,3};
            arrs(arr);
        }
        public static void arrs(int[] arr) {
        String s = new String();
        if (arr == null) {
            System.out.println(arr);
        } else if (arr.length == 0) {
            System.out.println("[]");
        } else {
            for (int i = 0; i < arr.length; i++) {
                s = s + arr[i];
            }
            char[] sarr = s.toCharArray();
            System.out.print("[");
            for (int j = 0; j < sarr.length; j++) {
                if (j == sarr.length-1) {
                    System.out.println(sarr[j] + "]");
                } else {
                    System.out.print(sarr[j] + ", ");
                }
            }
        }

    }
}

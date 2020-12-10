package com.itheima.homework;

/*
 设计一个方法，用于比较两个相同数据类型数组的内容是否相同。
 */
public class Test_606 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 7};
        compare(arr1, arr2);
    }

    public static void compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("数组的内容不同");
        } else {
            int temp = 1;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    temp = 0;
                }
            }
            if (temp == 0) {
                System.out.println("数组的内容不同");
            } else {
                System.out.println("数组的内容相同");
            }
        }
    }
}

package com.itheima.homework1;

/*
现有一个整型数组，数组中的元素为[12, 23, 34, 45, 56, 67]。请遍历该数组，输出其中索引为奇数的元素值。
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

package com.itheima.homework1;
/*
请定义一个方法，实现求一个整数数组中的最大值。调用方法，查看结果。
 */
public class Test_506 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 6, 2, 8, 1, 7};
        System.out.println("最小值：" + math(arr));
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

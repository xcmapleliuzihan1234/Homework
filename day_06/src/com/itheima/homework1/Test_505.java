package com.itheima.homework1;
/*
请定义一个方法，实现将指定int数组中的索引为偶数的元素值增加1。
假如数组为{1, 2, 3, 4, 5, 6, 7}，那么调用方法后，数组中的元素变为{2, 2, 4, 4, 6, 6, 8}。
调用方法，测试结果。
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

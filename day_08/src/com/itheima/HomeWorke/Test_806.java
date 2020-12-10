package com.itheima.HomeWorke;

/*
定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
 要求：? 1、如果传递的参数为空，返回null?
 2、如果传递的数组元素个数为0，返回[]?
 3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
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

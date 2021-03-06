package com.itheima.homework1;

import java.util.Scanner;

/*
有一个很有名的数学逻辑题叫做不死神兔问题。有一对兔子，从出生后第3个月起每个月都生一对兔子，
小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第n个月的兔子对数为多少？
请定义方法实现该功能，第n个月由方法的调用者传入，返回该月的兔子对数。调用方法查看结果。
 */
public class Test_610_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = sc.nextInt();
        System.out.println("兔子对为：" + mul(month));
    }
    public static int mul(int month) {
        if (month <= 0) {
            return 0;
        } else if (month < 3) {
            return 1;
        } else {
            int[] arr = new int[month];
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < month; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[month - 1];
        }
    }
}

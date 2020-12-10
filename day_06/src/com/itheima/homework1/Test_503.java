package com.itheima.homework1;


import java.util.Scanner;

public class Test_503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int cin = sc.nextInt();
        System.out.println(isOdd(cin));
    }
    public static boolean isOdd(int cin) {
        if (cin % 2 != 0) {
            return true;
        }
        return false;
    }
}
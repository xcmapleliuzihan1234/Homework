package com.itheima.homework1;

import java.util.Random;
import java.util.Scanner;

public class Test_317 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum = r.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入您猜的数据:");
            int num = sc.nextInt();
            if (num > randomNum) {
                System.out.println("猜大了");
            } else if (num < randomNum) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜,猜中了");
                break;
            }
        }
        System.out.println("感谢您的使用");
    }
}

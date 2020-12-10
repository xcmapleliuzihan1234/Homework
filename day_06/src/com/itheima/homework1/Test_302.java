package com.itheima.homework1;

import java.util.Scanner;

/*
需求：一年有12个月，分属于春夏秋冬4个季节，键盘录入一个月份，
请用程序实现判断该月份属于哪个季节，并输出。     春：3、4、5
    夏：6、7、8
    秋：9、10、11
    冬：1、2、12
 */
public class Test_302{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份:");
        int month = sc.nextInt();

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("冬天");
                break;
            default:
                System.out.println("您输入的月份有误!");
                break;
        }


    }

}

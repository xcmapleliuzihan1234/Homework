package com.itheima.HomeWorke;

import java.util.Scanner;

/*
我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
 */
public class Test_809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String num = sc.next();
       id(num);
    }
    public static void id(String num) {
     //先判断前两个条件是否满足
        if (num.length() != 18) {
            System.out.println("身份证不合法！");
        } else if (num.startsWith("0")) {
            System.out.println("身份证不合法！");
        } else {
            //把字符串转换成字符数组进行遍历，查询是否满足条件
            char[] chs = num.toCharArray();
            //定义一个布尔值，假设合法
            boolean temp = true;
            //循环判断1-17个数是否合法，不合法就为false
            for (int i = 0; i < chs.length - 1; i++) {
                if (!(chs[i] <= '9' && chs[i] >= '0')) {
                    temp = false;
                }
            }
            //判断最后一位数是否合法
            if (!(chs[chs.length - 1] <= '9' && chs[chs.length - 1] >= '0') && chs[chs.length - 1] != 'X') {
                temp = false;
            }
            //如果都合法则身份证合法
            if (temp == true) {
                System.out.println("身份证合法！");
            } else {
                System.out.println("身份证不合法！");
            }
        }
    }
}

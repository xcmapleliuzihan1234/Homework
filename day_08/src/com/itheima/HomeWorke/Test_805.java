package com.itheima.HomeWorke;

import java.util.Scanner;

/*
请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
比如：Hello12345World中字母：10个，数字：5个。
 */
public class Test_805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        char[] chs = s.toCharArray();
        int lettercount = 0;
        int numcount = 0;
        for (int i = 0; i < chs.length; i++) {
            if ((chs[i] >= 'A' && chs[i] <= 'Z') || (chs[i] >= 'a' && chs[i] <= 'z')) {
                lettercount++;
            } else if (chs[i] >= '0' && chs[i] <= '9') {
                numcount++;
            }
        }
        System.out.println("字母个数：" + lettercount);
        System.out.println("数字个数：" + numcount);
    }
}

package com.itheima.HomeWorke;

import java.util.Scanner;

/*
键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
 */
public class Test_804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        char[] chs = s.toCharArray();
        int bigcount = 0;
        int smallcount = 0;
        int numcount = 0;
        for (int i = 0; i < chs.length; i++) {
            if(chs[i]>='A'&&chs[i]<='Z'){
                bigcount++;
            }else if(chs[i]>='a'&&chs[i]<='z'){
                smallcount++;
            }else if(chs[i]>='0'&&chs[i]<='9'){
                numcount++;
            }
        }
        System.out.println("大写字母个数：" + bigcount);
        System.out.println("小写字母个数：" + smallcount);
        System.out.println("数字个数：" + numcount);
    }
}

package com.itheima.HomeWorke;

import java.util.Random;

/*
在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
请查看Random、StringBuilder相关API，定义方法，获取一个包含4个字符的验证码，
每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。例如：
7Kt5
 */
public class Test_810 {
    public static void main(String[] args) {
        System.out.println(code());
    }
    public static String code(){
        Random r = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i <4 ; i++) {//获取四次字符
            int num1 = r.nextInt(10) + 48;//随机数字ASCII
            int num2 = r.nextInt(26) + 65;//随机大写字母ASCII
            int num3 = r.nextInt(26) + 97;//随机小写字母ASCII
            int[] arr = {num1,num2,num3};
            int num4 = r.nextInt(3);
            byte b = (byte)arr[num4];//随机出其中一种的ASCII
            byte[] bys = {b};
            String s = new String(bys);//转换成字符
            StringBuilder sb1 = new StringBuilder(s);
            sb2.append(sb1);//四个字符append
        }
        return sb2.toString();//转换成String类型

    }
}

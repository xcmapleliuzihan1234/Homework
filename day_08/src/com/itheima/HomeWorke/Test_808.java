package com.itheima.HomeWorke;
/*
请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
例如："abcba"、"上海自来水来自海上"均为对称字符串。
 */
public class Test_808 {
    public static void main(String[] args) {
        String s1 ="abcba";
        String s2 = "上海自来水来自海上";
        System.out.println(symmetry(s1));
        System.out.println(symmetry(s2));
    }
    public static boolean symmetry(String s){
        StringBuilder sb = new StringBuilder(s);
       String s1 = sb.reverse().toString();
        if(s1.equals(s)){
            return true;
        }else {
            return false;
        }
    }
}

package com.itheima.HomeWorke;
/*
�붨��һ�����������ж�һ���ַ����Ƿ��ǶԳƵ��ַ����������������в��Է�����
���磺"abcba"��"�Ϻ�����ˮ���Ժ���"��Ϊ�Գ��ַ�����
 */
public class Test_808 {
    public static void main(String[] args) {
        String s1 ="abcba";
        String s2 = "�Ϻ�����ˮ���Ժ���";
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

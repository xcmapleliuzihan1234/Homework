package com.itheima.HomeWorke;

import java.util.Scanner;

/*
���д�����ɼ���¼��һ���ַ�����ͳ���ַ�����Ӣ����ĸ�����ֱַ��ж��ٸ���
���磺Hello12345World����ĸ��10�������֣�5����
 */
public class Test_805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ַ�����");
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
        System.out.println("��ĸ������" + lettercount);
        System.out.println("���ָ�����" + numcount);
    }
}

package com.itheima.HomeWorke;

import java.util.Scanner;

/*
����¼��һ���ַ�����ͳ�Ƹ��ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���(�����������ַ�)
 */
public class Test_804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ַ�����");
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
        System.out.println("��д��ĸ������" + bigcount);
        System.out.println("Сд��ĸ������" + smallcount);
        System.out.println("���ָ�����" + numcount);
    }
}

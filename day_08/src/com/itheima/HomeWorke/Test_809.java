package com.itheima.HomeWorke;

import java.util.Scanner;

/*
�ҹ��ľ������֤���룬����ʮ��λ���ֱ������һλ����У������ɡ�
�붨�巽���ж��û���������֤�����Ƿ�Ϸ��������������е��÷������Խ����
����Ϊ������Ϊ18λ������������0��ͷ��ǰ17λֻ���������֣����һλ���������ֻ��ߴ�д��ĸX��
 */
public class Test_809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String num = sc.next();
       id(num);
    }
    public static void id(String num) {
     //���ж�ǰ���������Ƿ�����
        if (num.length() != 18) {
            System.out.println("���֤���Ϸ���");
        } else if (num.startsWith("0")) {
            System.out.println("���֤���Ϸ���");
        } else {
            //���ַ���ת�����ַ�������б�������ѯ�Ƿ���������
            char[] chs = num.toCharArray();
            //����һ������ֵ������Ϸ�
            boolean temp = true;
            //ѭ���ж�1-17�����Ƿ�Ϸ������Ϸ���Ϊfalse
            for (int i = 0; i < chs.length - 1; i++) {
                if (!(chs[i] <= '9' && chs[i] >= '0')) {
                    temp = false;
                }
            }
            //�ж����һλ���Ƿ�Ϸ�
            if (!(chs[chs.length - 1] <= '9' && chs[chs.length - 1] >= '0') && chs[chs.length - 1] != 'X') {
                temp = false;
            }
            //������Ϸ������֤�Ϸ�
            if (temp == true) {
                System.out.println("���֤�Ϸ���");
            } else {
                System.out.println("���֤���Ϸ���");
            }
        }
    }
}

package com.itheima.Test_802;

import java.util.Scanner;

/*
��֪�û��������룬���ó���ʵ��ģ���û���¼���ܹ������λ��ᣬ�Ƿ��¼�ɹ���������Ӧ����ʾ��
 */
public class Enter {
    public static void main(String[] args) {
        String userNane = "admin";
        int password = 123456;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            System.out.println("�������û�����");
            String scUserName = sc.next();
            System.out.println("���������룺");
            int scPassword =sc.nextInt();

            if(scUserName.equals(userNane)&&(scPassword==password)){
                System.out.println("��¼�ɹ�");
                break;
            }else {
                if (i==3){
                    System.out.println("���ĵ�½�������þ�");
                }else {
                    System.out.println("�������,����ʣ" + (3-i) + "�λ���");
                }
            }
        }

    }
}

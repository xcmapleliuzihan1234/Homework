package com.itheima.homework1;

/*
�ҹ��Ŵ���ѧ�������ڡ��㾭��һ�����������ѧ���⣺����һֵǮ�壬��ĸһֵǮ����������ֵǮһ��?
 ��Ǯ��ټ����ʼ��̡���ĸ�����������Σ�
 */
public class Test_604 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                for (int k =0; k <= 100; k++) {
                    if ((k % 3 == 0) && (i + j + k == 100)&&(i * 15 + j * 9 + k == 300)) {
                        System.out.println("���̣�" + i + " ��ĸ��" + j + " ������" + k);
                    }
                }
            }
        }
    }

}

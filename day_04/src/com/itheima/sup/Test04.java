package com.itheima.sup;
/*
С��ȥ��Ʊվ���Ʊ�����һע˫ɫ��ʹ������洢С��������Ĳ�Ʊ���֡�
˫ɫ����� ����6�������1������ÿ������ķ�Χ��[1-32]�� ����ķ�Χ��[1-16]��
����֮������ֲ����ظ��������ǿ��Ժͺ����ظ���,������洢7��Ԫ��
(�����е�Ԫ��,��������������)
����̨Ч�����������£�
����Ϊ : 8 29 21 31 12 5 ����Ϊ : 14
 */
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] red = new int[6];
        int blue = r.nextInt(16) + 1;
        for (int i = 0; i < red.length; i++) {
            red[i] = r.nextInt(32) + 1;//1-32
            for (int j = 0; j <i ; j++) {
                //ѭ�����red[i]������Ƿ���ͬ
                if(red[i] == red[j]){
                    //��ͬ�򷵻���һ��ѭ��
                    i--;
                    break;
                }
            }
        }
        System.out.print("����Ϊ��");
      for (int i = 0; i < red.length; i++) {
          System.out.print(red[i] + " ");
      }
        System.out.println("  ����Ϊ��" + blue);
    }
}

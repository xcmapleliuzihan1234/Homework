package com.itheima.HomeWorke;

import java.util.Random;

/*
�ڵ�¼ע��ҳ���У������û����������⣬ͨ��Ҳ�������֤�롣
��֤�������������û��Ǽ���������ˣ���ֹ�����ƽ����롢ˢƱ����ˮ����Ϊ��
��鿴Random��StringBuilder���API�����巽������ȡһ������4���ַ�����֤�룬
ÿһλ�ַ������ѡ�����ĸ�����֣��ɰ���a-z,A-Z,0-9�����磺
7Kt5
 */
public class Test_810 {
    public static void main(String[] args) {
        System.out.println(code());
    }
    public static String code(){
        Random r = new Random();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i <4 ; i++) {//��ȡ�Ĵ��ַ�
            int num1 = r.nextInt(10) + 48;//�������ASCII
            int num2 = r.nextInt(26) + 65;//�����д��ĸASCII
            int num3 = r.nextInt(26) + 97;//���Сд��ĸASCII
            int[] arr = {num1,num2,num3};
            int num4 = r.nextInt(3);
            byte b = (byte)arr[num4];//���������һ�ֵ�ASCII
            byte[] bys = {b};
            String s = new String(bys);//ת�����ַ�
            StringBuilder sb1 = new StringBuilder(s);
            sb2.append(sb1);//�ĸ��ַ�append
        }
        return sb2.toString();//ת����String����

    }
}

/*
С�����Լ���Ǯ����ʮֻ��Ʊ����ĩ�����˸�ֻ��Ʊ������ֱ��ǰٷ�֮:
10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5����ʹ���������֪ʶ��̣�
����ͳ��׬Ǯ�Ĺ�Ʊ����Ǯ�Ĺ�Ʊ�ֱ��ж���ֻ����ӡЧ�����£�
׬Ǯ�Ĺ�Ʊһ���У�4ֻ
��Ǯ�Ĺ�Ʊһ���У�6ֻ
 */
public class Test_413 {
    public static void main(String[] args) {
        double[] arr = {10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5};
        int earn = 0;
        int lose = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                lose++;
            }else if(arr[i] > 0){
                earn++;
            }
        }
        System.out.println("׬Ǯ�Ĺ�Ʊһ���У�" + earn + "ֻ");
        System.out.println("��Ǯ�Ĺ�Ʊһ���У�" + lose + "ֻ");
    }

}

/*
��һ��������System.out.print("@")����ʾ���һ��"@"�����Ҳ����С�
ʹ�������䣬�ڿ���̨��ӡ��һ���������еĳ����Σ�Ч�����£�
@@@@@
@@@@@
@@@@@
@@@@@
 */
public class Test_319 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 20; i++) {
            count++;
            System.out.print("@");
            if(count % 5 ==0){
                System.out.println();
            }
        }
    }
}

import java.util.Scanner;
/*
ĳ�̳�������Դ��ۣ�����������£�? ��ͨ�˿͹�����100Ԫ�����ۣ���100Ԫ��9�ۣ�
? ��Ա���ﲻ��200Ԫ��8�ۣ���200Ԫ��7.5�ۣ�? ��ͬ���۹����ۼӼ��㡣
����ݴ��Żݼƻ����й�����㣬����¼��˿͵����0��ʾ��ͨ�˿ͣ�1��ʾ��Ա��
�͹������ǰ���������ɣ������Ӧ����С�����ͣ���
 */
public class Test_216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���ǻ�Ա��");
        int client = sc.nextInt();

        if(client == 0){
            System.out.println("�������������ѽ�");
            int money = sc.nextInt();
            if(money < 100){
                System.out.println(money);
            }else if(money >= 100){
                System.out.println(money*0.9);
            }
        }else if(client == 1){
            System.out.println("�������������ѽ�");
            int money = sc.nextInt();
            if(money < 200){
                System.out.println(money*0.8);
            }else if(money >= 200){
                System.out.println(money*0.75);
            }
        }
    }
}

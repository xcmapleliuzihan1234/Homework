import java.util.Random;

/*
����һ������Ϊ6���������顣���д���룬�����������0��������-100����������
֮���������ŵ������У�Ȼ����������������Ԫ�صĺͲ���ӡ��
 */
public class Test_409 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] arr = new int[6];
        System.out.print("���������Ϊ��");
        for (int i = 0; i < arr.length; i++) {
            //�������������
            int num =r.nextInt(100);
            arr[i] = num;
            System.out.print(num + " ");
        }int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println();
        System.out.println("��Ϊ��" + sum);
    }
}

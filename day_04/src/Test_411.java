/*����һ���������洢10��ѧ���ĳɼ������磺
{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}�����㲢���ѧ����ƽ���ɼ���
*/
public class Test_411 {
    public static void main(String[] args) {
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("ƽ���ɼ�Ϊ��" + (sum / arr.length));
    }
}

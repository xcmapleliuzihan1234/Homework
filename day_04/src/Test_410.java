/*
现有一个整数数组，长度为5. 数组中的每个元素都是[0-9]之间的数字，从数组的
最大索引位置开始到最小索引位置，依次表示整数的个位、十位、百位。。。依次类推。
请编写程序计算，这个数组所表示的整数值。例如：
数组：{2, 1, 3, 5, 4}
表示的整数为：21354
注意：是整数类型的两万一千三百五十四，不是字符串拼起来的。
 */
public class Test_410 {
    public static void main(String[] args) {
        int[] arr ={2, 1, 3, 5, 4};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            //根据位数乘以j个10，得到每位需要乘的数
            for (int j = 0; j <arr.length- i - 1 ; j++) {
                temp *= 10;
            }
            //把每个数乘以相应的位数
            num += arr[i] * temp;
        }
        System.out.println(num);
    }
}

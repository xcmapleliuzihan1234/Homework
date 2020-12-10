/*
在中国历法中有十二生肖年份，2019年是己亥猪年，请在控制台输出
从1949年（包含）到2019年（包含）中所有是猪年的年份。
 */
public class Test_318 {
    public static void main(String[] args) {
        for (int i = 1949; i <= 2019; i++) {
            if(i % 12 == 2019 %12){
                System.out.println(i + "年");
            }
        }
    }
}

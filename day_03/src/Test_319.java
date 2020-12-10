/*
有一个输出语句System.out.print("@")，表示输出一个"@"，并且不换行。
使用这个语句，在控制台打印出一个四行五列的长方形，效果如下：
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

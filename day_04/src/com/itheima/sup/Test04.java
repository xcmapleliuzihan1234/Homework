package com.itheima.sup;
/*
小明去彩票站买彩票，随机一注双色球。使用数组存储小明的随机的彩票数字。
双色球规则 ：有6个红球加1个蓝球，每个红球的范围是[1-32]， 蓝球的范围是[1-16]，
红球之间的数字不可重复，蓝球是可以和红球重复的,用数组存储7个元素
(数组中的元素,不考虑排序问题)
控制台效果，举例如下：
红球为 : 8 29 21 31 12 5 蓝球为 : 14
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
                //循环检测red[i]与后面是否相同
                if(red[i] == red[j]){
                    //相同则返回上一次循环
                    i--;
                    break;
                }
            }
        }
        System.out.print("红球为：");
      for (int i = 0; i < red.length; i++) {
          System.out.print(red[i] + " ");
      }
        System.out.println("  蓝球为：" + blue);
    }
}

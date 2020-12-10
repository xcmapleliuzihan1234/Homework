package com.itheima.homework1;

/*
我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。?
 百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 */
public class Test_604 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                for (int k =0; k <= 100; k++) {
                    if ((k % 3 == 0) && (i + j + k == 100)&&(i * 15 + j * 9 + k == 300)) {
                        System.out.println("鸡翁：" + i + " 鸡母：" + j + " 鸡雏：" + k);
                    }
                }
            }
        }
    }

}

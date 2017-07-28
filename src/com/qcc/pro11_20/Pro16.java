package com.qcc.pro11_20;

/**
 * @author: qiancc
 * 2017年07月27日
 * 【程序16】
题目：输出9*9口诀。
程序分析：分行与列考虑，共9行9列，i控制行，j控制列。

 */
public class Pro16 {
    public static void main(String[] args) {

        for(int i=1;i<10;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j + " * " + i + " = " + i*j + "\t");
            }
            System.out.println();
        }

    }
}

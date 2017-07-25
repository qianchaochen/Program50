package com.qcc.pro01_10;

/**
 * @author: qiancc
 * 2017年07月24日
 * 【程序3】
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class Pro3 {

    public static void main(String[] args) {
        int ge = 0, shi = 0, bai = 0;
        for (int i = 100; i < 1000; i++) {
            ge = i % 10;
            shi = i % 100 / 10;
            bai = i / 100;

            if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == i) {
                System.out.println(i);
            }
        }
    }
}

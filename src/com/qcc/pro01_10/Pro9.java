package com.qcc.pro01_10;

/**
 * @author: qiancc
 * 2017年07月26日
 * 【程序9】
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
 * 1,2,4,7,14
 */
public class Pro9 {

    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            if (isWanshu(i)) {
                System.out.println(i);
            }
        }

    }


    public static boolean isWanshu(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}

package com.qcc.pro01_10;

/**
 * @author: qiancc
 * 2017年07月24日
 * 【程序2】
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数
 */

public class Pro2 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 200; i++) {
            boolean flag = isPrime(i);
            if (flag) {
                count++;
                System.out.print(i + "\t");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("101-200之间有" + count + "个素数");
    }

    public static boolean isPrime(int num) {
        boolean flag = true;
        if (num == 1) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

}

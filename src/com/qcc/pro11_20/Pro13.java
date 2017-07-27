package com.qcc.pro11_20;

/**
 * @author: qiancc
 * 2017年07月27日
 * 【程序13】
 * 题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 * 程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。
 */
public class Pro13 {

    public static void main(String[] args) {
        int n=0;
        for(int i=1; i<100000;i++) {
            if (isCompSqrt(i + 100) && isCompSqrt(i + 268)) {
                n = i;
            }
        }
        System.out.println("n的值为："+n);
    }

    public static boolean isCompSqrt(int num){
        boolean flag = false;
        for (int i=1; i<= Math.sqrt(num); i++) {
            if (Math.pow(i, 2) == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

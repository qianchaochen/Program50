package com.qcc.pro01_10;

/**
 * @author: qiancc
 * 2017年07月26日
 * 【程序10】
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Pro10 {
    public static void main(String[] args) {

        //第10次反弹高度为h.
        double high = 100;
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                sum += high;
            } else {
                sum += high * 2;
            }
            high /= 2;

            System.out.println("sum: " + sum + " ,high: " + high);
        }

    }

}

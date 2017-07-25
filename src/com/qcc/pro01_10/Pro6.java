package com.qcc.pro01_10;

import com.sun.scenario.animation.shared.PulseReceiver;

/**
 * @author: qiancc
 * 2017年07月25日
 * 【程序6】
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 */
public class Pro6 {

    public static void main(String[] args) {
        int m = 2, n = 26;
        print(m, n);

    }

    public static void print(int m, int n) {
        int ys = 1;
        int bs = m * n;
        int temp = 0;
        if (m >= n) {
            temp = m;
            m = n;
            n = temp;
        }
        while (m != 0) {
            temp = n % m;
            n = m;
            m = temp;
        }
        System.out.println("约数为：" + n);
        System.out.println("倍数为：" + bs / n);

    }

}

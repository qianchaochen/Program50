package com.qcc.pro01_10;

/**
 * 【程序1】
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子对数为多少？
 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 */
public class Pro1 {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            int result = fun(i);
            System.out.println("第" + i + "个月兔子只数为：" + result);
        }

        System.out.println("------------------");

        for (int i = 1; i < 50; i++) {
            int result = fun2(i);
            System.out.println("第" + i + "个月兔子只数为：" + result);
        }


    }

    /*递归效率低*/
    public static int fun(int num) {
        if (num == 1 || num == 2) return 1;
        return fun(num - 1) + fun(num - 2);
    }

    /*递归转循环实现*/
    public static int fun2(int num) {
        if (num == 1 || num == 2) return 1;
        int f1 = 1, f2 = 1, result = 0;
        for (int i = 3; i <= num; i++) {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }


    public static void method(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }

}

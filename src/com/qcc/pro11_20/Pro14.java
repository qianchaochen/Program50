package com.qcc.pro11_20;

import java.util.Scanner;

/**
 * @author: qiancc
 * 2017年07月27日
 * 【程序14】
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，
 * 特殊情况，闰年且输入月份大于3时需考虑多加一天。
 */
public class Pro14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = s.nextInt();
        System.out.println("请输入月份：");
        int month = s.nextInt();
        System.out.println("请输入日期：");
        int day = s.nextInt();
        s.close();
        System.out.println("今天是" + year + "的第" + calc(year, month, day) + "天");
    }

    private static int calc(int year, int month, int day) {
        int result = 0;
        int[] month_day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            month_day[1] = 29;
        }
        for (int i = 0; i < month - 1; i++) {
            result += month_day[i];
        }
        return result + day;
    }
}

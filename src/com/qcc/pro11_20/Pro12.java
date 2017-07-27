package com.qcc.pro11_20;

import java.util.Scanner;

/**
 * @author: qiancc
 * 2017年07月26日
 * 【程序12】
 * 题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
 * 从键盘输入当月利润I，求应发放奖金总数？
 * 程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
 */
public class Pro12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入利润：");
        long bonus = scanner.nextLong();
        double result = 0;
        if (bonus <= 100000) {
            result = bonus * 0.1;
        } else if (bonus <= 200000) {
            result = 100000 * 0.1 + (bonus - 100000) * 0.075;
        } else if (bonus <= 400000) {
            result = 100000 * 0.1 + 100000 * 0.075 + (bonus - 200000) * 0.05;
        } else if (bonus <= 600000) {
            result = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + (bonus - 400000) * 0.03;
        } else if (bonus <= 1000000) {
            result = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + (bonus - 600000) * 0.015;
        } else {
            result = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + 400000 * 0.015 + (bonus - 1000000) * 0.01;
        }
        System.out.println("利润为：" + bonus + "奖金为：" + result);
    }
}

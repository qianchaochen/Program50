package com.qcc.pro01_10;

import java.util.Scanner;

/**
 * @author: qiancc
 * 2017年07月25日
 * 【程序5】
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */
public class Pro5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("please input a score:");
            int score = scanner.nextInt();
            System.out.println(score >= 90 ? "A" : score >= 60 ? "B" : "C");
            System.out.println("is continue?");
            String s = scanner.next();
            if ("n".equals(s)) {
                break;
            }
        }
    }
}

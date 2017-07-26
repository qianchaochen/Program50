package com.qcc.pro01_10;

/**
 * @author: qiancc
 * 2017年07月26日
 * 【程序8】
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * 程序分析：关键是计算出每一项的值。
 */
public class Pro8 {
    public static void main(String[] args) {
        int m = 2;
        int n = 5;
        int sum = 0;
        int item = 0;
        for (int i = 1; i <= n; i++) {
            item = getItem(m, i);
            sum += item;
        }
        System.out.println(sum);
    }

    public static int getItem(int m, int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(m);
        }
        return Integer.parseInt(sb.toString());
    }

}

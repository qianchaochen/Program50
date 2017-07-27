package com.qcc.pro11_20;

import java.util.Scanner;

/**
 * @author: qiancc
 * 2017年07月27日
 * 【程序15】
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 * 程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换，
 * 然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。
 */
public class Pro15 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int x = s.nextInt();
        System.out.println("请输入第二个数：");
        int y = s.nextInt();
        System.out.println("请输入第三个数：");
        int z = s.nextInt();
        s.close();
        if (x > y) {
            x += y;
            y = x-y;
            x -= y;
        }

        if (x > z) {
            x += z;
            z = x-z;
            x -= z;
        }

        if (y > z) {
            y += z;
            z = y-z;
            y -= z;
        }
        
        System.out.println(x + ", " + y + ", " + z);

    }
}
